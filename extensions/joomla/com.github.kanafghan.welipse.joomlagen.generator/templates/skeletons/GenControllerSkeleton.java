import com.github.kanafghan.welipse.joomlagen.generator.*;
import com.github.kanafghan.welipse.joomlagen.generator.context.*;

public class CLASS extends JExtension {

	protected String controllerName;

	protected void initialize(Object argument) {
		ControllerContext context = (ControllerContext) argument; 
		this.joomlaGenModel = context.getContext().getGenModel();
		this.controllerName = context.getName();
	}
	
	private String getControllerName() {
		return this.controllerName;
	}
	
	public String generate(Object argument) {
		return "";
	}
}
