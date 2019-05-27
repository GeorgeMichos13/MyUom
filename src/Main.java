

import java.awt.EventQueue;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//XlsReader re = new XlsReader();	
		//re.read();						  
		//re.printCoursesStats();
		//re.printCourses();
		

		ArrayList<Course> FCourses = new ArrayList<Course>();
			
			GUI();
		
			//Panel Initiation
	
		
		
	}//main
	
	public static void GUI() {
		File tempFile = new File( "CourseStats.ser" ); 
		boolean exists = tempFile.exists();
		if(exists)
		{
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						MainFrame window = new MainFrame();
						window.frmMainframe.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		else
		{	
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
		}
	}//GUI
	


}//Main

