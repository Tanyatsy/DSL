public class Program {
    public String socialFund;
    public String salaryType;
    public float salary;
    public boolean itField;
    public boolean syndicateContrib;
    public String currency;
    public float contribPensionFund;
    public float medInsEmployer;
    public float medInsEmployee;

    public String taskToCalculate;

    public void calcGrossSalary() {
        float finalSalary;
        if (salaryType.contains("netSalary")) {
            if (itField) {
                finalSalary = this.salary;
            } else {
                finalSalary = this.salary + this.salary * contribPensionFund / 100;
                if (medInsEmployer > 0) {
                    finalSalary += (this.salary * medInsEmployer) / 100;
                } else if (medInsEmployee > 0) {
                    finalSalary += (this.salary * medInsEmployee) / 100;
                }

                if (syndicateContrib) {
                    finalSalary += this.salary / 100;
                }
            }
            finalSalary += (1136.36 * 12) / 100;
            System.out.println(finalSalary);
        } else {
            System.out.println("Introduce Net Salary");
        }
    }

    public void calcNetSalary() {
        float finalSalary = 0;
        if (salaryType.contains("grossSalary")) {
            if (itField) {
                finalSalary = this.salary;
            } else {
                finalSalary = this.salary - this.salary * contribPensionFund / 100;
                if (medInsEmployer > 0) {
                    finalSalary -= (this.salary * medInsEmployer) / 100;
                } else if (medInsEmployee > 0) {
                    finalSalary -= (this.salary * medInsEmployee) / 100;
                }

                if (syndicateContrib) {
                    finalSalary -= this.salary / 100;
                }
            }
            System.out.println("Venit impozabil: " + finalSalary);
            finalSalary -= (finalSalary * 12) / 100;
            System.out.println("Salariul net: " + finalSalary);
        } else {
            System.out.println("Introduce Gross Salary");
        }
    }
}


