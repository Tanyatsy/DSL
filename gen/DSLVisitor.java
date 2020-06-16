// Generated from C:/Users/tanya/Documents/University/PBL2.0/DSL2.0/DSL_TAX_CALC\DSL.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DSLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DSLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#main_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_block(DSLParser.Main_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#calc_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc_block(DSLParser.Calc_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#serv_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServ_block(DSLParser.Serv_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#serv_stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServ_stmts(DSLParser.Serv_stmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#details_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetails_block(DSLParser.Details_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#details_stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetails_stmts(DSLParser.Details_stmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#sf_categs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSf_categs(DSLParser.Sf_categsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(DSLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DSLParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#first_category}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_category(DSLParser.First_categoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#second_category}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_category(DSLParser.Second_categoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#third_category}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThird_category(DSLParser.Third_categoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#fourth_category}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFourth_category(DSLParser.Fourth_categoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#optional_taxes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_taxes(DSLParser.Optional_taxesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#special_cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_cases(DSLParser.Special_casesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#salary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSalary(DSLParser.SalaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#calc_salary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc_salary(DSLParser.Calc_salaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#currency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrency(DSLParser.CurrencyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#booln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooln(DSLParser.BoolnContext ctx);
}