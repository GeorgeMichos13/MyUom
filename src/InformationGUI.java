import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class InformationGUI extends JFrame {

	private JFrame NoteFrame = new JFrame("Information");
	private JPanel InfoPanel = new JPanel();

	private ArrayList<CourseStats> SubjectList = new ArrayList<CourseStats>();
	private JTextArea InfoArea = new JTextArea();
	private JScrollPane scroll = new JScrollPane(InfoPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	private static final int WIDTH = 1200;
	private static final int HEIGHT = 900;
	private static final int TextWIDTH = 700;
	private static final int TextHEIGHT = 300;
	private JButton backButton;
	public void setSubjectList(ArrayList<CourseStats> array) {
		SubjectList.addAll(array);
	}

	public InformationGUI(ArrayList<CourseStats> array) {
		
		
		
		SubjectList.addAll(array);
		InfoPanel.setBackground(Color.GRAY);
		System.out.println(SubjectList.size());
		backButton = new JButton("Back");
		InfoPanel.add(backButton);
		
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent back) {
				
				EventQueue.invokeLater(new Runnable() { //Go Back to MainFrame
					public void run() {
						try {
							NoteFrame.setVisible(false);
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
			
			
			/* Frame Initialization */
			NoteFrame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
			NoteFrame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
			NoteFrame.setMaximumSize(new Dimension(WIDTH, HEIGHT));
			NoteFrame.setResizable(true);
			NoteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			NoteFrame.setLocationRelativeTo(null);
			NoteFrame.setVisible(true);

			/* TextAreas Initialization */
			JTextArea InfoArea1 = new JTextArea();
			InfoArea1.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea1.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea1.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea1.setEditable(false);
			InfoArea1.setVisible(false);
			InfoArea1.setLineWrap(true);
			JScrollPane scroll1 = new JScrollPane(InfoArea1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			
			
			JTextArea InfoArea2 = new JTextArea();
			JScrollPane scroll2 = new JScrollPane(InfoArea2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			InfoArea2.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea2.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea2.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea2.setEditable(false);
			InfoArea2.setVisible(false);
			InfoArea2.setLineWrap(true);
			
			JTextArea InfoArea3 = new JTextArea();
			JScrollPane scroll3 = new JScrollPane(InfoArea3, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			InfoArea3.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea3.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea3.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea3.setEditable(false);
			InfoArea3.setVisible(false);
			InfoArea3.setLineWrap(true);
			
			JTextArea InfoArea4 = new JTextArea();
			JScrollPane scroll4 = new JScrollPane(InfoArea4, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			InfoArea4.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea4.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea4.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea4.setEditable(true);
			InfoArea4.setVisible(false);
			InfoArea4.setLineWrap(true);
			
			JTextArea InfoArea5 = new JTextArea();
			JScrollPane scroll5 = new JScrollPane(InfoArea5, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			InfoArea5.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea5.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea5.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea5.setEditable(false);
			InfoArea5.setVisible(false);
			InfoArea5.setLineWrap(true);
			
			JTextArea InfoArea6 = new JTextArea();
			JScrollPane scroll6 = new JScrollPane(InfoArea6, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			InfoArea6.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea6.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea6.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea6.setEditable(false);
			InfoArea6.setVisible(false);
			InfoArea6.setLineWrap(true);
			
			JTextArea InfoArea7 = new JTextArea();
			JScrollPane scroll7 = new JScrollPane(InfoArea7, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			InfoArea7.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea7.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea7.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea7.setEditable(false);
			InfoArea7.setVisible(false);
			InfoArea7.setLineWrap(true);
			
			JTextArea InfoArea8 = new JTextArea();
			JScrollPane scroll8 = new JScrollPane(InfoArea8, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			InfoArea8.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea8.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea8.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea8.setEditable(true);
			InfoArea8.setVisible(false);
			InfoArea8.setLineWrap(true);
			
			JTextArea InfoArea9 = new JTextArea();
			JScrollPane scroll9 = new JScrollPane(InfoArea9, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			InfoArea9.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea9.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea9.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea9.setEditable(false);
			InfoArea9.setVisible(false);
			InfoArea9.setLineWrap(true);
			
			JTextArea InfoArea10 = new JTextArea();
			JScrollPane scroll10 = new JScrollPane(InfoArea10, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			InfoArea10.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea10.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea10.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea10.setEditable(false);
			InfoArea10.setVisible(false);
			InfoArea10.setLineWrap(true);
			
			 int num = SubjectList.size();
			
			System.out.println(new File(".").getAbsoluteFile());
			
			Notes info1  = new Notes(InfoArea1);
			Notes info2  = new Notes(InfoArea2);
			Notes info3  = new Notes(InfoArea3);
			Notes info4  = new Notes(InfoArea4);
			Notes info5  = new Notes(InfoArea5);
			Notes info6  = new Notes(InfoArea6);
			Notes info7  = new Notes(InfoArea7);
			Notes info8  = new Notes(InfoArea8);
			Notes info9  = new Notes(InfoArea9);
			Notes info10 = new Notes(InfoArea10);
			
			
			/* Panel Layouts */
			InfoPanel.setLayout(new BoxLayout(InfoPanel, BoxLayout.Y_AXIS));
			scroll.setVisible(true);
			

			switch(num) {
			case 1:
				
				String file = SubjectList.get(0).getName() + "info.txt";
				System.out.println(file);
				Path path = Paths.get(file);
				if(Files.exists(path))
					System.out.println("ok");
				else
					System.out.println("Not okey");
				 
				 String input = path.toString();
				 File myfile1 = new File(input);
				 info1.readFromFile(myfile1, InfoArea1);
				 
				
				 
				 /*Write Button*/
					JButton exams1 = new JButton("Δείτε τα παλία θέματα.");
					
					exams1.setVisible(true);
					exams1.setPreferredSize(new Dimension(120, 30));
					exams1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							//Exams code 
							
						}
					});
					
					
					
				JLabel infoLabel1 = new JLabel(SubjectList.get(0).getName());
				infoLabel1.setSize(new Dimension(400, 30));
				infoLabel1.setVisible(false);
				infoLabel1.setOpaque(true);
				infoLabel1.setBackground(Color.RED);
				infoLabel1.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				InfoPanel.add(infoLabel1);
				InfoPanel.add(InfoArea1);
				InfoPanel.add(exams1);
				
				infoLabel1.setVisible(true);
				InfoArea1.setVisible(true);
				
				
				
				
				
				break;
			case 2:
				
				myfile1 = new File(SubjectList.get(0).getName() + "info.txt");
				info1.readFromFile(myfile1, InfoArea1);
				
				 
				 /*Exams Button*/
					exams1 = new JButton("Δείτε τα παλία θέματα.");
					exams1.setVisible(true);
					exams1.setPreferredSize(new Dimension(120, 30));
					exams1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							//Exams code
						}
					});
					
					
				File myfile2 = new File(SubjectList.get(1).getName() + "info.txt");
				info2.readFromFile(myfile2, InfoArea2);
			
				
				JButton exams2 = new JButton("Δείτε τα παλία θέματα.");
				
				exams2.setVisible(true);
				exams2.setPreferredSize(new Dimension(120, 30));
				exams2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
					
				});
			
				
					
				infoLabel1 = new JLabel(SubjectList.get(0).getName());
				infoLabel1.setSize(new Dimension(400, 30));
				infoLabel1.setVisible(false);
				infoLabel1.setOpaque(true);
				infoLabel1.setBackground(Color.RED);
				infoLabel1.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel infoLabel2 = new JLabel(SubjectList.get(1).getName());
				infoLabel2.setSize(new Dimension(400, 30));
				infoLabel2.setVisible(false);
				infoLabel2.setOpaque(true);
				infoLabel2.setBackground(Color.RED);
				infoLabel2.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				
				InfoPanel.add(infoLabel1);
				InfoPanel.add(InfoArea1);
				InfoPanel.add(exams1);
				
				InfoPanel.add(infoLabel2);
				InfoPanel.add(InfoArea2);
				InfoPanel.add(exams2);
				
				infoLabel1.setVisible(true);
				InfoArea1.setVisible(true);
			
				
				infoLabel2.setVisible(true);
				InfoArea2.setVisible(true);
				
				break;
			case 3:
				
				myfile1 = new File(SubjectList.get(0).getName() + "info.txt");
				info1.readFromFile(myfile1, InfoArea1);
			
				 
				 /*Write Button*/
					exams1 = new JButton("Δείτε τα παλία θέματα.");
				
					exams1.setVisible(true);
					exams1.setPreferredSize(new Dimension(120, 30));
					exams1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							//Exams code
						}
					});
					
					
					
					
					
					
				myfile2 = new File(SubjectList.get(1).getName() + "info.txt");
				info2.readFromFile(myfile2, InfoArea2);
				
				
				
				exams2 = new JButton("Δείτε τα παλία θέματα.");
			
				exams2.setVisible(true);
				exams2.setPreferredSize(new Dimension(120, 30));
				exams2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
			
				
				
				File myfile3 = new File(SubjectList.get(2).getName() + "info.txt");
				info3.readFromFile(myfile3, InfoArea3);
			
				
				JButton exams3 = new JButton("Δείτε τα παλία θέματα.");
				
				exams3.setVisible(true);
				exams3.setPreferredSize(new Dimension(120, 30));
				exams3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				
				
				infoLabel1 = new JLabel(SubjectList.get(0).getName());
				infoLabel1.setSize(new Dimension(400, 30));
				infoLabel1.setVisible(false);
				infoLabel1.setOpaque(true);
				infoLabel1.setBackground(Color.RED);
				infoLabel1.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel2 = new JLabel(SubjectList.get(1).getName());
				infoLabel2.setSize(new Dimension(400, 30));
				infoLabel2.setVisible(false);
				infoLabel2.setOpaque(true);
				infoLabel2.setBackground(Color.RED);
				infoLabel2.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel infoLabel3 = new JLabel(SubjectList.get(2).getName());
				infoLabel3.setSize(new Dimension(400, 30));
				infoLabel3.setVisible(false);
				infoLabel3.setOpaque(true);
				infoLabel3.setBackground(Color.RED);
				infoLabel3.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel3.setVerticalTextPosition(JLabel.CENTER);
				
				
				
				
				InfoPanel.add(infoLabel1);
				InfoPanel.add(InfoArea1);
				InfoPanel.add(exams1);
				
				InfoPanel.add(infoLabel2);
				InfoPanel.add(InfoArea2);
				InfoPanel.add(exams2);
				
				InfoPanel.add(infoLabel3);
				InfoPanel.add(InfoArea3);
				InfoPanel.add(exams3);
				
			
				infoLabel1.setVisible(true);
				InfoArea1.setVisible(true);
			
				
				infoLabel2.setVisible(true);
				InfoArea2.setVisible(true);
				
				
				infoLabel3.setVisible(true);
				InfoArea3.setVisible(true);
				
				break;
			case 4:
				
				myfile1 = new File(SubjectList.get(0).getName() + "info.txt");
				info1.readFromFile(myfile1, InfoArea1);
				
				 
				 /*Write Button*/
					exams1 = new JButton("Δείτε τα παλία θέματα.");
				
					exams1.setVisible(true);
					exams1.setPreferredSize(new Dimension(120, 30));
					exams1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							//Exams code
						}
					});
					
					
					
				myfile2 = new File(SubjectList.get(1).getName() + "info.txt");
				info2.readFromFile(myfile2, InfoArea2);
				
				
				
				exams2 = new JButton("Δείτε τα παλία θέματα.");
			
				exams2.setVisible(true);
				exams2.setPreferredSize(new Dimension(120, 30));
				exams2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
			
				
				
				myfile3 = new File(SubjectList.get(2).getName() + "info.txt");
				info3.readFromFile(myfile3, InfoArea3);
				
				
				exams3 = new JButton("Δείτε τα παλία θέματα.");
			
				exams3.setVisible(true);
				exams3.setPreferredSize(new Dimension(120, 30));
				exams3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				
				File myfile4 = new File(SubjectList.get(3).getName() + "info.txt");
				System.out.println(myfile4);
				info4.readFromFile(myfile4, InfoArea4);
		
				
				JButton exams4 = new JButton("Δείτε τα παλία θέματα.");
				
				exams4.setVisible(true);
				exams4.setPreferredSize(new Dimension(120, 30));
				exams4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				
				
				infoLabel1 = new JLabel(SubjectList.get(0).getName());
				infoLabel1.setSize(new Dimension(400, 30));
				infoLabel1.setVisible(false);
				infoLabel1.setOpaque(true);
				infoLabel1.setBackground(Color.RED);
				infoLabel1.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel2 = new JLabel(SubjectList.get(1).getName());
				infoLabel2.setSize(new Dimension(400, 30));
				infoLabel2.setVisible(false);
				infoLabel2.setOpaque(true);
				infoLabel2.setBackground(Color.RED);
				infoLabel2.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel3 = new JLabel(SubjectList.get(2).getName());
				infoLabel3.setSize(new Dimension(400, 30));
				infoLabel3.setVisible(false);
				infoLabel3.setOpaque(true);
				infoLabel3.setBackground(Color.RED);
				infoLabel3.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel3.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel infoLabel4 = new JLabel(SubjectList.get(3).getName());
				infoLabel4.setSize(new Dimension(400, 30));
				infoLabel4.setVisible(false);
				infoLabel4.setOpaque(true);
				infoLabel4.setBackground(Color.RED);
				infoLabel4.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel4.setVerticalTextPosition(JLabel.CENTER);
				
				
				InfoPanel.add(infoLabel1);
				InfoPanel.add(InfoArea1);
				InfoPanel.add(exams1);
				
				InfoPanel.add(infoLabel2);
				InfoPanel.add(InfoArea2);
				InfoPanel.add(exams2);
				
				InfoPanel.add(infoLabel3);
				InfoPanel.add(InfoArea3);
				InfoPanel.add(exams3);
				
				InfoPanel.add(infoLabel4);
				InfoPanel.add(InfoArea4);
				InfoPanel.add(exams4);
				
				infoLabel1.setVisible(true);
				InfoArea1.setVisible(true);
			
				
				infoLabel2.setVisible(true);
				InfoArea2.setVisible(true);
			
				
				infoLabel3.setVisible(true);
				InfoArea3.setVisible(true);
				
				
				infoLabel4.setVisible(true);
				InfoArea4.setVisible(true);
			
				break;
			case 5:
				
				myfile1 = new File(SubjectList.get(0).getName() + "info.txt");
				info1.readFromFile(myfile1, InfoArea1);
			
				 
				 /*Write Button*/
					exams1 = new JButton("Δείτε τα παλία θέματα.");
				
					exams1.setVisible(true);
					exams1.setPreferredSize(new Dimension(120, 30));
					exams1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							//Exams code
						}
					});
					
					
					
				myfile2 = new File(SubjectList.get(1).getName() + "info.txt");
				info2.readFromFile(myfile2, InfoArea2);
		
				
				
				exams2 = new JButton("Δείτε τα παλία θέματα.");
				
				exams2.setVisible(true);
				exams2.setPreferredSize(new Dimension(120, 30));
				exams2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
			
				
				
				myfile3 = new File(SubjectList.get(2).getName() + "info.txt");
				info3.readFromFile(myfile3, InfoArea3);
				
				
				exams3 = new JButton("Δείτε τα παλία θέματα.");
				
				exams3.setVisible(true);
				exams3.setPreferredSize(new Dimension(120, 30));
				exams3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				
				myfile4 = new File(SubjectList.get(3).getName() + "info.txt");
				info4.readFromFile(myfile4, InfoArea4);
				
				
				exams4 = new JButton("Δείτε τα παλία θέματα.");
				
				exams4.setVisible(true);
				exams4.setPreferredSize(new Dimension(120, 30));
				exams4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				File myfile5 = new File(SubjectList.get(4).getName() + "info.txt");
				info5.readFromFile(myfile5, InfoArea5);
			
				
				JButton exams5 = new JButton("Δείτε τα παλία θέματα.");
			
				exams5.setVisible(true);
				exams5.setPreferredSize(new Dimension(120, 30));
				exams5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						InfoArea5.setEditable(true);
					}
				});
				
			
				
				
				
				infoLabel1 = new JLabel(SubjectList.get(0).getName());
				infoLabel1.setSize(new Dimension(400, 30));
				infoLabel1.setVisible(false);
				infoLabel1.setOpaque(true);
				infoLabel1.setBackground(Color.RED);
				infoLabel1.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel2 = new JLabel(SubjectList.get(1).getName());
				infoLabel2.setSize(new Dimension(400, 30));
				infoLabel2.setVisible(false);
				infoLabel2.setOpaque(true);
				infoLabel2.setBackground(Color.RED);
				infoLabel2.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel3 = new JLabel(SubjectList.get(2).getName());
				infoLabel3.setSize(new Dimension(400, 30));
				infoLabel3.setVisible(false);
				infoLabel3.setOpaque(true);
				infoLabel3.setBackground(Color.RED);
				infoLabel3.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel3.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel4 = new JLabel(SubjectList.get(3).getName());
				infoLabel4.setSize(new Dimension(400, 30));
				infoLabel4.setVisible(false);
				infoLabel4.setOpaque(true);
				infoLabel4.setBackground(Color.RED);
				infoLabel4.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel4.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel infoLabel5 = new JLabel(SubjectList.get(4).getName());
				infoLabel5.setSize(new Dimension(400, 30));
				infoLabel5.setVisible(false);
				infoLabel5.setOpaque(true);
				infoLabel5.setBackground(Color.RED);
				infoLabel5.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel5.setVerticalTextPosition(JLabel.CENTER);
				
				InfoPanel.add(infoLabel1);
				InfoPanel.add(InfoArea1);
				InfoPanel.add(exams1);
				
				InfoPanel.add(infoLabel2);
				InfoPanel.add(InfoArea2);
				InfoPanel.add(exams2);
				
				InfoPanel.add(infoLabel3);
				InfoPanel.add(InfoArea3);
				InfoPanel.add(exams3);
				
				InfoPanel.add(infoLabel4);
				InfoPanel.add(InfoArea4);
				InfoPanel.add(exams4);
				
				InfoPanel.add(infoLabel5);
				InfoPanel.add(InfoArea5);
				InfoPanel.add(exams5);
				
				infoLabel1.setVisible(true);
				InfoArea1.setVisible(true);
				
				
				infoLabel2.setVisible(true);
				InfoArea2.setVisible(true);
				
				
				infoLabel3.setVisible(true);
				InfoArea3.setVisible(true);
				
				
				infoLabel4.setVisible(true);
				InfoArea4.setVisible(true);
			
				
				infoLabel5.setVisible(true);
				InfoArea5.setVisible(true);
				
				break;
				
			case 6:
				myfile1 = new File(SubjectList.get(0).getName() + "info.txt");
				info1.readFromFile(myfile1, InfoArea1);
			
				 
				 /*Write Button*/
					exams1 = new JButton("Δείτε τα παλία θέματα.");
				
					exams1.setVisible(true);
					exams1.setPreferredSize(new Dimension(120, 30));
					exams1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							//Exams code
						}
					});
					
					
					
				myfile2 = new File(SubjectList.get(1).getName() + "info.txt");
				info2.readFromFile(myfile2, InfoArea2);
		
				
				
				exams2 = new  JButton("Δείτε τα παλία θέματα.");
				
				exams2.setVisible(true);
				exams2.setPreferredSize(new Dimension(120, 30));
				exams2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
			
				
				
				myfile3 = new File(SubjectList.get(2).getName() + "info.txt");
				info3.readFromFile(myfile3, InfoArea3);
				
				
				exams3 = new JButton("Δείτε τα παλία θέματα.");
				
				exams3.setVisible(true);
				exams3.setPreferredSize(new Dimension(120, 30));
				exams3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				
				myfile4 = new File(SubjectList.get(3).getName() + "info.txt");
				info4.readFromFile(myfile4, InfoArea4);
				
				
				exams4 = new JButton("Δείτε τα παλία θέματα.");
				
				exams4.setVisible(true);
				exams4.setPreferredSize(new Dimension(120, 30));
				exams4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				myfile5 = new File(SubjectList.get(4).getName() + "info.txt");
				info5.readFromFile(myfile5, InfoArea5);
			
				
				exams5 = new JButton("Δείτε τα παλία θέματα.");
				
				exams5.setVisible(true);
				exams5.setPreferredSize(new Dimension(120, 30));
				exams5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						InfoArea5.setEditable(true);
					}
				});
				
				
				
				File myfile6 = new File(SubjectList.get(5).getName() + "info.txt");
				info6.readFromFile(myfile6, InfoArea6);
				
				JButton exams6 = new JButton("Δείτε τα παλία θέματα.");
				
				exams6.setVisible(true);
				exams6.setPreferredSize(new Dimension(120, 30));
				exams6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				
				infoLabel1 = new JLabel(SubjectList.get(0).getName());
				infoLabel1.setSize(new Dimension(400, 30));
				infoLabel1.setVisible(false);
				infoLabel1.setOpaque(true);
				infoLabel1.setBackground(Color.RED);
				infoLabel1.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel2 = new JLabel(SubjectList.get(1).getName());
				infoLabel2.setSize(new Dimension(400, 30));
				infoLabel2.setVisible(false);
				infoLabel2.setOpaque(true);
				infoLabel2.setBackground(Color.RED);
				infoLabel2.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel3 = new JLabel(SubjectList.get(2).getName());
				infoLabel3.setSize(new Dimension(400, 30));
				infoLabel3.setVisible(false);
				infoLabel3.setOpaque(true);
				infoLabel3.setBackground(Color.RED);
				infoLabel3.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel3.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel4 = new JLabel(SubjectList.get(3).getName());
				infoLabel4.setSize(new Dimension(400, 30));
				infoLabel4.setVisible(false);
				infoLabel4.setOpaque(true);
				infoLabel4.setBackground(Color.RED);
				infoLabel4.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel4.setVerticalTextPosition(JLabel.CENTER);
				
				 infoLabel5 = new JLabel(SubjectList.get(4).getName());
				infoLabel5.setSize(new Dimension(400, 30));
				infoLabel5.setVisible(false);
				infoLabel5.setOpaque(true);
				infoLabel5.setBackground(Color.RED);
				infoLabel5.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel5.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel infoLabel6 = new JLabel(SubjectList.get(5).getName());
				infoLabel6.setSize(new Dimension(400, 30));
				infoLabel6.setVisible(false);
				infoLabel6.setOpaque(true);
				infoLabel6.setBackground(Color.RED);
				infoLabel6.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel6.setVerticalTextPosition(JLabel.CENTER);
				
				InfoPanel.add(infoLabel1);
				InfoPanel.add(InfoArea1);
				InfoPanel.add(exams1);
				
				InfoPanel.add(infoLabel2);
				InfoPanel.add(InfoArea2);
				InfoPanel.add(exams2);
				
				InfoPanel.add(infoLabel3);
				InfoPanel.add(InfoArea3);
				InfoPanel.add(exams3);
				
				InfoPanel.add(infoLabel4);
				InfoPanel.add(InfoArea4);
				InfoPanel.add(exams4);
				
				InfoPanel.add(infoLabel5);
				InfoPanel.add(InfoArea5);
				InfoPanel.add(exams5);
				
				InfoPanel.add(infoLabel6);
				InfoPanel.add(InfoArea6);
				InfoPanel.add(exams6);
				
				infoLabel1.setVisible(true);
				InfoArea1.setVisible(true);
				
				
				infoLabel2.setVisible(true);
				InfoArea2.setVisible(true);
				
				
				infoLabel3.setVisible(true);
				InfoArea3.setVisible(true);
				
				
				infoLabel4.setVisible(true);
				InfoArea4.setVisible(true);
				
				

				infoLabel5.setVisible(true);
				InfoArea5.setVisible(true);
				
				

				infoLabel6.setVisible(true);
				InfoArea6.setVisible(true);
				
				 break;
				 
			case 7:
				myfile1 = new File(SubjectList.get(0).getName() + "info.txt");
				info1.readFromFile(myfile1, InfoArea1);
			
				 
				 /*Write Button*/
					exams1 = new JButton("Δείτε τα παλία θέματα.");
					
					exams1.setVisible(true);
					exams1.setPreferredSize(new Dimension(120, 30));
					exams1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							//Exams code
						}
					});
					
					
					
				myfile2 = new File(SubjectList.get(1).getName() + "info.txt");
				info2.readFromFile(myfile2, InfoArea2);
		
				
				
				exams2 =new JButton("Δείτε τα παλία θέματα.");
			
				exams2.setVisible(true);
				exams2.setPreferredSize(new Dimension(120, 30));
				exams2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
			
				
				
				myfile3 = new File(SubjectList.get(2).getName() + "info.txt");
				info3.readFromFile(myfile3, InfoArea3);
				
				
				exams3 = new JButton("Δείτε τα παλία θέματα.");
				
				exams3.setVisible(true);
				exams3.setPreferredSize(new Dimension(120, 30));
				exams3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				
				myfile4 = new File(SubjectList.get(3).getName() + "info.txt");
				info4.readFromFile(myfile4, InfoArea4);
				
				
				exams4 = new JButton("Δείτε τα παλία θέματα.");
				
				exams4.setVisible(true);
				exams4.setPreferredSize(new Dimension(120, 30));
				exams4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				myfile5 = new File(SubjectList.get(4).getName() + "info.txt");
				info5.readFromFile(myfile5, InfoArea5);
			
				
				exams5 = new JButton("Δείτε τα παλία θέματα.");
			
				exams5.setVisible(true);
				exams5.setPreferredSize(new Dimension(120, 30));
				exams5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						InfoArea5.setEditable(true);
					}
				});
				
				
				
				myfile6 = new File(SubjectList.get(5).getName() + "info.txt");
				info6.readFromFile(myfile6, InfoArea6);
				
				exams6 = new JButton("Δείτε τα παλία θέματα.");
				
				exams6.setVisible(true);
				exams6.setPreferredSize(new Dimension(120, 30));
				exams6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				File myfile7 = new File(SubjectList.get(6).getName() + "info.txt");
				info7.readFromFile(myfile7, InfoArea7);
				
				
				JButton exams7 =new JButton("Δείτε τα παλία θέματα.");
				
				exams7.setVisible(true);
				exams7.setPreferredSize(new Dimension(120, 30));
				exams7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				
				infoLabel1 = new JLabel(SubjectList.get(0).getName());
				infoLabel1.setSize(new Dimension(400, 30));
				infoLabel1.setVisible(false);
				infoLabel1.setOpaque(true);
				infoLabel1.setBackground(Color.RED);
				infoLabel1.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel2 = new JLabel(SubjectList.get(1).getName());
				infoLabel2.setSize(new Dimension(400, 30));
				infoLabel2.setVisible(false);
				infoLabel2.setOpaque(true);
				infoLabel2.setBackground(Color.RED);
				infoLabel2.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel3 = new JLabel(SubjectList.get(2).getName());
				infoLabel3.setSize(new Dimension(400, 30));
				infoLabel3.setVisible(false);
				infoLabel3.setOpaque(true);
				infoLabel3.setBackground(Color.RED);
				infoLabel3.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel3.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel4 = new JLabel(SubjectList.get(3).getName());
				infoLabel4.setSize(new Dimension(400, 30));
				infoLabel4.setVisible(false);
				infoLabel4.setOpaque(true);
				infoLabel4.setBackground(Color.RED);
				infoLabel4.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel4.setVerticalTextPosition(JLabel.CENTER);
				
				 infoLabel5 = new JLabel(SubjectList.get(4).getName());
				infoLabel5.setSize(new Dimension(400, 30));
				infoLabel5.setVisible(false);
				infoLabel5.setOpaque(true);
				infoLabel5.setBackground(Color.RED);
				infoLabel5.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel5.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel6 = new JLabel(SubjectList.get(5).getName());
				infoLabel6.setSize(new Dimension(400, 30));
				infoLabel6.setVisible(false);
				infoLabel6.setOpaque(true);
				infoLabel6.setBackground(Color.RED);
				infoLabel6.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel6.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel infoLabel7 = new JLabel(SubjectList.get(6).getName());
				infoLabel7.setSize(new Dimension(400, 30));
				infoLabel7.setVisible(false);
				infoLabel7.setOpaque(true);
				infoLabel7.setBackground(Color.RED);
				infoLabel7.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel7.setVerticalTextPosition(JLabel.CENTER);
				
				InfoPanel.add(infoLabel1);
				InfoPanel.add(InfoArea1);
				InfoPanel.add(exams1);
				
				InfoPanel.add(infoLabel2);
				InfoPanel.add(InfoArea2);
				InfoPanel.add(exams2);
				
				InfoPanel.add(infoLabel3);
				InfoPanel.add(InfoArea3);
				InfoPanel.add(exams3);
				
				InfoPanel.add(infoLabel4);
				InfoPanel.add(InfoArea4);
				InfoPanel.add(exams4);
				
				InfoPanel.add(infoLabel5);
				InfoPanel.add(InfoArea5);
				InfoPanel.add(exams5);
				
				InfoPanel.add(infoLabel6);
				InfoPanel.add(InfoArea6);
				InfoPanel.add(exams6);
				
				InfoPanel.add(infoLabel7);
				InfoPanel.add(InfoArea7);
				InfoPanel.add(exams7);
				
				infoLabel1.setVisible(true);
				InfoArea1.setVisible(true);
				
				
				infoLabel2.setVisible(true);
				InfoArea2.setVisible(true);
				
			
				infoLabel3.setVisible(true);
				InfoArea3.setVisible(true);
				
				
				infoLabel4.setVisible(true);
				InfoArea4.setVisible(true);
				
				
				infoLabel5.setVisible(true);
				InfoArea5.setVisible(true);
				
				
				infoLabel6.setVisible(true);
				InfoArea6.setVisible(true);
			
				
				infoLabel7.setVisible(true);
				InfoArea7.setVisible(true);
			
				break;
				
			case 8:
				myfile1 = new File(SubjectList.get(0).getName() + "info.txt");
				info1.readFromFile(myfile1, InfoArea1);
			
				 
				 /*Write Button*/
					exams1 = new JButton("Δείτε τα παλία θέματα.");
				
					exams1.setVisible(true);
					exams1.setPreferredSize(new Dimension(120, 30));
					exams1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							//Exams code
						}
					});
					
					
					
				myfile2 = new File(SubjectList.get(1).getName() + "info.txt");
				info2.readFromFile(myfile2, InfoArea2);
		
				
				
				exams2 = new JButton("Δείτε τα παλία θέματα.");
				
				exams2.setVisible(true);
				exams2.setPreferredSize(new Dimension(120, 30));
				exams2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
			
				
				
				myfile3 = new File(SubjectList.get(2).getName() + "info.txt");
				info3.readFromFile(myfile3, InfoArea3);
				
				
				exams3 = new JButton("Δείτε τα παλία θέματα.");
				
				exams3.setVisible(true);
				exams3.setPreferredSize(new Dimension(120, 30));
				exams3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				
				myfile4 = new File(SubjectList.get(3).getName() + "info.txt");
				info4.readFromFile(myfile4, InfoArea4);
				
				
				exams4 = new JButton("Δείτε τα παλία θέματα.");
				
				exams4.setVisible(true);
				exams4.setPreferredSize(new Dimension(120, 30));
				exams4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				myfile5 = new File(SubjectList.get(4).getName() + "info.txt");
				info5.readFromFile(myfile5, InfoArea5);
			
				
				exams5 = new JButton("Δείτε τα παλία θέματα.");
			
				exams5.setVisible(true);
				exams5.setPreferredSize(new Dimension(120, 30));
				exams5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						InfoArea5.setEditable(true);
					}
				});
				
				
				
				myfile6 = new File(SubjectList.get(5).getName() + "info.txt");
				info6.readFromFile(myfile6, InfoArea6);
				
				exams6 = new JButton("Δείτε τα παλία θέματα.");
			
				exams6.setVisible(true);
				exams6.setPreferredSize(new Dimension(120, 30));
				exams6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				myfile7 = new File(SubjectList.get(6).getName() + "info.txt");
				info7.readFromFile(myfile7, InfoArea7);
				
				
				exams7 = new JButton("Δείτε τα παλία θέματα.");
				
				exams7.setVisible(true);
				exams7.setPreferredSize(new Dimension(120, 30));
				exams7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				File myfile8 = new File(SubjectList.get(7).getName() + "info.txt");
				info8.readFromFile(myfile8, InfoArea8);
				
				
				JButton exams8 = new JButton("Δείτε τα παλία θέματα.");
				
				exams8.setVisible(true);
				exams8.setPreferredSize(new Dimension(120, 30));
				exams8.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
			
				
				infoLabel1 = new JLabel(SubjectList.get(0).getName());
				infoLabel1.setSize(new Dimension(400, 30));
				infoLabel1.setVisible(false);
				infoLabel1.setOpaque(true);
				infoLabel1.setBackground(Color.RED);
				infoLabel1.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel2 = new JLabel(SubjectList.get(1).getName());
				infoLabel2.setSize(new Dimension(400, 30));
				infoLabel2.setVisible(false);
				infoLabel2.setOpaque(true);
				infoLabel2.setBackground(Color.RED);
				infoLabel2.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel3 = new JLabel(SubjectList.get(2).getName());
				infoLabel3.setSize(new Dimension(400, 30));
				infoLabel3.setVisible(false);
				infoLabel3.setOpaque(true);
				infoLabel3.setBackground(Color.RED);
				infoLabel3.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel3.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel4 = new JLabel(SubjectList.get(3).getName());
				infoLabel4.setSize(new Dimension(400, 30));
				infoLabel4.setVisible(false);
				infoLabel4.setOpaque(true);
				infoLabel4.setBackground(Color.RED);
				infoLabel4.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel4.setVerticalTextPosition(JLabel.CENTER);
				
				 infoLabel5 = new JLabel(SubjectList.get(4).getName());
				infoLabel5.setSize(new Dimension(400, 30));
				infoLabel5.setVisible(false);
				infoLabel5.setOpaque(true);
				infoLabel5.setBackground(Color.RED);
				infoLabel5.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel5.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel6 = new JLabel(SubjectList.get(5).getName());
				infoLabel6.setSize(new Dimension(400, 30));
				infoLabel6.setVisible(false);
				infoLabel6.setOpaque(true);
				infoLabel6.setBackground(Color.RED);
				infoLabel6.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel6.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel7 = new JLabel(SubjectList.get(6).getName());
				infoLabel7.setSize(new Dimension(400, 30));
				infoLabel7.setVisible(false);
				infoLabel7.setOpaque(true);
				infoLabel7.setBackground(Color.RED);
				infoLabel7.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel7.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel infoLabel8 = new JLabel(SubjectList.get(7).getName());
				infoLabel8.setSize(new Dimension(400, 30));
				infoLabel8.setVisible(false);
				infoLabel8.setOpaque(true);
				infoLabel8.setBackground(Color.RED);
				infoLabel8.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel8.setVerticalTextPosition(JLabel.CENTER);
				
				InfoPanel.add(infoLabel1);
				InfoPanel.add(scroll1);
				InfoPanel.add(exams1);
				
				InfoPanel.add(infoLabel2);
				InfoPanel.add(InfoArea2);
				InfoPanel.add(exams2);
				
				InfoPanel.add(infoLabel3);
				InfoPanel.add(InfoArea3);
				InfoPanel.add(exams3);
				
				InfoPanel.add(infoLabel4);
				InfoPanel.add(InfoArea4);
				InfoPanel.add(exams4);
				
				InfoPanel.add(infoLabel5);
				InfoPanel.add(InfoArea5);
				InfoPanel.add(exams5);
				
				InfoPanel.add(infoLabel6);
				InfoPanel.add(InfoArea6);
				InfoPanel.add(exams6);
				
				InfoPanel.add(infoLabel7);
				InfoPanel.add(InfoArea7);
				InfoPanel.add(exams7);
				
				InfoPanel.add(infoLabel8);
				InfoPanel.add(InfoArea8);
				InfoPanel.add(exams8);
				
				infoLabel1.setVisible(true);
				InfoArea1.setVisible(true);
				
				
				infoLabel2.setVisible(true);
				InfoArea2.setVisible(true);
			
				
				infoLabel3.setVisible(true);
				InfoArea3.setVisible(true);
				
				
				infoLabel4.setVisible(true);
				InfoArea4.setVisible(true);
			
				
				infoLabel5.setVisible(true);
				InfoArea5.setVisible(true);
				
				
				infoLabel6.setVisible(true);
				InfoArea6.setVisible(true);
				
				
				infoLabel7.setVisible(true);
				InfoArea7.setVisible(true);
				
				
				infoLabel8.setVisible(true);
				InfoArea8.setVisible(true);
				
				
				break;
				
			case 9:
				myfile1 = new File(SubjectList.get(0).getName() + "info.txt");
				info1.readFromFile(myfile1, InfoArea1);
			
				 
				 /*Write Button*/
					exams1 =new JButton("Δείτε τα παλία θέματα.");
					
					exams1.setVisible(true);
					exams1.setPreferredSize(new Dimension(120, 30));
					exams1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							//Exams code
						}
					});
					
					
					
				myfile2 = new File(SubjectList.get(1).getName() + "info.txt");
				info2.readFromFile(myfile2, InfoArea2);
		
				
				
				exams2 = new JButton("Δείτε τα παλία θέματα.");
				
				exams2.setVisible(true);
				exams2.setPreferredSize(new Dimension(120, 30));
				exams2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
			
				
				
				myfile3 = new File(SubjectList.get(2).getName() + "info.txt");
				info3.readFromFile(myfile3, InfoArea3);
				
				
				exams3 = new JButton("Δείτε τα παλία θέματα.");
				
				exams3.setVisible(true);
				exams3.setPreferredSize(new Dimension(120, 30));
				exams3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				
				myfile4 = new File(SubjectList.get(3).getName() + "info.txt");
				info4.readFromFile(myfile4, InfoArea4);
				
				
				exams4 = new JButton("Δείτε τα παλία θέματα.");
				
				exams4.setVisible(true);
				exams4.setPreferredSize(new Dimension(120, 30));
				exams4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				myfile5 = new File(SubjectList.get(4).getName() + "info.txt");
				info5.readFromFile(myfile5, InfoArea5);
			
				
				exams5 = new JButton("Δείτε τα παλία θέματα.");
				
				exams5.setVisible(true);
				exams5.setPreferredSize(new Dimension(120, 30));
				exams5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						InfoArea5.setEditable(true);
					}
				});
				
				
				
				myfile6 = new File(SubjectList.get(5).getName() + "info.txt");
				info6.readFromFile(myfile6, InfoArea6);
				
				exams6 = new JButton("Δείτε τα παλία θέματα.");
				
				exams6.setVisible(true);
				exams6.setPreferredSize(new Dimension(120, 30));
				exams6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				myfile7 = new File(SubjectList.get(6).getName() + "info.txt");
				info7.readFromFile(myfile7, InfoArea7);
				
				
				exams7 = new JButton("Δείτε τα παλία θέματα.");
				
				exams7.setVisible(true);
				exams7.setPreferredSize(new Dimension(120, 30));
				exams7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				myfile8 = new File(SubjectList.get(7).getName() + "info.txt");
				info8.readFromFile(myfile8, InfoArea8);
				
				
				exams8 = new JButton("Δείτε τα παλία θέματα.");
				
				exams8.setVisible(true);
				exams8.setPreferredSize(new Dimension(120, 30));
				exams8.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				File myfile9 = new File(SubjectList.get(8).getName() + "info.txt");
				info9.readFromFile(myfile9, InfoArea9);
				
				
				JButton exams9 = new JButton("Δείτε τα παλία θέματα.");
				
				exams9.setVisible(true);
				exams9.setPreferredSize(new Dimension(120, 30));
				exams9.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				
				
				
				infoLabel1 = new JLabel(SubjectList.get(0).getName());
				infoLabel1.setSize(new Dimension(400, 30));
				infoLabel1.setVisible(false);
				infoLabel1.setOpaque(true);
				infoLabel1.setBackground(Color.RED);
				infoLabel1.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel2 = new JLabel(SubjectList.get(1).getName());
				infoLabel2.setSize(new Dimension(400, 30));
				infoLabel2.setVisible(false);
				infoLabel2.setOpaque(true);
				infoLabel2.setBackground(Color.RED);
				infoLabel2.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel3 = new JLabel(SubjectList.get(2).getName());
				infoLabel3.setSize(new Dimension(400, 30));
				infoLabel3.setVisible(false);
				infoLabel3.setOpaque(true);
				infoLabel3.setBackground(Color.RED);
				infoLabel3.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel3.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel4 = new JLabel(SubjectList.get(3).getName());
				infoLabel4.setSize(new Dimension(400, 30));
				infoLabel4.setVisible(false);
				infoLabel4.setOpaque(true);
				infoLabel4.setBackground(Color.RED);
				infoLabel4.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel4.setVerticalTextPosition(JLabel.CENTER);
				
				 infoLabel5 = new JLabel(SubjectList.get(4).getName());
				infoLabel5.setSize(new Dimension(400, 30));
				infoLabel5.setVisible(false);
				infoLabel5.setOpaque(true);
				infoLabel5.setBackground(Color.RED);
				infoLabel5.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel5.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel6 = new JLabel(SubjectList.get(5).getName());
				infoLabel6.setSize(new Dimension(400, 30));
				infoLabel6.setVisible(false);
				infoLabel6.setOpaque(true);
				infoLabel6.setBackground(Color.RED);
				infoLabel6.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel6.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel7 = new JLabel(SubjectList.get(6).getName());
				infoLabel7.setSize(new Dimension(400, 30));
				infoLabel7.setVisible(false);
				infoLabel7.setOpaque(true);
				infoLabel7.setBackground(Color.RED);
				infoLabel7.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel7.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel8 = new JLabel(SubjectList.get(7).getName());
				infoLabel8.setSize(new Dimension(400, 30));
				infoLabel8.setVisible(false);
				infoLabel8.setOpaque(true);
				infoLabel8.setBackground(Color.RED);
				infoLabel8.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel8.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel infoLabel9 = new JLabel(SubjectList.get(8).getName());
				infoLabel9.setSize(new Dimension(400, 30));
				infoLabel9.setVisible(false);
				infoLabel9.setOpaque(true);
				infoLabel9.setBackground(Color.RED);
				infoLabel9.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel9.setVerticalTextPosition(JLabel.CENTER);
				
				InfoPanel.add(infoLabel1);
				InfoPanel.add(InfoArea1);
				InfoPanel.add(exams1);
				
				InfoPanel.add(infoLabel2);
				InfoPanel.add(InfoArea2);
				InfoPanel.add(exams2);
				
				
				InfoPanel.add(infoLabel3);
				InfoPanel.add(InfoArea3);
				InfoPanel.add(exams3);
				
				InfoPanel.add(infoLabel4);
				InfoPanel.add(InfoArea4);
				InfoPanel.add(exams4);
				
				InfoPanel.add(infoLabel5);
				InfoPanel.add(InfoArea5);
				InfoPanel.add(exams5);
				
				InfoPanel.add(infoLabel6);
				InfoPanel.add(InfoArea6);
				InfoPanel.add(exams6);
				
				InfoPanel.add(infoLabel7);
				InfoPanel.add(InfoArea7);
				InfoPanel.add(exams7);
				
				InfoPanel.add(infoLabel8);
				InfoPanel.add(InfoArea8);
				InfoPanel.add(exams8);
				
				InfoPanel.add(infoLabel9);
				InfoPanel.add(InfoArea9);
				InfoPanel.add(exams9);
				
				infoLabel1.setVisible(true);
				InfoArea1.setVisible(true);
				
				
				infoLabel2.setVisible(true);
				InfoArea2.setVisible(true);
			
				
				infoLabel3.setVisible(true);
				InfoArea3.setVisible(true);
			
				
				infoLabel4.setVisible(true);
				InfoArea4.setVisible(true);
				
				
				infoLabel5.setVisible(true);
				InfoArea5.setVisible(true);
			
				
				infoLabel6.setVisible(true);
				InfoArea6.setVisible(true);
				
				
				infoLabel7.setVisible(true);
				InfoArea7.setVisible(true);
				
				
				infoLabel8.setVisible(true);
				InfoArea8.setVisible(true);
				
				
				infoLabel9.setVisible(true);
				InfoArea9.setVisible(true);
				
				break;
				
			case 10:
				
				myfile1 = new File(SubjectList.get(0).getName() + "info.txt");
				info1.readFromFile(myfile1, InfoArea1);
			
				 
				 /*Write Button*/
					exams1 =new JButton("Δείτε τα παλία θέματα.");
					
					exams1.setVisible(true);
					exams1.setPreferredSize(new Dimension(120, 30));
					exams1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							//Exams code
						}
					});
					
					
					
				myfile2 = new File(SubjectList.get(1).getName() + "info.txt");
				info2.readFromFile(myfile2, InfoArea2);
		
				
				
				exams2 = new JButton("Δείτε τα παλία θέματα.");
			
				exams2.setVisible(true);
				exams2.setPreferredSize(new Dimension(120, 30));
				exams2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
			
				
				
				myfile3 = new File(SubjectList.get(2).getName() + "info.txt");
				info3.readFromFile(myfile3, InfoArea3);
				
				
				exams3 =new JButton("Δείτε τα παλία θέματα.");
				
				exams3.setVisible(true);
				exams3.setPreferredSize(new Dimension(120, 30));
				exams3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				
				myfile4 = new File(SubjectList.get(3).getName() + "info.txt");
				info4.readFromFile(myfile4, InfoArea4);
				
				
				exams4 = new JButton("Δείτε τα παλία θέματα.");
			
				exams4.setVisible(true);
				exams4.setPreferredSize(new Dimension(120, 30));
				exams4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				myfile5 = new File(SubjectList.get(4).getName() + "info.txt");
				info5.readFromFile(myfile5, InfoArea5);
			
				
				exams5 = new JButton("Δείτε τα παλία θέματα.");
			
				exams5.setVisible(true);
				exams5.setPreferredSize(new Dimension(120, 30));
				exams5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						InfoArea5.setEditable(true);
					}
				});
				
				
				
				myfile6 = new File(SubjectList.get(5).getName() + "info.txt");
				info6.readFromFile(myfile6, InfoArea6);
				
				exams6 = new JButton("Δείτε τα παλία θέματα.");
			
				exams6.setVisible(true);
				exams6.setPreferredSize(new Dimension(120, 30));
				exams6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				myfile7 = new File(SubjectList.get(6).getName() + "info.txt");
				info7.readFromFile(myfile7, InfoArea7);
				
				
				exams7 = new JButton("Δείτε τα παλία θέματα.");
				
				exams7.setVisible(true);
				exams7.setPreferredSize(new Dimension(120, 30));
				exams7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				myfile8 = new File(SubjectList.get(7).getName() + "info.txt");
				info8.readFromFile(myfile8, InfoArea8);
				
				
				exams8 = new JButton("Δείτε τα παλία θέματα.");
			
				exams8.setVisible(true);
				exams8.setPreferredSize(new Dimension(120, 30));
				exams8.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				myfile9 = new File(SubjectList.get(8).getName() + "info.txt");
				info9.readFromFile(myfile9, InfoArea9);
				
				
				exams9 = new JButton("Δείτε τα παλία θέματα.");
				
				exams9.setVisible(true);
				exams9.setPreferredSize(new Dimension(120, 30));
				exams9.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				
				File myfile10= new File(SubjectList.get(9).getName() + "info.txt");
				info10.readFromFile(myfile10, InfoArea10);
			
				
				JButton exams10 = new JButton("Δείτε τα παλία θέματα.");
				
				exams10.setVisible(true);
				exams10.setPreferredSize(new Dimension(120, 30));
				exams10.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//Exams code
					}
				});
				
				infoLabel1 = new JLabel(SubjectList.get(0).getName());
				infoLabel1.setSize(new Dimension(400, 30));
				infoLabel1.setVisible(false);
				infoLabel1.setOpaque(true);
				infoLabel1.setBackground(Color.RED);
				infoLabel1.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel2 = new JLabel(SubjectList.get(1).getName());
				infoLabel2.setSize(new Dimension(400, 30));
				infoLabel2.setVisible(false);
				infoLabel2.setOpaque(true);
				infoLabel2.setBackground(Color.RED);
				infoLabel2.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel3 = new JLabel(SubjectList.get(2).getName());
				infoLabel3.setSize(new Dimension(400, 30));
				infoLabel3.setVisible(false);
				infoLabel3.setOpaque(true);
				infoLabel3.setBackground(Color.RED);
				infoLabel3.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel3.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel4 = new JLabel(SubjectList.get(3).getName());
				infoLabel4.setSize(new Dimension(400, 30));
				infoLabel4.setVisible(false);
				infoLabel4.setOpaque(true);
				infoLabel4.setBackground(Color.RED);
				infoLabel4.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel4.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel5 = new JLabel(SubjectList.get(4).getName());
				infoLabel5.setSize(new Dimension(400, 30));
				infoLabel5.setVisible(false);
				infoLabel5.setOpaque(true);
				infoLabel5.setBackground(Color.RED);
				infoLabel5.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel5.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel6 = new JLabel(SubjectList.get(5).getName());
				infoLabel6.setSize(new Dimension(400, 30));
				infoLabel6.setVisible(false);
				infoLabel6.setOpaque(true);
				infoLabel6.setBackground(Color.RED);
				infoLabel6.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel6.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel7 = new JLabel(SubjectList.get(6).getName());
				infoLabel7.setSize(new Dimension(400, 30));
				infoLabel7.setVisible(false);
				infoLabel7.setOpaque(true);
				infoLabel7.setBackground(Color.RED);
				infoLabel7.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel7.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel8 = new JLabel(SubjectList.get(7).getName());
				infoLabel8.setSize(new Dimension(400, 30));
				infoLabel8.setVisible(false);
				infoLabel8.setOpaque(true);
				infoLabel8.setBackground(Color.RED);
				infoLabel8.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel8.setVerticalTextPosition(JLabel.CENTER);
				
				infoLabel9 = new JLabel(SubjectList.get(8).getName());
				infoLabel9.setSize(new Dimension(400, 30));
				infoLabel9.setVisible(false);
				infoLabel9.setOpaque(true);
				infoLabel9.setBackground(Color.RED);
				infoLabel9.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel9.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel infoLabel10 = new JLabel(SubjectList.get(9).getName());
				infoLabel10.setSize(new Dimension(400, 30));
				infoLabel10.setVisible(false);
				infoLabel10.setOpaque(true);
				infoLabel10.setBackground(Color.RED);
				infoLabel10.setHorizontalTextPosition(JLabel.CENTER);
				infoLabel10.setVerticalTextPosition(JLabel.CENTER);
				
				InfoPanel.add(infoLabel1);
				InfoPanel.add(InfoArea1);
				InfoPanel.add(exams1);
				
				InfoPanel.add(infoLabel2);
				InfoPanel.add(InfoArea2);
				InfoPanel.add(exams2);
				
				
				InfoPanel.add(infoLabel3);
				InfoPanel.add(InfoArea3);
				InfoPanel.add(exams3);
				
				InfoPanel.add(infoLabel4);
				InfoPanel.add(InfoArea4);
				InfoPanel.add(exams4);
				
				InfoPanel.add(infoLabel5);
				InfoPanel.add(InfoArea5);
				InfoPanel.add(exams5);
				
				InfoPanel.add(infoLabel6);
				InfoPanel.add(InfoArea6);
				InfoPanel.add(exams6);
				
				InfoPanel.add(infoLabel7);
				InfoPanel.add(InfoArea7);
				InfoPanel.add(exams7);
				
				InfoPanel.add(infoLabel8);
				InfoPanel.add(InfoArea8);
				InfoPanel.add(exams8);
				
				InfoPanel.add(infoLabel9);
				InfoPanel.add(InfoArea9);
				InfoPanel.add(exams9);
				
				InfoPanel.add(infoLabel10);
				InfoPanel.add(InfoArea10);
				scroll1.setVisible(true);
				NoteFrame.add(scroll1);
				InfoPanel.add(exams10);
				
				
				infoLabel1.setVisible(true);
				InfoArea1.setVisible(true);
				
				
				infoLabel2.setVisible(true);
				InfoArea2.setVisible(true);
				
				
				infoLabel3.setVisible(true);
				InfoArea3.setVisible(true);
				
				
				infoLabel4.setVisible(true);
				InfoArea4.setVisible(true);
			
				
				infoLabel5.setVisible(true);
				InfoArea5.setVisible(true);
			
				
				infoLabel6.setVisible(true);
				InfoArea6.setVisible(true);
				
				
				infoLabel7.setVisible(true);
				InfoArea7.setVisible(true);
			
				
				infoLabel8.setVisible(true);
				InfoArea8.setVisible(true);
				
				
				infoLabel9.setVisible(true);
				InfoArea9.setVisible(true);
				
				
				infoLabel10.setVisible(true);
				InfoArea10.setVisible(true);
			
				break;
				
			}
			
			NoteFrame.add(scroll);
	}
	
	

}


