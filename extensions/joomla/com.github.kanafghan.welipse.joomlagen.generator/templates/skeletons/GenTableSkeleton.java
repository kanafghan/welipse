import java.util.*;

import com.github.kanafghan.welipse.joomlagen.generator.*;
import com.github.kanafghan.welipse.joomlagen.generator.context.*;
import com.github.kanafghan.welipse.webdsl.PageElement;

import org.eclipse.emf.ecore.*;

public class CLASS extends JExtension {
	
	private EClass table;
	
	protected void initialize(Object argument) {
		TableContext context = (TableContext) argument;
		this.joomlaGenModel = context.getContext().getGenModel();
		this.table = context.getTable();
	}
	
	protected String getTableName() {
		String name = this.table.getName();
		return name.substring(0,1).toUpperCase() + name.substring(1);
	}
	
	protected String getSQLTableName() {
		return Utils.getTableName(this.table, this.joomlaGenModel);
	}
	
	public String generate(Object argument) {
		return "";
	}
}
