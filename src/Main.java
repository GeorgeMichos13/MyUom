

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
		
<<<<<<< HEAD
=======
		//test for github
		
	    System.out.println("test for github");
	    
	    //test 2 for github
	    System.out.println("test 2 for github");
>>>>>>> parent of 8d22573... commit test 2 (2)
		
		File myDir = new File("C:\\Users\\GEORGE MICHOS\\eclipse-workspace\\MyUom");
		File lessons = new File(myDir, "lessons.txt");
		
		try {
			FileWriter w = new FileWriter(lessons);
			w.write("My name is JEEEFFF \r\n");
			w.write("Î”Î¹Î±ÎºÏ�Î¹Ï„Î± Î¼Î±Î¸Î·Î¼Î±Ï„Î¹ÎºÎ± \r\n");
			w.write("Î”Î¹Î±ÎºÏ�Î¹Ï„Î± Î¼Î±Î¸Î·Î¼Î±Ï„Î¹ÎºÎ±1 \r\n");
			w.write("Î”Î¹Î±ÎºÏ�Î¹Ï„Î± Î¼Î±Î¸Î·Î¼Î±Ï„Î¹ÎºÎ±2 \r\n");
			w.write("Î”Î¹Î±ÎºÏ�Î¹Ï„Î± Î¼Î±Î¸Î·Î¼Î±Ï„Î¹ÎºÎ±3 \r\n");
			w.write("Î”Î¹Î±ÎºÏ�Î¹Ï„Î± Î¼Î±Î¸Î·Î¼Î±Ï„Î¹ÎºÎ±4 \r\n");
			w.write("Î”Î¹Î±ÎºÏ�Î¹Ï„Î± Î¼Î±Î¸Î·Î¼Î±Ï„Î¹ÎºÎ±5 \r\n");
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

