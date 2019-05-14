

import java.awt.EventQueue;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//XlsReader re = new XlsReader();	GINONTAI STHN CHECKBOXGUI()
		//re.read();						GINONTAI STHN CHECKBOXGUI()		  
		//re.printCoursesStats();
		//re.printCourses();
		
		File myDir = new File("C:\\Users\\GEORGE MICHOS\\eclipse-workspace\\MyUom");
		File lessons = new File(myDir, "lessons.txt");
		
		try {
			FileWriter w = new FileWriter(lessons);
			w.write("My name is JEEEFFF \r\n");
			w.write("Διακριτα μαθηματικα \r\n");
			w.write("Διακριτα μαθηματικα1 \r\n");
			w.write("Διακριτα μαθηματικα2 \r\n");
			w.write("Διακριτα μαθηματικα3 \r\n");
			w.write("Διακριτα μαθηματικα4 \r\n");
			w.write("Διακριτα μαθηματικα5 \r\n");
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		GUI();	//Panel Initiation
	
		
		
	}//main
	
	public static void GUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBoxGUI window = new CheckBoxGUI();
					window.frmInitScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}//GUI
	


}//Main

