// Generated from Rebus.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RebusParser}.
 */
public interface RebusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RebusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RebusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RebusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RebusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RebusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RebusParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RebusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RebusParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RebusParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(RebusParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RebusParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(RebusParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RebusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(RebusParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RebusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(RebusParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RebusParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(RebusParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RebusParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(RebusParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RebusParser#expression()}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RebusParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RebusParser#expression()}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RebusParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RebusParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(RebusParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link RebusParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(RebusParser.AtomContext ctx);
}