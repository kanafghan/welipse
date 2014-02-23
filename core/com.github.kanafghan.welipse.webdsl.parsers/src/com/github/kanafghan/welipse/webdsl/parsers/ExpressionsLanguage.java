package com.github.kanafghan.welipse.webdsl.parsers;

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

public class ExpressionsLanguage {

	private static ExpressionsLanguage instance;
	
	private CharStream charStream;
	private ExpressionsLexer lexer;
	private TokenStream tokenStream;
	private ExpressionsParser parser;
	
	private ExpressionsLanguage() {
		// initialized with an empty expression
		charStream = new ANTLRStringStream(" ");
		lexer = new ExpressionsLexer(charStream);
		tokenStream = new CommonTokenStream(lexer);
		parser = new ExpressionsParser(tokenStream);
	}
	
	public static ExpressionsLanguage getInstace() {
		if (instance == null) {
			instance = new ExpressionsLanguage();
		}
		return instance;
	}
	
	public void setText(String expression) {
		charStream = new ANTLRStringStream(expression);
		lexer = new ExpressionsLexer(charStream);
		tokenStream = new CommonTokenStream(lexer);
		parser = new ExpressionsParser(tokenStream);
	}
	
	public Expression getExpression() throws Exception {
		Expression result = null;
		
		try {
			result = parser.evaluator();
		} catch (RecognitionException e) {
			throw new Exception(e.getMessage());
		}
		
		return result;
	}
	
	public VariableInitialization getVariable() throws Exception {
		VariableInitialization result = null;
		
		try {
			result = parser.initialization();
		} catch (RecognitionException e) {
			throw new Exception(e.getMessage());
		}
		
		return result;
	}
	
	public Parameter getParameter() throws Exception {
		Parameter result = null;
		
		try {
			result = parser.parameter();
		} catch (RecognitionException e) {
			throw new Exception(e.getMessage());
		}
		
		return result;
	}
	
}
