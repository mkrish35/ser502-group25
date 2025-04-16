// Generated from Mint.g4 by ANTLR 4.13.2

package gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MintParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MintVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MintParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MintParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MintParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(MintParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MintParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(MintParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MintParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(MintParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#simpleAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssignment(MintParser.SimpleAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(MintParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(MintParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(MintParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(MintParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MintParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MintParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MintParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#ternaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(MintParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(MintParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(MintParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(MintParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(MintParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(MintParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MintParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(MintParser.PrimaryExpressionContext ctx);
}