import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

import javax.swing.JTextArea;

public class Notes {
	
	
		
		
		private JTextArea text;
		
		public Notes(JTextArea text) {
			
			
			this.text = text;
		}
		
		
		
	public void writeToFile(File myFile,JTextArea text) {
			
			
				try {
					
					FileOutputStream out = new FileOutputStream(myFile);
					String textArea = text.getText();
					OutputStreamWriter writer = new OutputStreamWriter(out);
					Writer fileWriter = new BufferedWriter(writer);
					Scanner  NoteReader = new Scanner(myFile);
					
					if(NoteReader.hasNext()) {
						fileWriter.write("");
					}
					
					fileWriter.write(textArea);
					fileWriter.close();
					NoteReader.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}



	public void readFromFile(File myFile,JTextArea text){
				
				
		
			try {
				if(!myFile.exists()) {
					text.setText("");
					System.out.println("The file does not exist" + myFile);
				}
				else {
					Scanner  NoteReader = new Scanner(myFile);
					
					while(NoteReader.hasNextLine()) {
					String notes = NoteReader.nextLine();
					text.append(notes + " "+ "\n");
					}
					NoteReader.close();
				}
				
				
			} catch (FileNotFoundException e) {
				
				System.out.println("Error");
				e.printStackTrace();
			}
			
		
		}


}
