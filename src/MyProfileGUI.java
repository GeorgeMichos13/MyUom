
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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
		
		
		nameArea = new JTextField();
		nameArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		nameArea.setBackground(Color.WHITE);
		nameArea.setHorizontalAlignment(SwingConstants.CENTER);
		nameArea.setFont(new Font("Monospaced", Font.BOLD, 19));
		//nameArea.setComponentOrientation(Orientation);
		
		selectedLessonsArea = new JTextArea(10,30);
		selectedLessonsArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
		
	
		backButton = new JButton("Back");
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rankButton = new JButton("Αξιολoγηση Mαθημάτων");
		rankButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		showResultsButton = new JButton("Εμφάνιση Στατιστικών");
		showResultsButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		resetButton = new JButton("Reset");
		resetButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		myProfilePanel.addComponentListener(new ComponentListener() {

            @Override
            public void componentHidden(ComponentEvent arg0) {
            }

            @Override
            public void componentMoved(ComponentEvent arg0) {
            }

            @Override
            public void componentResized(ComponentEvent arg0) {
                int width = myProfilePanel.getWidth();
                int height = myProfilePanel.getHeight();
      
              //  backButton.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, (width + height) / 105));
                rankButton.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, (width + height) / 100));
                showResultsButton.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, (width + height) / 100));
              //  resetButton.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, (width + height) / 110));
              //  myProfilePanel.getContentPane().revalidate();
            }

            @Override
            public void componentShown(ComponentEvent e) {

            }
        });
		
		nameArea.setEditable(false);
		
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
		

		this.setSize(768,432);
		this.setTitle("My Profile");
		this.setVisible(true);
		this.setContentPane(myProfilePanel);
		
		GroupLayout gl_myProfilePanel = new GroupLayout(myProfilePanel);
		gl_myProfilePanel.setHorizontalGroup(
			gl_myProfilePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_myProfilePanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_myProfilePanel.createParallelGroup(Alignment.LEADING)
						.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
						.addComponent(resetButton, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
					.addGap(115)
					.addGroup(gl_myProfilePanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_myProfilePanel.createSequentialGroup()
							.addComponent(rankButton, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
							.addGap(45)
							.addComponent(showResultsButton, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
						.addComponent(selectedLessonsArea, GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
						.addComponent(nameArea, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
					.addGap(23))
		);
		gl_myProfilePanel.setVerticalGroup(
			gl_myProfilePanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_myProfilePanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_myProfilePanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_myProfilePanel.createSequentialGroup()
							.addComponent(nameArea, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(selectedLessonsArea, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_myProfilePanel.createSequentialGroup()
							.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(286)))
					.addGroup(gl_myProfilePanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(showResultsButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(rankButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(resetButton, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		myProfilePanel.setLayout(gl_myProfilePanel);
		
	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	

}
