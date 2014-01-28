package com.github.kanafghan.welipse.joomlagen.generator.context;


public class HelperContext {
	
	final private Context context;
	final private String name;
	final private boolean generateLinkbar;
	
	public HelperContext(Context context, String name) {
		super();
		this.context = context;
		this.name = name;
		this.generateLinkbar = false;
	}

	public HelperContext(Context context, String name, boolean generateLinkbar) {
		super();
		this.context = context;
		this.name = name;
		this.generateLinkbar = generateLinkbar;
	}
	
	public Context getContext() {
		return context;
	}
	
	public String getName() {
		return name;
	}

	public boolean isGenerateLinkbar() {
		return generateLinkbar;
	}
}
