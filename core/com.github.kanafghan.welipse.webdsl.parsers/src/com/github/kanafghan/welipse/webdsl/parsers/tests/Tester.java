package com.github.kanafghan.welipse.webdsl.parsers.tests;

import com.github.kanafghan.welipse.webdsl.Expression;
import com.github.kanafghan.welipse.webdsl.Parameter;
import com.github.kanafghan.welipse.webdsl.VariableInitialization;
import com.github.kanafghan.welipse.webdsl.parsers.ExpressionsLanguage;

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
			"c.c1",
			"(1+(2+(3+(4+5))))+6",
			"8/2",
			"1*(2*3)*(4*5)",
			"x >= player.scores(true)",
			"\"hello\".length",
			"\"hello\".concat(\" world\")"
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
			ExpressionsLanguage parser = ExpressionsLanguage.getInstace();
			parser.setExpression(tc);
			try {
				switch (kind) {
				case EXPRESSION:
					Expression e = parser.getExpression();
					System.out.println("Test Case: "+ tc +" PASSED ("+ e.toString() +")");
					break;
				case VARIABLES:
					VariableInitialization v = parser.getVariable();
					System.out.println("Test Case: "+ tc +" PASSED ("+ v.toString() +")");
					break;
				case PARAMETERS:
					Parameter p = parser.getParameter();
					System.out.println("Test Case: "+ tc +" PASSED ("+ p.toString() +")");
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.err.println("Test Case: "+ tc +" FAILED ("+ e.getMessage() +")");
				e.printStackTrace();
			}
		}
	}
}
