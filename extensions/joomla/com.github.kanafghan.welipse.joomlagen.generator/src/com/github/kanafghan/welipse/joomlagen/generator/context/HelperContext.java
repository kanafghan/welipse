package com.github.kanafghan.welipse.joomlagen.generator.context;


public class HelperContext {
	
	final private Context context;
	final private String name;
	
	public HelperContext(Context context, String name) {
		super();
		this.context = context;
		this.name = name;
	}

	public Context getContext() {
		return context;
	}
	
	public String getName() {
		return name;
	}
}
