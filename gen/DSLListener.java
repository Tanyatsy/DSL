// Generated from C:/Users/tanya/Documents/University/PBL2.0/DSL2.0/DSL_TAX_CALC\DSL.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSLParser}.
 */
public interface DSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DSLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DSLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#main_block}.
	 * @param ctx the parse tree
	 */
	void enterMain_block(DSLParser.Main_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#main_block}.
	 * @param ctx the parse tree
	 */
	void exitMain_block(DSLParser.Main_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#calc_block}.
	 * @param ctx the parse tree
	 */
	void enterCalc_block(DSLParser.Calc_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#calc_block}.
	 * @param ctx the parse tree
	 */
	void exitCalc_block(DSLParser.Calc_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#serv_block}.
	 * @param ctx the parse tree
	 */
	void enterServ_block(DSLParser.Serv_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#serv_block}.
	 * @param ctx the parse tree
	 */
	void exitServ_block(DSLParser.Serv_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#serv_stmts}.
	 * @param ctx the parse tree
	 */
	void enterServ_stmts(DSLParser.Serv_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#serv_stmts}.
	 * @param ctx the parse tree
	 */
	void exitServ_stmts(DSLParser.Serv_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#details_block}.
	 * @param ctx the parse tree
	 */
	void enterDetails_block(DSLParser.Details_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#details_block}.
	 * @param ctx the parse tree
	 */
	void exitDetails_block(DSLParser.Details_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#details_stmts}.
	 * @param ctx the parse tree
	 */
	void enterDetails_stmts(DSLParser.Details_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#details_stmts}.
	 * @param ctx the parse tree
	 */
	void exitDetails_stmts(DSLParser.Details_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#sf_categs}.
	 * @param ctx the parse tree
	 */
	void enterSf_categs(DSLParser.Sf_categsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#sf_categs}.
	 * @param ctx the parse tree
	 */
	void exitSf_categs(DSLParser.Sf_categsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(DSLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(DSLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DSLParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DSLParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#first_category}.
	 * @param ctx the parse tree
	 */
	void enterFirst_category(DSLParser.First_categoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#first_category}.
	 * @param ctx the parse tree
	 */
	void exitFirst_category(DSLParser.First_categoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#second_category}.
	 * @param ctx the parse tree
	 */
	void enterSecond_category(DSLParser.Second_categoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#second_category}.
	 * @param ctx the parse tree
	 */
	void exitSecond_category(DSLParser.Second_categoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#third_category}.
	 * @param ctx the parse tree
	 */
	void enterThird_category(DSLParser.Third_categoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#third_category}.
	 * @param ctx the parse tree
	 */
	void exitThird_category(DSLParser.Third_categoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#fourth_category}.
	 * @param ctx the parse tree
	 */
	void enterFourth_category(DSLParser.Fourth_categoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#fourth_category}.
	 * @param ctx the parse tree
	 */
	void exitFourth_category(DSLParser.Fourth_categoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#optional_taxes}.
	 * @param ctx the parse tree
	 */
	void enterOptional_taxes(DSLParser.Optional_taxesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#optional_taxes}.
	 * @param ctx the parse tree
	 */
	void exitOptional_taxes(DSLParser.Optional_taxesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#special_cases}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_cases(DSLParser.Special_casesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#special_cases}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_cases(DSLParser.Special_casesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#salary}.
	 * @param ctx the parse tree
	 */
	void enterSalary(DSLParser.SalaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#salary}.
	 * @param ctx the parse tree
	 */
	void exitSalary(DSLParser.SalaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#calc_salary}.
	 * @param ctx the parse tree
	 */
	void enterCalc_salary(DSLParser.Calc_salaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#calc_salary}.
	 * @param ctx the parse tree
	 */
	void exitCalc_salary(DSLParser.Calc_salaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#currency}.
	 * @param ctx the parse tree
	 */
	void enterCurrency(DSLParser.CurrencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#currency}.
	 * @param ctx the parse tree
	 */
	void exitCurrency(DSLParser.CurrencyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#booln}.
	 * @param ctx the parse tree
	 */
	void enterBooln(DSLParser.BoolnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#booln}.
	 * @param ctx the parse tree
	 */
	void exitBooln(DSLParser.BoolnContext ctx);
}