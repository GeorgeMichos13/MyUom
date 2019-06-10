

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;




public class CheckBoxGUI {

	JFrame frmInitScreen;
	
	/**
	 * Launch occurs in class Main
	 */
	   private HashSet<String> hashcourses = new HashSet<String>();  //contains distinct courses
	   private ArrayList<String> arrcourses = new ArrayList<String>(); //contains selected courses
	   private ArrayList<JCheckBox> arcboxes = new ArrayList<JCheckBox>(); //contains all checkboxes
		
	
	
	public CheckBoxGUI() {
		XlsReader re = new XlsReader();
		re.read(); //read variables from Excel 
		
		frmInitScreen = new JFrame();
		frmInitScreen.setTitle("Select Courses");
		frmInitScreen.getContentPane().setBackground(Color.WHITE);
		frmInitScreen.setSize(1024, 504);
		frmInitScreen.setLocationRelativeTo(null);
				
				JScrollPane BoxscrollPane = new JScrollPane();
				BoxscrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				BoxscrollPane.getVerticalScrollBar().setUnitIncrement(10);
				
					
					JLayeredPane panel = new JLayeredPane();
					BoxscrollPane.setViewportView(panel);
				
					
					//Set Up ComboBoxes
					
					JComboBox<String> comboBoxS = new JComboBox<String>();   //semester combobox
					comboBoxS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					comboBoxS.setToolTipText("-Επιλέξτε Εξάμηνο-");
					comboBoxS.setFont(new Font("Arial", Font.BOLD, 11));
					comboBoxS.setModel(new DefaultComboBoxModel<String>(new String[] {"Εξάμηνο 2ο", "Εξάμηνο 4ο", "Εξάμηνο 6ο ", "Εξάμηνο 8ο"}));
										
					JComboBox<String> comboBoxD = new JComboBox<String>();   //direction combobox
					comboBoxD.setFont(new Font("Arial", Font.BOLD, 11));
					comboBoxD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					comboBoxD.setModel(new DefaultComboBoxModel<String>(new String[] {"ΔΙΟΙΚΗΣΗ ΤΕΧΝΟΛΟΓΙΑΣ", "ΕΦΑΡΜΟΣΜΕΝΗ ΠΛΗΡΟΦΟΡΙΚΗ"}));
					comboBoxD.setMaximumRowCount(2);
					comboBoxD.setToolTipText("Επιλέξτε την κατεύθυνση σας. Μόλις επιλέξετε δεν έχετε δικαίωμα να αλλάξετε\r\n");
					
					
	
			/*
			 * set up checkboxes		
			 */
					
							
						JCheckBox checkBox1 = new JCheckBox(re.getCoursesStats().get(0).getName());
						checkBox1.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox1);  
						
						
						JCheckBox checkBox2 = new JCheckBox(re.getCoursesStats().get(1).getName());
						checkBox2.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox2);
						
						JCheckBox checkBox3 = new JCheckBox(re.getCoursesStats().get(2).getName());
						checkBox3.setHorizontalAlignment(SwingConstants.LEFT);
						arcboxes.add(checkBox3);
						
						JCheckBox checkBox4 = new JCheckBox(re.getCoursesStats().get(3).getName());
						checkBox4.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox4);
					

						JCheckBox checkBox5 = new JCheckBox(re.getCoursesStats().get(4).getName());
						checkBox5.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox5);
						
						JCheckBox checkBox6 = new JCheckBox(re.getCoursesStats().get(5).getName());
						checkBox6.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox6);
						
						JCheckBox checkBox7 = new JCheckBox((String) null);
						checkBox7.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox7);
						
						JCheckBox checkBox8 = new JCheckBox((String) null);
						checkBox8.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox8);
						
						JCheckBox checkBox9 = new JCheckBox((String) null);
						checkBox9.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox9);
						
						JCheckBox checkBox10 = new JCheckBox((String) null);
						checkBox10.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox10);
						
						JCheckBox checkBox11 = new JCheckBox((String) null);
						checkBox11.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox11);
						
						JCheckBox checkBox12 = new JCheckBox((String) null);
						checkBox12.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox12);
						
						JCheckBox checkBox13 = new JCheckBox((String) null);
						checkBox13.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox13);
						
						JCheckBox checkBox14 = new JCheckBox((String) null);
						checkBox14.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox14);
						
						JCheckBox checkBox15 = new JCheckBox((String) null);
						checkBox15.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox15);		
						
						JCheckBox checkBox16 = new JCheckBox((String) null);
						checkBox16.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox16);
						
						JCheckBox checkBox17 = new JCheckBox((String) null);
						checkBox17.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox17);
						
						JCheckBox checkBox18 = new JCheckBox((String) null);
						checkBox18.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox18);
						
						JCheckBox checkBox19 = new JCheckBox((String) null);
						checkBox19.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox19);
						
						JCheckBox checkBox20 = new JCheckBox((String) null);
						checkBox20.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox20);
						
						JCheckBox checkBox21 = new JCheckBox((String) null);
						checkBox21.setVerticalAlignment(SwingConstants.TOP);
						arcboxes.add(checkBox21);
						
						
						GroupLayout gl_panel = new GroupLayout(panel); //graphics stuff
						gl_panel.setHorizontalGroup(
							gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox1, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox2, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox3, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox4, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox5, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox6, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox7, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox8, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox9, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox10, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox11, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox12, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox13, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox14, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox15, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox16, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox17, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox18, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox19, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox20, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(checkBox21, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addContainerGap()
									.addComponent(comboBoxD, 0, 139, Short.MAX_VALUE)
									.addGap(10)
									.addComponent(comboBoxS, 0, 97, Short.MAX_VALUE)
									.addGap(154))
						);
						gl_panel.setVerticalGroup(
							gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(6)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(comboBoxD, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
										.addComponent(comboBoxS, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(checkBox1)
									.addGap(3)
									.addComponent(checkBox2)
									.addGap(3)
									.addComponent(checkBox3)
									.addGap(3)
									.addComponent(checkBox4)
									.addGap(3)
									.addComponent(checkBox5)
									.addGap(3)
									.addComponent(checkBox6)
									.addGap(3)
									.addComponent(checkBox7)
									.addGap(3)
									.addComponent(checkBox8)
									.addGap(3)
									.addComponent(checkBox9)
									.addGap(3)
									.addComponent(checkBox10)
									.addGap(3)
									.addComponent(checkBox11, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(checkBox12, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(checkBox13, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(checkBox14, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(checkBox15, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(checkBox16, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(checkBox17, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(checkBox18, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(checkBox19, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(checkBox20, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(checkBox21, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						);
						panel.setLayout(gl_panel);
						
						JScrollPane infoscrollpane = new JScrollPane();
						
						JScrollPane scrollPane = new JScrollPane();
			/* 
			 * set up buttons			
			 */
						JButton addbutton = new JButton("Προσθήκη");
						addbutton.setFont(new Font("Tahoma", Font.PLAIN, 13));
						
						JButton clearbutton = new JButton("Καθαρισμός");
						clearbutton.setFont(new Font("Tahoma", Font.PLAIN, 13));
						
						JButton nextframebutton;
						nextframebutton = new JButton("Υποβολή");
						
						
						GroupLayout groupLayout = new GroupLayout(frmInitScreen.getContentPane());
						groupLayout.setHorizontalGroup(
							groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(BoxscrollPane, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(addbutton, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(clearbutton, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)))
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(18)
											.addComponent(infoscrollpane, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(nextframebutton)
											.addContainerGap())))
						);
						groupLayout.setVerticalGroup(
							groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
										.addComponent(infoscrollpane, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(clearbutton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
											.addComponent(addbutton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
										.addComponent(nextframebutton))
									.addGap(26))
								.addComponent(BoxscrollPane, GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
						);
				
						/*
						 * set up information fields
						 */
						
						JLabel label_1 = new JLabel("Επιλεγμένα Μαθήματα");
						label_1.setHorizontalAlignment(SwingConstants.CENTER);
						scrollPane.setColumnHeaderView(label_1);
						
						JTextArea textcourses = new JTextArea();
						textcourses.setEditable(false);
						scrollPane.setViewportView(textcourses);
						textcourses.setFont(new Font("Tahoma", Font.PLAIN, 15));
						
						JLabel label = new JLabel("Πληροφορίες Μαθήματος");
						label.setHorizontalAlignment(SwingConstants.CENTER);
						infoscrollpane.setColumnHeaderView(label);
						
						JTextArea infotext = new JTextArea();
						infotext.setEditable(false);
						infotext.setFont(new Font("Monospaced", Font.PLAIN, 13));
						label.setLabelFor(infotext);
						infotext.setText("Κάντε κλικ σε ένα μάθημα για\nνα εμφανίσετε τις πληροφορίες του.");
						infoscrollpane.setViewportView(infotext);
						frmInitScreen.getContentPane().setLayout(groupLayout);
						
							
							
						
						for(int i=6; i<arcboxes.size();i++) {  //hide checkboxes that are empty 
							arcboxes.get(i).hide();
						}
						
						

									
		
		
		frmInitScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	
	class ItemHandler implements ItemListener {  
			
		
	
		
			@Override
			public void itemStateChanged(ItemEvent event) {   //fire up actions when comboboxes state is changed
					 
					
					if(comboBoxD.getSelectedIndex()==0) { 
							Dioikisi(Semester(comboBoxS.getSelectedIndex())); 
					}
					
					else if(comboBoxD.getSelectedIndex()==1){
						Efarmosmeni(Semester(comboBoxS.getSelectedIndex()));
					}
						
						comboBoxD.setEnabled(false);    //prevent user to select courses with different directions
			}
			
		
			
			private int Semester(int sem_index) {  //convert semester index to real number
				int x=0;
				
				if(sem_index==0) 
				{
					x=2;
				}
				else if(sem_index==1)
				{	x=4;
				}
				else if(sem_index==2)
				{
					x=6;	
				}
				else if(sem_index==3)
				{
					x=8;
				}
				
				return x;
				
			}
			
			
			
			private void Efarmosmeni(int S){  // receives semester number, sets up the needed names for the current semester for ΚΕΠ direction
				;
				if(S==2) { //IDIA MATHIMATA EFARM KAI DIOIKHSH STO 2o EKSAMINO
					
					setCheckBoxes(0,5);
				}
				
				else if(S==4) { 
					
					setCheckBoxes(6,11);
					
				}
				
				else if(S==6) { 
					
					setCheckBoxes(12,17);
	
				}
				else if(S==8) { //ep
				
					setCheckBoxes(18,38);
					
				}
				
				
			}

			private void Dioikisi(int S) { // receives semester number, sets up the needed names for the current semester for ΚΔΤ direction
				
				
					if(S==2) {
						
						setCheckBoxes(0,5);
					}
					else if(S==4) {
						
						setCheckBoxes(41,46);
					}
					else if(S==6) {
						setCheckBoxes(47,52);
					}
					else if(S==8) {

						setCheckBoxes(53,63);
					}
				
			}
			
			private void setCheckBoxes(int start, int end) { //Enable needed checkbox and hide others according to Semester and Direction
				int checkboxcounter=0;
				for(int cindex = start; cindex<=end;cindex++) {
					arcboxes.get(checkboxcounter).show();
					arcboxes.get(checkboxcounter).setSelected(false);
					arcboxes.get(checkboxcounter).setText(re.getCoursesStats().get(cindex).getName());
					checkboxcounter++;
				}
				
				for(int i=checkboxcounter; i<arcboxes.size();i++) {
					arcboxes.get(i).hide();
					arcboxes.get(i).setSelected(false);
				}
			}

			
		}//itemlistener
	

	
	
	
  	class ActionHandler implements ActionListener{
		
	
		
		@Override
		public void actionPerformed(ActionEvent ae) {
			
			if(ae.getSource()==nextframebutton) { //when Υποβολή is clicked
	
				if (arrcourses.size()>0 && arrcourses.size()<=10) { //prevent faulty number of selected courses
					int dirindex = comboBoxD.getSelectedIndex();
					String dirstr=""; //Saves selected Direction from User 
					if(dirindex ==0)
						dirstr = "ΚΔΤ";
					else if(dirindex ==1)
						dirstr ="ΚΕΠ";
					

					
					String username = "";
					
					while(username.trim().length()==0) { //while username is only white spaces
						try {
							username = JOptionPane.showInputDialog("Enter Username"); //ask for username
							
						} catch (Exception e) {
							break;	
						}
					}
					
					
					if (username.trim().length()!=0) { //if username is given
						try (Writer writer = new BufferedWriter(
								new OutputStreamWriter(new FileOutputStream("username.txt"), StandardCharsets.UTF_8))) {
							writer.write(username);
							/*write username into file */
						} catch (IOException ex) {
							System.out.println("username entering failed");
							ex.printStackTrace();
						} 
						
						re.setArrayString(arrcourses);   //transfer array to XlsReader
						re.setSelectedDirection(dirstr);
						re.writeSelectedCourses();  
					}
					
					
				
					
				
				
					
					EventQueue.invokeLater(new Runnable() {  //Open MainFrame
						public void run() {		
							try {
								MainFrame window = new MainFrame();
								window.frmMainframe.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					frmInitScreen.setVisible(false);	
			
				}
				
				else {
					  	//error Pop up
					JOptionPane.showMessageDialog(null, "Πρέπει να δηλώσετε μέχρι 10 μαθήματα", "ΕRROR", JOptionPane.ERROR_MESSAGE);
				}
			}
			
			
			
			setupSelectedBoxes(ae);  
			
			
			if(ae.getSource()==clearbutton)  //deletes all selected courses 
			{
				hashcourses.clear();  //flushes hashset
				arrcourses.clear(); //flushes string array with selected courses
				textcourses.setText(null);
			}	
			
			
		}//actionPerformed
		
		private void setupSelectedBoxes(ActionEvent ae){  
			
			for(JCheckBox selectedcb :arcboxes) { //scan all checkboxes that are selected
				
				if(selectedcb.isSelected()) {
					
					
					if (ae.getSource()==selectedcb) { //show current selected course's info 
						readInfoFile(selectedcb.getText(), infotext);
					}
					
					if(ae.getSource()==addbutton) { //add all selected courses to the Selected Panel
						hashcourses.add(selectedcb.getText());
						printAll(hashcourses, textcourses);
					}
				}
			}
		}//setupselectedboxes
		
		
		private void printAll(HashSet<String> courses, JTextArea textcourses) { //print selected courses
			
		
			
			Iterator<String> it= courses.iterator();
			
			
			arrcourses.clear();  //flush previously selected courses
			while(it.hasNext()) {
				String arcS = ((String) it.next()+"\n");    
				arrcourses.add(arcS);
				
				
			}
			
			Collections.sort(arrcourses);
		 
		   textcourses.setText(toString2(arrcourses));  
		}
		
		
		public String toString2(ArrayList<String> arrcourses) { //line up nicely selected courses and return an entire String that contains them all

			String strOutput =""; 
			for(int i = 0; i < arrcourses.size(); i++){ 
				strOutput += arrcourses.get(i) ;
				}
		
			return strOutput; 
			
		}
		
		
		private void readInfoFile(String course, JTextArea field) { //Uses Courses name to find the necessary text file containing all course's information
			String fileName = course + "info.txt";
			Path path = Paths.get(fileName);
			
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
				field.setText("Δεν βρέθηκαν πληροφορίες");
			}
			
		}
		
		
		
		
	} //actionListener
	
	
	/*
	 * add all action listeners
	 */
		ActionListener checkboxListener = new ActionHandler();
		ActionListener addbuttonListener = new ActionHandler();
		ActionListener clearbuttonListener = new ActionHandler();
		ActionListener nextframebuttonListener = new ActionHandler();
		
		
		for(int i=0;i<arcboxes.size();i++)
			arcboxes.get(i).addActionListener(checkboxListener);
		
		
		addbutton.addActionListener(addbuttonListener);
		clearbutton.addActionListener(clearbuttonListener);
		
		nextframebutton.addActionListener(nextframebuttonListener);
		
		
		
		ItemHandler Sboxhandler = new ItemHandler();
		ItemHandler Dboxhandler = new ItemHandler();
		
		comboBoxD.addItemListener(Dboxhandler);
		comboBoxS.addItemListener(Sboxhandler);
		
		
		
	
	}//constructor
} //CheckBoGUI class

	

