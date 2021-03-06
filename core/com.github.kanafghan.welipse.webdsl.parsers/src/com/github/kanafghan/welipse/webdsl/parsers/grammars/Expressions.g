grammar Expressions;

options {
	language = Java;
}

@header {
	package com.github.kanafghan.welipse.webdsl.parsers.expressions;
	
	import com.github.kanafghan.welipse.webdsl.*;
}

@lexer::header {
    package com.github.kanafghan.welipse.webdsl.parsers.expressions;
}

expressions returns [Expression result]
	:	expression {$result = $expression.result;}
	;
	
expression returns [Expression result]
	:	term11 {$result = $term11.result;}	
	;
	
term0 returns [Expression result]
	:	variableUse {$result = $variableUse.result;}
	|	'(' expression ')' {$result = $expression.result;}
	|	constantExpression {$result = $constantExpression.result;}
	|	classifierOperation {$result = $classifierOperation.result;}
	|	structuralExpression {$result = $structuralExpression.result;}
	|	listExpression {$result = $listExpression.result;}
	|	webUtilsExpression {$result = $webUtilsExpression.result;}
	;
	
term1 returns [Expression result]
	:	{ boolean negated = false; }
		(
			'!'
			{  negated = !negated; }
		)* term0
		{
			if (negated) {
				BooleanOperation e = WebDSLFactory.eINSTANCE.createBooleanOperation();
				e.getOperands().add($term0.result);
				e.setOperator(BooleanOperator.NEGATION);
				$result = e;
			} else {
				$result = $term0.result;
			}
		}
	;	

term2 returns [Expression result]
	:	{boolean positive = true;}
		('+' | '-' {positive = !positive;})* term1
		{
			$result = $term1.result;
			if (!positive) {
				ArithmeticOperation e = WebDSLFactory.eINSTANCE.createArithmeticOperation();
				e.getOperands().add($result);
				e.setOperator(ArithmeticOperator.NEGATION);
				$result = e;
			}
		}
	;

term3 returns [Expression result]
	:	op1 = term2 { $result = $op1.result; }
		(	'*' op2 = term2
			{
				ArithmeticOperation e = WebDSLFactory.eINSTANCE.createArithmeticOperation();
				e.getOperands().add($op1.result);
				e.getOperands().add($op2.result);
				e.setOperator(ArithmeticOperator.MULTIPLICATION);
				$result = e;
			}
		|	'/' op2 = term2
			{
				ArithmeticOperation e = WebDSLFactory.eINSTANCE.createArithmeticOperation();
				e.getOperands().add($op1.result);
				e.getOperands().add($op2.result);
				e.setOperator(ArithmeticOperator.DIVISION);
				$result = e;
			}		
		)*
	;

term4 returns [Expression result]
	:	op1 = term3 { $result = $op1.result; }
		(	'+' op2 = term3
			{
				ArithmeticOperation e = WebDSLFactory.eINSTANCE.createArithmeticOperation();
				e.getOperands().add($op1.result);
				e.getOperands().add($op2.result);
				e.setOperator(ArithmeticOperator.ADDITION);
				$result = e;
			}
		|	'-' op2 = term3
			{
				ArithmeticOperation e = WebDSLFactory.eINSTANCE.createArithmeticOperation();
				e.getOperands().add($op1.result);
				e.getOperands().add($op2.result);
				e.setOperator(ArithmeticOperator.SUBTRACTION);
				$result = e;
			}
		)*
	;

term5 returns [Expression result]
	:	op1 = term4 { $result = $op1.result; }
		(	'>' op2 = term4
			{	
				ComparisonOperation e = WebDSLFactory.eINSTANCE.createComparisonOperation();
				e.getOperands().add($op1.result);			
				e.getOperands().add($op2.result);
				e.setOperator(ComparisonOperator.GREATER_THAN);
				$result = e;
			}
		|	'<' op2 = term4
			{
				ComparisonOperation e = WebDSLFactory.eINSTANCE.createComparisonOperation();
				e.getOperands().add($op1.result);
				e.getOperands().add($op2.result);
				e.setOperator(ComparisonOperator.LESS_THAN);
				$result = e;
			}
		|	'>=' op2 = term4
			{
				ComparisonOperation e = WebDSLFactory.eINSTANCE.createComparisonOperation();
				e.getOperands().add($op1.result);
				e.getOperands().add($op2.result);
				e.setOperator(ComparisonOperator.GREATER_THAN_EQUAL);
				$result = e;
			}
		|	'<=' op2 = term4
			{
				ComparisonOperation e = WebDSLFactory.eINSTANCE.createComparisonOperation();
				e.getOperands().add($op1.result);
				e.getOperands().add($op2.result);
				e.setOperator(ComparisonOperator.LESS_THAN_EQUAL);
				$result = e;
			}
		)*
	;
	
