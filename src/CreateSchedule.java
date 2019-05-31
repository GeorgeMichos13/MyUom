import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class CreateSchedule {
	
	JFrame schedulefrm;
	
	
	private ArrayList<JCheckBox> arrcboxes = new ArrayList<JCheckBox>(); //Array with all the checkboxes
	

	/**
	 * Launch occurs in class MainFrame
	 */
	 

	
	//@SuppressWarnings("unchecked")
	public CreateSchedule() {
		


		
		schedulefrm = new JFrame();
		schedulefrm.setTitle("Schedule");
		schedulefrm.getContentPane().setBackground(Color.LIGHT_GRAY);
				schedulefrm.getContentPane().setLayout(null);
		
		
		 
		  
		   
							
							
				
				JScrollPane scrollpane = new JScrollPane();
				scrollpane.setBounds(0, 0, 680, 401);
				scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				
					
					JLayeredPane panel = new JLayeredPane();
					scrollpane.setViewportView(panel);
					
					
	
					
				
					
						
						JCheckBox checkBox1 = new JCheckBox("Mathima 1.1");
						checkBox1.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox1);
						
						
						
						JCheckBox checkBox2 = new JCheckBox("Mathima 1.2");
						checkBox2.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox2);
						
						JCheckBox checkBox3 = new JCheckBox("Mathima 2.1");
						checkBox3.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox3);
						
						JCheckBox checkBox4 = new JCheckBox("Mathima 2.2");
						checkBox4.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox4);
					

						JCheckBox checkBox5 = new JCheckBox("Mathima 3.1");
						checkBox5.setVerticalAlignment(SwingConstants.TOP);
						arrcboxes.add(checkBox5);
						
						JCheckBox checkBox6 = new JCheckBox("Mathima 3.2");
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
						
						
						
						
						
						
						
						GroupLayout gl_panel = new GroupLayout(panel);
						gl_panel.setHorizontalGroup(
							gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(checkBox1, GroupLayout.PREFERRED_SIZE, 667, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox2, GroupLayout.PREFERRED_SIZE, 667, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox3, GroupLayout.PREFERRED_SIZE, 667, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox4, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox5, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox6, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox7, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox8, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox9, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE))
										.addComponent(checkBox10, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox11, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox12, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox13, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox14, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox15, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox16, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox17, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox18, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox19, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox20, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE))
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
						);
						gl_panel.setVerticalGroup(
							gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(35)
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
									.addGap(18)
									.addComponent(checkBox15, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(checkBox16, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(checkBox17, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(checkBox18, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(checkBox19, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addComponent(checkBox20, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
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
									.addComponent(checkBox30, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						);
						panel.setLayout(gl_panel);
						schedulefrm.getContentPane().add(scrollpane);
						
							
							
						
					
						

									
		
		schedulefrm.setSize(896, 504);
		schedulefrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	
	class ActionHandler implements ActionListener{
		
	
		
		@Override
		public void actionPerformed(ActionEvent ae) {
		/*	
			if(ae.getSource()==nextframebutton) {  
				
					
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
			
			*/
			
		}//actionPerformed
		

	} //actionListener
	
	
	
		ActionListener nextframebuttonListener = new ActionHandler();
		ActionListener checkboxListener = new ActionHandler();
		
		for(int i=0;i<arrcboxes.size();i++)
			arrcboxes.get(i).addActionListener(checkboxListener);
		
		//nextframebutton.addActionListener(nextframebuttonListener);
		
	
	}
}
