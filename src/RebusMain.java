import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class RebusMain {
    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromFileName("Main.rebus");
        RebusLexer lexer = new RebusLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RebusParser parser = new RebusParser(tokens);
        ParseTree tree = parser.program();

        RebusInterpreter interpreter = new RebusInterpreter();
        interpreter.visit(tree);
    }
}