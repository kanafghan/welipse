import com.github.kanafghan.welipse.joomlagen.generator.*;
import com.github.kanafghan.welipse.joomlagen.generator.context.*;
import com.github.kanafghan.welipse.webdsl.*;

import java.util.*;

public class CLASS extends JExtension {

	protected Page page;
	
	protected void initialize(Object argument) {
		ViewContext viewContext = (ViewContext) argument; 
		this.joomlaGenModel = viewContext.getContext().getGenModel();
		this.page = viewContext.getPage();
	}
	
	private String getViewName() {
		String name = this.page.getName();
		return name.substring(0,1).toUpperCase() + name.substring(1);
	}
	
	private List<PageElement> getElements() {
		if (page != null) {			
			return (List<PageElement>) this.page.getElements();
		}
		return new ArrayList<PageElement>();
	}
	
	private String buildURL(Link link) {
		String url = "";
		if (link instanceof InternalLink) {
			url = "?option="+ getComponent();
			PageElement target = ((InternalLink) link).getTarget();
			if (target != null) {				
				Page targetPage = target.getPage();
				if (targetPage != null) {
					url += "&view="+ targetPage.getName().toLowerCase();
				}
			}
		}
		return url;
	}	
	
	public String generate(Object argument) {
		return "";
	}
}
