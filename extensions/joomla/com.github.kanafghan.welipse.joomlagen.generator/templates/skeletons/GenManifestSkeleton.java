import com.github.kanafghan.welipse.joomlagen.generator.*;
import com.github.kanafghan.welipse.joomlagen.generator.context.*;

public class CLASS extends JExtension {
	
	protected void initialize(Object argument) {
		Context context = (Context) argument;
		this.joomlaGenModel = context.getGenModel();
	}
	
	protected boolean addInstall() {
		return this.joomlaGenModel.getDatamodel() != null;
	}
	
	protected boolean addUninstall() {
		return false;
	}
	
	protected boolean addUpdate() {
		return false;
	}
	
	public String generate(Object argument) {
		return "";
	} 
}
