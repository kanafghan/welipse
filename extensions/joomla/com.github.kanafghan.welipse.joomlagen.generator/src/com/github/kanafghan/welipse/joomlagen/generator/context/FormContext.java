package com.github.kanafghan.welipse.joomlagen.generator.context;

import com.github.kanafghan.welipse.joomlagen.GenClass;

public class FormContext {
	
	final private Context context;
	final private GenClass model;
	
	public FormContext(Context context, GenClass model) {
		super();
		this.context = context;
		this.model = model;
	}

	public Context getContext() {
		return context;
	}

	public GenClass getModel() {
		return model;
	}
}