term6 returns [Expression result]
	:	op1 = term5 { $result = $op1.result; }
		(	'==' op2 = term5
			{	
				ComparisonOperation e = WebDSLFactory.eINSTANCE.createComparisonOperation();
				e.getOperands().add($op1.result);
				e.getOperands().add($op2.result);
				e.setOperator(ComparisonOperator.EQUAL);
				$result = e;
			}
		|	'!=' op2 = term5
			{
				ComparisonOperation e = WebDSLFactory.eINSTANCE.createComparisonOperation();
				e.getOperands().add($op1.result);
				e.getOperands().add($op2.result);
				e.setOperator(ComparisonOperator.NOT_EQUAL);
				$result = e;
			}
		)*
	;	

term7 returns [Expression result]
	:	op1 = term6 { $result = $op1.result; }
		(	'&&' op2 = term6
			{
				BooleanOperation e = WebDSLFactory.eINSTANCE.createBooleanOperation();
				e.getOperands().add($op1.result);
				e.getOperands().add($op2.result);
				e.setOperator(BooleanOperator.CONJUNCTION);
				$result = e;
			}
		)*	
	;

term8 returns [Expression result]
	:	op1 = term7 { $result = $op1.result; }
		(	'||' op2 = term7
			{
				BooleanOperation e = WebDSLFactory.eINSTANCE.createBooleanOperation();
				e.getOperands().add($op1.result);
				e.getOperands().add($op2.result);
				e.setOperator(BooleanOperator.DISJUNCTION);
				$result = e;
			}
		)*	
	;

term9 returns [Expression result]
	:	op1 = term8 { $result = $op1.result; } 
		(	'.' 'concat(' op2 = term8 ')'
			{
				StringOperation e = WebDSLFactory.eINSTANCE.createStringOperation();
				e.getOperands().add($op1.result);
				e.getOperands().add($op2.result);
				e.setOperator(StringOperator.CONCATENATION);
				$result = e;
			}
		)*
	;
	
term10 returns [Expression result]
	:	op = term9 { $result = $op.result; }
		(	'.' 'length'
			{
				StringOperation e = WebDSLFactory.eINSTANCE.createStringOperation();
				e.getOperands().add($op.result);
				e.setOperator(StringOperator.LENGTH);
				$result = e;
			}
		)?
	;
	
term11 returns [Expression result]
	:	key = term10 { $result = $key.result; }
		(
			'=>' value = term10
			{
				ListElement le = WebDSLFactory.eINSTANCE.createListElement();
				le.setKey($key.result);
				le.setValue($value.result);
				$result = le;
			}
		)?
	;
	
variableUse returns [Expression result]
	:	IDENT
		{
			VariableExp e = WebDSLFactory.eINSTANCE.createVariableExp();
			e.setVar($IDENT.text);
			$result = e;
		}
	;

classifierOperation returns [Expression result]
	:	{
			ClassifierOperation e = WebDSLFactory.eINSTANCE.createClassifierOperation();
			$result = e;
		}	
		src = variableUse '.' IDENT '('
		{
			e.setSource($src.result);
			e.setIdentifier($IDENT.text);
		}
		(	e1 = expression 
			{
				e.getArguments().add($e1.result);
			}
			(	',' 
				e2 = expression
				{
					e.getArguments().add($e2.result);
				}
			)*
		)? ')'
	;
	
webUtilsExpression returns [Expression result]
	:	'WebUtils' '.' IDENT '(' ')'
		{
			WebUtilExp e = WebDSLFactory.eINSTANCE.createWebUtilExp();
			e.setIdentifier($IDENT.text);
			$result = e;
		}
	;
	
