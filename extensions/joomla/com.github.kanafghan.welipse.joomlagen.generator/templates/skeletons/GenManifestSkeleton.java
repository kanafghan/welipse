import com.github.kanafghan.welipse.joomlagen.generator.*;
import com.github.kanafghan.welipse.joomlagen.generator.context.*;

public class CLASS extends JExtension {
	
	protected void initialize(Object argument) {
		Context context = (Context) argument;
		this.joomlaGenModel = context.getGenModel();
	}
	
	protected boolean addInstall() {
		//TODO replace this with a parameter from gen model
		return this.joomlaGenModel.getDatamodel() != null;
	}
	
	protected boolean addUninstall() {
		//TODO implement this using a parameter from gen model
		return false;
	}
	
	protected boolean addUpdate() {
		//TODO implement this using a parameter from gen model
		return false;
	}
	
	protected boolean addMedia() {
		//TODO implement this using a parameter from gen model
		return true;
	}
	
	public String generate(Object argument) {
		return "";
	} 
}
