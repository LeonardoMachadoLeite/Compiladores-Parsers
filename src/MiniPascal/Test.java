package MiniPascal;

public class Test {

    public static void main(final String[] args) {

        final MiniPascalParser parser = new MiniPascalParser();

        String text = 
            "program teste (input, output);\n" +
            "begin\n" +
            "end.\n";

        try {
            parser.Parse(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
}
}