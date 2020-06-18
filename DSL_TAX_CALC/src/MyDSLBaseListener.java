import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyDSLBaseListener extends DSLBaseListener {
    public static boolean isError;
    Program program;

    public MyDSLBaseListener(Program program) {
        this.program = program;
    }

    @Override
    public void exitSf_categs(DSLParser.Sf_categsContext ctx) {
        program.socialFund = ctx.getText();
    }

    @Override
    public void exitSalary(DSLParser.SalaryContext ctx) {
        //System.out.println(ctx.getText());
        program.salaryType = ctx.getText();
    }

    @Override
    public void exitDetails_block(DSLParser.Details_blockContext ctx) {
        String str = ctx.getText();
        str = str.replace("servN1", "");
        str = str.replace("}", "");
        str = str.replace("{", "");

        //System.out.println(str);
        Pattern patternSalary = Pattern.compile(program.salaryType + "->[0-9]+");

        Pattern patternNum = Pattern.compile("[0-9]+");

        Pattern patternCurrency = Pattern.compile("eur|mdl|usd");

        Pattern patternItFieldTrue = Pattern.compile("itField->yes|itField->true");
        Pattern patternItFieldFalse = Pattern.compile("itField->no|itField->false");

        Pattern patternSyndicateTrue = Pattern.compile("syndicateContrib->yes|syndicateContrib->true");
        Pattern patternSyndicateFalse = Pattern.compile("syndicateContrib->no|syndicateContrib->false");

        Pattern patternContribFund = Pattern.compile("contribPensionFund->[0-9]*\\.?[0-9]*+%");

        Pattern patternMedInsEmployer = Pattern.compile("medInsEmployer->[0-9]*\\.?[0-9]*+%");

        Pattern patternMedInsEmployee = Pattern.compile("medInsEmployee->[0-9]*\\.?[0-9]*+%");

        Pattern patternExemption = Pattern.compile("exemption[0-9]*->[0-9]*");

        Pattern numberPattern = Pattern.compile("\\d+");
        Matcher m = patternSalary.matcher(str);

        if (m.find()) {
            Matcher m1 = patternNum.matcher(str);
            if (m1.find())
                program.salary = Integer.parseInt(m1.group(0));
        } else {
            System.out.println("Error: Salary field is empty or not valid.");
            isError = true;
        }

        m = patternCurrency.matcher(str);
        if (m.find()) {
            program.currency = m.group(0);
        } else {
            System.out.println("Error: Salary currency field is empty or not valid.");
            isError = true;
        }

        m = patternItFieldTrue.matcher(str);
        if (m.find()) {
            program.itField = true;
        }

        m = patternItFieldFalse.matcher(str);
        if (m.find()) {
            program.itField = false;
        }

        m = patternSyndicateTrue.matcher(str);
        if (m.find()) {
            program.syndicateContrib = true;
        }

        m = patternSyndicateFalse.matcher(str);
        if (m.find()) {
            program.syndicateContrib = false;
        }

        m = patternContribFund.matcher(str);
        if (m.find()) {
            m = numberPattern.matcher(m.group(0));
            if (m.find()) {
                program.contribPensionFund = Float.parseFloat(m.group());
            }

        } else {
            System.out.println("Error: \"Contribution Pension fond\" field is empty or not valid.");
            isError = true;
        }

        m = patternMedInsEmployer.matcher(str);
        if (m.find()) {
            m = numberPattern.matcher(m.group(0));
            if (m.find()) {
                program.medInsEmployer = Float.parseFloat(m.group());
            }
        } else {
            System.out.println("Error: \"Medical Insurance Employer\" field is empty or not valid.");
            isError = true;
        }

        m = patternMedInsEmployee.matcher(str);
        if (m.find()) {
            m = numberPattern.matcher(m.group(0));
            if (m.find()) {
                program.medInsEmployee = Float.parseFloat(m.group());
            }
        } else {
            System.out.println("Error: \"Medical Insurance Employer\" field is empty or not valid.");
            isError = true;
        }

        m = patternExemption.matcher(str);
        if(m.find())
        {
            String strExempt = m.group();
            strExempt = strExempt.substring(strExempt.indexOf('>') + 1);
            program.exemption = Integer.parseInt(strExempt);
        }
    }

    @Override
    public void exitOptional_taxes(DSLParser.Optional_taxesContext ctx) {
//        System.out.println(ctx.getText());
    }

    @Override
    public void exitCalc_salary(DSLParser.Calc_salaryContext ctx) {
        Pattern pattern = Pattern.compile("calcTotalSalary|calcGrossSalary|calcNetSalary|calcTaxes");
        Matcher m = pattern.matcher(ctx.getText());
        if(m.find()){
            program.taskToCalculate = ctx.getText();
        } else {

            System.out.println("Error: Please choose the following operations: \n 1.calcTotalSalary" + "\n 2.calcGrossSalary" + "\n 3.calcNetSalary" + "\n 4.calcTaxes");
            isError = true;
        }
    }
}
