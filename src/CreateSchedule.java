import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CreateSchedule {
	
	JFrame schedulefrm;
	
	
	private ArrayList<JCheckBox> arrcboxes = new ArrayList<JCheckBox>(); //Array with all the checkboxes
	private ArrayList<Course> FCourses = new ArrayList<Course>();
	private ArrayList<Course> FFCourses = new ArrayList<Course>();
	/**
	 * Launch occurs in class MainFrame
	 */
	 

	
	//@SuppressWarnings("unchecked")
	public CreateSchedule(ArrayList<Course> array) {
		
		this.FCourses.addAll(array);

		
		schedulefrm = new JFrame();
		schedulefrm.setBackground(Color.WHITE);
		schedulefrm.setTitle("Schedule");
		schedulefrm.getContentPane().setBackground(SystemColor.control);
				
		
		
				JButton backbutton = new JButton("Πίσω");
				JButton nextframebutton = new JButton("Εντάξει");
				JButton addactbutton = new JButton("Προσθήκη Νέας Δραστηριότητας");
				JButton clearbutton = new JButton("Καθαρισμός");
							
							
				
				JScrollPane scrollpane = new JScrollPane();
				scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				scrollpane.getVerticalScrollBar().setUnitIncrement(16);
				
					
				JLayeredPane panel = new JLayeredPane();
				
				scrollpane.setViewportView(panel);
					
					
					
						JCheckBox checkBox1 = new JCheckBox("");
						
						checkBox1.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox1);
						
						
						
						JCheckBox checkBox2 = new JCheckBox("");
						checkBox2.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox2);
						
						JCheckBox checkBox3 = new JCheckBox("");
						checkBox3.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox3);
						
						JCheckBox checkBox4 = new JCheckBox("");
						checkBox4.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox4);
					

						JCheckBox checkBox5 = new JCheckBox("");
						checkBox5.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox5);
						
						JCheckBox checkBox6 = new JCheckBox("");
						checkBox6.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox6);
						
						JCheckBox checkBox7 = new JCheckBox((String) null);
						checkBox7.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox7);
						
						JCheckBox checkBox8 = new JCheckBox((String) null);
						checkBox8.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox8);
						
						
						JCheckBox checkBox9 = new JCheckBox((String) null);
						checkBox9.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox9);
						
						JCheckBox checkBox10 = new JCheckBox((String) null);
						checkBox10.setVerticalAlignment(SwingConstants.TOP);
						
						arrcboxes.add(checkBox10);
						
						
						JCheckBox checkBox11 = new JCheckBox((String) null);
						checkBox11.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox11);
						
						JCheckBox checkBox12 = new JCheckBox((String) null);
						checkBox12.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox12);
						
						JCheckBox checkBox13 = new JCheckBox((String) null);
						checkBox13.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox13);
						
						JCheckBox checkBox14 = new JCheckBox((String) null);
						checkBox14.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox14);
						
						JCheckBox checkBox15 = new JCheckBox((String) null);
						checkBox15.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox15);
						
						
						JCheckBox checkBox16 = new JCheckBox((String) null);
						checkBox16.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox16);
						
						JCheckBox checkBox17 = new JCheckBox((String) null);
						checkBox17.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox17);
						
						JCheckBox checkBox18 = new JCheckBox((String) null);
						checkBox18.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox18);
						
						JCheckBox checkBox19 = new JCheckBox((String) null);
						checkBox19.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox19);
						
						JCheckBox checkBox20 = new JCheckBox((String) null);
						checkBox20.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox20);
						
						JCheckBox checkBox21= new JCheckBox((String) null);
						checkBox15.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox21);
						
						
						JCheckBox checkBox22 = new JCheckBox((String) null);
						checkBox16.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox22);
						
						JCheckBox checkBox23 = new JCheckBox((String) null);
						checkBox17.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox23);
						
						JCheckBox checkBox24 = new JCheckBox((String) null);
						checkBox18.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox24);
						
						JCheckBox checkBox25 = new JCheckBox((String) null);
						checkBox19.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox25);
						
						JCheckBox checkBox26 = new JCheckBox((String) null);
						checkBox20.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox26);
						
						JCheckBox checkBox27 = new JCheckBox((String) null);
						checkBox15.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox27);
						
						
						JCheckBox checkBox28 = new JCheckBox((String) null);
						checkBox16.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox28);
						
						JCheckBox checkBox29 = new JCheckBox((String) null);
						checkBox17.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox29);
						
						JCheckBox checkBox30 = new JCheckBox((String) null);
						checkBox18.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox30);
						
						for(JCheckBox cb :arrcboxes)
							cb.setFont(new Font("Tahoma", Font.PLAIN, 13));
						
						int k=0;
						int l=0;
						int j=0;
						int lasthour;
						boolean flag = false;
						for(int i=0;i<FCourses.size()-1;i++)
						{

							if(FCourses.get(i).getName().equals(FCourses.get(i+1).getName())==false || (FCourses.get(i+1).getHour() - FCourses.get(i).getHour() !=1) || FCourses.get(i).getClasss().equals(FCourses.get(i+1).getClasss())==false)
							{
								l = i;
								lasthour = FCourses.get(l).getHour()+1 ;
								arrcboxes.get(j).setText(FCourses.get(i).getName() + "  |  " + FCourses.get(i).getClasss() + "  |  "+ FCourses.get(i).getDayS() +"  |  " +FCourses.get(k).getHour() + ":00 - " + lasthour + ":00  |"  );
								j++;
								k = i+1;
							}
							
						}
						l = FCourses.size() -1;
						int i = FCourses.size() -1;
						while(!flag && FCourses.isEmpty()==false)
						{
							lasthour = FCourses.get(l).getHour()+1 ;
							if(FCourses.get(i).getName().equals(FCourses.get(i-1).getName())==false || (FCourses.get(i).getHour() - FCourses.get(i-1).getHour() !=1) || FCourses.get(i).getClasss().equals(FCourses.get(i-1).getClasss())==false)
							{
								flag = true;
								arrcboxes.get(j).setText(FCourses.get(i).getName()+ "  |  " + FCourses.get(i).getClasss() + "  |  "+ FCourses.get(i).getDayS() +"  |  " +FCourses.get(i).getHour() + ":00 - " + lasthour + ":00  |" );
								j++;
							}
							i--;
						}
						for(i=j;i<arrcboxes.size();i++)
						{
							arrcboxes.get(i).setVisible(false);
						}
						
						
						
						
											
						
						
						GroupLayout gl_panel = new GroupLayout(panel);
						gl_panel.setHorizontalGroup(
							gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(10)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
													.addComponent(checkBox1, GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
													.addGap(3))
												.addGroup(gl_panel.createSequentialGroup()
													.addComponent(checkBox2, GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
													.addGap(3))
												.addComponent(checkBox3, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox4, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox5, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox6, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox7, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox8, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox9, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox10, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox11, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox12, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox15, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox16, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox17, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox18, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox19, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox20, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox21, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox22, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox23, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox24, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox25, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox26, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox27, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox28, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox29, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox30, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox13, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox14, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_panel.createSequentialGroup()
											.addContainerGap()
											.addComponent(backbutton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
									.addGap(41)
									.addComponent(clearbutton)
									.addGap(31))
						);
						gl_panel.setVerticalGroup(
							gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(5)
											.addComponent(backbutton)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(checkBox1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(checkBox2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(checkBox3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(checkBox4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(checkBox5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(checkBox6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(checkBox7, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(checkBox8, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(checkBox9, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(checkBox10, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
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
											.addComponent(checkBox21, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(checkBox22, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(checkBox23, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(checkBox24, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(checkBox25, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(checkBox26, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(checkBox27, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(checkBox28, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(checkBox29, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
											.addComponent(checkBox30, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addContainerGap()
											.addComponent(clearbutton, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
									.addContainerGap(15, Short.MAX_VALUE))
						);
						panel.setLayout(gl_panel);
						
						
						
						
						GroupLayout groupLayout = new GroupLayout(schedulefrm.getContentPane());
						groupLayout.setHorizontalGroup(
							groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(scrollpane, GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
										.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
											.addContainerGap()
											.addComponent(addactbutton)
											.addPreferredGap(ComponentPlacement.RELATED, 543, Short.MAX_VALUE)
											.addComponent(nextframebutton, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
											.addGap(27)))
									.addGap(0))
						);
						groupLayout.setVerticalGroup(
							groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addComponent(scrollpane, GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(nextframebutton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
										.addComponent(addactbutton, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
									.addContainerGap())
						);
						schedulefrm.getContentPane().setLayout(groupLayout);
						
							
							
						
					
						

									
		
		schedulefrm.setSize(896, 504);
		schedulefrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		class ButtonHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ev) {
				
				
				
				if(ev.getSource() == clearbutton) {
					
					//Uncheck All Boxes
					System.out.println("eimai sthn grammh 413");
					
				}
			
				if(ev.getSource()==nextframebutton) {  
					
					
					for(int i=0;i<arrcboxes.size();i++)
					{
						if(arrcboxes.get(i).isSelected() && arrcboxes.get(i).isEnabled())
						{
							String cbText = arrcboxes.get(i).getText().substring(0,arrcboxes.get(i).getText().indexOf("|")-2);
							String temp2 = arrcboxes.get(i).getText().substring(arrcboxes.get(i).getText().indexOf("|")+3);
							String cbClass = temp2.substring(0,temp2.indexOf("|")-2);
							for(int j=0;j<FCourses.size();j++)
							{
								if(cbText.equals(FCourses.get(j).getName()) && cbClass.equals(FCourses.get(j).getClasss()))
								{
									FFCourses.add(FCourses.get(j));
								}
							}
						}
					}
					XlsWriter writer = new XlsWriter(FFCourses)	;
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
						schedulefrm.setVisible(false);
				}
				
				
				if(ev.getSource() ==backbutton) {
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
					schedulefrm.setVisible(false);
					
				}	
				
			
				if(ev.getSource() == addactbutton) {
					
					JTextField titlefield = new JTextField();
					JTextField dayfield = new JTextField();
					JTextField timefield = new JTextField();

					Object[] act = {
							"Τίτλος :", titlefield,
							"Μέρα(1=Δευτέρα, 5=Παρασκευή) :", dayfield,
							"Ώρα(8-21 :)", timefield
							};
					
					int option = JOptionPane.showConfirmDialog(null, act, "Προσθέστε Δραστηριότητα", JOptionPane.OK_CANCEL_OPTION);
					
					

						String title = titlefield.getText();
						String day = dayfield.getText();
						String time = timefield.getText();
						
						boolean emptyfields =(title.trim().equals("") || day.trim().equals("") || time.trim().equals(""));
						boolean invalidDayNumber = false; // Elegxos gia na deis oti einai enas mono arithmos apo to 1-5
						boolean invalidTime = false; //Elegxos gia lanthasmeni diarkeia drasthriothtas
						
						
						while((emptyfields || invalidDayNumber || invalidTime) && option ==JOptionPane.OK_OPTION) {
						
							JOptionPane.showMessageDialog(null, "Συμπλήρωσε σωστά τα κενά");
							option = JOptionPane.showConfirmDialog(null, act, "Προσθέστε Δραστηριότητα", JOptionPane.OK_CANCEL_OPTION);
							title = titlefield.getText();
							day = dayfield.getText();
							time = timefield.getText();
						}
						
						if(option ==JOptionPane.OK_OPTION) {
							
							
							//save data
							
							
						System.out.println("Saving Data...");
						}
						
				
					
				}//addactivitiesbutton
			}
		}//ButtonHandler
	
		
		
		
		
		class ActionHandler implements ActionListener{
		
	
		
		@Override
		public void actionPerformed(ActionEvent ae) {
			
			ArrayList<Course> selectedCourses = new ArrayList<Course>();

				JCheckBox selectedBox = ((JCheckBox) ae.getSource());
					String selectedCourse = selectedBox.getText().substring(0,selectedBox.getText().indexOf("|")-2);
					System.out.println(selectedCourse);
					String temp = selectedBox.getText().substring(selectedBox.getText().indexOf("|")+3);
					String selectedClass = temp.substring(0,temp.indexOf("|")-2);
					
					selectedBox.isEnabled();
					int selectedIndex=0;
					
					
					for(int i = 0;i<arrcboxes.size();i++)
					{
						if(arrcboxes.get(i).isSelected() && arrcboxes.get(i).isVisible())
						{
							selectedIndex = i;
						}
					}

					for(int k = 0;k<FCourses.size();k++)
					{
						if(FCourses.get(k).getName().equals(selectedCourse) && FCourses.get(k).getClasss().equals(selectedClass)) {
							selectedCourses.add(FCourses.get(k));

						}
						
					}
					if(selectedBox.isSelected())
					{
								for(int j=0;j<arrcboxes.size();j++)
								{	
									if(arrcboxes.get(j).isVisible()  )
									{	
										for(int k =0 ;k<selectedCourses.size();k++)
										{																			
											for(int l = 0;l<FCourses.size();l++)
											{										
												boolean identicalCourse = selectedCourses.get(k).equals(FCourses.get(l));
												boolean differentClass = selectedCourses.get(k).getName().equals(FCourses.get(l).getName()) && selectedCourses.get(k).getClasss().equals(FCourses.get(l).getClasss())==false;
												//System.out.println(identicalCourse +""+ samedaytime);
												//System.out.println(selectedCourses.get(k).toString() + FCourses.get(l).toString());
												String courseToDelete = FCourses.get(l).getName();
												String classToDelete = FCourses.get(l).getClasss();
												boolean samedaytime = selectedCourses.get(k).getDayS().equals(FCourses.get(l).getDayS()) && selectedCourses.get(k).getHour() == FCourses.get(l).getHour();
												String cbText = arrcboxes.get(j).getText().substring(0,arrcboxes.get(j).getText().indexOf("|")-2);
												String temp2 = arrcboxes.get(j).getText().substring(arrcboxes.get(j).getText().indexOf("|")+3);
												String cbClass = temp2.substring(0,temp2.indexOf("|")-2);
												if(cbText.equals(courseToDelete) && cbClass.equals(classToDelete) && (identicalCourse ==false) && samedaytime)
												{
													System.out.println(FCourses.get(l).getName() + "" +FCourses.get(l).getHour() + "" +FCourses.get(l).getDayS());
													System.out.println(samedaytime +""+ j + " " + k + " " + l);
													System.out.println(courseToDelete + cbText);
													//arrcboxes.get(j).setSelected(true);
													arrcboxes.get(j).setEnabled(false);
												
												}
												if(cbText.equals(courseToDelete) && identicalCourse ==false && differentClass && j!=selectedIndex)
												{
													System.out.println(courseToDelete + cbText);
													arrcboxes.get(j).setSelected(true);
													arrcboxes.get(j).setEnabled(false);								
												}
												samedaytime = false;
										
											}		
										}
									}
								}
					}
					if(selectedBox.isSelected()==false)
					{
								for(int j=0;j<arrcboxes.size();j++)
								{	
									if(arrcboxes.get(j).isVisible()  )
									{	
										for(int k =0 ;k<selectedCourses.size();k++)
										{																			
											for(int l = 0;l<FCourses.size();l++)
											{										
												boolean identicalCourse = selectedCourses.get(k).equals(FCourses.get(l));
												boolean differentClass = selectedCourses.get(k).getName().equals(FCourses.get(l).getName()) && selectedCourses.get(k).getClasss().equals(FCourses.get(l).getClasss())==false;
												//System.out.println(identicalCourse +""+ samedaytime);
												//System.out.println(selectedCourses.get(k).toString() + FCourses.get(l).toString());
												String courseToDelete = FCourses.get(l).getName();
												String classToDelete = FCourses.get(l).getClasss();
												boolean samedaytime = selectedCourses.get(k).getDayS().equals(FCourses.get(l).getDayS()) && selectedCourses.get(k).getHour() == FCourses.get(l).getHour();
												String cbText = arrcboxes.get(j).getText().substring(0,arrcboxes.get(j).getText().indexOf("|")-2);
												String temp2 = arrcboxes.get(j).getText().substring(arrcboxes.get(j).getText().indexOf("|")+3);
												String cbClass = temp2.substring(0,temp2.indexOf("|")-2);
												if(cbText.equals(courseToDelete) && cbClass.equals(classToDelete) && (identicalCourse ==false) && samedaytime && arrcboxes.get(j).isSelected())
												{
													//arrcboxes.get(j).setSelected(true);
													arrcboxes.get(j).setEnabled(true);
												}
												if(cbText.equals(courseToDelete)  && identicalCourse ==false && differentClass)
												{
													arrcboxes.get(j).setEnabled(true);	
													arrcboxes.get(j).setSelected(false);								
												}
												samedaytime = false;
											}		
										}
									}
								}
					}
									
							/*if(!identicalCourse && differentClass)
							{
								for(int j=0;j<arrcboxes.size();j++)
								{
									if(arrcboxes.get(j).isVisible())
									{									
										String courseToCompare = arrcboxes.get(j).getText().substring(0,arrcboxes.get(j).getText().indexOf("|")-2);
										if(selectedCourse.equals(courseToCompare))
										{
											arrcboxes.get(j).setSelected(true);
											arrcboxes.get(j).setEnabled(false);
										}
									}
									
								}
							}*/
							
					
				
			
				
			
			
				
	
	
			
			
		}//actionPerformed
		

	} //ActionHanlder
	
	
	
		ActionListener nextframebuttonListener = new ButtonHandler();
		ActionListener checkboxListener = new ActionHandler();
		ActionListener backbuttonlistener = new ButtonHandler();
		ActionListener addactbuttonlistener = new ButtonHandler();
		ActionListener clearbuttonlistener = new ButtonHandler();
		
		for( i=0;i<arrcboxes.size();i++)
			arrcboxes.get(i).addActionListener(checkboxListener);
		
		backbutton.addActionListener(backbuttonlistener);
		nextframebutton.addActionListener(nextframebuttonListener);
		addactbutton.addActionListener(addactbuttonlistener);
		clearbutton.addActionListener(clearbuttonlistener);
	}
}
