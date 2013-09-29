import com.github.kanafghan.welipse.joomlagen.generator.*;
import com.github.kanafghan.welipse.joomlagen.generator.context.*;

public class CLASS extends JExtension {
	
	protected void initialize(Object argument) {
		Context context = (Context) argument;
		this.joomlaGenModel = context.getGenModel();
	}
	
	public String generate(Object argument) {
		return "";
	} 
}
