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

    @Override
    public Object visitExpressionStatement(MintParser.ExpressionStatementContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Object visitTernaryExpression(MintParser.TernaryExpressionContext ctx) {
        if (ctx.T_IF() != null) {
            Object conditionResult = visit(ctx.logicalExpression());
            if (!(conditionResult instanceof Boolean)) {
                throw new RuntimeException("Ternary condition must evaluate to a boolean");
            }
            
            boolean condition = (Boolean) conditionResult;
            return condition ? visit(ctx.expression(0)) : visit(ctx.expression(1));
        }
        return visit(ctx.logicalExpression());
    }

    @Override
    public Object visitLogicalExpression(MintParser.LogicalExpressionContext ctx) {
        // Rule: logicalExpression AND equalityExpression
        if (ctx.AND() != null) {
            Object left = visit(ctx.logicalExpression());
            
            // Type check for left operand
            if (!(left instanceof Boolean)) {
                throw new RuntimeException("AND operation requires boolean operands. Left operand is " + 
                                         (left != null ? left.getClass().getSimpleName() : "null"));
            }
            
            // Short-circuit evaluation for AND
            if (!(Boolean)left) {
                return false;
            }
            
            Object right = visit(ctx.equalityExpression());
            
            // Type check for right operand
            if (!(right instanceof Boolean)) {
                throw new RuntimeException("AND operation requires boolean operands. Right operand is " + 
                                         (right != null ? right.getClass().getSimpleName() : "null"));
            }
            
            return (Boolean) left && (Boolean) right;
        } 
        // Rule: logicalExpression OR equalityExpression
        else if (ctx.OR() != null) {
            Object left = visit(ctx.logicalExpression());
            
            // Type check for left operand
            if (!(left instanceof Boolean)) {
                throw new RuntimeException("OR operation requires boolean operands. Left operand is " + 
                                         (left != null ? left.getClass().getSimpleName() : "null"));
            }
            
            // Short-circuit evaluation for OR
            if ((Boolean)left) {
                return true;
            }
            
            Object right = visit(ctx.equalityExpression());
            
            // Type check for right operand
            if (!(right instanceof Boolean)) {
                throw new RuntimeException("OR operation requires boolean operands. Right operand is " + 
                                         (right != null ? right.getClass().getSimpleName() : "null"));
            }
            
            return (Boolean) left || (Boolean) right;
        } 
        // Rule: NOT logicalExpression
        else if (ctx.NOT() != null) {
            Object value = visit(ctx.logicalExpression());
            
            // Type check
            if (!(value instanceof Boolean)) {
                throw new RuntimeException("NOT operation requires boolean operand. Got " + 
                                         (value != null ? value.getClass().getSimpleName() : "null"));
            }
            
            return !(Boolean) value;
        } 
        // Rule: equalityExpression
        else {
            return visit(ctx.equalityExpression());
        }
    }

    @Override
    public Object visitEqualityExpression(MintParser.EqualityExpressionContext ctx) {
        // If there are no equality operators, just return the comparison expression
        if (ctx.EQ().isEmpty() && ctx.NEQ().isEmpty()) {
            return visit(ctx.comparisonExpression(0));
        }
    
        Object left = visit(ctx.comparisonExpression(0));
        for (int i = 1; i < ctx.comparisonExpression().size(); i++) {
            Object right = visit(ctx.comparisonExpression(i));
            
            // Check if we have an equality operator
            if (ctx.EQ(i - 1) != null) {
                if (!equalsWithTypeCheck(left, right)) {
                    return false;
                }
            }
            // Check if we have an inequality operator
            else if (ctx.NEQ(i - 1) != null) {
                if (equalsWithTypeCheck(left, right)) {
                    return false;
                }
            }
            
            left = right; // For chained equality checks
        }
        
        return true;
    }
    
    // Helper method for proper equality checking with type considerations
    private boolean equalsWithTypeCheck(Object a, Object b) {
        if (a == null || b == null) {
            return a == b;
        }
        
        // If both are numbers, compare their numeric values
        if (a instanceof Number && b instanceof Number) {
            return Double.compare(((Number)a).doubleValue(), ((Number)b).doubleValue()) == 0;
        }
        
        // For all other types, use standard equals
        return a.equals(b);
    }

    @Override
    public Object visitComparisonExpression(MintParser.ComparisonExpressionContext ctx) {
        // If there are no comparison operators, just return the additive expression
        if (ctx.LT().isEmpty() && ctx.LTE().isEmpty() && ctx.GT().isEmpty() && ctx.GTE().isEmpty()) {
            return visit(ctx.additiveExpression(0));
        }
        
        Object left = visit(ctx.additiveExpression(0));
        for (int i = 1; i < ctx.additiveExpression().size(); i++) {
            Object right = visit(ctx.additiveExpression(i));
            
            // Ensure both operands are numbers for comparison
            if (!(left instanceof Number) || !(right instanceof Number)) {
                throw new RuntimeException("Comparison operations require numeric operands. Got " + 
                                         left.getClass().getSimpleName() + " and " + 
                                         right.getClass().getSimpleName());
            }
            
            double l = ((Number) left).doubleValue();
            double r = ((Number) right).doubleValue();
            
            if (ctx.LT(i - 1) != null) {
                if (!(l < r)) return false;
            }
            else if (ctx.LTE(i - 1) != null) {
                if (!(l <= r)) return false;
            }
            else if (ctx.GT(i - 1) != null) {
                if (!(l > r)) return false;
            }
            else if (ctx.GTE(i - 1) != null) {
                if (!(l >= r)) return false;
            }
            
            left = right; // For chained comparisons
        }
        
        return true; // All comparisons passed
    }

    @Override
    public Object visitAdditiveExpression(MintParser.AdditiveExpressionContext ctx) {
        // Process the grammar structure correctly by checking rule alternatives
        if (ctx.getChildCount() == 1) {
            // Base case: just a multiplicativeExpression
            return visit(ctx.multiplicativeExpression());
        } else {
            // Binary operation case: additiveExpression operator multiplicativeExpression
            Object left = visit(ctx.additiveExpression());
            Object right = visit(ctx.multiplicativeExpression());
            
            // Special case for string concatenation with +
            if (ctx.ADD() != null && (left instanceof String || right instanceof String)) {
                return String.valueOf(left) + String.valueOf(right);
            }
            
            if (!(left instanceof Number) || !(right instanceof Number)) {
                throw new RuntimeException("Add/Sub operations require numeric operands. Got " + 
                                         left.getClass().getSimpleName() + " and " + 
                                         right.getClass().getSimpleName());
            }
            
            // Determine if we should return Integer or Double
            boolean isInteger = left instanceof Integer && right instanceof Integer;
            
            if (ctx.ADD() != null) {
                if (isInteger) {
                    return ((Number)left).intValue() + ((Number)right).intValue();
                } else {
                    return ((Number)left).doubleValue() + ((Number)right).doubleValue();
                }
            } else { // SUB
                if (isInteger) {
                    return ((Number)left).intValue() - ((Number)right).intValue();
                } else {
                    return ((Number)left).doubleValue() - ((Number)right).doubleValue();
                }
            }
        }
    }

    @Override
    public Object visitMultiplicativeExpression(MintParser.MultiplicativeExpressionContext ctx) {
        // Process the grammar structure correctly by checking rule alternatives
        if (ctx.getChildCount() == 1) {
            // Base case: just a primaryExpression
            return visit(ctx.primaryExpression());
        } else {
            // Binary operation case: multiplicativeExpression operator primaryExpression
            Object left = visit(ctx.multiplicativeExpression());
            Object right = visit(ctx.primaryExpression());
            
            if (!(left instanceof Number) || !(right instanceof Number)) {
                throw new RuntimeException("Multiplicative operations require numeric operands");
            }
            
            // Determine if we should return Integer or Double
            boolean isInteger = left instanceof Integer && right instanceof Integer;
            
            if (ctx.MUL() != null) {
                if (isInteger) {
                    return ((Number)left).intValue() * ((Number)right).intValue();
                } else {
                    return ((Number)left).doubleValue() * ((Number)right).doubleValue();
                }
            } 
            else if (ctx.DIV() != null) {
                // Division by zero check
                if (((Number)right).doubleValue() == 0) {
                    throw new RuntimeException("Division by zero");
                }
                
                if (isInteger) {
                    return ((Number)left).intValue() / ((Number)right).intValue();
                } else {
                    return ((Number)left).doubleValue() / ((Number)right).doubleValue();
                }
            } 
            else { // MOD
                // Modulo by zero check
                if (((Number)right).doubleValue() == 0) {
                    throw new RuntimeException("Modulo by zero");
                }
                
                if (isInteger) {
                    return ((Number)left).intValue() % ((Number)right).intValue();
                } else {
                    return ((Number)left).doubleValue() % ((Number)right).doubleValue();
                }
            }
        }
    }

    @Override
    public Object visitPrimaryExpression(MintParser.PrimaryExpressionContext ctx) {
        if (ctx.NUMBER() != null) {
            String numText = ctx.NUMBER().getText();
            
            // Check for parsing errors - should not happen with correct lexer
            if (numText.equals("true") || numText.equals("false")) {
                return Boolean.parseBoolean(numText);
            }
            
            if (numText.contains(".")) {
                return Double.parseDouble(numText);
            } else {
                return Integer.parseInt(numText);
            }
        }
    
        if (ctx.BOOL() != null) {
            String boolText = ctx.BOOL().getText();
            return Boolean.parseBoolean(boolText);
        }

        if (ctx.STRING() != null) {
            // Remove the surrounding quotes from the string literal
            String value = ctx.STRING().getText();
            value = value.substring(1, value.length() - 1); // Remove first and last quote
            return value;
        }

        if (ctx.IDENTIFIER() != null) {
            String varName = ctx.IDENTIFIER().getText();
            if (!variables.containsKey(varName)) {
                throw new RuntimeException("Variable not declared: " + varName);
            }
            Object value = variables.get(varName);
            return value;
        }

        if (ctx.expression() != null) {
            return visit(ctx.expression());
        }

        throw new RuntimeException("Unknown primary expression");
    }

    @Override
    public Object visitStatement(MintParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }
}