listExpression returns [Expression result]
	:	{
			ListExp list = WebDSLFactory.eINSTANCE.createListExp();
			$result = list;
		}
		'['
			(
				e1 = expression
				{
					list.getElements().add($e1.result);
				}
				(
					','
					e2 = expression
					{
						list.getElements().add($e2.result);
					}
				)*
			)?
		']'
	;

structuralExpression returns [Expression result]
	:	{
			StructuralExp e = WebDSLFactory.eINSTANCE.createStructuralExp();
			$result = e;
		}	
		src = variableUse '.' IDENT
		{
			e.setSource($src.result);
			e.setIdentifier($IDENT.text);
		}
	;

constantExpression returns [Expression result]
	:	numberConstant {$result = $numberConstant.result;}
	|	booleanConstant {$result = $booleanConstant.result;}
	|	stringConstant {$result = $stringConstant.result;}
	;

numberConstant returns [Expression result]
	:	i = integerConstant { $result = i; }
	|	r = realConstant { $result = r; }
	;
	
integerConstant returns [Expression result]
	:	INTEGER
		{
			IntegerConstant e = WebDSLFactory.eINSTANCE.createIntegerConstant();
			e.setValue(Integer.parseInt($INTEGER.text));
			$result = e;
		}
	;
	
realConstant returns [Expression result]
	:	DECIMAL
		{
			RealConstant e = WebDSLFactory.eINSTANCE.createRealConstant();
			e.setValue(Double.parseDouble($DECIMAL.text));
			$result = e;
		}
	;
	
stringConstant returns [Expression result]
	:	STRING
		{
			StringConstant e = WebDSLFactory.eINSTANCE.createStringConstant();
			e.setValue($STRING.text);
			$result = e;
		}
	;

booleanConstant returns [Expression result]
	:	'true'	
		{ 
			BooleanConstant e = WebDSLFactory.eINSTANCE.createBooleanConstant();
			$result = e;
			e.setValue(true); 
		}
	|	'false' 
		{ 
			BooleanConstant e = WebDSLFactory.eINSTANCE.createBooleanConstant();
			$result = e;
			e.setValue(false); 
		}
	;

// Variable Declaration and Initialization
initialization returns [VariableInitialization result]
	:	v = IDENT ':' t = IDENT '=' e = expression
		{
			VariableInitialization var = WebDSLFactory.eINSTANCE.createVariableInitialization();
			var.setVar($v.text);
			var.setClassifier($t.text);
			var.setDeclaration($v.text +" : "+ $t.text);
			var.setInitExp($e.result);
			$result = var;
		}
	;

parameter returns [Parameter result]
	:	v = IDENT ':' t = IDENT
		{
			Parameter p = WebDSLFactory.eINSTANCE.createParameter();
			p.setVar($v.text);
			p.setClassifier($t.text);
			p.setDeclaration($v.text +" : "+ $t.text);
			$result = p;
		}
	;
	
INTEGER : '0'..'9'+;
DECIMAL : INTEGER '.' INTEGER | '.' INTEGER | INTEGER '.';

IDENT : ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '$' | '0'..'9')*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};

/*
 * The following is taken from:
 * http://stackoverflow.com/questions/504402/how-to-handle-escape-sequences-in-string-literals-in-antlr-3
 */
STRING      
@init{final StringBuilder lBuf = new StringBuilder();}
	:
		'"'
		( ESC[lBuf] 
		| normal=~('"'|'\\'|'\n'|'\r') { lBuf.appendCodePoint(normal); } 
		)*
		'"'
		{ setText(lBuf.toString()); }
	;

fragment
ESC[StringBuilder buf]
:   '\\'
	(   'n'    {buf.append("\n");}
	|   'r'    {buf.append("\r");}
	|   't'    {buf.append("\t");}
	|   'b'    {buf.append("\b");}
	|   'f'    {buf.append("\f");}
	|   '\''   {buf.append("\'");}
	|   '/'    {buf.append("/");}
	|   '\\'   {buf.append("\\");}
	|   '"'    {buf.append("\"");}
	)
    ;