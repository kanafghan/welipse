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
			"42",
			"42.987",
			"0.42",
			"42.0",
			".42",
			"42.",
			"\"\"",
			"\"Welipse\"",
			"true",
			"false",
			"player",
			"player.name",
			"player.calculateAge()",
			"player.getGoals(match)",
			"player.calculateAge(bY, bM, bD)",
			"WebUtils.getAllPlayers()",
			"[]",
			"[\"Welipse\"]",
			"[\"Male\", \"Female\"]",
			"[1 => \"One\", 2 => \"Two\", 3 => \"Three\", 4 => \"Four\", 5 => \"Five\"]",
			"\"Welipse\".length",
			"\"Hello\".concat(\" World!\")",
			"\"Name: \".concat(player.name)",
			"1+2-5",
			"2*3/4",
			"2*3/4+5-(3+(-2))",
			"2*3/height+5-(weight+(-2))",
			"3>2<6>=(5<=19)",
			"(3==5)!=19",
			"3>weight<6==(height!=190)",
			"!(3>x)",
			"(3>x) && (y==4)",
			"(5>y) || (3==y)",
			"!((5>y) || (3==y)) && ((player.weight>x) && (y==player.height))"
		};
		// Test cases for creating Variables
		String[] vars = {
			"name:EString=player.name",
			"name : EString = player.name",
			"name:EString=",
			"name:EString"
		};
		// Test cases for creating Parameters
		String[] params = {
			"player:Player",
			"player : Player"
		};

		runTests(expressions, EXPRESSION);
		runTests(vars, VARIABLES);
		runTests(params, PARAMETERS);
	}

	private static void runTests(String[] expressions, int kind) {
		for (String tc: expressions) {
			ExpressionsLanguage parser = ExpressionsLanguage.getInstace();
			parser.setText(tc);
			try {
				switch (kind) {
				case EXPRESSION:
					Expression e = parser.getExpression();
					if (e != null) {						
						System.out.println("Test Case: "+ tc +" PASSED ("+ e.toString() +")");
					} else {
						throw new Exception("Could not parse the expression!");
					}
					break;
				case VARIABLES:
					VariableInitialization v = parser.getVariable();
					if (v != null && v.getInitExp() != null) {						
						System.out.println("Test Case: "+ tc +" PASSED ("+ v.toString() +")");
					} else {
						throw new Exception("Could not parse the variable initialization!");
					}
					break;
				case PARAMETERS:
					Parameter p = parser.getParameter();
					if (p != null) {						
						System.out.println("Test Case: "+ tc +" PASSED ("+ p.toString() +")");
					} else {
						throw new Exception("Could not parse the parameter!");
					}
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.err.println("Test Case: "+ tc +" FAILED ("+ e.getMessage() +")");
//				e.printStackTrace();
			}
		}
	}
}
