package runtime;

import gen.MintBaseVisitor;
import gen.MintParser;
import java.util.HashMap;
import java.util.Map;

public class MintEvaluator extends MintBaseVisitor<Object> {
    private final Map<String, Object> variables = new HashMap<>();
    private final Map<String, String> types = new HashMap<>();
    private boolean breakFlag = false;
    private boolean continueFlag = false;

    @Override
    public Object visitProgram(MintParser.ProgramContext ctx) {
        for (MintParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }
        return null;
    }

    @Override
    public Object visitDeclaration(MintParser.DeclarationContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        String typeText = ctx.type().getText();  // e.g., "mint_int"
        Object value = null;

        if (ctx.expression() != null) {
            value = visit(ctx.expression());
            switch (typeText) {
                case "mint_int":
                    if (!(value instanceof Integer)) {
                        throw new RuntimeException("Type mismatch: Expected int for " + varName);
                    }
                    break;
                case "mint_float":
                    if (!(value instanceof Double)) {
                        throw new RuntimeException("Type mismatch: Expected float for " + varName);
                    }
                    break;
                case "mint_bool":
                    if (!(value instanceof Boolean)) {
                        throw new RuntimeException("Type mismatch: Expected bool for " + varName);
                    }
                    break;
                case "mint_string":
                    if (!(value instanceof String)) {
                        throw new RuntimeException("Type mismatch: Expected string for " + varName);
                    }
                    break;
                default:
                    throw new RuntimeException("Unknown type: " + typeText);
            }
        }

        variables.put(varName, value);
        types.put(varName, typeText);

        return value;
    }

    @Override
    public Object visitAssignment(MintParser.AssignmentContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Object value = visit(ctx.expression());

        if (!types.containsKey(name)) {
            throw new RuntimeException("Variable not declared: " + name);
        }

        String declaredType = types.get(name);

        switch (declaredType) {
            case "mint_int":
                if (!(value instanceof Integer)) {
                    throw new RuntimeException("Type mismatch: Expected int for " + name);
                }
                break;
            case "mint_float":
                if (!(value instanceof Double)) {
                    throw new RuntimeException("Type mismatch: Expected float for " + name);
                }
                break;
            case "mint_bool":
                if (!(value instanceof Boolean)) {
                    throw new RuntimeException("Type mismatch: Expected bool for " + name);
                }
                break;
            case "mint_string":
                if (!(value instanceof String)) {
                    throw new RuntimeException("Type mismatch: Expected string for " + name);
                }
                break;
            default:
                throw new RuntimeException("Unknown type for variable: " + name);
        }

        variables.put(name, value);
        return value;
    }

    @Override
    public Object visitPrintStatement(MintParser.PrintStatementContext ctx) {
        Object value = visit(ctx.expression());
        if (ctx.SAY() != null) System.out.print(value);
        else System.out.println(value);
        return null;
    }

    @Override
    public Object visitIfStatement(MintParser.IfStatementContext ctx) {
        Object conditionResult = visit(ctx.expression(0));
        if (!(conditionResult instanceof Boolean)) {
            throw new RuntimeException("If condition must evaluate to a boolean");
        }
        
        if ((Boolean) conditionResult) {
            visit(ctx.block(0));
        } else {
            for (int i = 1; i < ctx.expression().size(); i++) {
                Object elseIfResult = visit(ctx.expression(i));
                if (!(elseIfResult instanceof Boolean)) {
                    throw new RuntimeException("ElseIf condition must evaluate to a boolean");
                }
                
                if ((Boolean) elseIfResult) {
                    visit(ctx.block(i));
                    return null;
                }
            }
            if (ctx.MINT_ELSE() != null) {
                visit(ctx.block(ctx.block().size() - 1));
            }
        }
        return null;
    }

    @Override
    public Object visitWhileLoop(MintParser.WhileLoopContext ctx) {
        while (true) {
            Object conditionResult = visit(ctx.expression());
        
            if (!(conditionResult instanceof Boolean)) {
                throw new RuntimeException("While condition must evaluate to a boolean");
            }
        
            if (!(Boolean) conditionResult) break;
        
            breakFlag = false;
            continueFlag = false;
            
            // Process each statement in the block individually
            for (MintParser.StatementContext stmtCtx : ctx.block().statement()) {
                visit(stmtCtx);
                
                // Check flags after each statement
                if (breakFlag || continueFlag) {
                    break;
                }
            }
            
            // Handle continue flag
            if (continueFlag) {
                continueFlag = false;
                continue;
            }
            
            // Handle break flag
            if (breakFlag) {
                breakFlag = false;
                break;
            }
        }
        return null;
    }
    
}

    @Override
    public Object visitSimpleAssignment(MintParser.SimpleAssignmentContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Object value = visit(ctx.expression());

        if (!types.containsKey(name)) {
            throw new RuntimeException("Variable not declared: " + name);
        }

        String declaredType = types.get(name);

        switch (declaredType) {
            case "mint_int":
                if (!(value instanceof Integer)) {
                    throw new RuntimeException("Type mismatch: Expected int for " + name);
                }
                break;
            case "mint_float":
                if (!(value instanceof Double)) {
                    throw new RuntimeException("Type mismatch: Expected float for " + name);
                }
                break;
            case "mint_bool":
                if (!(value instanceof Boolean)) {
                    throw new RuntimeException("Type mismatch: Expected bool for " + name);
                }
                break;
            case "mint_string":
                if (!(value instanceof String)) {
                    throw new RuntimeException("Type mismatch: Expected string for " + name);
                }
                break;
            default:
                throw new RuntimeException("Unknown type for variable: " + name);
        }

        variables.put(name, value);
        return value;
    }

    @Override
    public Object visitForLoop(MintParser.ForLoopContext ctx) {
        visit(ctx.simpleAssignment(0));
        
        while (true) {
            Object conditionResult = visit(ctx.expression());
            if (!(conditionResult instanceof Boolean)) {
                throw new RuntimeException("For loop condition must evaluate to a boolean");
            }
            
            if (!(Boolean) conditionResult) break;
            if (breakFlag) {
                breakFlag = false;
                break;
            }
            
            visit(ctx.block());
            
            if (continueFlag) {
                continueFlag = false;
            }
            
            visit(ctx.simpleAssignment(1));
        }
        return null;
    }

    @Override
    public Object visitBreakStatement(MintParser.BreakStatementContext ctx) {
        breakFlag = true;
        return null;
    }

    @Override
    public Object visitContinueStatement(MintParser.ContinueStatementContext ctx) {
        continueFlag = true;
        return null;
    }

    @Override
    public Object visitExpression(MintParser.ExpressionContext ctx) {
        return visit(ctx.ternaryExpression());
    }
