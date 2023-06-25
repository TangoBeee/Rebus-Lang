// Generated from Rebus.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RebusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RebusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RebusParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RebusParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RebusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RebusParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RebusParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(RebusParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RebusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(RebusParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RebusParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(RebusParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RebusParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RebusParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RebusParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(RebusParser.AtomContext ctx);
}