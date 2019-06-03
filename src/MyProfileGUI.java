
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;



public class MyProfileGUI extends JFrame{
	private static final long serialVersionUID = 1L;
	
	
	public JPanel myProfilePanel;
	private JTextField nameArea;
	private JTextArea selectedLessonsArea;
	private JButton backButton;
	private JButton rankButton;
	private JButton showResultsButton;
	private JButton resetButton;
	ArrayList<String> courses = new ArrayList<String>();
	String username;
	
	
	public MyProfileGUI() {
		
		myProfilePanel = new JPanel();
		
		//Initialising field for username
		nameArea = new JTextField();
		nameArea.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		nameArea.setBackground(Color.WHITE);
		nameArea.setHorizontalAlignment(SwingConstants.CENTER);
		nameArea.setFont(new Font("Monospaced", Font.BOLD, 19));
		//nameArea.setComponentOrientation(Orientation);
		
		//Initialising field for selected lessons
		selectedLessonsArea = new JTextArea(10,30);
		selectedLessonsArea.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		selectedLessonsArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
		
	
		//Button GUI
		backButton = new JButton("Back");
		backButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rankButton = new JButton("Αξιολoγηση Mαθημάτων");
		rankButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		rankButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		showResultsButton = new JButton("Εμφάνιση Στατιστικών");
		showResultsButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		showResultsButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		resetButton = new JButton("Reset");
		resetButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		resetButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		
		nameArea.setEditable(false);
		
		//Getting username from file 
		//and printing it to panel
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
		
		//Getting courses names and
		//printing them to panel
		MyProfile profilewindow = new MyProfile();
		courses = profilewindow.getCourses();
	
		String persp = "";
		for(int i = 0 ; i < courses.size(); i++) {
			persp = persp + courses.get(i) + "\n";
		}
		selectedLessonsArea.setText(persp);
		selectedLessonsArea.setEditable(false);
		
		
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
		

		this.setSize(768,432);
		this.setTitle("My Profile");
		this.setVisible(true);
		this.setContentPane(myProfilePanel);
		
		
		//GUI setting that I dont really understand
		//co-worker did his work very well
		GroupLayout gl_myProfilePanel = new GroupLayout(myProfilePanel);
		gl_myProfilePanel.setHorizontalGroup(
			gl_myProfilePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_myProfilePanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addGap(109)
					.addComponent(nameArea, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
					.addGap(196))
				.addGroup(gl_myProfilePanel.createSequentialGroup()
					.addGap(293)
					.addComponent(resetButton, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
					.addGap(317))
				.addGroup(gl_myProfilePanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(selectedLessonsArea)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_myProfilePanel.createParallelGroup(Alignment.LEADING)
						.addComponent(showResultsButton, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
						.addComponent(rankButton, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
					.addGap(6))
		);
		gl_myProfilePanel.setVerticalGroup(
			gl_myProfilePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_myProfilePanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_myProfilePanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_myProfilePanel.createSequentialGroup()
							.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(27))
						.addGroup(gl_myProfilePanel.createSequentialGroup()
							.addComponent(nameArea, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addGroup(gl_myProfilePanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(selectedLessonsArea, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
						.addGroup(gl_myProfilePanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 110, GroupLayout.PREFERRED_SIZE)
							.addComponent(rankButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(showResultsButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
					.addGap(32)
					.addComponent(resetButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(18))
		);
		myProfilePanel.setLayout(gl_myProfilePanel);
		
	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
