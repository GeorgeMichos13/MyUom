
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyProfileGUI extends JFrame{
	private static final long serialVersionUID = 1L;
	
	
	public JPanel myProfilePanel;
	private JTextArea nameArea;
	private JTextArea selectedLessonsArea;
	private JButton backButton;
	private JButton rankButton;
	private JButton showResultsButton;
	private JButton resetButton;
	private ArrayList<CourseStats> FCourseStats = new ArrayList<CourseStats>();
	private ArrayList<Course> FCourses = new ArrayList<Course>();
	
	public MyProfileGUI() {
		readCourses();
		myProfilePanel = new JPanel();
		
		nameArea = new JTextArea(2,20);
		selectedLessonsArea = new JTextArea(10,30);
	
		backButton = new JButton("Back");
		rankButton = new JButton("Αξιολoγηση Mαθημάτων");
		showResultsButton = new JButton("Εμφάνιση Στατιστικών");
		resetButton = new JButton("Reset");
		
	
		
		myProfilePanel.add(backButton);
		myProfilePanel.add(nameArea);
		myProfilePanel.add(selectedLessonsArea);
		
		myProfilePanel.add(rankButton);
		myProfilePanel.add(showResultsButton);
		myProfilePanel.add(resetButton);
		
		
		
		nameArea.setEditable(false);
		selectedLessonsArea.setEditable(false);
		
		
		printSelectedLessonsIntoGUI();
		
		System.out.println(FCourseStats.toString());
		
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent back) {
				
				setVisible(false);
				
				EventQueue.invokeLater(new Runnable() { //Go Back to MainFrame
					public void run() {
						try {
							MainFrame window = new MainFrame();
							window.frmMainframe.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				//new mainFrame(); 
				
			}
			
		});
		
		rankButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new RankGUI();
			}
			
		});
		
		showResultsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ShowResultsGUI();
			}
			
		});
		
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
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
				//delete all file except from statistics
				
				Path filePath = Paths.get("lessons.txt");
				
				String input = filePath.toString();
				
				File lessonsPath = new File(input);
				
				if(lessonsPath.delete()) {
					
				}
			}
			
		});
		
		this.setSize(500,500);
		this.setTitle("My Profile");
		this.setVisible(true);
		this.setContentPane(myProfilePanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void printSelectedLessonsIntoGUI() {
		Path filePath = Paths.get("lessons.txt");
		
		String input = filePath.toString();
		
		File lessons = new File(input);
		String line;
		String buffer= "";
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(lessons));
			
			//First read is the name
			line= reader.readLine();
			nameArea.setText(line);
			
			//The rest are lessons
			while((line = reader.readLine()) != null) {
				//Create the proper string
				buffer = (buffer + "" + line + "\n");
			}
			
			selectedLessonsArea.setText(buffer);
			
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	@SuppressWarnings("finally")
	public ArrayList<CourseStats> readCourses(){
		try {
			FileInputStream fileIn = new FileInputStream("Course.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			FCourses = (ArrayList<Course>) in.readObject();
			in.close();
			fileIn.close();		
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
		finally {
			System.out.println("De-Serialization Attempted...");
		}
		
		try {
			FileInputStream fileIn = new FileInputStream("CourseStats.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			FCourseStats = (ArrayList<CourseStats>) in.readObject();
			in.close();
			fileIn.close();		
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
		finally {
			System.out.println("De-Serialization Attempted...");
			return FCourseStats;
		}
		
		
	}
	
	public ArrayList<Course> getCourses(){
		return FCourses;
	}

}
