package runtime;

import gen.MintLexer;
import gen.MintParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MintMain {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java runtime.MintMain <filename.mint>");
            System.exit(1);
        }

        try {
            // Read .mint file
            CharStream input = CharStreams.fromFileName(args[0]);

            // Lexer & token stream
            MintLexer lexer = new MintLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Parse
            MintParser parser = new MintParser(tokens);
            ParseTree tree = parser.program();

            // Print tokens AFTER parser starts parsing
            tokens.fill();

            // Visit
            MintEvaluator evaluator = new MintEvaluator();
            evaluator.visit(tree);

            System.out.println(tree.toStringTree(parser));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
