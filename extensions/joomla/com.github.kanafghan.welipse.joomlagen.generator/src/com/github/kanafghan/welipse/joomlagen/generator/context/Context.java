package com.github.kanafghan.welipse.joomlagen.generator.context;

import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;

public class Context {
	
	final private JoomlaGenModel genModel;
	
	public Context(JoomlaGenModel genModel) {
		super();
		this.genModel = genModel;
	}

	public JoomlaGenModel getGenModel() {
		return genModel;
	}
}
