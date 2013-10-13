package com.github.kanafghan.welipse.joomlagen.generator.context;

import org.eclipse.emf.ecore.EClass;

public class FormContext {
	
	final private Context context;
	final private EClass model;
	
	public FormContext(Context context, EClass model) {
		super();
		this.context = context;
		this.model = model;
	}

	public Context getContext() {
		return context;
	}

	public EClass getModel() {
		return model;
	}
}
