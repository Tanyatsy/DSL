import java.text.DecimalFormat;

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
    public float finalSalary = 0;
    public float incomeTax = (100 - 12) / 100.0f;
    public int exemption = 0;
    float totalSalary = 0;
    float calcTaxes = 0;

    public void calcGrossSalary() {
        if (salaryType.contains("netSalary")) {
            if (itField) {
                finalSalary = this.salary;
            } else {
                finalSalary = (this.salary / incomeTax);
                finalSalary = finalSalary / ((100 - medInsEmployee - contribPensionFund) / 100.0f);
                if (syndicateContrib) {
                    finalSalary += this.salary / 100;
                }
            }
            System.out.println(finalSalary);
        } else {
            System.out.println("Introduce Net Salary");
        }
    }

    public void calcNetSalary() {
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
            if(exemption > 0 ){
                finalSalary -= exemption;
            }
            finalSalary -= (finalSalary * 12) / 100;
            System.out.println("Salariul net: " + finalSalary);
        } else {
            System.out.println("Introduce Gross Salary");
        }
    }

    public void calcTotalSalary() {
        DecimalFormat f = new DecimalFormat("00.00");
        if (salaryType.contains("netSalary")) {
            totalSalary = this.salary;
            calcGrossSalary();
            switch (socialFund) {
                case "privateSector":
                case "higherEducation":
                case "medicalInstitutions":
                    totalSalary += Float.parseFloat(f.format(finalSalary * 18 / 100));
                    break;
                case "budgetaryInstitutions":
                case "publicInstitutions":
                    totalSalary += Float.parseFloat(f.format(finalSalary * 23 / 100));
                    break;
                case "privateSectorS":
                case "higherEducationS":
                case "medicalInstitutionsS":
                    totalSalary += Float.parseFloat(f.format(finalSalary * 26 / 100));
                    break;
                case "budgetaryInstitutionsS":
                case "publicInstitutionsS":
                    totalSalary += Float.parseFloat(f.format(finalSalary * 33 / 100));
                    break;
            }
            totalSalary += Float.parseFloat(f.format(finalSalary * 10 / 100));
            totalSalary += Float.parseFloat(f.format(finalSalary * contribPensionFund / 100));
            totalSalary += Float.parseFloat(f.format(this.salary / incomeTax)) - this.salary;
        } else if (salaryType.contains("grossSalary")) {
            calcNetSalary();
            totalSalary = finalSalary;
            switch (socialFund) {
                case "privateSector":
                case "higherEducation":
                case "medicalInstitutions":
                    totalSalary += Float.parseFloat(f.format(this.salary * 18 / 100));
                    break;
                case "budgetaryInstitutions":
                case "publicInstitutions":
                    totalSalary += Float.parseFloat(f.format(this.salary * 23 / 100));
                    break;
                case "privateSectorS":
                case "higherEducationS":
                case "medicalInstitutionsS":
                    totalSalary += Float.parseFloat(f.format(this.salary * 26 / 100));
                    break;
                case "budgetaryInstitutionsS":
                case "publicInstitutionsS":
                    totalSalary += Float.parseFloat(f.format(this.salary * 33 / 100));
                    break;
            }
            totalSalary += Float.parseFloat(f.format(this.salary * 10 / 100));
            totalSalary += Float.parseFloat(f.format(this.salary * contribPensionFund / 100));
            totalSalary += Float.parseFloat(f.format(finalSalary / incomeTax)) - finalSalary;
        }
        System.out.println("Total Salary: " + totalSalary);
    }

    public void calcTaxes() {
        if (salaryType.contains("netSalary")) {
            calcTotalSalary();
             calcTaxes = totalSalary - this.salary;
        } else if (salaryType.contains("grossSalary")) {
            calcTotalSalary();
            calcTaxes = totalSalary - finalSalary;
        }
        System.out.println("Total taxes: " + calcTaxes);
    }
}




