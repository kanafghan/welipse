package com.github.kanafghan.welipse.webdsl.etc;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcoreFactory;

import com.github.kanafghan.welipse.webdsl.ArithmeticOperator;
import com.github.kanafghan.welipse.webdsl.BooleanOperator;
import com.github.kanafghan.welipse.webdsl.ComparisonOperator;
import com.github.kanafghan.welipse.webdsl.StringOperator;

public class ExpressionUtils {

	public static final String[] primitiveTypes = {"EInt", "EString", "EByte", "EShort", "EFloat", "EDouble"};
	
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

	public static boolean isNumerical(EClassifier type) {
		if (type.getName().equals("EByte")) {
			return true;
		} else if (type.getName().equals("EShort")) {
			return true;
		} else if (type.getName().equals("EInt")) {
			return true;
		} else if (type.getName().equals("EFloat")) {
			return true;
		} else if (type.getName().equals("EDouble")) {
			return true;
		}
		return false;
	}

	public static String getOperatorSymbol(BooleanOperator operator) {
		String symbol = "";
		
		switch (operator) {
		case NEGATION:
			symbol = "!";
			break;
		case CONJUNCTION:
			symbol = "&&";
			break;
		case DISJUNCTION:
			symbol = "||";
			break;
		default:
			// Unknown operator
			break;
		}
		
		return symbol;
	}

	public static String getOperatorSymbol(ComparisonOperator operator) {
		String symbol = "";
		
		switch (operator) {
		case EQUAL:
			symbol = "==";
			break;
		case GREATER_THAN:
			symbol = ">";
			break;
		case GREATER_THAN_EQUAL:
			symbol = ">=";
			break;
		case LESS_THAN:
			symbol = "<";
			break;
		case LESS_THAN_EQUAL:
			symbol = "<=";
			break;
		case NOT_EQUAL:
			symbol = "!=";
			break;
		default:
			// Unknown operator
			break;
		}
		
		return symbol;
	}

	public static boolean isString(EClassifier type) {
		if (type.getName().equals("EString")) {
			return true;
		}
		return false;
	}

	public static boolean isBoolean(EClassifier type) {
		if (type.getName().equals("EBoolean")) {
			return true;
		}
		return false;
	}

	public static boolean isPrimitiveType(String classifier) {
		for (String type : primitiveTypes) {
			if (type.equals(classifier)) {
				return true;
			}
		}
		return false;
	}

	public static EClassifier getDataType(String classifier) {
		for (String name : primitiveTypes) {
			if (name.equals(classifier)) {
				return EcoreFactory.eINSTANCE.getEcorePackage().getEClassifier(name);
			}
		}
		return null;
	}

}
