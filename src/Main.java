

import java.awt.EventQueue;
import java.io.File;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {	

		ArrayList<Course> FCourses = new ArrayList<Course>();
			
			GUI();	//Panel Initiation
	
	}//main
	
	public static void GUI() {
		
		File tempFile = new File( "CourseStats.ser" ); 
		boolean exists = tempFile.exists();
		if(exists)
		{
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						MainFrame mainwindow = new MainFrame();
						mainwindow.frmMainframe.setVisible(true);
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
						CheckBoxGUI initwindow = new CheckBoxGUI();
						initwindow.frmInitScreen.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}//GUI
	


}//Main

