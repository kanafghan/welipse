package com.github.kanafghan.welipse.joomlagen.generator;

import org.eclipse.emf.ecore.EClass;

import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;
import com.github.kanafghan.welipse.webdsl.Page;

public class Utils {
	
	public static final String SQL_TABLE_NAME_PREFIX = "#__";
	
	private static int counter;
	
	private static Utils instance;
	
	private Utils() {
		counter = 0;
	}
	
	public static synchronized Utils getInstance() {
		if (instance == null) {
			instance = new Utils();
		}
		return instance;
	}
	
	public int generateID() {
		int id = ++counter;
		return id;
	}
	
	public static synchronized String getExtensionName(JoomlaGenModel joomlaGenModel) {
		if (joomlaGenModel.getExtensionName().isEmpty()) {
			return joomlaGenModel.getExtension().getName();
		}
		return joomlaGenModel.getExtensionName();
	}
	
	public static synchronized String getComponent(JoomlaGenModel joomlaGenModel) {
		return "com_"+ getExtensionName(joomlaGenModel).toLowerCase();
	}
	
	public static synchronized String getComponentName(JoomlaGenModel joomlaGenModel) {
		String name = getExtensionName(joomlaGenModel);
		return name.substring(0,1).toUpperCase() + name.substring(1);
	}

	public static synchronized String getPageName(Page page) {
		if (!page.getName().isEmpty()) {
			return page.getName();
		}
		return "Page"+ getInstance().generateID();
	}
	
	public static synchronized String getTableName(EClass table, JoomlaGenModel genModel) {
		String name = table.getName().toLowerCase();
		return SQL_TABLE_NAME_PREFIX +
				getExtensionName(genModel) +
				'_' + name;
	}
}
