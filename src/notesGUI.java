import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class notesGUI extends JFrame {

	private JFrame NoteFrame = new JFrame("Personal Notes");
	private JPanel NotePanel = new JPanel();
	private JPanel ButtonPanel1 = new JPanel();
	private JPanel ButtonPanel2 = new JPanel();
	private JPanel ButtonPanel3 = new JPanel();
	private JPanel ButtonPanel4 = new JPanel();
	private JPanel ButtonPanel5 = new JPanel();
	private JPanel ButtonPanel6 = new JPanel();
	private JPanel ButtonPanel7 = new JPanel();
	private JPanel ButtonPanel8 = new JPanel();
	private JPanel ButtonPanel9 = new JPanel();
	private JPanel ButtonPanel10 = new JPanel();
	private ArrayList<String> SubjectList = new ArrayList<String>();
	private JTextArea NoteArea = new JTextArea();
	private JScrollPane scroll = new JScrollPane(NotePanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	private static final int WIDTH = 1200;
	private static final int HEIGHT = 900;
	private JButton backButton;
	public void setSubjectList(ArrayList<String> array) {
		SubjectList.addAll(array);
	}

	public notesGUI(ArrayList<String> array) {

		
		SubjectList.addAll(array);
		NotePanel.setBackground(Color.GRAY);
		System.out.println(SubjectList.size());
		backButton = new JButton("Back");
		NotePanel.add(backButton);
		
		
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
			JTextArea NoteArea1 = new JTextArea();
			NoteArea1.setPreferredSize(new Dimension(285, 100));
			NoteArea1.setMinimumSize(new Dimension(285, 100));
			NoteArea1.setMaximumSize(new Dimension(285, 100));
			NoteArea1.setEditable(true);
			NoteArea1.setVisible(false);
			NoteArea1.setLineWrap(true);
			JScrollPane scroll1 = new JScrollPane(NoteArea1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			
			
			JTextArea NoteArea2 = new JTextArea();
			JScrollPane scroll2 = new JScrollPane(NoteArea2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			NoteArea2.setPreferredSize(new Dimension(285, 100));
			NoteArea2.setMinimumSize(new Dimension(285, 100));
			NoteArea2.setMaximumSize(new Dimension(285, 100));
			NoteArea2.setEditable(true);
			NoteArea2.setVisible(false);
			NoteArea2.setLineWrap(true);
			
			JTextArea NoteArea3 = new JTextArea();
			JScrollPane scroll3 = new JScrollPane(NoteArea3, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			NoteArea3.setPreferredSize(new Dimension(285, 100));
			NoteArea3.setMinimumSize(new Dimension(285, 100));
			NoteArea3.setMaximumSize(new Dimension(285, 100));
			NoteArea3.setEditable(true);
			NoteArea3.setVisible(false);
			NoteArea3.setLineWrap(true);
			
			JTextArea NoteArea4 = new JTextArea();
			JScrollPane scroll4 = new JScrollPane(NoteArea4, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			NoteArea4.setPreferredSize(new Dimension(285, 100));
			NoteArea4.setMinimumSize(new Dimension(285, 100));
			NoteArea4.setMaximumSize(new Dimension(285, 100));
			NoteArea4.setEditable(true);
			NoteArea4.setVisible(false);
			NoteArea4.setLineWrap(true);
			
			JTextArea NoteArea5 = new JTextArea();
			JScrollPane scroll5 = new JScrollPane(NoteArea5, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			NoteArea5.setPreferredSize(new Dimension(285, 100));
			NoteArea5.setMinimumSize(new Dimension(285, 100));
			NoteArea5.setMaximumSize(new Dimension(285, 100));
			NoteArea5.setEditable(true);
			NoteArea5.setVisible(false);
			NoteArea5.setLineWrap(true);
			
			JTextArea NoteArea6 = new JTextArea();
			JScrollPane scroll6 = new JScrollPane(NoteArea6, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			NoteArea6.setPreferredSize(new Dimension(285, 100));
			NoteArea6.setMinimumSize(new Dimension(285, 100));
			NoteArea6.setMaximumSize(new Dimension(285, 100));
			NoteArea6.setEditable(true);
			NoteArea6.setVisible(false);
			NoteArea6.setLineWrap(true);
			
			JTextArea NoteArea7 = new JTextArea();
			JScrollPane scroll7 = new JScrollPane(NoteArea7, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			NoteArea7.setPreferredSize(new Dimension(250, 100));
			NoteArea7.setMinimumSize(new Dimension(250, 100));
			NoteArea7.setMaximumSize(new Dimension(250, 100));
			NoteArea7.setEditable(true);
			NoteArea7.setVisible(false);
			NoteArea7.setLineWrap(true);
			
			JTextArea NoteArea8 = new JTextArea();
			JScrollPane scroll8 = new JScrollPane(NoteArea8, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			NoteArea8.setPreferredSize(new Dimension(285, 100));
			NoteArea8.setMinimumSize(new Dimension(285, 100));
			NoteArea8.setMaximumSize(new Dimension(285, 100));
			NoteArea8.setEditable(true);
			NoteArea8.setVisible(false);
			NoteArea8.setLineWrap(true);
			
			JTextArea NoteArea9 = new JTextArea();
			JScrollPane scroll9 = new JScrollPane(NoteArea9, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			NoteArea9.setPreferredSize(new Dimension(250, 100));
			NoteArea9.setMinimumSize(new Dimension(250, 100));
			NoteArea9.setMaximumSize(new Dimension(250, 100));
			NoteArea9.setEditable(true);
			NoteArea9.setVisible(false);
			NoteArea9.setLineWrap(true);
			
			JTextArea NoteArea10 = new JTextArea();
			JScrollPane scroll10 = new JScrollPane(NoteArea10, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			NoteArea10.setPreferredSize(new Dimension(285, 100));
			NoteArea10.setMinimumSize(new Dimension(285, 100));
			NoteArea10.setMaximumSize(new Dimension(285, 100));
			NoteArea10.setEditable(true);
			NoteArea10.setVisible(false);
			NoteArea10.setLineWrap(true);
			
			 int num = SubjectList.size();
			
			System.out.println(new File(".").getAbsoluteFile());
			
			Notes note1  = new Notes(NoteArea1);
			Notes note2  = new Notes(NoteArea2);
			Notes note3  = new Notes(NoteArea3);
			Notes note4  = new Notes(NoteArea4);
			Notes note5  = new Notes(NoteArea5);
			Notes note6  = new Notes(NoteArea6);
			Notes note7  = new Notes(NoteArea7);
			Notes note8  = new Notes(NoteArea8);
			Notes note9  = new Notes(NoteArea9);
			Notes note10  = new Notes(NoteArea10);
			
			
			/* Panel Layouts */
			NotePanel.setLayout(new BoxLayout(NotePanel, BoxLayout.Y_AXIS));
			ButtonPanel1.setLayout(new FlowLayout());
			
			scroll.setVisible(true);
			

			switch(num) {
			case 1:
				
				
				
				 File myfile1 = new File(SubjectList.get(0) + "myUomNotes.txt");
				 note1.readFromFile(myfile1, NoteArea1);
				 MyJButton set1 = new MyJButton("Αποθηκευση",myfile1);
				 
				 /*Write Button*/
					JButton write1 = new JButton("Σημειωσε");
					write1.setVisible(true);
					write1.setPreferredSize(new Dimension(120, 30));
					write1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							NoteArea1.setEditable(true);
						}
					});
					
					/*Set1*/
					ButtonPanel1.add(set1);
					ButtonPanel1.add(write1);
					ButtonPanel1.setVisible(false);
					ButtonPanel1.setBackground(Color.GRAY);
					ButtonPanel1.setPreferredSize(new Dimension(150, 90));
					set1.setPreferredSize(new Dimension(120, 30));
					
					set1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							NoteArea1.setEditable(false);
							note1.writeToFile(myfile1,NoteArea1);
						
						
							
						}
					});
					
				JLabel NoteLabel1 = new JLabel(SubjectList.get(0));
				NoteLabel1.setSize(new Dimension(400, 30));
				NoteLabel1.setVisible(false);
				NoteLabel1.setOpaque(true);
				NoteLabel1.setBackground(Color.RED);
				NoteLabel1.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				NotePanel.add(NoteLabel1);
				NotePanel.add(NoteArea1);
				NotePanel.add(ButtonPanel1);
				
				NoteLabel1.setVisible(true);
				NoteArea1.setVisible(true);
				ButtonPanel1.setVisible(true);
				
				
				
				
				break;
			case 2:
				
				myfile1 = new File(SubjectList.get(0) + "myUomNotes.txt");
				note1.readFromFile(myfile1, NoteArea1);
				set1 = new MyJButton("Αποθηκευση",myfile1);
				 
				 /*Write Button*/
					write1 = new JButton("Σημειωσε");
					write1.setVisible(true);
					write1.setPreferredSize(new Dimension(120, 30));
					write1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							NoteArea1.setEditable(true);
						}
					});
					
					/*Set1*/
					ButtonPanel1.add(set1);
					ButtonPanel1.add(write1);
					ButtonPanel1.setVisible(false);
					ButtonPanel1.setBackground(Color.GRAY);
					ButtonPanel1.setPreferredSize(new Dimension(150, 90));
					set1.setPreferredSize(new Dimension(120, 30));
					
					set1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							NoteArea1.setEditable(false);
							note1.writeToFile(myfile1,NoteArea1);
							
						
							
						}
					});
					
				File myfile2 = new File(SubjectList.get(1) + "myUomNotes.txt");
				note2.readFromFile(myfile2, NoteArea2);
				MyJButton set2 = new MyJButton("Αποθηκευση",myfile2);
				
				
				JButton write2 = new JButton("Σημειωσε");
				write2.setVisible(true);
				write2.setPreferredSize(new Dimension(120, 30));
				write2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea2.setEditable(true);
					}
				});
			
				/*Set2*/
				ButtonPanel2.add(set2);
				ButtonPanel2.add(write2);
				ButtonPanel2.setVisible(false);
				ButtonPanel2.setBackground(Color.GRAY);
				ButtonPanel2.setPreferredSize(new Dimension(150, 90));
				set2.setPreferredSize(new Dimension(120, 30));
				
				set2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea2.setEditable(false);
						note2.writeToFile(myfile2,NoteArea2);
					
						
					}
				});
					
				NoteLabel1 = new JLabel(SubjectList.get(0));
				NoteLabel1.setSize(new Dimension(400, 30));
				NoteLabel1.setVisible(false);
				NoteLabel1.setOpaque(true);
				NoteLabel1.setBackground(Color.RED);
				NoteLabel1.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel NoteLabel2 = new JLabel(SubjectList.get(1));
				NoteLabel2.setSize(new Dimension(400, 30));
				NoteLabel2.setVisible(false);
				NoteLabel2.setOpaque(true);
				NoteLabel2.setBackground(Color.RED);
				NoteLabel2.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				
				NotePanel.add(NoteLabel1);
				NotePanel.add(NoteArea1);
				NotePanel.add(ButtonPanel1);
				
				NotePanel.add(NoteLabel2);
				NotePanel.add(NoteArea2);
				NotePanel.add(ButtonPanel2);
				
				NoteLabel1.setVisible(true);
				NoteArea1.setVisible(true);
				ButtonPanel1.setVisible(true);
				
				NoteLabel2.setVisible(true);
				NoteArea2.setVisible(true);
				ButtonPanel2.setVisible(true);
				break;
			case 3:
				
				myfile1 = new File(SubjectList.get(0) + "myUomNotes.txt");
				note1.readFromFile(myfile1, NoteArea1);
				set1 = new MyJButton("Αποθηκευση",myfile1);
				 
				 /*Write Button*/
					write1 = new JButton("Σημειωσε");
					write1.setVisible(true);
					write1.setPreferredSize(new Dimension(120, 30));
					write1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							NoteArea1.setEditable(true);
						}
					});
					
					/*Set1*/
					ButtonPanel1.add(set1);
					ButtonPanel1.add(write1);
					ButtonPanel1.setVisible(false);
					ButtonPanel1.setBackground(Color.GRAY);
					ButtonPanel1.setPreferredSize(new Dimension(150, 90));
					set1.setPreferredSize(new Dimension(120, 30));
					
					set1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							NoteArea1.setEditable(false);
							note1.writeToFile(myfile1,NoteArea1);
							
						
							
						}
					});
					
				myfile2 = new File(SubjectList.get(1) + "myUomNotes.txt");
				note2.readFromFile(myfile2, NoteArea2);
				set2 = new MyJButton("Αποθηκευση",myfile2);
				
				
				write2 = new JButton("Σημειωσε");
				write2.setVisible(true);
				write2.setPreferredSize(new Dimension(120, 30));
				write2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea2.setEditable(true);
					}
				});
			
				/*Set2*/
				ButtonPanel2.add(set2);
				ButtonPanel2.add(write2);
				ButtonPanel2.setVisible(false);
				ButtonPanel2.setBackground(Color.GRAY);
				ButtonPanel2.setPreferredSize(new Dimension(150, 90));
				set2.setPreferredSize(new Dimension(120, 30));
				
				set2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea2.setEditable(false);
						note2.writeToFile(myfile2,NoteArea2);
					
						
					}
				});
				
				File myfile3 = new File(SubjectList.get(2) + "myUomNotes.txt");
				note3.readFromFile(myfile3, NoteArea3);
				MyJButton set3 = new MyJButton("Αποθηκευση",myfile3);
				
				JButton write3 = new JButton("Σημειωσε");
				write3.setVisible(true);
				write3.setPreferredSize(new Dimension(120, 30));
				write3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea3.setEditable(true);
					}
				});
				
				/*Set3*/
				ButtonPanel3.add(set3);
				ButtonPanel3.add(write3);
				ButtonPanel3.setVisible(false);
				ButtonPanel3.setBackground(Color.GRAY);
				ButtonPanel3.setPreferredSize(new Dimension(150, 90));
				set3.setPreferredSize(new Dimension(120, 30));
				
				set3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea3.setEditable(false);
						note3.writeToFile(myfile3,NoteArea3);
					
						
					}
				});
				
				
				NoteLabel1 = new JLabel(SubjectList.get(0));
				NoteLabel1.setSize(new Dimension(400, 30));
				NoteLabel1.setVisible(false);
				NoteLabel1.setOpaque(true);
				NoteLabel1.setBackground(Color.RED);
				NoteLabel1.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel2 = new JLabel(SubjectList.get(1));
				NoteLabel2.setSize(new Dimension(400, 30));
				NoteLabel2.setVisible(false);
				NoteLabel2.setOpaque(true);
				NoteLabel2.setBackground(Color.RED);
				NoteLabel2.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel NoteLabel3 = new JLabel(SubjectList.get(2));
				NoteLabel3.setSize(new Dimension(400, 30));
				NoteLabel3.setVisible(false);
				NoteLabel3.setOpaque(true);
				NoteLabel3.setBackground(Color.RED);
				NoteLabel3.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel3.setVerticalTextPosition(JLabel.CENTER);
				
				
				
				
				NotePanel.add(NoteLabel1);
				NotePanel.add(NoteArea1);
				NotePanel.add(ButtonPanel1);
				
				NotePanel.add(NoteLabel2);
				NotePanel.add(NoteArea2);
				NotePanel.add(ButtonPanel2);
				
				NotePanel.add(NoteLabel3);
				NotePanel.add(NoteArea3);
				NotePanel.add(ButtonPanel3);
				
			
				NoteLabel1.setVisible(true);
				NoteArea1.setVisible(true);
				ButtonPanel1.setVisible(true);
				
				NoteLabel2.setVisible(true);
				NoteArea2.setVisible(true);
				ButtonPanel2.setVisible(true);
				
				NoteLabel3.setVisible(true);
				NoteArea3.setVisible(true);
				ButtonPanel3.setVisible(true);
				break;
			case 4:
				
				myfile1 = new File(SubjectList.get(0) + "myUomNotes.txt");
				note1.readFromFile(myfile1, NoteArea1);
				set1 = new MyJButton("Αποθηκευση",myfile1);
				 
				 /*Write Button*/
					write1 = new JButton("Σημειωσε");
					write1.setVisible(true);
					write1.setPreferredSize(new Dimension(120, 30));
					write1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							NoteArea1.setEditable(true);
						}
					});
					
					/*Set1*/
					ButtonPanel1.add(set1);
					ButtonPanel1.add(write1);
					ButtonPanel1.setVisible(false);
					ButtonPanel1.setBackground(Color.GRAY);
					ButtonPanel1.setPreferredSize(new Dimension(150, 90));
					set1.setPreferredSize(new Dimension(120, 30));
					
					set1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							NoteArea1.setEditable(false);
							note1.writeToFile(myfile1,NoteArea1);
							
						
							
						}
					});
					
				myfile2 = new File(SubjectList.get(1) + "myUomNotes.txt");
				note2.readFromFile(myfile2, NoteArea2);
				set2 = new MyJButton("Αποθηκευση",myfile2);
				
				
				write2 = new JButton("Σημειωσε");
				write2.setVisible(true);
				write2.setPreferredSize(new Dimension(120, 30));
				write2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea2.setEditable(true);
					}
				});
			
				/*Set2*/
				ButtonPanel2.add(set2);
				ButtonPanel2.add(write2);
				ButtonPanel2.setVisible(false);
				ButtonPanel2.setBackground(Color.GRAY);
				ButtonPanel2.setPreferredSize(new Dimension(150, 90));
				set2.setPreferredSize(new Dimension(120, 30));
				
				set2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea2.setEditable(false);
						note2.writeToFile(myfile2,NoteArea2);
					
						
					}
				});
				
				myfile3 = new File(SubjectList.get(2) + "myUomNotes.txt");
				note3.readFromFile(myfile3, NoteArea3);
				set3 = new MyJButton("Αποθηκευση",myfile3);
				
				write3 = new JButton("Σημειωσε");
				write3.setVisible(true);
				write3.setPreferredSize(new Dimension(120, 30));
				write3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea3.setEditable(true);
					}
				});
				
				/*Set3*/
				ButtonPanel3.add(set3);
				ButtonPanel3.add(write3);
				ButtonPanel3.setVisible(false);
				ButtonPanel3.setBackground(Color.GRAY);
				ButtonPanel3.setPreferredSize(new Dimension(150, 90));
				set3.setPreferredSize(new Dimension(120, 30));
				
				set3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea3.setEditable(false);
						note3.writeToFile(myfile3,NoteArea3);
					
						
					}
				});
				
				File myfile4 = new File(SubjectList.get(3) + "myUomNotes.txt");
				note4.readFromFile(myfile4, NoteArea4);
				MyJButton set4 = new MyJButton("Αποθηκευση",myfile4);
				
				JButton write4 = new JButton("Σημειωσε");
				write4.setVisible(true);
				write4.setPreferredSize(new Dimension(120, 30));
				write4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea4.setEditable(true);
					}
				});
				/*Set4*/
				ButtonPanel4.add(set4);
				ButtonPanel4.add(write4);
				ButtonPanel4.setVisible(false);
				ButtonPanel4.setBackground(Color.GRAY);
				ButtonPanel4.setPreferredSize(new Dimension(150, 90));
				set4.setPreferredSize(new Dimension(120, 30));
				
				set4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea4.setEditable(false);
						note4.writeToFile(myfile4,NoteArea4);
					
						
					}
				});
				
				
				
				NoteLabel1 = new JLabel(SubjectList.get(0));
				NoteLabel1.setSize(new Dimension(400, 30));
				NoteLabel1.setVisible(false);
				NoteLabel1.setOpaque(true);
				NoteLabel1.setBackground(Color.RED);
				NoteLabel1.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel2 = new JLabel(SubjectList.get(1));
				NoteLabel2.setSize(new Dimension(400, 30));
				NoteLabel2.setVisible(false);
				NoteLabel2.setOpaque(true);
				NoteLabel2.setBackground(Color.RED);
				NoteLabel2.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel3 = new JLabel(SubjectList.get(2));
				NoteLabel3.setSize(new Dimension(400, 30));
				NoteLabel3.setVisible(false);
				NoteLabel3.setOpaque(true);
				NoteLabel3.setBackground(Color.RED);
				NoteLabel3.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel3.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel NoteLabel4 = new JLabel(SubjectList.get(3));
				NoteLabel4.setSize(new Dimension(400, 30));
				NoteLabel4.setVisible(false);
				NoteLabel4.setOpaque(true);
				NoteLabel4.setBackground(Color.RED);
				NoteLabel4.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel4.setVerticalTextPosition(JLabel.CENTER);
				
				
				NotePanel.add(NoteLabel1);
				NotePanel.add(NoteArea1);
				NotePanel.add(ButtonPanel1);
				
				NotePanel.add(NoteLabel2);
				NotePanel.add(NoteArea2);
				NotePanel.add(ButtonPanel2);
				
				NotePanel.add(NoteLabel3);
				NotePanel.add(NoteArea3);
				NotePanel.add(ButtonPanel3);
				
				NotePanel.add(NoteLabel4);
				NotePanel.add(NoteArea4);
				NotePanel.add(ButtonPanel4);
				
				NoteLabel1.setVisible(true);
				NoteArea1.setVisible(true);
				ButtonPanel1.setVisible(true);
				
				NoteLabel2.setVisible(true);
				NoteArea2.setVisible(true);
				ButtonPanel2.setVisible(true);
				
				NoteLabel3.setVisible(true);
				NoteArea3.setVisible(true);
				ButtonPanel3.setVisible(true);
				
				NoteLabel4.setVisible(true);
				NoteArea4.setVisible(true);
				ButtonPanel4.setVisible(true);
				break;
			case 5:
				
				myfile1 = new File(SubjectList.get(0) + "myUomNotes.txt");
				note1.readFromFile(myfile1, NoteArea1);
				set1 = new MyJButton("Αποθηκευση",myfile1);
				 
				 /*Write Button*/
					write1 = new JButton("Σημειωσε");
					write1.setVisible(true);
					write1.setPreferredSize(new Dimension(120, 30));
					write1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							NoteArea1.setEditable(true);
						}
					});
					
					/*Set1*/
					ButtonPanel1.add(set1);
					ButtonPanel1.add(write1);
					ButtonPanel1.setVisible(false);
					ButtonPanel1.setBackground(Color.GRAY);
					ButtonPanel1.setPreferredSize(new Dimension(150, 90));
					set1.setPreferredSize(new Dimension(120, 30));
					
					set1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							NoteArea1.setEditable(false);
							note1.writeToFile(myfile1,NoteArea1);
							
						
							
						}
					});
					
				myfile2 = new File(SubjectList.get(1) + "myUomNotes.txt");
				note2.readFromFile(myfile2, NoteArea2);
				set2 = new MyJButton("Αποθηκευση",myfile2);
				
				
				write2 = new JButton("Σημειωσε");
				write2.setVisible(true);
				write2.setPreferredSize(new Dimension(120, 30));
				write2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea2.setEditable(true);
					}
				});
			
				/*Set2*/
				ButtonPanel2.add(set2);
				ButtonPanel2.add(write2);
				ButtonPanel2.setVisible(false);
				ButtonPanel2.setBackground(Color.GRAY);
				ButtonPanel2.setPreferredSize(new Dimension(150, 90));
				set2.setPreferredSize(new Dimension(120, 30));
				
				set2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea2.setEditable(false);
						note2.writeToFile(myfile2,NoteArea2);
					
						
					}
				});
				
				myfile3 = new File(SubjectList.get(2) + "myUomNotes.txt");
				note3.readFromFile(myfile3, NoteArea3);
				set3 = new MyJButton("Αποθηκευση",myfile3);
				
				write3 = new JButton("Σημειωσε");
				write3.setVisible(true);
				write3.setPreferredSize(new Dimension(120, 30));
				write3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea3.setEditable(true);
					}
				});
				
				/*Set3*/
				ButtonPanel3.add(set3);
				ButtonPanel3.add(write3);
				ButtonPanel3.setVisible(false);
				ButtonPanel3.setBackground(Color.GRAY);
				ButtonPanel3.setPreferredSize(new Dimension(150, 90));
				set3.setPreferredSize(new Dimension(120, 30));
				
				set3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea3.setEditable(false);
						note3.writeToFile(myfile3,NoteArea3);
					
						
					}
				});
				
				myfile4 = new File(SubjectList.get(3) + "myUomNotes.txt");
				note4.readFromFile(myfile4, NoteArea4);
				set4 = new MyJButton("Αποθηκευση",myfile4);
				
				write4 = new JButton("Σημειωσε");
				write4.setVisible(true);
				write4.setPreferredSize(new Dimension(120, 30));
				write4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea4.setEditable(true);
					}
				});
				/*Set4*/
				ButtonPanel4.add(set4);
				ButtonPanel4.add(write4);
				ButtonPanel4.setVisible(false);
				ButtonPanel4.setBackground(Color.GRAY);
				ButtonPanel4.setPreferredSize(new Dimension(150, 90));
				set4.setPreferredSize(new Dimension(120, 30));
				
				set4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea4.setEditable(false);
						note4.writeToFile(myfile4,NoteArea4);
					
						
					}
				});
				
				File myfile5 = new File(SubjectList.get(4) + "myUomNotes.txt");
				note5.readFromFile(myfile5, NoteArea5);
				MyJButton set5 = new MyJButton("Αποθηκευση",myfile5);
				
				JButton write5 = new JButton("Σημειωσε");
				write5.setVisible(true);
				write5.setPreferredSize(new Dimension(120, 30));
				write5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea5.setEditable(true);
					}
				});
				
				/*Set5*/
				ButtonPanel5.add(set5);
				ButtonPanel5.add(write5);
				ButtonPanel5.setVisible(false);
				ButtonPanel5.setBackground(Color.GRAY);
				ButtonPanel5.setPreferredSize(new Dimension(150, 90));
				set5.setPreferredSize(new Dimension(120, 30));
				
				set5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea5.setEditable(false);
						note5.writeToFile(myfile5,NoteArea5);
					
						
					}
				});
				
				
				
				NoteLabel1 = new JLabel(SubjectList.get(0));
				NoteLabel1.setSize(new Dimension(400, 30));
				NoteLabel1.setVisible(false);
				NoteLabel1.setOpaque(true);
				NoteLabel1.setBackground(Color.RED);
				NoteLabel1.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel2 = new JLabel(SubjectList.get(1));
				NoteLabel2.setSize(new Dimension(400, 30));
				NoteLabel2.setVisible(false);
				NoteLabel2.setOpaque(true);
				NoteLabel2.setBackground(Color.RED);
				NoteLabel2.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel3 = new JLabel(SubjectList.get(2));
				NoteLabel3.setSize(new Dimension(400, 30));
				NoteLabel3.setVisible(false);
				NoteLabel3.setOpaque(true);
				NoteLabel3.setBackground(Color.RED);
				NoteLabel3.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel3.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel4 = new JLabel(SubjectList.get(3));
				NoteLabel4.setSize(new Dimension(400, 30));
				NoteLabel4.setVisible(false);
				NoteLabel4.setOpaque(true);
				NoteLabel4.setBackground(Color.RED);
				NoteLabel4.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel4.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel NoteLabel5 = new JLabel(SubjectList.get(4));
				NoteLabel5.setSize(new Dimension(400, 30));
				NoteLabel5.setVisible(false);
				NoteLabel5.setOpaque(true);
				NoteLabel5.setBackground(Color.RED);
				NoteLabel5.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel5.setVerticalTextPosition(JLabel.CENTER);
				
				NotePanel.add(NoteLabel1);
				NotePanel.add(NoteArea1);
				NotePanel.add(ButtonPanel1);
				
				NotePanel.add(NoteLabel2);
				NotePanel.add(NoteArea2);
				NotePanel.add(ButtonPanel2);
				
				NotePanel.add(NoteLabel3);
				NotePanel.add(NoteArea3);
				NotePanel.add(ButtonPanel3);
				
				NotePanel.add(NoteLabel4);
				NotePanel.add(NoteArea4);
				NotePanel.add(ButtonPanel4);
				
				NotePanel.add(NoteLabel5);
				NotePanel.add(NoteArea5);
				NotePanel.add(ButtonPanel5);
				
				NoteLabel1.setVisible(true);
				NoteArea1.setVisible(true);
				ButtonPanel1.setVisible(true);
				
				NoteLabel2.setVisible(true);
				NoteArea2.setVisible(true);
				ButtonPanel2.setVisible(true);
				
				NoteLabel3.setVisible(true);
				NoteArea3.setVisible(true);
				ButtonPanel3.setVisible(true);
				
				NoteLabel4.setVisible(true);
				NoteArea4.setVisible(true);
				ButtonPanel4.setVisible(true);
				
				NoteLabel5.setVisible(true);
				NoteArea5.setVisible(true);
				ButtonPanel5.setVisible(true);
				break;
				
			case 6:
				
				myfile1 = new File(SubjectList.get(0) + "myUomNotes.txt");
				note1.readFromFile(myfile1, NoteArea1);
				set1 = new MyJButton("Αποθηκευση",myfile1);
				 
				 /*Write Button*/
					write1 = new JButton("Σημειωσε");
					write1.setVisible(true);
					write1.setPreferredSize(new Dimension(120, 30));
					write1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							NoteArea1.setEditable(true);
						}
					});
					
					/*Set1*/
					ButtonPanel1.add(set1);
					ButtonPanel1.add(write1);
					ButtonPanel1.setVisible(false);
					ButtonPanel1.setBackground(Color.GRAY);
					ButtonPanel1.setPreferredSize(new Dimension(150, 90));
					set1.setPreferredSize(new Dimension(120, 30));
					
					set1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							NoteArea1.setEditable(false);
							note1.writeToFile(myfile1,NoteArea1);
							
						
							
						}
					});
					
				myfile2 = new File(SubjectList.get(1) + "myUomNotes.txt");
				note2.readFromFile(myfile2, NoteArea2);
				set2 = new MyJButton("Αποθηκευση",myfile2);
				
				
				write2 = new JButton("Σημειωσε");
				write2.setVisible(true);
				write2.setPreferredSize(new Dimension(120, 30));
				write2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea2.setEditable(true);
					}
				});
			
				/*Set2*/
				ButtonPanel2.add(set2);
				ButtonPanel2.add(write2);
				ButtonPanel2.setVisible(false);
				ButtonPanel2.setBackground(Color.GRAY);
				ButtonPanel2.setPreferredSize(new Dimension(150, 90));
				set2.setPreferredSize(new Dimension(120, 30));
				
				set2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea2.setEditable(false);
						note2.writeToFile(myfile2,NoteArea2);
					
						
					}
				});
				
				myfile3 = new File(SubjectList.get(2) + "myUomNotes.txt");
				note3.readFromFile(myfile3, NoteArea3);
				set3 = new MyJButton("Αποθηκευση",myfile3);
				
				write3 = new JButton("Σημειωσε");
				write3.setVisible(true);
				write3.setPreferredSize(new Dimension(120, 30));
				write3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea3.setEditable(true);
					}
				});
				
				/*Set3*/
				ButtonPanel3.add(set3);
				ButtonPanel3.add(write3);
				ButtonPanel3.setVisible(false);
				ButtonPanel3.setBackground(Color.GRAY);
				ButtonPanel3.setPreferredSize(new Dimension(150, 90));
				set3.setPreferredSize(new Dimension(120, 30));
				
				set3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea3.setEditable(false);
						note3.writeToFile(myfile3,NoteArea3);
					
						
					}
				});
				
				myfile4 = new File(SubjectList.get(3) + "myUomNotes.txt");
				note4.readFromFile(myfile4, NoteArea4);
				set4 = new MyJButton("Αποθηκευση",myfile4);
				
				write4 = new JButton("Σημειωσε");
				write4.setVisible(true);
				write4.setPreferredSize(new Dimension(120, 30));
				write4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea4.setEditable(true);
					}
				});
				/*Set4*/
				ButtonPanel4.add(set4);
				ButtonPanel4.add(write4);
				ButtonPanel4.setVisible(false);
				ButtonPanel4.setBackground(Color.GRAY);
				ButtonPanel4.setPreferredSize(new Dimension(150, 90));
				set4.setPreferredSize(new Dimension(120, 30));
				
				set4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea4.setEditable(false);
						note4.writeToFile(myfile4,NoteArea4);
					
						
					}
				});
				
				myfile5 = new File(SubjectList.get(4) + "myUomNotes.txt");
				note5.readFromFile(myfile5, NoteArea5);
				set5 = new MyJButton("Αποθηκευση",myfile5);
				
				write5 = new JButton("Σημειωσε");
				write5.setVisible(true);
				write5.setPreferredSize(new Dimension(120, 30));
				write5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea5.setEditable(true);
					}
				});
				
				/*Set5*/
				ButtonPanel5.add(set5);
				ButtonPanel5.add(write5);
				ButtonPanel5.setVisible(false);
				ButtonPanel5.setBackground(Color.GRAY);
				ButtonPanel5.setPreferredSize(new Dimension(150, 90));
				set5.setPreferredSize(new Dimension(120, 30));
				
				set5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea5.setEditable(false);
						note5.writeToFile(myfile5,NoteArea5);
					
						
					}
				});
				
				File myfile6 = new File(SubjectList.get(5) + "myUomNotes.txt");
				note6.readFromFile(myfile6, NoteArea6);
				MyJButton set6 = new MyJButton("Αποθηκευση",myfile6);
				JButton write6 = new JButton("Σημειωσε");
				write6.setVisible(true);
				write6.setPreferredSize(new Dimension(120, 30));
				write6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea6.setEditable(true);
					}
				});
				
				/*Set6*/
				ButtonPanel6.add(set6);
				ButtonPanel6.add(write6);
				ButtonPanel6.setVisible(false);
				ButtonPanel6.setBackground(Color.GRAY);
				ButtonPanel6.setPreferredSize(new Dimension(150, 90));
				set6.setPreferredSize(new Dimension(120, 30));
				
				set6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea6.setEditable(false);
						note6.writeToFile(myfile6,NoteArea6);
					
						
					}
				});
				
				
				NoteLabel1 = new JLabel(SubjectList.get(0));
				NoteLabel1.setSize(new Dimension(400, 30));
				NoteLabel1.setVisible(false);
				NoteLabel1.setOpaque(true);
				NoteLabel1.setBackground(Color.RED);
				NoteLabel1.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel2 = new JLabel(SubjectList.get(1));
				NoteLabel2.setSize(new Dimension(400, 30));
				NoteLabel2.setVisible(false);
				NoteLabel2.setOpaque(true);
				NoteLabel2.setBackground(Color.RED);
				NoteLabel2.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel3 = new JLabel(SubjectList.get(2));
				NoteLabel3.setSize(new Dimension(400, 30));
				NoteLabel3.setVisible(false);
				NoteLabel3.setOpaque(true);
				NoteLabel3.setBackground(Color.RED);
				NoteLabel3.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel3.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel4 = new JLabel(SubjectList.get(3));
				NoteLabel4.setSize(new Dimension(400, 30));
				NoteLabel4.setVisible(false);
				NoteLabel4.setOpaque(true);
				NoteLabel4.setBackground(Color.RED);
				NoteLabel4.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel4.setVerticalTextPosition(JLabel.CENTER);
				
				 NoteLabel5 = new JLabel(SubjectList.get(4));
				NoteLabel5.setSize(new Dimension(400, 30));
				NoteLabel5.setVisible(false);
				NoteLabel5.setOpaque(true);
				NoteLabel5.setBackground(Color.RED);
				NoteLabel5.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel5.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel NoteLabel6 = new JLabel(SubjectList.get(5));
				NoteLabel6.setSize(new Dimension(400, 30));
				NoteLabel6.setVisible(false);
				NoteLabel6.setOpaque(true);
				NoteLabel6.setBackground(Color.RED);
				NoteLabel6.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel6.setVerticalTextPosition(JLabel.CENTER);
				
				NotePanel.add(NoteLabel1);
				NotePanel.add(NoteArea1);
				NotePanel.add(ButtonPanel1);
				
				NotePanel.add(NoteLabel2);
				NotePanel.add(NoteArea2);
				NotePanel.add(ButtonPanel2);
				
				NotePanel.add(NoteLabel3);
				NotePanel.add(NoteArea3);
				NotePanel.add(ButtonPanel3);
				
				NotePanel.add(NoteLabel4);
				NotePanel.add(NoteArea4);
				NotePanel.add(ButtonPanel4);
				
				NotePanel.add(NoteLabel5);
				NotePanel.add(NoteArea5);
				NotePanel.add(ButtonPanel5);
				
				NotePanel.add(NoteLabel6);
				NotePanel.add(NoteArea6);
				NotePanel.add(ButtonPanel6);
				
				NoteLabel1.setVisible(true);
				NoteArea1.setVisible(true);
				ButtonPanel1.setVisible(true);
				
				NoteLabel2.setVisible(true);
				NoteArea2.setVisible(true);
				ButtonPanel2.setVisible(true);
				
				NoteLabel3.setVisible(true);
				NoteArea3.setVisible(true);
				ButtonPanel3.setVisible(true);
				
				NoteLabel4.setVisible(true);
				NoteArea4.setVisible(true);
				ButtonPanel4.setVisible(true);
				

				NoteLabel5.setVisible(true);
				NoteArea5.setVisible(true);
				ButtonPanel5.setVisible(true);
				

				NoteLabel6.setVisible(true);
				NoteArea6.setVisible(true);
				ButtonPanel6.setVisible(true);
				 break;
				 
			case 7:
				
				myfile1 = new File(SubjectList.get(0) + "myUomNotes.txt");
				note1.readFromFile(myfile1, NoteArea1);
				set1 = new MyJButton("Αποθηκευση",myfile1);
				 
				 /*Write Button*/
					write1 = new JButton("Σημειωσε");
					write1.setVisible(true);
					write1.setPreferredSize(new Dimension(120, 30));
					write1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							NoteArea1.setEditable(true);
						}
					});
					
					/*Set1*/
					ButtonPanel1.add(set1);
					ButtonPanel1.add(write1);
					ButtonPanel1.setVisible(false);
					ButtonPanel1.setBackground(Color.GRAY);
					ButtonPanel1.setPreferredSize(new Dimension(150, 90));
					set1.setPreferredSize(new Dimension(120, 30));
					
					set1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							NoteArea1.setEditable(false);
							note1.writeToFile(myfile1,NoteArea1);
							
						
							
						}
					});
					
				myfile2 = new File(SubjectList.get(1) + "myUomNotes.txt");
				note2.readFromFile(myfile2, NoteArea2);
				set2 = new MyJButton("Αποθηκευση",myfile2);
				
				
				write2 = new JButton("Σημειωσε");
				write2.setVisible(true);
				write2.setPreferredSize(new Dimension(120, 30));
				write2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea2.setEditable(true);
					}
				});
			
				/*Set2*/
				ButtonPanel2.add(set2);
				ButtonPanel2.add(write2);
				ButtonPanel2.setVisible(false);
				ButtonPanel2.setBackground(Color.GRAY);
				ButtonPanel2.setPreferredSize(new Dimension(150, 90));
				set2.setPreferredSize(new Dimension(120, 30));
				
				set2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea2.setEditable(false);
						note2.writeToFile(myfile2,NoteArea2);
					
						
					}
				});
				
				myfile3 = new File(SubjectList.get(2) + "myUomNotes.txt");
				note3.readFromFile(myfile3, NoteArea3);
				set3 = new MyJButton("Αποθηκευση",myfile3);
				
				write3 = new JButton("Σημειωσε");
				write3.setVisible(true);
				write3.setPreferredSize(new Dimension(120, 30));
				write3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea3.setEditable(true);
					}
				});
				
				/*Set3*/
				ButtonPanel3.add(set3);
				ButtonPanel3.add(write3);
				ButtonPanel3.setVisible(false);
				ButtonPanel3.setBackground(Color.GRAY);
				ButtonPanel3.setPreferredSize(new Dimension(150, 90));
				set3.setPreferredSize(new Dimension(120, 30));
				
				set3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea3.setEditable(false);
						note3.writeToFile(myfile3,NoteArea3);
					
						
					}
				});
				
				myfile4 = new File(SubjectList.get(3) + "myUomNotes.txt");
				note4.readFromFile(myfile4, NoteArea4);
				set4 = new MyJButton("Αποθηκευση",myfile4);
				
				write4 = new JButton("Σημειωσε");
				write4.setVisible(true);
				write4.setPreferredSize(new Dimension(120, 30));
				write4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea4.setEditable(true);
					}
				});
				/*Set4*/
				ButtonPanel4.add(set4);
				ButtonPanel4.add(write4);
				ButtonPanel4.setVisible(false);
				ButtonPanel4.setBackground(Color.GRAY);
				ButtonPanel4.setPreferredSize(new Dimension(150, 90));
				set4.setPreferredSize(new Dimension(120, 30));
				
				set4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea4.setEditable(false);
						note4.writeToFile(myfile4,NoteArea4);
					
						
					}
				});
				
				myfile5 = new File(SubjectList.get(4) + "myUomNotes.txt");
				note5.readFromFile(myfile5, NoteArea5);
				set5 = new MyJButton("Αποθηκευση",myfile5);
				
				write5 = new JButton("Σημειωσε");
				write5.setVisible(true);
				write5.setPreferredSize(new Dimension(120, 30));
				write5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea5.setEditable(true);
					}
				});
				
				/*Set5*/
				ButtonPanel5.add(set5);
				ButtonPanel5.add(write5);
				ButtonPanel5.setVisible(false);
				ButtonPanel5.setBackground(Color.GRAY);
				ButtonPanel5.setPreferredSize(new Dimension(150, 90));
				set5.setPreferredSize(new Dimension(120, 30));
				
				set5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea5.setEditable(false);
						note5.writeToFile(myfile5,NoteArea5);
					
						
					}
				});
				
				myfile6 = new File(SubjectList.get(5) + "myUomNotes.txt");
				note6.readFromFile(myfile6, NoteArea6);
				set6 = new MyJButton("Αποθηκευση",myfile6);
				write6 = new JButton("Σημειωσε");
				write6.setVisible(true);
				write6.setPreferredSize(new Dimension(120, 30));
				write6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea6.setEditable(true);
					}
				});
				
				/*Set6*/
				ButtonPanel6.add(set6);
				ButtonPanel6.add(write6);
				ButtonPanel6.setVisible(false);
				ButtonPanel6.setBackground(Color.GRAY);
				ButtonPanel6.setPreferredSize(new Dimension(150, 90));
				set6.setPreferredSize(new Dimension(120, 30));
				
				set6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea6.setEditable(false);
						note6.writeToFile(myfile6,NoteArea6);
					
						
					}
				});
				
				File myfile7 = new File(SubjectList.get(6) + "myUomNotes.txt");
				note7.readFromFile(myfile7, NoteArea7);
				MyJButton set7 = new MyJButton("Αποθηκευση",myfile7);
				
				JButton write7 = new JButton("Σημειωσε");
				write7.setVisible(true);
				write7.setPreferredSize(new Dimension(120, 30));
				write7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea7.setEditable(true);
					}
				});
				
				/*Set7*/
				ButtonPanel7.add(set7);
				ButtonPanel7.add(write7);
				ButtonPanel7.setVisible(false);
				ButtonPanel7.setBackground(Color.GRAY);
				ButtonPanel7.setPreferredSize(new Dimension(150, 90));
				set7.setPreferredSize(new Dimension(120, 30));
				
				set7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea7.setEditable(false);
						note7.writeToFile(myfile7,NoteArea7);
					
						
					}
				});
				
				
				NoteLabel1 = new JLabel(SubjectList.get(0));
				NoteLabel1.setSize(new Dimension(400, 30));
				NoteLabel1.setVisible(false);
				NoteLabel1.setOpaque(true);
				NoteLabel1.setBackground(Color.RED);
				NoteLabel1.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel2 = new JLabel(SubjectList.get(1));
				NoteLabel2.setSize(new Dimension(400, 30));
				NoteLabel2.setVisible(false);
				NoteLabel2.setOpaque(true);
				NoteLabel2.setBackground(Color.RED);
				NoteLabel2.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel3 = new JLabel(SubjectList.get(2));
				NoteLabel3.setSize(new Dimension(400, 30));
				NoteLabel3.setVisible(false);
				NoteLabel3.setOpaque(true);
				NoteLabel3.setBackground(Color.RED);
				NoteLabel3.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel3.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel4 = new JLabel(SubjectList.get(3));
				NoteLabel4.setSize(new Dimension(400, 30));
				NoteLabel4.setVisible(false);
				NoteLabel4.setOpaque(true);
				NoteLabel4.setBackground(Color.RED);
				NoteLabel4.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel4.setVerticalTextPosition(JLabel.CENTER);
				
				 NoteLabel5 = new JLabel(SubjectList.get(4));
				NoteLabel5.setSize(new Dimension(400, 30));
				NoteLabel5.setVisible(false);
				NoteLabel5.setOpaque(true);
				NoteLabel5.setBackground(Color.RED);
				NoteLabel5.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel5.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel6 = new JLabel(SubjectList.get(5));
				NoteLabel6.setSize(new Dimension(400, 30));
				NoteLabel6.setVisible(false);
				NoteLabel6.setOpaque(true);
				NoteLabel6.setBackground(Color.RED);
				NoteLabel6.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel6.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel NoteLabel7 = new JLabel(SubjectList.get(6));
				NoteLabel7.setSize(new Dimension(400, 30));
				NoteLabel7.setVisible(false);
				NoteLabel7.setOpaque(true);
				NoteLabel7.setBackground(Color.RED);
				NoteLabel7.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel7.setVerticalTextPosition(JLabel.CENTER);
				
				NotePanel.add(NoteLabel1);
				NotePanel.add(NoteArea1);
				NotePanel.add(ButtonPanel1);
				
				NotePanel.add(NoteLabel2);
				NotePanel.add(NoteArea2);
				NotePanel.add(ButtonPanel2);
				
				NotePanel.add(NoteLabel3);
				NotePanel.add(NoteArea3);
				NotePanel.add(ButtonPanel3);
				
				NotePanel.add(NoteLabel4);
				NotePanel.add(NoteArea4);
				NotePanel.add(ButtonPanel4);
				
				NotePanel.add(NoteLabel5);
				NotePanel.add(NoteArea5);
				NotePanel.add(ButtonPanel5);
				
				NotePanel.add(NoteLabel6);
				NotePanel.add(NoteArea6);
				NotePanel.add(ButtonPanel6);
				
				NotePanel.add(NoteLabel7);
				NotePanel.add(NoteArea7);
				NotePanel.add(ButtonPanel7);
				
				NoteLabel1.setVisible(true);
				NoteArea1.setVisible(true);
				ButtonPanel1.setVisible(true);
				
				NoteLabel2.setVisible(true);
				NoteArea2.setVisible(true);
				ButtonPanel2.setVisible(true);
			
				NoteLabel3.setVisible(true);
				NoteArea3.setVisible(true);
				ButtonPanel3.setVisible(true);
				
				NoteLabel4.setVisible(true);
				NoteArea4.setVisible(true);
				ButtonPanel4.setVisible(true);
				
				NoteLabel5.setVisible(true);
				NoteArea5.setVisible(true);
				ButtonPanel5.setVisible(true);
				
				NoteLabel6.setVisible(true);
				NoteArea6.setVisible(true);
				ButtonPanel6.setVisible(true);
				
				NoteLabel7.setVisible(true);
				NoteArea7.setVisible(true);
				ButtonPanel7.setVisible(true);
				break;
				
			case 8:
				
				myfile1 = new File(SubjectList.get(0) + "myUomNotes.txt");
				note1.readFromFile(myfile1, NoteArea1);
				set1 = new MyJButton("Αποθηκευση",myfile1);
				 
				 /*Write Button*/
					write1 = new JButton("Σημειωσε");
					write1.setVisible(true);
					write1.setPreferredSize(new Dimension(120, 30));
					write1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							NoteArea1.setEditable(true);
						}
					});
					
					/*Set1*/
					ButtonPanel1.add(set1);
					ButtonPanel1.add(write1);
					ButtonPanel1.setVisible(false);
					ButtonPanel1.setBackground(Color.GRAY);
					ButtonPanel1.setPreferredSize(new Dimension(150, 90));
					set1.setPreferredSize(new Dimension(120, 30));
					
					set1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							NoteArea1.setEditable(false);
							note1.writeToFile(myfile1,NoteArea1);
							
						
							
						}
					});
					
				myfile2 = new File(SubjectList.get(1) + "myUomNotes.txt");
				note2.readFromFile(myfile2, NoteArea2);
				set2 = new MyJButton("Αποθηκευση",myfile2);
				
				
				write2 = new JButton("Σημειωσε");
				write2.setVisible(true);
				write2.setPreferredSize(new Dimension(120, 30));
				write2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea2.setEditable(true);
					}
				});
			
				/*Set2*/
				ButtonPanel2.add(set2);
				ButtonPanel2.add(write2);
				ButtonPanel2.setVisible(false);
				ButtonPanel2.setBackground(Color.GRAY);
				ButtonPanel2.setPreferredSize(new Dimension(150, 90));
				set2.setPreferredSize(new Dimension(120, 30));
				
				set2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea2.setEditable(false);
						note2.writeToFile(myfile2,NoteArea2);
					
						
					}
				});
				
				myfile3 = new File(SubjectList.get(2) + "myUomNotes.txt");
				note3.readFromFile(myfile3, NoteArea3);
				set3 = new MyJButton("Αποθηκευση",myfile3);
				
				write3 = new JButton("Σημειωσε");
				write3.setVisible(true);
				write3.setPreferredSize(new Dimension(120, 30));
				write3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea3.setEditable(true);
					}
				});
				
				/*Set3*/
				ButtonPanel3.add(set3);
				ButtonPanel3.add(write3);
				ButtonPanel3.setVisible(false);
				ButtonPanel3.setBackground(Color.GRAY);
				ButtonPanel3.setPreferredSize(new Dimension(150, 90));
				set3.setPreferredSize(new Dimension(120, 30));
				
				set3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea3.setEditable(false);
						note3.writeToFile(myfile3,NoteArea3);
					
						
					}
				});
				
				myfile4 = new File(SubjectList.get(3) + "myUomNotes.txt");
				note4.readFromFile(myfile4, NoteArea4);
				set4 = new MyJButton("Αποθηκευση",myfile4);
				
				write4 = new JButton("Σημειωσε");
				write4.setVisible(true);
				write4.setPreferredSize(new Dimension(120, 30));
				write4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea4.setEditable(true);
					}
				});
				/*Set4*/
				ButtonPanel4.add(set4);
				ButtonPanel4.add(write4);
				ButtonPanel4.setVisible(false);
				ButtonPanel4.setBackground(Color.GRAY);
				ButtonPanel4.setPreferredSize(new Dimension(150, 90));
				set4.setPreferredSize(new Dimension(120, 30));
				
				set4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea4.setEditable(false);
						note4.writeToFile(myfile4,NoteArea4);
					
						
					}
				});
				
				myfile5 = new File(SubjectList.get(4) + "myUomNotes.txt");
				note5.readFromFile(myfile5, NoteArea5);
				set5 = new MyJButton("Αποθηκευση",myfile5);
				
				write5 = new JButton("Σημειωσε");
				write5.setVisible(true);
				write5.setPreferredSize(new Dimension(120, 30));
				write5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea5.setEditable(true);
					}
				});
				
				/*Set5*/
				ButtonPanel5.add(set5);
				ButtonPanel5.add(write5);
				ButtonPanel5.setVisible(false);
				ButtonPanel5.setBackground(Color.GRAY);
				ButtonPanel5.setPreferredSize(new Dimension(150, 90));
				set5.setPreferredSize(new Dimension(120, 30));
				
				set5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea5.setEditable(false);
						note5.writeToFile(myfile5,NoteArea5);
					
						
					}
				});
				
				myfile6 = new File(SubjectList.get(5) + "myUomNotes.txt");
				note6.readFromFile(myfile6, NoteArea6);
				set6 = new MyJButton("Αποθηκευση",myfile6);
				write6 = new JButton("Σημειωσε");
				write6.setVisible(true);
				write6.setPreferredSize(new Dimension(120, 30));
				write6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea6.setEditable(true);
					}
				});
				
				/*Set6*/
				ButtonPanel6.add(set6);
				ButtonPanel6.add(write6);
				ButtonPanel6.setVisible(false);
				ButtonPanel6.setBackground(Color.GRAY);
				ButtonPanel6.setPreferredSize(new Dimension(150, 90));
				set6.setPreferredSize(new Dimension(120, 30));
				
				set6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea6.setEditable(false);
						note6.writeToFile(myfile6,NoteArea6);
					
						
					}
				});
				
				myfile7 = new File(SubjectList.get(6) + "myUomNotes.txt");
				note7.readFromFile(myfile7, NoteArea7);
				set7 = new MyJButton("Αποθηκευση",myfile7);
				
				 write7 = new JButton("Σημειωσε");
				write7.setVisible(true);
				write7.setPreferredSize(new Dimension(120, 30));
				write7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea7.setEditable(true);
					}
				});
				
				/*Set7*/
				ButtonPanel7.add(set7);
				ButtonPanel7.add(write7);
				ButtonPanel7.setVisible(false);
				ButtonPanel7.setBackground(Color.GRAY);
				ButtonPanel7.setPreferredSize(new Dimension(150, 90));
				set7.setPreferredSize(new Dimension(120, 30));
				
				set7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea7.setEditable(false);
						note7.writeToFile(myfile7,NoteArea7);
					
						
					}
				});
				
				File myfile8 = new File(SubjectList.get(7) + "myUomNotes.txt");
				note8.readFromFile(myfile8, NoteArea8);
				MyJButton set8 = new MyJButton("Αποθηκευση",myfile8);
				
				JButton write8 = new JButton("Σημειωσε");
				write8.setVisible(true);
				write8.setPreferredSize(new Dimension(120, 30));
				write8.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea8.setEditable(true);
					}
				});
				
			
				/*Set8*/
				ButtonPanel8.add(set8);
				ButtonPanel8.add(write8);
				ButtonPanel8.setVisible(false);
				ButtonPanel8.setBackground(Color.GRAY);
				ButtonPanel8.setPreferredSize(new Dimension(150, 90));
				set8.setPreferredSize(new Dimension(120, 30));
				
				set8.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea8.setEditable(false);
						note8.writeToFile(myfile8,NoteArea8);
					
						
					}
				});
				
				
				NoteLabel1 = new JLabel(SubjectList.get(0));
				NoteLabel1.setSize(new Dimension(400, 30));
				NoteLabel1.setVisible(false);
				NoteLabel1.setOpaque(true);
				NoteLabel1.setBackground(Color.RED);
				NoteLabel1.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel2 = new JLabel(SubjectList.get(1));
				NoteLabel2.setSize(new Dimension(400, 30));
				NoteLabel2.setVisible(false);
				NoteLabel2.setOpaque(true);
				NoteLabel2.setBackground(Color.RED);
				NoteLabel2.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel3 = new JLabel(SubjectList.get(2));
				NoteLabel3.setSize(new Dimension(400, 30));
				NoteLabel3.setVisible(false);
				NoteLabel3.setOpaque(true);
				NoteLabel3.setBackground(Color.RED);
				NoteLabel3.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel3.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel4 = new JLabel(SubjectList.get(3));
				NoteLabel4.setSize(new Dimension(400, 30));
				NoteLabel4.setVisible(false);
				NoteLabel4.setOpaque(true);
				NoteLabel4.setBackground(Color.RED);
				NoteLabel4.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel4.setVerticalTextPosition(JLabel.CENTER);
				
				 NoteLabel5 = new JLabel(SubjectList.get(4));
				NoteLabel5.setSize(new Dimension(400, 30));
				NoteLabel5.setVisible(false);
				NoteLabel5.setOpaque(true);
				NoteLabel5.setBackground(Color.RED);
				NoteLabel5.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel5.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel6 = new JLabel(SubjectList.get(5));
				NoteLabel6.setSize(new Dimension(400, 30));
				NoteLabel6.setVisible(false);
				NoteLabel6.setOpaque(true);
				NoteLabel6.setBackground(Color.RED);
				NoteLabel6.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel6.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel7 = new JLabel(SubjectList.get(6));
				NoteLabel7.setSize(new Dimension(400, 30));
				NoteLabel7.setVisible(false);
				NoteLabel7.setOpaque(true);
				NoteLabel7.setBackground(Color.RED);
				NoteLabel7.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel7.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel NoteLabel8 = new JLabel(SubjectList.get(7));
				NoteLabel8.setSize(new Dimension(400, 30));
				NoteLabel8.setVisible(false);
				NoteLabel8.setOpaque(true);
				NoteLabel8.setBackground(Color.RED);
				NoteLabel8.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel8.setVerticalTextPosition(JLabel.CENTER);
				
				NotePanel.add(NoteLabel1);
				NotePanel.add(NoteArea1);
				NotePanel.add(ButtonPanel1);
				
				NotePanel.add(NoteLabel2);
				NotePanel.add(NoteArea2);
				NotePanel.add(ButtonPanel2);
				
				NotePanel.add(NoteLabel3);
				NotePanel.add(NoteArea3);
				NotePanel.add(ButtonPanel3);
				
				NotePanel.add(NoteLabel4);
				NotePanel.add(NoteArea4);
				NotePanel.add(ButtonPanel4);
				
				NotePanel.add(NoteLabel5);
				NotePanel.add(NoteArea5);
				NotePanel.add(ButtonPanel5);
				
				NotePanel.add(NoteLabel6);
				NotePanel.add(NoteArea6);
				NotePanel.add(ButtonPanel6);
				
				NotePanel.add(NoteLabel7);
				NotePanel.add(NoteArea7);
				NotePanel.add(ButtonPanel7);
				
				NotePanel.add(NoteLabel8);
				NotePanel.add(NoteArea8);
				NotePanel.add(ButtonPanel8);
				
				NoteLabel1.setVisible(true);
				NoteArea1.setVisible(true);
				ButtonPanel1.setVisible(true);
				
				NoteLabel2.setVisible(true);
				NoteArea2.setVisible(true);
				ButtonPanel2.setVisible(true);
				
				NoteLabel3.setVisible(true);
				NoteArea3.setVisible(true);
				ButtonPanel3.setVisible(true);
				
				NoteLabel4.setVisible(true);
				NoteArea4.setVisible(true);
				ButtonPanel4.setVisible(true);
				
				NoteLabel5.setVisible(true);
				NoteArea5.setVisible(true);
				ButtonPanel5.setVisible(true);
				
				NoteLabel6.setVisible(true);
				NoteArea6.setVisible(true);
				ButtonPanel6.setVisible(true);
				
				NoteLabel7.setVisible(true);
				NoteArea7.setVisible(true);
				ButtonPanel7.setVisible(true);
				
				NoteLabel8.setVisible(true);
				NoteArea8.setVisible(true);
				ButtonPanel8.setVisible(true);
				
				break;
				
			case 9:
				
				myfile1 = new File(SubjectList.get(0) + "myUomNotes.txt");
				note1.readFromFile(myfile1, NoteArea1);
				set1 = new MyJButton("Αποθηκευση",myfile1);
				 
				 /*Write Button*/
					write1 = new JButton("Σημειωσε");
					write1.setVisible(true);
					write1.setPreferredSize(new Dimension(120, 30));
					write1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							NoteArea1.setEditable(true);
						}
					});
					
					/*Set1*/
					ButtonPanel1.add(set1);
					ButtonPanel1.add(write1);
					ButtonPanel1.setVisible(false);
					ButtonPanel1.setBackground(Color.GRAY);
					ButtonPanel1.setPreferredSize(new Dimension(150, 90));
					set1.setPreferredSize(new Dimension(120, 30));
					
					set1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							NoteArea1.setEditable(false);
							note1.writeToFile(myfile1,NoteArea1);
							
						
							
						}
					});
					
				myfile2 = new File(SubjectList.get(1) + "myUomNotes.txt");
				note2.readFromFile(myfile2, NoteArea2);
				set2 = new MyJButton("Αποθηκευση",myfile2);
				
				
				write2 = new JButton("Σημειωσε");
				write2.setVisible(true);
				write2.setPreferredSize(new Dimension(120, 30));
				write2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea2.setEditable(true);
					}
				});
			
				/*Set2*/
				ButtonPanel2.add(set2);
				ButtonPanel2.add(write2);
				ButtonPanel2.setVisible(false);
				ButtonPanel2.setBackground(Color.GRAY);
				ButtonPanel2.setPreferredSize(new Dimension(150, 90));
				set2.setPreferredSize(new Dimension(120, 30));
				
				set2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea2.setEditable(false);
						note2.writeToFile(myfile2,NoteArea2);
					
						
					}
				});
				
				myfile3 = new File(SubjectList.get(2) + "myUomNotes.txt");
				note3.readFromFile(myfile3, NoteArea3);
				set3 = new MyJButton("Αποθηκευση",myfile3);
				
				write3 = new JButton("Σημειωσε");
				write3.setVisible(true);
				write3.setPreferredSize(new Dimension(120, 30));
				write3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea3.setEditable(true);
					}
				});
				
				/*Set3*/
				ButtonPanel3.add(set3);
				ButtonPanel3.add(write3);
				ButtonPanel3.setVisible(false);
				ButtonPanel3.setBackground(Color.GRAY);
				ButtonPanel3.setPreferredSize(new Dimension(150, 90));
				set3.setPreferredSize(new Dimension(120, 30));
				
				set3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea3.setEditable(false);
						note3.writeToFile(myfile3,NoteArea3);
					
						
					}
				});
				
				myfile4 = new File(SubjectList.get(3) + "myUomNotes.txt");
				note4.readFromFile(myfile4, NoteArea4);
				set4 = new MyJButton("Αποθηκευση",myfile4);
				
				write4 = new JButton("Σημειωσε");
				write4.setVisible(true);
				write4.setPreferredSize(new Dimension(120, 30));
				write4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea4.setEditable(true);
					}
				});
				/*Set4*/
				ButtonPanel4.add(set4);
				ButtonPanel4.add(write4);
				ButtonPanel4.setVisible(false);
				ButtonPanel4.setBackground(Color.GRAY);
				ButtonPanel4.setPreferredSize(new Dimension(150, 90));
				set4.setPreferredSize(new Dimension(120, 30));
				
				set4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea4.setEditable(false);
						note4.writeToFile(myfile4,NoteArea4);
					
						
					}
				});
				
				myfile5 = new File(SubjectList.get(4) + "myUomNotes.txt");
				note5.readFromFile(myfile5, NoteArea5);
				set5 = new MyJButton("Αποθηκευση",myfile5);
				
				write5 = new JButton("Σημειωσε");
				write5.setVisible(true);
				write5.setPreferredSize(new Dimension(120, 30));
				write5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea5.setEditable(true);
					}
				});
				
				/*Set5*/
				ButtonPanel5.add(set5);
				ButtonPanel5.add(write5);
				ButtonPanel5.setVisible(false);
				ButtonPanel5.setBackground(Color.GRAY);
				ButtonPanel5.setPreferredSize(new Dimension(150, 90));
				set5.setPreferredSize(new Dimension(120, 30));
				
				set5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea5.setEditable(false);
						note5.writeToFile(myfile5,NoteArea5);
					
						
					}
				});
				
				myfile6 = new File(SubjectList.get(5) + "myUomNotes.txt");
				note6.readFromFile(myfile6, NoteArea6);
				set6 = new MyJButton("Αποθηκευση",myfile6);
				write6 = new JButton("Σημειωσε");
				write6.setVisible(true);
				write6.setPreferredSize(new Dimension(120, 30));
				write6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea6.setEditable(true);
					}
				});
				
				/*Set6*/
				ButtonPanel6.add(set6);
				ButtonPanel6.add(write6);
				ButtonPanel6.setVisible(false);
				ButtonPanel6.setBackground(Color.GRAY);
				ButtonPanel6.setPreferredSize(new Dimension(150, 90));
				set6.setPreferredSize(new Dimension(120, 30));
				
				set6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea6.setEditable(false);
						note6.writeToFile(myfile6,NoteArea6);
					
						
					}
				});
				
				myfile7 = new File(SubjectList.get(6) + "myUomNotes.txt");
				note7.readFromFile(myfile7, NoteArea7);
				set7 = new MyJButton("Αποθηκευση",myfile7);
				
				 write7 = new JButton("Σημειωσε");
				write7.setVisible(true);
				write7.setPreferredSize(new Dimension(120, 30));
				write7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea7.setEditable(true);
					}
				});
				
				/*Set7*/
				ButtonPanel7.add(set7);
				ButtonPanel7.add(write7);
				ButtonPanel7.setVisible(false);
				ButtonPanel7.setBackground(Color.GRAY);
				ButtonPanel7.setPreferredSize(new Dimension(150, 90));
				set7.setPreferredSize(new Dimension(120, 30));
				
				set7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea7.setEditable(false);
						note7.writeToFile(myfile7,NoteArea7);
					
						
					}
				});
				
				myfile8 = new File(SubjectList.get(7) + "myUomNotes.txt");
				note8.readFromFile(myfile8, NoteArea8);
				set8 = new MyJButton("Αποθηκευση",myfile8);
				
				write8 = new JButton("Σημειωσε");
				write8.setVisible(true);
				write8.setPreferredSize(new Dimension(120, 30));
				write8.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea8.setEditable(true);
					}
				});
				
			
				/*Set8*/
				ButtonPanel8.add(set8);
				ButtonPanel8.add(write8);
				ButtonPanel8.setVisible(false);
				ButtonPanel8.setBackground(Color.GRAY);
				ButtonPanel8.setPreferredSize(new Dimension(150, 90));
				set8.setPreferredSize(new Dimension(120, 30));
				
				set8.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea8.setEditable(false);
						note8.writeToFile(myfile8,NoteArea8);
					
						
					}
				});
				
				File myfile9 = new File(SubjectList.get(8) + "myUomNotes.txt");
				note9.readFromFile(myfile9, NoteArea9);
				MyJButton set9 = new MyJButton("Αποθηκευση",myfile9);
				
				JButton write9 = new JButton("Σημειωσε");
				write9.setVisible(true);
				write9.setPreferredSize(new Dimension(120, 30));
				write9.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea9.setEditable(true);
					}
				});
				
				/*Set9*/
				ButtonPanel9.add(set9);
				ButtonPanel9.add(write9);
				ButtonPanel9.setVisible(false);
				ButtonPanel9.setBackground(Color.GRAY);
				ButtonPanel9.setPreferredSize(new Dimension(150, 90));
				set9.setPreferredSize(new Dimension(120, 30));
				
				set9.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea9.setEditable(false);
						note9.writeToFile(myfile9,NoteArea9);
					
						
					}
				});
				
				
				
				NoteLabel1 = new JLabel(SubjectList.get(0));
				NoteLabel1.setSize(new Dimension(400, 30));
				NoteLabel1.setVisible(false);
				NoteLabel1.setOpaque(true);
				NoteLabel1.setBackground(Color.RED);
				NoteLabel1.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel2 = new JLabel(SubjectList.get(1));
				NoteLabel2.setSize(new Dimension(400, 30));
				NoteLabel2.setVisible(false);
				NoteLabel2.setOpaque(true);
				NoteLabel2.setBackground(Color.RED);
				NoteLabel2.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel3 = new JLabel(SubjectList.get(2));
				NoteLabel3.setSize(new Dimension(400, 30));
				NoteLabel3.setVisible(false);
				NoteLabel3.setOpaque(true);
				NoteLabel3.setBackground(Color.RED);
				NoteLabel3.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel3.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel4 = new JLabel(SubjectList.get(3));
				NoteLabel4.setSize(new Dimension(400, 30));
				NoteLabel4.setVisible(false);
				NoteLabel4.setOpaque(true);
				NoteLabel4.setBackground(Color.RED);
				NoteLabel4.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel4.setVerticalTextPosition(JLabel.CENTER);
				
				 NoteLabel5 = new JLabel(SubjectList.get(4));
				NoteLabel5.setSize(new Dimension(400, 30));
				NoteLabel5.setVisible(false);
				NoteLabel5.setOpaque(true);
				NoteLabel5.setBackground(Color.RED);
				NoteLabel5.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel5.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel6 = new JLabel(SubjectList.get(5));
				NoteLabel6.setSize(new Dimension(400, 30));
				NoteLabel6.setVisible(false);
				NoteLabel6.setOpaque(true);
				NoteLabel6.setBackground(Color.RED);
				NoteLabel6.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel6.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel7 = new JLabel(SubjectList.get(6));
				NoteLabel7.setSize(new Dimension(400, 30));
				NoteLabel7.setVisible(false);
				NoteLabel7.setOpaque(true);
				NoteLabel7.setBackground(Color.RED);
				NoteLabel7.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel7.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel8 = new JLabel(SubjectList.get(7));
				NoteLabel8.setSize(new Dimension(400, 30));
				NoteLabel8.setVisible(false);
				NoteLabel8.setOpaque(true);
				NoteLabel8.setBackground(Color.RED);
				NoteLabel8.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel8.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel NoteLabel9 = new JLabel(SubjectList.get(8));
				NoteLabel9.setSize(new Dimension(400, 30));
				NoteLabel9.setVisible(false);
				NoteLabel9.setOpaque(true);
				NoteLabel9.setBackground(Color.RED);
				NoteLabel9.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel9.setVerticalTextPosition(JLabel.CENTER);
				
				NotePanel.add(NoteLabel1);
				NotePanel.add(NoteArea1);
				NotePanel.add(ButtonPanel1);
				
				NotePanel.add(NoteLabel2);
				NotePanel.add(NoteArea2);
				NotePanel.add(ButtonPanel2);
				
				
				NotePanel.add(NoteLabel3);
				NotePanel.add(NoteArea3);
				NotePanel.add(ButtonPanel3);
				
				NotePanel.add(NoteLabel4);
				NotePanel.add(NoteArea4);
				NotePanel.add(ButtonPanel4);
				
				NotePanel.add(NoteLabel5);
				NotePanel.add(NoteArea5);
				NotePanel.add(ButtonPanel5);
				
				NotePanel.add(NoteLabel6);
				NotePanel.add(NoteArea6);
				NotePanel.add(ButtonPanel6);
				
				NotePanel.add(NoteLabel7);
				NotePanel.add(NoteArea7);
				NotePanel.add(ButtonPanel7);
				
				NotePanel.add(NoteLabel8);
				NotePanel.add(NoteArea8);
				NotePanel.add(ButtonPanel8);
				
				NotePanel.add(NoteLabel9);
				NotePanel.add(NoteArea9);
				NotePanel.add(ButtonPanel9);
				
				NoteLabel1.setVisible(true);
				NoteArea1.setVisible(true);
				ButtonPanel1.setVisible(true);
				
				NoteLabel2.setVisible(true);
				NoteArea2.setVisible(true);
				ButtonPanel2.setVisible(true);
				
				NoteLabel3.setVisible(true);
				NoteArea3.setVisible(true);
				ButtonPanel3.setVisible(true);
				
				NoteLabel4.setVisible(true);
				NoteArea4.setVisible(true);
				ButtonPanel4.setVisible(true);
				
				NoteLabel5.setVisible(true);
				NoteArea5.setVisible(true);
				ButtonPanel5.setVisible(true);
				
				NoteLabel6.setVisible(true);
				NoteArea6.setVisible(true);
				ButtonPanel6.setVisible(true);
				
				NoteLabel7.setVisible(true);
				NoteArea7.setVisible(true);
				ButtonPanel7.setVisible(true);
				
				NoteLabel8.setVisible(true);
				NoteArea8.setVisible(true);
				ButtonPanel8.setVisible(true);
				
				NoteLabel9.setVisible(true);
				NoteArea9.setVisible(true);
				ButtonPanel9.setVisible(true);
				break;
				
			case 10:
				
				myfile1 = new File(SubjectList.get(0) + "myUomNotes.txt");
				note1.readFromFile(myfile1, NoteArea1);
				set1 = new MyJButton("Αποθηκευση",myfile1);
				 
				 /*Write Button*/
					write1 = new JButton("Σημειωσε");
					write1.setVisible(true);
					write1.setPreferredSize(new Dimension(120, 30));
					write1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							NoteArea1.setEditable(true);
						}
					});
					
					/*Set1*/
					ButtonPanel1.add(set1);
					ButtonPanel1.add(write1);
					ButtonPanel1.setVisible(false);
					ButtonPanel1.setBackground(Color.GRAY);
					ButtonPanel1.setPreferredSize(new Dimension(150, 90));
					set1.setPreferredSize(new Dimension(120, 30));
					
					set1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							NoteArea1.setEditable(false);
							note1.writeToFile(myfile1,NoteArea1);
							
						
							
						}
					});
					
				myfile2 = new File(SubjectList.get(1) + "myUomNotes.txt");
				note2.readFromFile(myfile2, NoteArea2);
				set2 = new MyJButton("Αποθηκευση",myfile2);
				
				
				write2 = new JButton("Σημειωσε");
				write2.setVisible(true);
				write2.setPreferredSize(new Dimension(120, 30));
				write2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea2.setEditable(true);
					}
				});
			
				/*Set2*/
				ButtonPanel2.add(set2);
				ButtonPanel2.add(write2);
				ButtonPanel2.setVisible(false);
				ButtonPanel2.setBackground(Color.GRAY);
				ButtonPanel2.setPreferredSize(new Dimension(150, 90));
				set2.setPreferredSize(new Dimension(120, 30));
				
				set2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea2.setEditable(false);
						note2.writeToFile(myfile2,NoteArea2);
					
						
					}
				});
				
				myfile3 = new File(SubjectList.get(2) + "myUomNotes.txt");
				note3.readFromFile(myfile3, NoteArea3);
				set3 = new MyJButton("Αποθηκευση",myfile3);
				
				write3 = new JButton("Σημειωσε");
				write3.setVisible(true);
				write3.setPreferredSize(new Dimension(120, 30));
				write3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea3.setEditable(true);
					}
				});
				
				/*Set3*/
				ButtonPanel3.add(set3);
				ButtonPanel3.add(write3);
				ButtonPanel3.setVisible(false);
				ButtonPanel3.setBackground(Color.GRAY);
				ButtonPanel3.setPreferredSize(new Dimension(150, 90));
				set3.setPreferredSize(new Dimension(120, 30));
				
				set3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea3.setEditable(false);
						note3.writeToFile(myfile3,NoteArea3);
					
						
					}
				});
				
				myfile4 = new File(SubjectList.get(3) + "myUomNotes.txt");
				note4.readFromFile(myfile4, NoteArea4);
				set4 = new MyJButton("Αποθηκευση",myfile4);
				
				write4 = new JButton("Σημειωσε");
				write4.setVisible(true);
				write4.setPreferredSize(new Dimension(120, 30));
				write4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea4.setEditable(true);
					}
				});
				/*Set4*/
				ButtonPanel4.add(set4);
				ButtonPanel4.add(write4);
				ButtonPanel4.setVisible(false);
				ButtonPanel4.setBackground(Color.GRAY);
				ButtonPanel4.setPreferredSize(new Dimension(150, 90));
				set4.setPreferredSize(new Dimension(120, 30));
				
				set4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea4.setEditable(false);
						note4.writeToFile(myfile4,NoteArea4);
					
						
					}
				});
				
				myfile5 = new File(SubjectList.get(4) + "myUomNotes.txt");
				note5.readFromFile(myfile5, NoteArea5);
				set5 = new MyJButton("Αποθηκευση",myfile5);
				
				write5 = new JButton("Σημειωσε");
				write5.setVisible(true);
				write5.setPreferredSize(new Dimension(120, 30));
				write5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea5.setEditable(true);
					}
				});
				
				/*Set5*/
				ButtonPanel5.add(set5);
				ButtonPanel5.add(write5);
				ButtonPanel5.setVisible(false);
				ButtonPanel5.setBackground(Color.GRAY);
				ButtonPanel5.setPreferredSize(new Dimension(150, 90));
				set5.setPreferredSize(new Dimension(120, 30));
				
				set5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea5.setEditable(false);
						note5.writeToFile(myfile5,NoteArea5);
					
						
					}
				});
				
				myfile6 = new File(SubjectList.get(5) + "myUomNotes.txt");
				note6.readFromFile(myfile6, NoteArea6);
				set6 = new MyJButton("Αποθηκευση",myfile6);
				write6 = new JButton("Σημειωσε");
				write6.setVisible(true);
				write6.setPreferredSize(new Dimension(120, 30));
				write6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea6.setEditable(true);
					}
				});
				
				/*Set6*/
				ButtonPanel6.add(set6);
				ButtonPanel6.add(write6);
				ButtonPanel6.setVisible(false);
				ButtonPanel6.setBackground(Color.GRAY);
				ButtonPanel6.setPreferredSize(new Dimension(150, 90));
				set6.setPreferredSize(new Dimension(120, 30));
				
				set6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea6.setEditable(false);
						note6.writeToFile(myfile6,NoteArea6);
					
						
					}
				});
				
				myfile7 = new File(SubjectList.get(6) + "myUomNotes.txt");
				note7.readFromFile(myfile7, NoteArea7);
				set7 = new MyJButton("Αποθηκευση",myfile7);
				
				 write7 = new JButton("Σημειωσε");
				write7.setVisible(true);
				write7.setPreferredSize(new Dimension(120, 30));
				write7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea7.setEditable(true);
					}
				});
				
				/*Set7*/
				ButtonPanel7.add(set7);
				ButtonPanel7.add(write7);
				ButtonPanel7.setVisible(false);
				ButtonPanel7.setBackground(Color.GRAY);
				ButtonPanel7.setPreferredSize(new Dimension(150, 90));
				set7.setPreferredSize(new Dimension(120, 30));
				
				set7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea7.setEditable(false);
						note7.writeToFile(myfile7,NoteArea7);
					
						
					}
				});
				
				myfile8 = new File(SubjectList.get(7) + "myUomNotes.txt");
				note8.readFromFile(myfile8, NoteArea8);
				set8 = new MyJButton("Αποθηκευση",myfile8);
				
				write8 = new JButton("Σημειωσε");
				write8.setVisible(true);
				write8.setPreferredSize(new Dimension(120, 30));
				write8.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea8.setEditable(true);
					}
				});
				
			
				/*Set8*/
				ButtonPanel8.add(set8);
				ButtonPanel8.add(write8);
				ButtonPanel8.setVisible(false);
				ButtonPanel8.setBackground(Color.GRAY);
				ButtonPanel8.setPreferredSize(new Dimension(150, 90));
				set8.setPreferredSize(new Dimension(120, 30));
				
				set8.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea8.setEditable(false);
						note8.writeToFile(myfile8,NoteArea8);
					
						
					}
				});
				
				myfile9 = new File(SubjectList.get(8) + "myUomNotes.txt");
				note9.readFromFile(myfile9, NoteArea9);
				set9 = new MyJButton("Αποθηκευση",myfile9);
				
				write9 = new JButton("Σημειωσε");
				write9.setVisible(true);
				write9.setPreferredSize(new Dimension(120, 30));
				write9.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea9.setEditable(true);
					}
				});
				
				/*Set9*/
				ButtonPanel9.add(set9);
				ButtonPanel9.add(write9);
				ButtonPanel9.setVisible(false);
				ButtonPanel9.setBackground(Color.GRAY);
				ButtonPanel9.setPreferredSize(new Dimension(150, 90));
				set9.setPreferredSize(new Dimension(120, 30));
				
				set9.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea9.setEditable(false);
						note9.writeToFile(myfile9,NoteArea9);
					
						
					}
				});
				
				File myfile10= new File(SubjectList.get(9) + "myUomNotes.txt");
				note10.readFromFile(myfile10, NoteArea10);
				MyJButton set10 = new MyJButton("Αποθηκευση",myfile10);
				
				JButton write10 = new JButton("Σημειωσε");
				write10.setVisible(true);
				write10.setPreferredSize(new Dimension(120, 30));
				write10.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NoteArea10.setEditable(true);
					}
				});
				
				/*Set10*/
				ButtonPanel10.add(set10);
				ButtonPanel10.add(write10);
				ButtonPanel10.setVisible(false);
				ButtonPanel10.setBackground(Color.GRAY);
				ButtonPanel10.setPreferredSize(new Dimension(150, 90));
				set10.setPreferredSize(new Dimension(120, 30));
				
				set10.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						NoteArea10.setEditable(false);
						note10.writeToFile(myfile10,NoteArea10);
					}
				});
				
				NoteLabel1 = new JLabel(SubjectList.get(0));
				NoteLabel1.setSize(new Dimension(400, 30));
				NoteLabel1.setVisible(false);
				NoteLabel1.setOpaque(true);
				NoteLabel1.setBackground(Color.RED);
				NoteLabel1.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel1.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel2 = new JLabel(SubjectList.get(1));
				NoteLabel2.setSize(new Dimension(400, 30));
				NoteLabel2.setVisible(false);
				NoteLabel2.setOpaque(true);
				NoteLabel2.setBackground(Color.RED);
				NoteLabel2.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel2.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel3 = new JLabel(SubjectList.get(2));
				NoteLabel3.setSize(new Dimension(400, 30));
				NoteLabel3.setVisible(false);
				NoteLabel3.setOpaque(true);
				NoteLabel3.setBackground(Color.RED);
				NoteLabel3.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel3.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel4 = new JLabel(SubjectList.get(3));
				NoteLabel4.setSize(new Dimension(400, 30));
				NoteLabel4.setVisible(false);
				NoteLabel4.setOpaque(true);
				NoteLabel4.setBackground(Color.RED);
				NoteLabel4.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel4.setVerticalTextPosition(JLabel.CENTER);
				
				 NoteLabel5 = new JLabel(SubjectList.get(4));
				NoteLabel5.setSize(new Dimension(400, 30));
				NoteLabel5.setVisible(false);
				NoteLabel5.setOpaque(true);
				NoteLabel5.setBackground(Color.RED);
				NoteLabel5.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel5.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel6 = new JLabel(SubjectList.get(5));
				NoteLabel6.setSize(new Dimension(400, 30));
				NoteLabel6.setVisible(false);
				NoteLabel6.setOpaque(true);
				NoteLabel6.setBackground(Color.RED);
				NoteLabel6.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel6.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel7 = new JLabel(SubjectList.get(6));
				NoteLabel7.setSize(new Dimension(400, 30));
				NoteLabel7.setVisible(false);
				NoteLabel7.setOpaque(true);
				NoteLabel7.setBackground(Color.RED);
				NoteLabel7.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel7.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel8 = new JLabel(SubjectList.get(7));
				NoteLabel8.setSize(new Dimension(400, 30));
				NoteLabel8.setVisible(false);
				NoteLabel8.setOpaque(true);
				NoteLabel8.setBackground(Color.RED);
				NoteLabel8.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel8.setVerticalTextPosition(JLabel.CENTER);
				
				NoteLabel9 = new JLabel(SubjectList.get(8));
				NoteLabel9.setSize(new Dimension(400, 30));
				NoteLabel9.setVisible(false);
				NoteLabel9.setOpaque(true);
				NoteLabel9.setBackground(Color.RED);
				NoteLabel9.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel9.setVerticalTextPosition(JLabel.CENTER);
				
				JLabel NoteLabel10 = new JLabel(SubjectList.get(9));
				NoteLabel10.setSize(new Dimension(400, 30));
				NoteLabel10.setVisible(false);
				NoteLabel10.setOpaque(true);
				NoteLabel10.setBackground(Color.RED);
				NoteLabel10.setHorizontalTextPosition(JLabel.CENTER);
				NoteLabel10.setVerticalTextPosition(JLabel.CENTER);
				
				NotePanel.add(NoteLabel1);
				NotePanel.add(NoteArea1);
				NotePanel.add(ButtonPanel1);
				
				NotePanel.add(NoteLabel2);
				NotePanel.add(NoteArea2);
				NotePanel.add(ButtonPanel2);
				
				
				NotePanel.add(NoteLabel3);
				NotePanel.add(NoteArea3);
				NotePanel.add(ButtonPanel3);
				
				NotePanel.add(NoteLabel4);
				NotePanel.add(NoteArea4);
				NotePanel.add(ButtonPanel4);
				
				NotePanel.add(NoteLabel5);
				NotePanel.add(NoteArea5);
				NotePanel.add(ButtonPanel5);
				
				NotePanel.add(NoteLabel6);
				NotePanel.add(NoteArea6);
				NotePanel.add(ButtonPanel6);
				
				NotePanel.add(NoteLabel7);
				NotePanel.add(NoteArea7);
				NotePanel.add(ButtonPanel7);
				
				NotePanel.add(NoteLabel8);
				NotePanel.add(NoteArea8);
				NotePanel.add(ButtonPanel8);
				
				NotePanel.add(NoteLabel9);
				NotePanel.add(NoteArea9);
				NotePanel.add(ButtonPanel9);
				
				NotePanel.add(NoteLabel10);
				NotePanel.add(NoteArea10);
				NotePanel.add(ButtonPanel10);
				
				
				NoteLabel1.setVisible(true);
				NoteArea1.setVisible(true);
				ButtonPanel1.setVisible(true);
				
				NoteLabel2.setVisible(true);
				NoteArea2.setVisible(true);
				ButtonPanel2.setVisible(true);
				
				NoteLabel3.setVisible(true);
				NoteArea3.setVisible(true);
				ButtonPanel3.setVisible(true);
				
				NoteLabel4.setVisible(true);
				NoteArea4.setVisible(true);
				ButtonPanel4.setVisible(true);
				
				NoteLabel5.setVisible(true);
				NoteArea5.setVisible(true);
				ButtonPanel5.setVisible(true);
				
				NoteLabel6.setVisible(true);
				NoteArea6.setVisible(true);
				ButtonPanel6.setVisible(true);
				
				NoteLabel7.setVisible(true);
				NoteArea7.setVisible(true);
				ButtonPanel7.setVisible(true);
				
				NoteLabel8.setVisible(true);
				NoteArea8.setVisible(true);
				ButtonPanel8.setVisible(true);
				
				NoteLabel9.setVisible(true);
				NoteArea9.setVisible(true);
				ButtonPanel9.setVisible(true);
				
				NoteLabel10.setVisible(true);
				NoteArea10.setVisible(true);
				ButtonPanel10.setVisible(true);
				break;
				
			}
			NoteFrame.add(scroll);
			
	}

}

