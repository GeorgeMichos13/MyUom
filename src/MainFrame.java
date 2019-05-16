import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
		programbutton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton mapsbutton = new JButton("Χάρτες");
		mapsbutton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton notesbutton = new JButton("Σημειώσεις");
		notesbutton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton infobutton = new JButton("Πληροφορίες");
		infobutton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton profilebutton = new JButton("Προφίλ");
		profilebutton.setFont(new Font("Tahoma", Font.BOLD, 16));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(profilebutton, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
					.addGap(74)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(programbutton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
						.addComponent(mapsbutton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
						.addComponent(infobutton, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
						.addComponent(notesbutton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(22)
					.addComponent(programbutton, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(mapsbutton, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(infobutton, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(profilebutton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
						.addComponent(notesbutton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		frmMainframe.getContentPane().setLayout(groupLayout);
		frmMainframe.setTitle("Mainframe");
		frmMainframe.setBounds(100, 100, 424, 280);
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
				if(ev.getSource() == programbutton){
					
					/*
					 * 
					 * Program()
					 */
				}
				else if(ev.getSource() == mapsbutton){
					
					/*
					 * 
					 * Maps()
					 */
				}
				else if(ev.getSource() == notesbutton) {
					
					/*
					 * Notes()
					 */
				}
				else if(ev.getSource() == infobutton) {
					
					/*
					 * Infos()
					 */
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
		
		
		programbutton.addActionListener(programbuttonlistener);
		mapsbutton.addActionListener(mapsbuttonlistener);
		notesbutton.addActionListener(notesbuttonlistener);
		infobutton.addActionListener(infobuttonlistener);
		profilebutton.addActionListener(profilebuttonlistener);
		
		
	}//mainframe
	
	
	
}//Mainframe
