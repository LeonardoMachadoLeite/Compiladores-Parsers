package main;

import CompilerBase.LL.Parser;
import TesteLL.ExpressionParser;

public class Main {
	
	public static void main(String[] args) {
		Parser parser = new ExpressionParser();
		System.out.println(parser.Parse("{((2+2))}"));
	}

}
