package com.github.kanafghan.welipse.webdsl.etc;

import com.github.kanafghan.welipse.webdsl.ArithmeticOperator;
import com.github.kanafghan.welipse.webdsl.StringOperator;

public class ExpressionUtils {

	public static String getOperatorSymbol(ArithmeticOperator operator) {
		String symbol = "";
		
		switch (operator) {
		case ADDITION:
			symbol = "+";
			break;
		case SUBTRACTION:
			symbol = "-";
			break;
		case MULTIPLICATION:
			symbol = "*";
			break;
		case DIVISION:
			symbol = "/";
			break;
		default:
			// Unknown operator
			break;
		}
		
		return symbol;
	}

	public static String getOperatorSymbol(StringOperator operator) {
		String symbol = "";
		
		switch (operator) {
		case CONCATENATION:
			symbol = ".";
			break;
		default:
			// Unknown operator
			break;
		}
		
		return symbol;
	}

}
