import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
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
	private static final long serialVersionUID = 1L;
	public JFrame InfoFrame = new JFrame("Information");
	private JPanel InfoPanel = new JPanel();

	private ArrayList<String> SubjectList = new ArrayList<String>();
	private JScrollPane scroll = new JScrollPane(InfoPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	private static final int WIDTH = 1200;
	private static final int HEIGHT = 900;
	private static final int TextWIDTH = 700;
	private static final int TextHEIGHT = 300;
	private ArrayList<JTextArea> InfoAreas = new ArrayList<JTextArea>();
	private ArrayList<Notes> Info = new ArrayList<Notes>();
	private JButton backButton;
	public void setSubjectList(ArrayList<String> array) {
		SubjectList.addAll(array);
	}

	public InformationGUI(ArrayList<String> array) {
		
		
		
		SubjectList.addAll(array);
		InfoPanel.setBackground(Color.GRAY);
		backButton = new JButton("Πίσω");
		
		InfoPanel.add(backButton);
	
		scroll.getViewport().setViewPosition(new Point(0,0));
		scroll.getVerticalScrollBar().setUnitIncrement(10);
		scroll.setVisible(true);
		
		InfoFrame.add(scroll);
		
		
		
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent back) {
				
				EventQueue.invokeLater(new Runnable() { //Go Back to MainFrame
					public void run() {
						try {
							InfoFrame.setVisible(false);
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
			InfoFrame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
			InfoFrame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
			InfoFrame.setMaximumSize(new Dimension(WIDTH, HEIGHT));
			InfoFrame.setResizable(true);
			InfoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			InfoFrame.setLocationRelativeTo(null);
			InfoFrame.setVisible(true);

			/* TextAreas Initialization */
			JTextArea InfoArea1 = new JTextArea();
			InfoArea1.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea1.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea1.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea1.setEditable(false);
			InfoArea1.setVisible(false);
			InfoArea1.setLineWrap(true);
			
			
			
			JTextArea InfoArea2 = new JTextArea();
			InfoArea2.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea2.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea2.setEditable(false);
			InfoArea2.setVisible(false);
			InfoArea2.setLineWrap(true);
			
			JTextArea InfoArea3 = new JTextArea();
			InfoArea3.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea3.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea3.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea3.setEditable(false);
			InfoArea3.setVisible(false);
			InfoArea3.setLineWrap(true);
			
			JTextArea InfoArea4 = new JTextArea();
			InfoArea4.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea4.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea4.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea4.setEditable(true);
			InfoArea4.setVisible(false);
			InfoArea4.setLineWrap(true);
			
			JTextArea InfoArea5 = new JTextArea();
			InfoArea5.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea5.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea5.setEditable(false);
			InfoArea5.setVisible(false);
			InfoArea5.setLineWrap(true);
			
			JTextArea InfoArea6 = new JTextArea();
			InfoArea6.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea6.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea6.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea6.setEditable(false);
			InfoArea6.setVisible(false);
			InfoArea6.setLineWrap(true);
			
			JTextArea InfoArea7 = new JTextArea();
			InfoArea7.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea7.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea7.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea7.setEditable(false);
			InfoArea7.setVisible(false);
			InfoArea7.setLineWrap(true);
			
			JTextArea InfoArea8 = new JTextArea();
			InfoArea8.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea8.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea8.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea8.setEditable(true);
			InfoArea8.setVisible(false);
			InfoArea8.setLineWrap(true);
			
			JTextArea InfoArea9 = new JTextArea();
			InfoArea9.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea9.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea9.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea9.setEditable(false);
			InfoArea9.setVisible(false);
			InfoArea9.setLineWrap(true);
			
			JTextArea InfoArea10 = new JTextArea();
			InfoArea10.setPreferredSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea10.setMinimumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea10.setMaximumSize(new Dimension(TextWIDTH, TextHEIGHT));
			InfoArea10.setEditable(false);
			InfoArea10.setVisible(false);
			InfoArea10.setLineWrap(true);
			
			
			
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
			
			Info.add(info1);
			Info.add(info2);
			Info.add(info3);
			Info.add(info4);
			Info.add(info5);
			Info.add(info6);
			Info.add(info7);
			Info.add(info8);
			Info.add(info9);
			Info.add(info10);
			
			InfoAreas.add(InfoArea1);
			InfoAreas.add(InfoArea2);
			InfoAreas.add(InfoArea3);
			InfoAreas.add(InfoArea4);
			InfoAreas.add(InfoArea5);
			InfoAreas.add(InfoArea6);
			InfoAreas.add(InfoArea7);
			InfoAreas.add(InfoArea8);
			InfoAreas.add(InfoArea9);
			InfoAreas.add(InfoArea10);
			
			
			
			/* Panel Layouts */
			InfoPanel.setLayout(new BoxLayout(InfoPanel, BoxLayout.Y_AXIS));
			

			for(int i = 0 ; i < SubjectList.size() ; i++)
				setInfo(i);
			
	}
	
	
	private void setInfo(int i) {
		
		String file = SubjectList.get(i) + "info.txt";

		Path path = Paths.get(file);
		
		 
		 String input = path.toString();
		 File myfile = new File(input);
		 Info.get(i).readFromFile(myfile, InfoAreas.get(i));
		 
		
		 
		 /*Write Button*/
			JButton exams = new JButton("Δείτε τα παλία θέματα.");
			
			exams.setVisible(true);
			exams.setPreferredSize(new Dimension(120, 30));
			exams.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					new ThemataGUI(SubjectList.get(i));
					InfoFrame.setVisible(false);
					
				}
			});
			
			
			
		JLabel infoLabel = new JLabel(SubjectList.get(i));
		infoLabel.setSize(new Dimension(400, 30));
		infoLabel.setVisible(false);
		infoLabel.setOpaque(true);
		infoLabel.setBackground(Color.RED);
		infoLabel.setHorizontalTextPosition(JLabel.CENTER);
		infoLabel.setVerticalTextPosition(JLabel.CENTER);
		
		InfoPanel.add(infoLabel);
		InfoPanel.add(InfoAreas.get(i));
		InfoPanel.add(exams);
		
		infoLabel.setVisible(true);
		InfoAreas.get(i).setVisible(true);
		InfoAreas.get(i).setEditable(false);
		
	}
	

}


