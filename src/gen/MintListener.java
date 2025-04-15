// Generated from Mint.g4 by ANTLR 4.13.2

package gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MintParser}.
 */
public interface MintListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MintParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MintParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MintParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MintParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MintParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MintParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MintParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MintParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MintParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MintParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MintParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MintParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MintParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(MintParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(MintParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(MintParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(MintParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(MintParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(MintParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(MintParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(MintParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(MintParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(MintParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MintParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MintParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MintParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MintParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MintParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MintParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(MintParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(MintParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(MintParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(MintParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(MintParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(MintParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(MintParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(MintParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(MintParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(MintParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(MintParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(MintParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MintParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(MintParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MintParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(MintParser.PrimaryExpressionContext ctx);
}