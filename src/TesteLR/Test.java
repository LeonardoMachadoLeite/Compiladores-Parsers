package TesteLR;

import CompilerBase.LR.*;

public class Test {
    public static void main(final String[] args) {

        final Parser parser = new ExpressionParser();

        parser.Parse("[2+2]*4");
    }
}