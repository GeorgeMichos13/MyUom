import java.io.File;

import javax.swing.JButton;

public class MyJButton extends JButton {
	
		
	private String name;
	private File aFile;

	
	
	public MyJButton(String name, File aFile) {
		super(name);
		this.aFile = aFile;
		
	}
}