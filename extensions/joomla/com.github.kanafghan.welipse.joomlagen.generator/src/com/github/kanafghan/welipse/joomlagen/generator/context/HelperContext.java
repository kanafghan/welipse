package com.github.kanafghan.welipse.joomlagen.generator.context;


public class HelperContext extends CommonContext {
	
	final private String name;
	final private boolean generateLinkbar;
	
	public HelperContext(Context context, String name) {
		super(context);
		this.name = name;
		this.generateLinkbar = false;
	}

	public HelperContext(Context context, String name, boolean generateLinkbar) {
		super(context);
		this.name = name;
		this.generateLinkbar = generateLinkbar;
	}
		
	public String getName() {
		return name;
	}

	public boolean isGenerateLinkbar() {
		return generateLinkbar;
	}
}
