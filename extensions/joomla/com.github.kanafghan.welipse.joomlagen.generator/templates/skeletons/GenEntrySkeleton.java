import com.github.kanafghan.welipse.joomlagen.generator.*;
import com.github.kanafghan.welipse.joomlagen.generator.context.*;

public class CLASS extends JExtension {
	
	protected void initialize(Object argument) {
		Context context = (Context) argument; 
		this.joomlaGenModel = context.getGenModel();
	}
	
	private String[] getCSS() {
		String[] files = new String[0];
		
		if (!this.joomlaGenModel.getCSS().isEmpty()) {
			files = this.joomlaGenModel.getCSS().split(Utils.CSS_FILES_SEPARATOR);
			for (int i=0; i<files.length; i++) {
				files[i] = Utils.getFileName(files[i]);
			}
		}
		
		return files;
	}
	
	public String generate(Object argument) {
		return "";
	}
}
