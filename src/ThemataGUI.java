import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ThemataGUI extends JFrame{
	
	private JPanel themataPanel;
	private JTextField courseName;
	private JTextArea themata;
	private JButton backButton;
	
	public ThemataGUI(String course) {
		
		themataPanel = new JPanel();
		courseName = new JTextField(course + "Παλία θέματα");
		themata = new JTextArea();
		backButton = new JButton("Back");
		
		
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent back) {
				
				setVisible(false);
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							MyProfile mP = new MyProfile();
							ArrayList<String> courses = mP.getCourses();
							InformationGUI info = new InformationGUI(courses);
							themataPanel.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			
				
			}
			
		});
		themataPanel.add(backButton);
		themataPanel.add(courseName);
		themata.setPreferredSize(new Dimension(600, 450));
		
		courseName.setEditable(false);
		courseName.setBackground(Color.GREEN);
		
		readFile(course, themata);
		
		themataPanel.add(themata);
		themata.setEditable(false);
		themata.setBackground(Color.CYAN);
		
		
		
		
		this.setSize(700,600);
		this.setTitle("Themata");
		this.setVisible(true);
		this.setContentPane(themataPanel);
		//themataPanel.setBackground(Color.ORANGE);
	}

	
	private void readFile(String course, JTextArea field) {
		String fileName = course + "themata.txt";
		Path path = Paths.get(fileName);
		System.out.println(path);
		
		BufferedReader reader = null;
		String line = "";
		String them = "";
		if(Files.exists(path)) {
			String input = path.toString();
			File file = new File(input);
			try {
				reader = new BufferedReader(new FileReader(file));
				try {
					while((line = reader.readLine()) != null) {
						them += line + "\n";
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			field.setText(them);
		}
		else {
			field.setText("Δεν βρέθηκαν παλιά θέματα.\n\nΛυπούμαστε ταμάλα.\n\nΝα πας να διαβάσεις μονος σου τωρα.\n\n\n#MyUomTeam#SorryNotSorry");
		}
		
	}
}
