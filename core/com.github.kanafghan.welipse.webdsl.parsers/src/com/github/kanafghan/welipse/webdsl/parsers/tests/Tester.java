package com.github.kanafghan.welipse.webdsl.parsers.tests;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import com.github.kanafghan.welipse.webdsl.Expression;
import com.github.kanafghan.welipse.webdsl.Parameter;
import com.github.kanafghan.welipse.webdsl.VariableInitialization;
import com.github.kanafghan.welipse.webdsl.parsers.expressions.ExpressionsLexer;
import com.github.kanafghan.welipse.webdsl.parsers.expressions.ExpressionsParser;

public class Tester {
	
	private static final int EXPRESSION = 0;
	private static final int VARIABLES = 1;
	private static final int PARAMETERS = 2;

	public static void main(String[] args) {
		// Test cases for testing expressions
		String[] expressions = {
			"1+2*2-5",
			"2*3/4+5-(3+(-2))",
			"player.name",
			"(1+(2+(3+(4+5))))+6",
			"8/2",
			"1*(2*3)*(4*5)",
			"x >= player.scores(true)"
		};
		// Test cases for creating Variables
		String[] vars = {
			"name:EString=player.name",
			"name : EString = player.name",
			"x:EInt = 2*(player.height-30)"
		};
		// Test cases for creating Parameters
		String[] params = {
			"player:Player",
			"x:EInt",
			"role : Role"
		};

		runTests(expressions, EXPRESSION);
		runTests(vars, VARIABLES);
		runTests(params, PARAMETERS);
	}

	private static void runTests(String[] expressions, int kind) {
		for (String tc: expressions) {
			CharStream charStream = new ANTLRStringStream(tc);
			ExpressionsLexer lexer = new ExpressionsLexer(charStream);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			ExpressionsParser parser = new ExpressionsParser(tokenStream);
			try {
				switch (kind) {
				case EXPRESSION:
					Expression e = parser.evaluator();
					System.out.println("Test Case: "+ tc +" PASSED ("+ e.toString() +")");
					break;
				case VARIABLES:
					VariableInitialization v = parser.initialization();
					System.out.println("Test Case: "+ tc +" PASSED ("+ v.toString() +")");
					break;
				case PARAMETERS:
					Parameter p = parser.parameter();
					System.out.println("Test Case: "+ tc +" PASSED ("+ p.toString() +")");
					break;
				default:
					break;
				}
			} catch (RecognitionException e) {
				System.err.println("Test Case: "+ tc +" FAILED ("+ e.getMessage() +")");
			} catch (Exception e) {
				System.err.println("Test Case: "+ tc +" FAILED ("+ e.getMessage() +")");
				e.printStackTrace();
			}
		}
	}

}
