package TesteLL;

import CompilerBase.LL.*;

public class Test {
    public static void main(final String[] args) {

        final Parser parser = new ExpressionParser();

        // parser.Parse("((4+4)*2/8-1)+((4+4)*2/8-1)");
        parser.Parse("((4+4)*2/8-1) + ((4+4)*2/8-1)");
    }
}