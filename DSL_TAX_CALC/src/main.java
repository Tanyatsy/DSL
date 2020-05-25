import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        File file = new File("DSL_TAX_CALC/src/test.txt");
        Scanner sc = new Scanner(file);

        String scriptText = "";
        while (sc.hasNextLine())
        {
            scriptText += '\n' + sc.nextLine();
        }

        CharStream input = CharStreams.fromString(scriptText);

        DSLLexer lexer = new DSLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DSLParser parser = new DSLParser(tokens);

        System.out.println("");
        Program program = new Program();
        parser.addParseListener(new MyDSLBaseListener(program));
        parser.program();
        program.calcGrossSalary();
        program.calcNetSalary();
    }
}
