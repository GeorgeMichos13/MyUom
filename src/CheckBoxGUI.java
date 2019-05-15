

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.List;




public class CheckBoxGUI {

	JFrame frmInitScreen;
	private JButton nextframebutton;
	
	
	

	/**
	 * Launch occurs in class Main
	 */

	
	@SuppressWarnings("unchecked")
	public CheckBoxGUI() {
		XlsReader re = new XlsReader();
		re.read();
		//re.printCourses();
		//re.printCoursesStats();

		
		frmInitScreen = new JFrame();
		frmInitScreen.setTitle("CheckBoxes");
		frmInitScreen.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		
		 
		   HashSet<String> hashcourses = new HashSet<String>();
		   ArrayList<String> arrcourses = new ArrayList();
		   ArrayList<JCheckBox> arcboxes = new ArrayList();
		   
							
							
				
				JScrollPane BoxscrollPane = new JScrollPane();
				BoxscrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				
					
					JLayeredPane panel = new JLayeredPane();
					BoxscrollPane.setViewportView(panel);
					
					
					
					
					JComboBox comboBoxS = new JComboBox();
					comboBoxS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					comboBoxS.setToolTipText("-Επιλέξτε Εξάμηνο-");
					comboBoxS.setFont(new Font("Arial", Font.BOLD, 11));
					comboBoxS.setModel(new DefaultComboBoxModel(new String[] {"Εξάμηνο 2ο", "Εξάμηνο 4ο", "Εξάμηνο 6ο ", "Εξάμηνο 8ο"}));
					
					
					JComboBox comboBoxD = new JComboBox();
					comboBoxD.setFont(new Font("Arial", Font.BOLD, 11));
					comboBoxD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					comboBoxD.setModel(new DefaultComboBoxModel(new String[] {"ΔΙΟΙΚΗΣΗ ΤΕΧΝΟΛΟΓΙΑΣ", "ΕΦΑΡΜΟΣΜΕΝΗ ΠΛΗΡΟΦΟΡΙΚΗ"}));
					comboBoxD.setMaximumRowCount(2);
					comboBoxD.setToolTipText("-Επιλέξτε Κατεύθυνση-\r\n");
					
					
	
					
					
					
						
						JCheckBox checkBox1 = new JCheckBox(re.getCoursesStats().get(0).getName());
						checkBox1.setVerticalAlignment(SwingConstants.TOP);
						checkBox1.setToolTipText("Mέρα, Ώρα, Αίθουσα");
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
						
						
						GroupLayout gl_panel = new GroupLayout(panel);
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
									.addComponent(checkBox3, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
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
									.addContainerGap()
									.addComponent(BoxscrollPane, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(addbutton, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(clearbutton, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
										.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(18)
											.addComponent(infoscrollpane, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(nextframebutton)
											.addContainerGap())))
						);
						groupLayout.setVerticalGroup(
							groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(BoxscrollPane, GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(infoscrollpane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
										.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(clearbutton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
											.addComponent(addbutton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
										.addComponent(nextframebutton))
									.addGap(26))
						);
						
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
						infotext.setFont(new Font("Monospaced", Font.PLAIN, 13));
						label.setLabelFor(infotext);
						infotext.setText("kasadjkjdsasd");
						infoscrollpane.setViewportView(infotext);
						frmInitScreen.getContentPane().setLayout(groupLayout);
						
							
							
						
						for(int i=7; i<arcboxes.size();i++) {
							arcboxes.get(i-1).hide();
						}
						
							checkBox21.hide(); //bug 
						

									
		
		frmInitScreen.setBounds(100, 100, 697, 440);
		frmInitScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	
	class ItemHandler implements ItemListener {
			
		
	
		
			@Override
			public void itemStateChanged(ItemEvent event) {
					 
					
					if(comboBoxD.getSelectedIndex()==0) {
							Dioikisi(Semester(comboBoxS.getSelectedIndex()));
					}
					
					else if(comboBoxD.getSelectedIndex()==1){
						Efarmosmeni(Semester(comboBoxS.getSelectedIndex()));
					}
						
			}
			
		
			
			public int Semester(int sem_index) {
				int x=2;
				
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
			
			//int efi=0;
			
			
			public void Efarmosmeni(int S){
				int cbi=0;
				if(S==2) { //IDIA MATHIMATA EFARM KAI DIOIKHSH STO 2o EKSAMINO
					
					setCheckBoxes(0,5);
				}
				
				else if(S==4) { 
					
					setCheckBoxes(6,11);
					
				}
				
				else if(S==6) { 
					
					setCheckBoxes(12,16);
	
				}
				else if(S==8) { //ep
				
					setCheckBoxes(17,38);
					
				}
				
				
			}

			public void Dioikisi(int S) {
				
				
					if(S==2) { //STO 2o EKSAMINO TA MATHIMATA EINAI IDIA ALLA THA EINAI TA IDIA KAI STIS DYO KATEYTHINSEIS 
						
						setCheckBoxes(0,5);
					}
					else if(S==4) {
						
						setCheckBoxes(39,43);
					}
					else if(S==6) {
						setCheckBoxes(44,49);
					}
					else if(S==8) {

						setCheckBoxes(50,53);
					}
				
			}
			
			public void setCheckBoxes(int start, int end) { //!lag
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
			
			if(ae.getSource()==nextframebutton) {
				
				if (arrcourses.size()>0 && arrcourses.size()<=10) {
					//new MyProfileGUI();
					EventQueue.invokeLater(new Runnable() {
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
					/* 
					 * 
					 *   POP UP WARNING WINDOW 
					 * 
					 */
				}
			}
			
			
			
			if(checkBox1.isSelected()) {
				infotext.setText("tsekares to prwto koutaki");
				     
					if(ae.getSource()==addbutton) {
						hashcourses.add(checkBox1.getText());
						printAll(hashcourses, textcourses);
						
						
					}
			}	
			
			if(checkBox2.isSelected()) {
				infotext.setText("tsekares to deutero koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox2.getText());
					printAll(hashcourses, textcourses);
					
				}
			}
			
			if(checkBox3.isSelected()) {
				infotext.setText("tsekares to trito koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox3.getText());
					printAll(hashcourses, textcourses);
					
				}
			}
			
			if(checkBox4.isSelected()) {
				infotext.setText("tsekares to tetarto koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox4.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox5.isSelected()) {
				infotext.setText("tsekares to 5 koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox5.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox6.isSelected()) {
				infotext.setText("tsekares to 6 koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox6.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox7.isSelected()) {
				infotext.setText("tsekares to 7 koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox7.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox8.isSelected()) {
				infotext.setText("tsekares to 8 koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox8.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox9.isSelected()) {
				infotext.setText("tsekares to 9 koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox9.getText());
					printAll(hashcourses, textcourses);
				}
			}
		
			if(checkBox10.isSelected()) {
				infotext.setText("tsekares to 10 koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox10.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox11.isSelected()) {
				infotext.setText("tsekares to 11 koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox11.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox12.isSelected()) {
				infotext.setText("tsekares to 12 koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox12.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox13.isSelected()) {
				infotext.setText("tsekares to 13 koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox13.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox14.isSelected()) {
				infotext.setText("tsekares to 14 koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox14.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox15.isSelected()) {
				infotext.setText("tsekares to 15 koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox15.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox16.isSelected()) {
				infotext.setText("tsekares to 16 koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox16.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox17.isSelected()) {
				infotext.setText("tsekares to 17 koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox17.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox18.isSelected()) {
				infotext.setText("tsekares to 18 koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox18.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox19.isSelected()) {
				infotext.setText("tsekares to 19 koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox19.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox20.isSelected()) {
				infotext.setText("tsekares to 20 koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox20.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox21.isSelected()) {
				infotext.setText("tsekares to 21 koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox21.getText());
					printAll(hashcourses, textcourses);
				}
						
			}
			
			
			if(ae.getSource()==clearbutton) 
			{
				
				hashcourses.clear();
				textcourses.setText(null);
			}	
			
			
			
		}//actionPerformed
		
		
		public void printAll(HashSet<String> courses, JTextArea textcourses) {
			
			String hashS = "";
			int i=0;
			Iterator it= courses.iterator();
			
			
			arrcourses.clear();
			while(it.hasNext()) {
				String arcS = ((String) it.next() + "\n");
				arrcourses.add(arcS);
				hashS = hashS + arcS;
				
			}
			
			Collections.sort(arrcourses);

		   
		    
		 
		   textcourses.setText(toString2(arrcourses));  
		}
		
		
		public String toString2(ArrayList<String> arrcourses) {

			String strOutput ="";  //Prints constructor name + left bracket
			for(int i = 0; i < arrcourses.size(); i++){     //myArr = ArrayList instance variable
				strOutput += arrcourses.get(i) ;
				}
			
			//strOutput = strOutput + "/n";
			return strOutput; 
			
		}
		
		
	} //actionListener
	
	
	
		ActionListener checkboxListener = new ActionHandler();
		ActionListener addbuttonListener = new ActionHandler();
		ActionListener clearbuttonListener = new ActionHandler();
		ActionListener nextframebuttonListener = new ActionHandler();
		
		checkBox1.addActionListener(checkboxListener);
		checkBox2.addActionListener(checkboxListener);
		checkBox3.addActionListener(checkboxListener);
		checkBox4.addActionListener(checkboxListener);
		checkBox5.addActionListener(checkboxListener);
		checkBox6.addActionListener(checkboxListener);
		checkBox7.addActionListener(checkboxListener);
		checkBox8.addActionListener(checkboxListener);
		checkBox9.addActionListener(checkboxListener);
		checkBox10.addActionListener(checkboxListener);
		checkBox11.addActionListener(checkboxListener);
		checkBox12.addActionListener(checkboxListener);
		checkBox13.addActionListener(checkboxListener);
		checkBox14.addActionListener(checkboxListener);
		checkBox15.addActionListener(checkboxListener);
		checkBox16.addActionListener(checkboxListener);
		checkBox17.addActionListener(checkboxListener);
		checkBox18.addActionListener(checkboxListener);
		checkBox19.addActionListener(checkboxListener);
		checkBox20.addActionListener(checkboxListener);
		checkBox21.addActionListener(checkboxListener);
		
		addbutton.addActionListener(addbuttonListener);
		clearbutton.addActionListener(clearbuttonListener);
		
		nextframebutton.addActionListener(nextframebuttonListener);
		
		
		
		ItemHandler Sboxhandler = new ItemHandler();
		ItemHandler Dboxhandler = new ItemHandler();
		
		comboBoxD.addItemListener(Dboxhandler);
		comboBoxS.addItemListener(Sboxhandler);
		
		
		
	
	}
}

	

