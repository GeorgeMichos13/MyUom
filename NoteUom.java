import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JTextArea;

public class NoteUom {
	
	


	private JTextArea text;
	
	public NoteUom(JTextArea text) {
		
		
		this.text = text;
	}
	
	
	
public void createCourseFileNote(File myFile,JTextArea text) {
		
		
		
			FileWriter NoteWriter;
			try {
				NoteWriter = new FileWriter(myFile);
				NoteWriter.write(text.getText());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
		
		
	}



public void getNotesToText(File myFile,JTextArea text){
			
			
	
		try {
			Scanner  NoteReader = new Scanner(myFile);
			
			
			while(NoteReader.hasNextLine()) {
				String notes = NoteReader.nextLine();
				System.out.println(notes);
				text.setText(notes);
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Error");
			e.printStackTrace();
		}
		
	
	}

	

}
