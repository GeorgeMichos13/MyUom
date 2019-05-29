import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class MainFrame {

	public JFrame frmMainframe;

	/**
	 * Launch occurs in CheckBoxGUI
	 */
	
	/**
	 * Create the application.
	 */
	public MainFrame() {
		
		frmMainframe = new JFrame();
		frmMainframe.pack();
		frmMainframe.setLocationRelativeTo(null);
		frmMainframe.getContentPane().setBackground(SystemColor.activeCaption);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		
		
		GroupLayout groupLayout = new GroupLayout(frmMainframe.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
		);
		
		JButton programbutton = new JButton("Πρόγραμμα");
		programbutton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		programbutton.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image program_img = new ImageIcon(this.getClass().getResource("/schedule.png")).getImage();
		programbutton.setIcon(new ImageIcon(program_img));
		
		JButton mapsbutton = new JButton("Χάρτες");
		mapsbutton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		mapsbutton.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image maps_img = new ImageIcon(this.getClass().getResource("/maps.png")).getImage();
		mapsbutton.setIcon(new ImageIcon(maps_img));
		
		JButton notesbutton = new JButton("Σημειώσεις");
		notesbutton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		notesbutton.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image notes_img = new ImageIcon(this.getClass().getResource("/notes.png")).getImage();
		notesbutton.setIcon(new ImageIcon(notes_img));
		
		JButton infobutton = new JButton("Πληροφορίες");
		infobutton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		infobutton.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image info_img = new ImageIcon(this.getClass().getResource("/info.png")).getImage();
		infobutton.setIcon(new ImageIcon(info_img));
		
		JButton profilebutton = new JButton("Προφίλ");
		profilebutton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		profilebutton.setFont(new Font("Tahoma", Font.BOLD, 16));
		Image profile_img = new ImageIcon(this.getClass().getResource("/profile.png")).getImage();
		profilebutton.setIcon(new ImageIcon(profile_img));
		
		JButton timerbutton = new JButton("Timers");
		timerbutton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		timerbutton.setForeground(UIManager.getColor("CheckBox.foreground"));
		timerbutton.setBackground(UIManager.getColor("Button.background"));
		timerbutton.setFont(new Font("Tahoma", Font.BOLD, 16));
		Image timer_img = new ImageIcon(this.getClass().getResource("/timer.png")).getImage();
		timerbutton.setIcon(new ImageIcon(timer_img));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(timerbutton, GroupLayout.PREFERRED_SIZE, 143, Short.MAX_VALUE)
						.addComponent(profilebutton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(74)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(programbutton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
						.addComponent(mapsbutton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
						.addComponent(infobutton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(notesbutton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(timerbutton, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addComponent(programbutton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(mapsbutton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(infobutton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(profilebutton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(notesbutton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		frmMainframe.getContentPane().setLayout(groupLayout);
		frmMainframe.setTitle("Mainframe");
		frmMainframe.setSize(720, 480);
		frmMainframe.setLocationRelativeTo(null);
		frmMainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmMainframe.addComponentListener(new ComponentListener() {

            @Override
            public void componentHidden(ComponentEvent arg0) {
            }

            @Override
            public void componentMoved(ComponentEvent arg0) {
            }

            @Override
            public void componentResized(ComponentEvent arg0) {
                int width = frmMainframe.getWidth();
                int height = frmMainframe.getHeight();
      
                mapsbutton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, (width + height) / 40));
                programbutton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, (width + height) / 40));
                infobutton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, (width + height) / 40));
                notesbutton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, (width + height) / 40));
                profilebutton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, (width + height) / 40));
                frmMainframe.getContentPane().revalidate();
            }

            @Override
            public void componentShown(ComponentEvent e) {

            }
        });
		
		class ActionHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ev) {
				
				
				if(ev.getSource() == programbutton){ //Schedule 
					
					frmMainframe.setVisible(false);
					EventQueue.invokeLater(new Runnable() {
						public void run() {		
							try {
								CreateSchedule schedulewindow = new CreateSchedule();
								schedulewindow.schedulefrm.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
								System.out.println("den anoikse");
							}
						}
					});
					
				}
				
				
				
				else if (ev.getSource() == timerbutton) {
					frmMainframe.setVisible(false);
					JFrame frame = new JFrame();
					Timer gui = new Timer(frame);
				}
				else if(ev.getSource() == mapsbutton){
					
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								frmMainframe.setVisible(false);
								
								MapsGUI mapsframe = new MapsGUI();
								mapsframe.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else if(ev.getSource() == notesbutton) {
					frmMainframe.setVisible(false);
					
					MyProfile profilewindow = new MyProfile();
					notesGUI s1 = new notesGUI(profilewindow.getCourses()) ;
					
				}
				else if(ev.getSource() == infobutton) {
					frmMainframe.setVisible(false);
					MyProfile profilewindow = new MyProfile();
					new InformationGUI(profilewindow.getCourses());
				}
				else if(ev.getSource() == profilebutton) {
					
					
					frmMainframe.setVisible(false);
					
					EventQueue.invokeLater(new Runnable() { //Go to My Profile
						public void run() {
							try {
								MyProfileGUI profilewindow = new MyProfileGUI();
								
								profilewindow.myProfilePanel.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					
				}
					
				
			}//actionPerformed
			
		}//ActionListener
		
		ActionListener programbuttonlistener = new ActionHandler();
		ActionListener mapsbuttonlistener = new ActionHandler();
		ActionListener notesbuttonlistener = new ActionHandler();
		ActionListener infobuttonlistener = new ActionHandler();
		ActionListener profilebuttonlistener = new ActionHandler();
		ActionListener timerbuttonlistener = new ActionHandler();
		
		
		
		programbutton.addActionListener(programbuttonlistener);
		mapsbutton.addActionListener(mapsbuttonlistener);
		notesbutton.addActionListener(notesbuttonlistener);
		infobutton.addActionListener(infobuttonlistener);
		profilebutton.addActionListener(profilebuttonlistener);
		timerbutton.addActionListener(timerbuttonlistener);
		
		
	}//mainframe
}//Mainframe
