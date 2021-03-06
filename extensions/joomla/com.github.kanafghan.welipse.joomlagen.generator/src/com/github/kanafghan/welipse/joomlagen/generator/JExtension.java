package com.github.kanafghan.welipse.joomlagen.generator;

import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;

/**
 * 
 * @author KanAfghan
 * @deprecated will be removed (was used with JET)
 */
public abstract class JExtension {
	
	protected JoomlaGenModel joomlaGenModel;
	
	protected abstract void initialize(Object argument);
	
	protected String getExtensionName() {
		return Utils.getExtensionName(joomlaGenModel);
	}
	
	protected String getComponent() {
		return Utils.getComponent(joomlaGenModel);
	}
	
	protected String getComponentName() {
		return Utils.getComponentName(this.joomlaGenModel);
	}
	
	protected String getHomePageName() {
		String result = "";
//		Website website = joomlaGenModel.getExtension();
//		if (website != null) {
//			Page homePage = website.getHome();
//			if (homePage != null) {
//				result = homePage.getName();
//			}			
//		}
		return result;
	}
}
