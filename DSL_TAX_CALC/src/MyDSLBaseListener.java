import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyDSLBaseListener extends DSLBaseListener{
    Program program;

    public MyDSLBaseListener(Program program)
    {
        this.program = program;
    }

    @Override
    public void exitSf_categs(DSLParser.Sf_categsContext ctx)
    {
        program.socialFund = ctx.getText();
    }

    @Override
    public void exitSalary(DSLParser.SalaryContext ctx) {
        //System.out.println(ctx.getText());
        program.salaryType = ctx.getText();
    }

    @Override public void exitDetails_block(DSLParser.Details_blockContext ctx) {
        String str = ctx.getText();
        str = str.replace("servN1", "");
        str = str.replace("}", "");
        str = str.replace("{", "");

        //System.out.println(str);
        Pattern patternSalary = Pattern.compile("[0-9]+");

        Pattern patternCurrency = Pattern.compile("eur|mdl|usd");

        Pattern patternItFieldTrue = Pattern.compile("itField->yes|itField->true");
        Pattern patternItFieldFalse = Pattern.compile("itField->no|itField->false");

        Pattern patternSyndicateTrue = Pattern.compile("syndicateContrib->yes|syndicateContrib->true");
        Pattern patternSyndicateFalse = Pattern.compile("syndicateContrib->no|syndicateContrib->false");

        Pattern patternContribFund = Pattern.compile("contribPensionFund->[0-9]+%");

        Pattern patternMedInsEmployer = Pattern.compile("medInsEmployer->[0-9]+%");

        Pattern patternMedInsEmployee = Pattern.compile("medInsEmployee->[0-9]+%");

        Pattern numberPattern = Pattern.compile("\\d+");
        Matcher m = patternSalary.matcher(str);

        if(m.find())
        {
            program.salary = Integer.parseInt(m.group(0));
        }

        m = patternCurrency.matcher(str);
        if(m.find())
        {
            program.currency = m.group(0);
        }

        m = patternItFieldTrue.matcher(str);
        if(m.find())
        {
            program.itField = true;
        }

        m = patternItFieldFalse.matcher(str);
        if(m.find())
        {
            program.itField = false;
        }

        m = patternSyndicateTrue.matcher(str);
        if(m.find())
        {
            program.syndicateContrib = true;
        }

        m = patternSyndicateFalse.matcher(str);
        if(m.find())
        {
            program.syndicateContrib = false;
        }

        m = patternContribFund.matcher(str);
        if(m.find())
        {
            m = numberPattern.matcher(m.group(0));
            if(m.find())
            {
                program.contribPensionFund = Float.parseFloat(m.group());
            }
        }

        m = patternMedInsEmployer.matcher(str);
        if(m.find())
        {
            m = numberPattern.matcher(m.group(0));
            if(m.find())
            {
                program.medInsEmployer = Float.parseFloat(m.group());
            }
        }

        m = patternMedInsEmployee.matcher(str);
        if(m.find())
        {
            m = numberPattern.matcher(m.group(0));
            if(m.find())
            {
                program.medInsEmployee = Float.parseFloat(m.group());
            }
        }
    }

    @Override public void exitOptional_taxes(DSLParser.Optional_taxesContext ctx) {
//        System.out.println(ctx.getText());
    }
    @Override public void exitCalc_salary(DSLParser.Calc_salaryContext ctx) {
        program.taskToCalculate = ctx.getText();
    }
}
