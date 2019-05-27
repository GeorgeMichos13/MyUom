
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
	ArrayList<String> courses = new ArrayList<String>();
	String username;
	
	
	public MyProfileGUI() {
		
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
		
		Path namefile = Paths.get("username.txt");
		String user = namefile.toString();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(user));
			try {
				username = reader.readLine();
				reader.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		nameArea.setText(username);
		MyProfile profilewindow = new MyProfile();
		courses = profilewindow.getCourses();
		
		String persp = "";
		for(int i = 0 ; i < courses.size(); i++) {
			persp = persp + courses.get(i) + "\n";
		}
		selectedLessonsArea.setText(persp);
		
		
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
				Path path = Paths.get("didRank.txt");
				final JPanel panel = new JPanel();
				if(Files.exists(path)) {
				    JOptionPane.showMessageDialog(panel, "You can rank only once. Sorry.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					 JOptionPane.showMessageDialog(panel, "You can rank once, so be sure to rank(click and drag!) every lesson.", "Advise", JOptionPane.INFORMATION_MESSAGE);
					setVisible(false);
					new RankGUI();
				}
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
				//delete all user files
				profilewindow.reset();
			}
			
		});
		
		this.setSize(500,500);
		this.setTitle("My Profile");
		this.setVisible(true);
		this.setContentPane(myProfilePanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}
