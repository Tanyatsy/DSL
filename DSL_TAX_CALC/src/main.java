import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        File file = new File("DSL_TAX_CALC/src/1.txt");
        Scanner sc = new Scanner(file);

        String scriptText = "";
        while (sc.hasNextLine()) {
            scriptText += '\n' + sc.nextLine();
        }

        CharStream input = CharStreams.fromString(scriptText);

        DSLLexer lexer = new DSLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DSLParser parser = new DSLParser(tokens);

        System.out.println();
        Program program = new Program();
        parser.addParseListener(new MyDSLBaseListener(program));
        parser.program();
        if (MyDSLBaseListener.isError) {
            System.out.println("\n");
        } else {
            switch (program.taskToCalculate) {
                case "calcTotalSalary":
                    program.calcTotalSalary();
                    break;
                case "calcGrossSalary":
                    program.calcGrossSalary();
                    break;
                case "calcNetSalary":
                    program.calcNetSalary();
                    break;
                case "calcTaxes":
                    program.calcTaxes();
                    break;
                case "calcTotalSalarycalcTaxes":
                    program.calcTotalSalary();
                    program.calcTaxes();
                    break;
            }
        }

    }
}
