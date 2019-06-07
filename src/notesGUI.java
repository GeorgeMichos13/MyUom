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
	private static final long serialVersionUID = 1L;
	private JFrame NoteFrame = new JFrame("Notes");
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
	private JScrollPane scroll = new JScrollPane(NotePanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	private static final int WIDTH = 1200;
	private static final int HEIGHT = 700;
	private JButton backButton;
	ArrayList<Notes> Notes = new ArrayList<Notes>();
	ArrayList<JTextArea> NoteAreas = new ArrayList<JTextArea>();
	ArrayList<JPanel> ButtonPanels = new ArrayList<JPanel>();
	public void setSubjectList(ArrayList<String> array) {
		SubjectList.addAll(array);
	}

	public notesGUI(ArrayList<String> array) {

		
		SubjectList.addAll(array);
		NotePanel.setBackground(Color.GRAY);
		backButton = new JButton("Πίσω");
		NotePanel.add(backButton);
		
		
		scroll.getVerticalScrollBar().setUnitIncrement(10);
		
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
		
		NoteFrame.add(scroll);
		
		
		
			
			
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
			NoteArea1.setPreferredSize(new Dimension(423, 100));
			NoteArea1.setMinimumSize(new Dimension(423, 100));
			NoteArea1.setMaximumSize(new Dimension(423, 100));
			NoteArea1.setEditable(true);
			NoteArea1.setVisible(false);
			NoteArea1.setLineWrap(true);
			
			
			
			JTextArea NoteArea2 = new JTextArea();
			NoteArea2.setPreferredSize(new Dimension(423, 100));
			NoteArea2.setMinimumSize(new Dimension(423, 100));
			NoteArea2.setMaximumSize(new Dimension(423, 100));
			NoteArea2.setEditable(true);
			NoteArea2.setVisible(false);
			NoteArea2.setLineWrap(true);
			
			JTextArea NoteArea3 = new JTextArea();
			NoteArea3.setPreferredSize(new Dimension(423, 100));
			NoteArea3.setMinimumSize(new Dimension(423, 100));
			NoteArea3.setMaximumSize(new Dimension(423, 100));
			NoteArea3.setEditable(true);
			NoteArea3.setVisible(false);
			NoteArea3.setLineWrap(true);
			
			JTextArea NoteArea4 = new JTextArea();
			NoteArea4.setPreferredSize(new Dimension(423, 100));
			NoteArea4.setMinimumSize(new Dimension(423, 100));
			NoteArea4.setMaximumSize(new Dimension(423, 100));
			NoteArea4.setEditable(true);
			NoteArea4.setVisible(false);
			NoteArea4.setLineWrap(true);
			
			JTextArea NoteArea5 = new JTextArea();
			NoteArea5.setPreferredSize(new Dimension(423, 100));
			NoteArea5.setMinimumSize(new Dimension(423, 100));
			NoteArea5.setMaximumSize(new Dimension(423, 100));
			NoteArea5.setEditable(true);
			NoteArea5.setVisible(false);
			NoteArea5.setLineWrap(true);
			
			JTextArea NoteArea6 = new JTextArea();
			NoteArea6.setPreferredSize(new Dimension(423, 100));
			NoteArea6.setMinimumSize(new Dimension(423, 100));
			NoteArea6.setMaximumSize(new Dimension(423, 100));
			NoteArea6.setEditable(true);
			NoteArea6.setVisible(false);
			NoteArea6.setLineWrap(true);
			
			JTextArea NoteArea7 = new JTextArea();
			NoteArea7.setPreferredSize(new Dimension(423, 100));
			NoteArea7.setMinimumSize(new Dimension(423, 100));
			NoteArea7.setMaximumSize(new Dimension(423, 100));
			NoteArea7.setEditable(true);
			NoteArea7.setVisible(false);
			NoteArea7.setLineWrap(true);
			
			JTextArea NoteArea8 = new JTextArea();
			NoteArea8.setPreferredSize(new Dimension(423, 100));
			NoteArea8.setMinimumSize(new Dimension(423, 100));
			NoteArea8.setMaximumSize(new Dimension(423, 100));
			NoteArea8.setEditable(true);
			NoteArea8.setVisible(false);
			NoteArea8.setLineWrap(true);
			
			JTextArea NoteArea9 = new JTextArea();
			NoteArea9.setPreferredSize(new Dimension(423, 100));
			NoteArea9.setMinimumSize(new Dimension(423, 100));
			NoteArea9.setMaximumSize(new Dimension(423, 100));
			NoteArea9.setEditable(true);
			NoteArea9.setVisible(false);
			NoteArea9.setLineWrap(true);
			
			JTextArea NoteArea10 = new JTextArea();
			NoteArea10.setPreferredSize(new Dimension(423, 100));
			NoteArea10.setMinimumSize(new Dimension(423, 100));
			NoteArea10.setMaximumSize(new Dimension(423, 100));
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
			
			
			NoteAreas.add(NoteArea1);
			NoteAreas.add(NoteArea2);
			NoteAreas.add(NoteArea3);
			NoteAreas.add(NoteArea4);
			NoteAreas.add(NoteArea5);
			NoteAreas.add(NoteArea6);
			NoteAreas.add(NoteArea7);
			NoteAreas.add(NoteArea8);
			NoteAreas.add(NoteArea9);
			NoteAreas.add(NoteArea10);
			
			
			Notes.add(note1);
			Notes.add(note2);
			Notes.add(note3);
			Notes.add(note4);
			Notes.add(note5);
			Notes.add(note6);
			Notes.add(note7);
			Notes.add(note8);
			Notes.add(note9);
			Notes.add(note10);
			
			ButtonPanels.add(ButtonPanel1);
			ButtonPanels.add(ButtonPanel2);
			ButtonPanels.add(ButtonPanel3);
			ButtonPanels.add(ButtonPanel4);
			ButtonPanels.add(ButtonPanel5);
			ButtonPanels.add(ButtonPanel6);
			ButtonPanels.add(ButtonPanel7);
			ButtonPanels.add(ButtonPanel8);
			ButtonPanels.add(ButtonPanel9);
			ButtonPanels.add(ButtonPanel10);
			
			/* Panel Layouts */
			NotePanel.setLayout(new BoxLayout(NotePanel, BoxLayout.Y_AXIS));
			ButtonPanel1.setLayout(new FlowLayout());
			
			scroll.setVisible(true);
			

			switch(num) {
			case 1:
				
				setNote(0);
				
				break;
			case 2:{
				
				setNote(0);
				setNote(1);
				
				break;
			}
			case 3:{
				
				setNote(0);
				setNote(1);
				setNote(2);
			
				break;
			}
			case 4:{
				
				setNote(0);
				setNote(1);
				setNote(2);
				setNote(3);
				
				break;
			}
			case 5:{
				setNote(0);
				setNote(1);
				setNote(2);
				setNote(3);
				setNote(4);
				
				break;
			}
			case 6:{
				
				setNote(0);
				setNote(1);
				setNote(2);
				setNote(3);
				setNote(4);
				setNote(5);
				
				break;
			}
			case 7:{
				
				setNote(0);
				setNote(1);
				setNote(2);
				setNote(3);
				setNote(4);
				setNote(5);
				setNote(6);
				
				break;
			}
			case 8:{
				
				setNote(0);
				setNote(1);
				setNote(2);
				setNote(3);
				setNote(4);
				setNote(5);
				setNote(6);
				setNote(7);
				
				break;
			}
			case 9:{
				
				setNote(0);
				setNote(1);
				setNote(2);
				setNote(3);
				setNote(4);
				setNote(5);
				setNote(6);
				setNote(7);
				setNote(8);
				
				break;
			}
			case 10:{
				
				setNote(0);
				setNote(1);
				setNote(2);
				setNote(3);
				setNote(4);
				setNote(5);
				setNote(6);
				setNote(7);
				setNote(8);
				setNote(9);
				
				break;
			}
			}
			
	}
	
	
	private void setNote(int i) {
		
		 File myfile = new File(SubjectList.get(i) + "myUomNotes.txt");
		 Notes.get(i).readFromFile(myfile, NoteAreas.get(i));
		 MyJButton set = new MyJButton("Αποθηκευση",myfile);
		 
		 /*Write Button*/
			JButton write = new JButton("Σημειωσε");
			write.setVisible(true);
			write.setPreferredSize(new Dimension(120, 30));
			write.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					NoteAreas.get(i).setEditable(true);
				}
			});
			
			/*Set1*/
			ButtonPanels.get(i).add(set);
			ButtonPanels.get(i).add(write);
			ButtonPanels.get(i).setVisible(false);
			ButtonPanels.get(i).setBackground(Color.GRAY);
			ButtonPanels.get(i).setPreferredSize(new Dimension(150, 90));
			set.setPreferredSize(new Dimension(120, 30));
			
			set.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					NoteAreas.get(i).setEditable(false);
					Notes.get(i).writeToFile(myfile,NoteAreas.get(i));
				
				
					
				}
			});
			
		JLabel NoteLabel = new JLabel(SubjectList.get(i));
		NoteLabel.setSize(new Dimension(700, 30));
		NoteLabel.setVisible(false);
		NoteLabel.setOpaque(true);
		NoteLabel.setBackground(Color.WHITE);
		NoteLabel.setHorizontalTextPosition(JLabel.CENTER);
		NoteLabel.setVerticalTextPosition(JLabel.CENTER);
		
		NotePanel.add(NoteLabel);
		NotePanel.add(NoteAreas.get(i));
		NotePanel.add(ButtonPanels.get(i));
		
		NoteLabel.setVisible(true);
		NoteAreas.get(i).setVisible(true);
		ButtonPanels.get(i).setVisible(true);
		
	}

}

