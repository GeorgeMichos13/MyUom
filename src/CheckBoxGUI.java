

import java.awt.Color;
import java.awt.Cursor;
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
		   
		   
							
							
				
				JScrollPane BoxscrollPane = new JScrollPane();
				BoxscrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				
					
					JLayeredPane panel = new JLayeredPane();
					BoxscrollPane.setViewportView(panel);
					
					
					
					
					JComboBox comboBoxS = new JComboBox();
					comboBoxS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					
					JComboBox comboBoxD = new JComboBox();
					comboBoxD.setFont(new Font("Arial", Font.BOLD, 11));
					comboBoxD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					comboBoxD.setModel(new DefaultComboBoxModel(new String[] {"ΔΙΟΙΚΗΣΗ ΤΕΧΝΟΛΟΓΙΑΣ", "ΕΦΑΡΜΟΣΜΕΝΗ ΠΛΗΡΟΦΟΡΙΚΗ"}));
					comboBoxD.setMaximumRowCount(2);
					comboBoxD.setToolTipText("-Επιλέξτε Κατεύθυνση-\r\n");
					
					
	
					
					comboBoxS.setToolTipText("-Επιλέξτε Εξάμηνο-");
					comboBoxS.setFont(new Font("Arial", Font.BOLD, 11));
					comboBoxS.setModel(new DefaultComboBoxModel(new String[] {"Εξάμηνο 2ο", "Εξάμηνο 4ο", "Εξάμηνο 6ο ", "Εξάμηνο 8ο"}));
					
					
					
					JCheckBox checkBox1 = new JCheckBox(re.getCoursesStats().get(0).getName());
					checkBox1.setVerticalAlignment(SwingConstants.TOP);
					checkBox1.setToolTipText("Mέρα, Ώρα, Αίθουσα");
					
					
					JCheckBox checkBox2 = new JCheckBox(re.getCoursesStats().get(1).getName());
					checkBox2.setVerticalAlignment(SwingConstants.TOP);
					
					JCheckBox checkBox3 = new JCheckBox(re.getCoursesStats().get(2).getName());
					checkBox3.setHorizontalAlignment(SwingConstants.LEFT);
					
					JCheckBox checkBox4 = new JCheckBox(re.getCoursesStats().get(3).getName());
					checkBox4.setVerticalAlignment(SwingConstants.TOP);
					

						JCheckBox checkBox5 = new JCheckBox(re.getCoursesStats().get(4).getName());
						checkBox5.setVerticalAlignment(SwingConstants.TOP);
						
						JCheckBox checkBox6 = new JCheckBox(re.getCoursesStats().get(5).getName());
						checkBox6.show();
						checkBox6.setVerticalAlignment(SwingConstants.TOP);
						
						JCheckBox checkBox7 = new JCheckBox(re.getCoursesStats().get(6).getName());
						checkBox7.setVerticalAlignment(SwingConstants.TOP);
						
						
						JCheckBox checkBox8 = new JCheckBox(re.getCoursesStats().get(7).getName());
						checkBox8.setVerticalAlignment(SwingConstants.TOP);
						
						
						JCheckBox checkBox9 = new JCheckBox(re.getCoursesStats().get(8).getName());
						checkBox9.setVerticalAlignment(SwingConstants.TOP);
						
						JCheckBox checkBox10 = new JCheckBox(re.getCoursesStats().get(9).getName());
						checkBox10.setVerticalAlignment(SwingConstants.TOP);
						
						JCheckBox checkBox15 = new JCheckBox((String) null);
						checkBox15.setVerticalAlignment(SwingConstants.TOP);
						
						JCheckBox checkBox14 = new JCheckBox((String) null);
						checkBox14.setVerticalAlignment(SwingConstants.TOP);
						
						JCheckBox checkBox13 = new JCheckBox((String) null);
						checkBox13.setVerticalAlignment(SwingConstants.TOP);
						
						JCheckBox checkBox11 = new JCheckBox((String) null);
						checkBox11.setVerticalAlignment(SwingConstants.TOP);
						
						JCheckBox checkBox12 = new JCheckBox((String) null);
						checkBox12.setVerticalAlignment(SwingConstants.TOP);
						
						JCheckBox checkBox16 = new JCheckBox((String) null);
						checkBox16.setVerticalAlignment(SwingConstants.TOP);
						
						JCheckBox checkBox17 = new JCheckBox((String) null);
						checkBox17.setVerticalAlignment(SwingConstants.TOP);
						
						JCheckBox checkBox18 = new JCheckBox((String) null);
						checkBox18.setVerticalAlignment(SwingConstants.TOP);
						
						JCheckBox checkBox19 = new JCheckBox((String) null);
						checkBox19.setVerticalAlignment(SwingConstants.TOP);
						
						JCheckBox checkBox20 = new JCheckBox((String) null);
						checkBox20.setVerticalAlignment(SwingConstants.TOP);
						
						JCheckBox checkBox21 = new JCheckBox((String) null);
						checkBox21.setVerticalAlignment(SwingConstants.TOP);
						
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
						
							
							
							checkBox7.hide();
							checkBox8.hide();
							checkBox9.hide();
							checkBox10.hide();
							checkBox11.hide();
							checkBox12.hide();
							checkBox13.hide();
							checkBox14.hide();
							checkBox15.hide();
							checkBox16.hide();
							checkBox17.hide();
							checkBox18.hide();
							checkBox19.hide();
							checkBox20.hide();
							checkBox21.hide();
							
							
									
		
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
			
			public void Efarmosmeni(int S){
				if(S==2) { //IDIA MATHIMATA EFARM KAI DIOIKHSH STO 2o EKSAMINO
					if(re.getCoursesStats().get(0).getSemesterN()==S) {  
						checkBox1.show();
						checkBox1.setSelected(false);
						checkBox1.setText(re.getCoursesStats().get(0).getName());

						}
						if(re.getCoursesStats().get(1).getSemesterN()==S) {  
							checkBox2.show();
							checkBox2.setSelected(false);
							checkBox2.setText(re.getCoursesStats().get(1).getName());
							} 
						if(re.getCoursesStats().get(2).getSemesterN()==S) {  
							checkBox3.show();
							checkBox3.setSelected(false);
							checkBox3.setText(re.getCoursesStats().get(2).getName());
							}
						
						if(re.getCoursesStats().get(3).getSemesterN()==S) {  
							checkBox4.show();
							checkBox4.setSelected(false);
							checkBox4.setText(re.getCoursesStats().get(3).getName());
							}
						if(re.getCoursesStats().get(4).getSemesterN()==S) {  
							checkBox5.show();
							checkBox5.setSelected(false);
							checkBox5.setText(re.getCoursesStats().get(4).getName());
							}
						if(re.getCoursesStats().get(5).getSemesterN()==S) {  
							checkBox6.show();
							checkBox6.setSelected(false);
							checkBox6.setText(re.getCoursesStats().get(5).getName());
							}
						
						
						
						checkBox7.hide();
						checkBox7.setSelected(false);
					
						checkBox8.hide();
						checkBox8.setSelected(false);
						
						checkBox9.hide();
						checkBox9.setSelected(false);
						
						checkBox10.hide();
						checkBox10.setSelected(false);
						
						checkBox11.hide();
						checkBox11.setSelected(false);
						
						checkBox12.hide();
						checkBox12.setSelected(false);
						
						checkBox13.hide();
						checkBox13.setSelected(false);
						
						checkBox14.hide();
						checkBox14.setSelected(false);
						
						checkBox15.hide();
						checkBox15.setSelected(false);
						
						checkBox16.hide();
						checkBox16.setSelected(false);
						
						checkBox17.hide();
						checkBox17.setSelected(false);
						
						checkBox18.hide();
						checkBox18.setSelected(false);
						
						checkBox19.hide();
						checkBox19.setSelected(false);
						
						checkBox20.hide();
						checkBox20.setSelected(false);
						
						checkBox21.hide();
						checkBox21.setSelected(false);
				}
				else if(S==4) { //ep
					if(re.getCoursesStats().get(6).getSemesterN()==S) {  
						checkBox1.setSelected(false);
						checkBox1.setText(re.getCoursesStats().get(6).getName());
						}
						if(re.getCoursesStats().get(7).getSemesterN()==S) {  
							checkBox2.setText(re.getCoursesStats().get(7).getName());
							checkBox2.setSelected(false);
							} 
						
						if(re.getCoursesStats().get(8).getSemesterN()==S) {  
							checkBox3.setSelected(false);
							checkBox3.setText(re.getCoursesStats().get(8).getName());
							}
						
						if(re.getCoursesStats().get(9).getSemesterN()==S) {  
							checkBox4.setSelected(false);
							checkBox4.setText(re.getCoursesStats().get(9).getName());
							}
						if(re.getCoursesStats().get(10).getSemesterN()==S) {  
							checkBox5.setSelected(false);
							checkBox5.setText(re.getCoursesStats().get(10).getName());
							}
						if(re.getCoursesStats().get(11).getSemesterN()==S) {  
							checkBox6.show();
							checkBox6.setSelected(false);
							checkBox6.setText(re.getCoursesStats().get(11).getName());
							}
						
						
						checkBox7.hide();
						checkBox7.setSelected(false);
					
						checkBox8.hide();
						checkBox8.setSelected(false);
						
						checkBox9.hide();
						checkBox9.setSelected(false);
						
						checkBox10.hide();
						checkBox10.setSelected(false);
						
						checkBox11.hide();
						checkBox11.setSelected(false);
						
						checkBox12.hide();
						checkBox12.setSelected(false);
						
						checkBox13.hide();
						checkBox13.setSelected(false);
						
						checkBox14.hide();
						checkBox14.setSelected(false);
						
						checkBox15.hide();
						checkBox15.setSelected(false);
						
						checkBox16.hide();
						checkBox16.setSelected(false);
						
						checkBox17.hide();
						checkBox17.setSelected(false);
						
						checkBox18.hide();
						checkBox18.setSelected(false);
						
						checkBox19.hide();
						checkBox19.setSelected(false);
						
						checkBox20.hide();
						checkBox20.setSelected(false);
						
						checkBox21.hide();
						checkBox21.setSelected(false);
				}
				else if(S==6) { //ep
					if(re.getCoursesStats().get(12).getSemesterN()==S) {  
						checkBox1.setSelected(false);
						checkBox1.setText(re.getCoursesStats().get(12).getName());
						}
						if(re.getCoursesStats().get(13).getSemesterN()==S) {
							checkBox2.setSelected(false);
							checkBox2.setText(re.getCoursesStats().get(13).getName());
							} 
						if(re.getCoursesStats().get(14).getSemesterN()==S) {  
							checkBox3.setSelected(false);
							checkBox3.setText(re.getCoursesStats().get(14).getName());
							}
						
						if(re.getCoursesStats().get(15).getSemesterN()==S) {  
							checkBox4.setSelected(false);
							checkBox4.setText(re.getCoursesStats().get(15).getName());
							}
						if(re.getCoursesStats().get(16).getSemesterN()==S) {
							checkBox5.setSelected(false); 
							checkBox5.setText(re.getCoursesStats().get(16).getName());
							}
						
						
						
						checkBox6.hide();
						checkBox6.setSelected(false);
						
						checkBox7.hide();
						checkBox7.setSelected(false);
					
						checkBox8.hide();
						checkBox8.setSelected(false);
						
						checkBox9.hide();
						checkBox9.setSelected(false);
						
						checkBox10.hide();
						checkBox10.setSelected(false);
						
						checkBox11.hide();
						checkBox11.setSelected(false);
						
						checkBox12.hide();
						checkBox12.setSelected(false);
						
						checkBox13.hide();
						checkBox13.setSelected(false);
						
						checkBox14.hide();
						checkBox14.setSelected(false);
						
						checkBox15.hide();
						checkBox15.setSelected(false);
						
						checkBox16.hide();
						checkBox16.setSelected(false);
						
						checkBox17.hide();
						checkBox17.setSelected(false);
						
						checkBox18.hide();
						checkBox18.setSelected(false);
						
						checkBox19.hide();
						checkBox19.setSelected(false);
						
						checkBox20.hide();
						checkBox20.setSelected(false);
						
						checkBox21.hide();
						checkBox21.setSelected(false);
				}
				else if(S==8) { //ep
					if(re.getCoursesStats().get(17).getSemesterN()==S) {  
						checkBox1.setSelected(false);
						checkBox1.setText(re.getCoursesStats().get(17).getName());
						}
						if(re.getCoursesStats().get(18).getSemesterN()==S) { 
							checkBox2.setSelected(false);
							checkBox2.setText(re.getCoursesStats().get(18).getName());
							} 
						if(re.getCoursesStats().get(19).getSemesterN()==S) {
							checkBox3.setSelected(false);
							checkBox3.setText(re.getCoursesStats().get(19).getName());
							}
						
						if(re.getCoursesStats().get(20).getSemesterN()==S) {
							checkBox4.setSelected(false);
							checkBox4.setText(re.getCoursesStats().get(20).getName());
							}
						if(re.getCoursesStats().get(21).getSemesterN()==S) {  
							checkBox5.show();
							checkBox5.setSelected(false);
							checkBox5.setText(re.getCoursesStats().get(21).getName());
							}
						if(re.getCoursesStats().get(22).getSemesterN()==S) {
							checkBox6.show();
							checkBox6.setSelected(false);
							checkBox6.setText(re.getCoursesStats().get(22).getName());
						}
						if(re.getCoursesStats().get(23).getSemesterN()==S) {  
							checkBox7.show();
							checkBox7.setSelected(false);
							checkBox7.setText(re.getCoursesStats().get(23).getName());
							}
							if(re.getCoursesStats().get(24).getSemesterN()==S) {  
								checkBox8.show();
								checkBox8.setSelected(false);
								checkBox8.setText(re.getCoursesStats().get(24).getName());
								} 
							if(re.getCoursesStats().get(25).getSemesterN()==S) {  
								checkBox9.show();
								checkBox9.setSelected(false);
								checkBox9.setText(re.getCoursesStats().get(25).getName());
								}
							
							if(re.getCoursesStats().get(26).getSemesterN()==S) {  
								checkBox10.show();
								checkBox10.setSelected(false);
								checkBox10.setText(re.getCoursesStats().get(26).getName());
								}
							if(re.getCoursesStats().get(27).getSemesterN()==S) {  
								checkBox11.show();
								checkBox11.setSelected(false);
								checkBox11.setText(re.getCoursesStats().get(27).getName());
								}
							if(re.getCoursesStats().get(28).getSemesterN()==S) {  
								checkBox12.show();
								checkBox12.setSelected(false);
								checkBox12.setText(re.getCoursesStats().get(28).getName());
								}
								if(re.getCoursesStats().get(29).getSemesterN()==S) {  
									checkBox13.show();
									checkBox13.setSelected(false);
									checkBox13.setText(re.getCoursesStats().get(29).getName());
									} 
								if(re.getCoursesStats().get(30).getSemesterN()==S) {  
									checkBox14.show();
									checkBox14.setSelected(false);
									checkBox14.setText(re.getCoursesStats().get(30).getName());
									}
								
								if(re.getCoursesStats().get(31).getSemesterN()==S) {  
									checkBox15.show();
									checkBox15.setSelected(false);
									checkBox15.setText(re.getCoursesStats().get(31).getName());
									}
								if(re.getCoursesStats().get(32).getSemesterN()==S) {  
									checkBox16.show();
									checkBox16.setSelected(false);
									checkBox16.setText(re.getCoursesStats().get(32).getName());
									}
								if(re.getCoursesStats().get(33).getSemesterN()==S) {  
									checkBox16.show();
									checkBox16.setText(re.getCoursesStats().get(33).getName());
									}
									if(re.getCoursesStats().get(34).getSemesterN()==S) {  
										checkBox17.show();
										checkBox17.setSelected(false);
										checkBox17.setText(re.getCoursesStats().get(34).getName());
										} 
									if(re.getCoursesStats().get(35).getSemesterN()==S) {  
										checkBox18.show();
										checkBox18.setSelected(false);
										checkBox18.setText(re.getCoursesStats().get(35).getName());
										}
									
									if(re.getCoursesStats().get(36).getSemesterN()==S) {  
										checkBox19.show();
										checkBox19.setSelected(false);
										checkBox19.setText(re.getCoursesStats().get(36).getName());
										}
									if(re.getCoursesStats().get(37).getSemesterN()==S) {  
										checkBox20.show();
										checkBox20.setSelected(false);
										checkBox20.setText(re.getCoursesStats().get(37).getName());
										}
									if(re.getCoursesStats().get(38).getSemesterN()==S) {  
										checkBox21.show();
										checkBox21.setSelected(false);
										checkBox21.setText(re.getCoursesStats().get(38).getName());
										}
									
				}
				
				
			}

			public void Dioikisi(int S) {
				
				
					if(S==2) { //STO 2o EKSAMINO TA MATHIMATA EINAI IDIA ALLA THA EINAI TA IDIA KAI STIS DYO KATEYTHINSEIS 
						
						if(re.getCoursesStats().get(0).getSemesterN()==S) {  
							checkBox1.setSelected(false);
							checkBox1.setText(re.getCoursesStats().get(0).getName());
							
							}
							if(re.getCoursesStats().get(1).getSemesterN()==S) {
								checkBox2.setSelected(false);
								checkBox2.setText(re.getCoursesStats().get(1).getName());
								} 
							if(re.getCoursesStats().get(2).getSemesterN()==S) {
								checkBox3.setSelected(false);
								checkBox3.setText(re.getCoursesStats().get(2).getName());
								}
							
							if(re.getCoursesStats().get(3).getSemesterN()==S) {  
								checkBox4.setSelected(false);
								checkBox4.setText(re.getCoursesStats().get(3).getName());
								}
							if(re.getCoursesStats().get(4).getSemesterN()==S) {
								checkBox5.setSelected(false);
								checkBox5.setText(re.getCoursesStats().get(4).getName());
								}
							if(re.getCoursesStats().get(5).getSemesterN()==S) {
								checkBox6.setSelected(false);
								checkBox6.setText(re.getCoursesStats().get(5).getName());
								}
							checkBox7.hide();
							checkBox7.setSelected(false);
						
							checkBox8.hide();
							checkBox8.setSelected(false);
							
							checkBox9.hide();
							checkBox9.setSelected(false);
							
							checkBox10.hide();
							checkBox10.setSelected(false);
							
							checkBox11.hide();
							checkBox11.setSelected(false);
							
							checkBox12.hide();
							checkBox12.setSelected(false);
							
							checkBox13.hide();
							checkBox13.setSelected(false);
							
							checkBox14.hide();
							checkBox14.setSelected(false);
							
							checkBox15.hide();
							checkBox15.setSelected(false);
							
							checkBox16.hide();
							checkBox16.setSelected(false);
							
							checkBox17.hide();
							checkBox17.setSelected(false);
							
							checkBox18.hide();
							checkBox18.setSelected(false);
							
							checkBox19.hide();
							checkBox19.setSelected(false);
							
							checkBox20.hide();
							checkBox20.setSelected(false);
							
							checkBox21.hide();
							checkBox21.setSelected(false);
					}
					else if(S==4) {
						
						if(re.getCoursesStats().get(39).getSemesterN()==S) {  
							checkBox1.setSelected(false);
							checkBox1.setText(re.getCoursesStats().get(39).getName());
							}
							if(re.getCoursesStats().get(40).getSemesterN()==S) {  
								checkBox2.setSelected(false);
								checkBox2.setText(re.getCoursesStats().get(40).getName());
								} 
							if(re.getCoursesStats().get(41).getSemesterN()==S) {  
								checkBox3.setSelected(false);
								checkBox3.setText(re.getCoursesStats().get(41).getName());
								}
							
							if(re.getCoursesStats().get(42).getSemesterN()==S) {  
								checkBox4.setSelected(false);
								checkBox4.setText(re.getCoursesStats().get(42).getName());
								}
							if(re.getCoursesStats().get(43).getSemesterN()==S) {  
								checkBox5.setSelected(false);
								checkBox5.setText(re.getCoursesStats().get(43).getName());
								}
							
							checkBox6.hide();
							checkBox6.setSelected(false);
							
							checkBox7.hide();
							checkBox7.setSelected(false);
						
							checkBox8.hide();
							checkBox8.setSelected(false);
							
							checkBox9.hide();
							checkBox9.setSelected(false);
							
							checkBox10.hide();
							checkBox10.setSelected(false);
							
							checkBox11.hide();
							checkBox11.setSelected(false);
							
							checkBox12.hide();
							checkBox12.setSelected(false);
							
							checkBox13.hide();
							checkBox13.setSelected(false);
							
							checkBox14.hide();
							checkBox14.setSelected(false);
							
							checkBox15.hide();
							checkBox15.setSelected(false);
							
							checkBox16.hide();
							checkBox16.setSelected(false);
							
							checkBox17.hide();
							checkBox17.setSelected(false);
							
							checkBox18.hide();
							checkBox18.setSelected(false);
							
							checkBox19.hide();
							checkBox19.setSelected(false);
							
							checkBox20.hide();
							checkBox20.setSelected(false);
							
							checkBox21.hide();
							checkBox21.setSelected(false);
					}
					else if(S==6) {
						if(re.getCoursesStats().get(44).getSemesterN()==S) {  
							checkBox1.setSelected(false);
							checkBox1.setText(re.getCoursesStats().get(44).getName());
							}
							if(re.getCoursesStats().get(45).getSemesterN()==S) {
								checkBox2.setSelected(false);
								checkBox2.setText(re.getCoursesStats().get(45).getName());
								} 
							if(re.getCoursesStats().get(46).getSemesterN()==S) {
								checkBox3.setSelected(false);
								checkBox3.setText(re.getCoursesStats().get(46).getName());
								}
							
							if(re.getCoursesStats().get(47).getSemesterN()==S) {
								checkBox4.setSelected(false);
								checkBox4.setText(re.getCoursesStats().get(47).getName());
								}
							if(re.getCoursesStats().get(48).getSemesterN()==S) {
								checkBox5.setSelected(false);
								checkBox5.setText(re.getCoursesStats().get(48).getName());
								}
							if(re.getCoursesStats().get(49).getSemesterN()==S) {  
								checkBox6.show();
								checkBox6.setSelected(false);
								checkBox6.setText(re.getCoursesStats().get(49).getName());
								}
						    
							checkBox7.hide();
							checkBox7.setSelected(false);
						
							checkBox8.hide();
							checkBox8.setSelected(false);
							
							checkBox9.hide();
							checkBox9.setSelected(false);
							
							checkBox10.hide();
							checkBox10.setSelected(false);
							
							checkBox11.hide();
							checkBox11.setSelected(false);
							
							checkBox12.hide();
							checkBox12.setSelected(false);
							
							checkBox13.hide();
							checkBox13.setSelected(false);
							
							checkBox14.hide();
							checkBox14.setSelected(false);
							
							checkBox15.hide();
							checkBox15.setSelected(false);
							
							checkBox16.hide();
							checkBox16.setSelected(false);
							
							checkBox17.hide();
							checkBox17.setSelected(false);
							
							checkBox18.hide();
							checkBox18.setSelected(false);
							
							checkBox19.hide();
							checkBox19.setSelected(false);
							
							checkBox20.hide();
							checkBox20.setSelected(false);
							
							checkBox21.hide();
							checkBox21.setSelected(false);
						
					}
					else if(S==8) {

						if(re.getCoursesStats().get(50).getSemesterN()==S) {  
							checkBox1.setSelected(false);
							checkBox1.setText(re.getCoursesStats().get(50).getName());
							}
							if(re.getCoursesStats().get(51).getSemesterN()==S) {  
								checkBox2.setSelected(false);
								checkBox2.setText(re.getCoursesStats().get(51).getName());
								} 
							if(re.getCoursesStats().get(52).getSemesterN()==S) {
								checkBox3.setSelected(false);
								checkBox3.setText(re.getCoursesStats().get(52).getName());
								}
							
							if(re.getCoursesStats().get(53).getSemesterN()==S) {
								checkBox4.setSelected(false);
								checkBox4.setText(re.getCoursesStats().get(53).getName());
								}
							
							checkBox5.hide();
							checkBox5.setSelected(false);
							
							checkBox6.hide();
							checkBox6.setSelected(false);
							
							checkBox7.hide();
							checkBox7.setSelected(false);
						
							checkBox8.hide();
							checkBox8.setSelected(false);
							
							checkBox9.hide();
							checkBox9.setSelected(false);
							
							checkBox10.hide();
							checkBox10.setSelected(false);
							
							checkBox11.hide();
							checkBox11.setSelected(false);
							
							checkBox12.hide();
							checkBox12.setSelected(false);
							
							checkBox13.hide();
							checkBox13.setSelected(false);
							
							checkBox14.hide();
							checkBox14.setSelected(false);
							
							checkBox15.hide();
							checkBox15.setSelected(false);
							
							checkBox16.hide();
							checkBox16.setSelected(false);
							
							checkBox17.hide();
							checkBox17.setSelected(false);
							
							checkBox18.hide();
							checkBox18.setSelected(false);
							
							checkBox19.hide();
							checkBox19.setSelected(false);
							
							checkBox20.hide();
							checkBox20.setSelected(false);
							
							checkBox21.hide();
							checkBox21.setSelected(false);
					}
				
			}
			
			

			
		}//itemlistener
	

	
	class ActionHandler implements ActionListener{
		
		
		
		
		
		
		@Override
		public void actionPerformed(ActionEvent ae) {
			
			if(ae.getSource()==nextframebutton) {
				
				if (arrcourses.size()>0 && arrcourses.size()<=10) {
					new MyProfileGUI();
					
					frmInitScreen.setVisible(false);
				
				
				/*
				 * 
				 * 
				 *   KLHSH EPOMENOU PARATHIROU
				 *   UKAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
				 * 
				 * 
				 * 
				 */
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
				infotext.setText("tsekares to trito koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox5.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox6.isSelected()) {
				infotext.setText("tsekares to trito koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox6.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox7.isSelected()) {
				infotext.setText("tsekares to trito koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox7.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox8.isSelected()) {
				infotext.setText("tsekares to trito koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox8.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox9.isSelected()) {
				infotext.setText("tsekares to trito koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox9.getText());
					printAll(hashcourses, textcourses);
				}
			}
		
			if(checkBox10.isSelected()) {
				infotext.setText("tsekares to trito koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox10.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox11.isSelected()) {
				infotext.setText("tsekares to trito koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox11.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox12.isSelected()) {
				infotext.setText("tsekares to trito koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox12.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox13.isSelected()) {
				infotext.setText("tsekares to trito koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox13.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox14.isSelected()) {
				infotext.setText("tsekares to trito koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox14.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox15.isSelected()) {
				infotext.setText("tsekares to trito koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox15.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox16.isSelected()) {
				infotext.setText("tsekares to trito koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox16.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox17.isSelected()) {
				infotext.setText("tsekares to trito koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox17.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox18.isSelected()) {
				infotext.setText("tsekares to trito koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox18.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox19.isSelected()) {
				infotext.setText("tsekares to trito koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox19.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox20.isSelected()) {
				infotext.setText("tsekares to trito koutaki");
			     
				if(ae.getSource()==addbutton) {
					hashcourses.add(checkBox20.getText());
					printAll(hashcourses, textcourses);
				}
			}
			
			if(checkBox21.isSelected()) {
				infotext.setText("tsekares to trito koutaki");
			     
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

		   
		    
		  // System.out.println(arrcourses);
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

	

