import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class MapsGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();   //save current screen resolution
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();
	

	/**
	 * Create the frame.
	 */
	public MapsGUI() {
		setTitle("Maps");
		setSize(screenSize); //make it fullscreen window
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);  //go back to mainframe
		
		contentPane = new JPanel();
			setContentPane(contentPane);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			scrollPane.setSize(screenSize);
			
			JPanel panel = new JPanel();
			scrollPane.setViewportView(panel);
			
	/*
	 * create & set up images and labels containing them	
	 */
			JLabel ml1 = new JLabel("");
			Image map1 = new ImageIcon(this.getClass().getResource("/001.jpg")).getImage();
			// set label icon as the Map image, scaled properly to prevent image distortion
			ml1.setIcon(new ImageIcon(new ImageIcon(map1).getImage().getScaledInstance((int) width, (int)height, Image.SCALE_SMOOTH))); 
			
			JLabel ml2 = new JLabel("");
			Image map2 = new ImageIcon(this.getClass().getResource("/002.jpg")).getImage();
			ml2.setIcon(new ImageIcon(new ImageIcon(map2).getImage().getScaledInstance((int) width, (int)height, Image.SCALE_SMOOTH)));
			
			
			JLabel ml3 = new JLabel("");
			Image map3 = new ImageIcon(this.getClass().getResource("/003.jpg")).getImage();
			ml3.setIcon(new ImageIcon(new ImageIcon(map3).getImage().getScaledInstance((int) width, (int)height, Image.SCALE_SMOOTH)));
			
			JLabel ml4 = new JLabel("");
			Image map4 = new ImageIcon(this.getClass().getResource("/004.jpg")).getImage();
			ml4.setIcon(new ImageIcon(new ImageIcon(map4).getImage().getScaledInstance((int) width, (int)height, Image.SCALE_SMOOTH)));
			
			JLabel ml5 = new JLabel("");
			Image map5 = new ImageIcon(this.getClass().getResource("/005.jpg")).getImage();
			ml5.setIcon(new ImageIcon(new ImageIcon(map5).getImage().getScaledInstance((int) width, (int)height, Image.SCALE_SMOOTH)));
			
			JLabel ml6 = new JLabel("");
			Image map6 = new ImageIcon(this.getClass().getResource("/006.jpg")).getImage();
			ml6.setIcon(new ImageIcon(new ImageIcon(map6).getImage().getScaledInstance((int) width, (int)height, Image.SCALE_SMOOTH)));
			
			JLabel ml7 = new JLabel("");
			Image map7 = new ImageIcon(this.getClass().getResource("/007.jpg")).getImage();
			ml7.setIcon(new ImageIcon(new ImageIcon(map7).getImage().getScaledInstance((int) width, (int)height, Image.SCALE_SMOOTH)));
			
			JLabel ml8 = new JLabel("");
			Image map8 = new ImageIcon(this.getClass().getResource("/008.jpg")).getImage();
			ml8.setIcon(new ImageIcon(new ImageIcon(map8).getImage().getScaledInstance((int) width, (int)height, Image.SCALE_SMOOTH)));
			
			JLabel ml9 = new JLabel("");
			Image map9 = new ImageIcon(this.getClass().getResource("/009.jpg")).getImage();
			ml9.setIcon(new ImageIcon(new ImageIcon(map9).getImage().getScaledInstance((int) width, (int)height, Image.SCALE_SMOOTH)));
			
			JLabel ml10 = new JLabel("");
			Image map10 = new ImageIcon(this.getClass().getResource("/010.jpg")).getImage();
			ml10.setIcon(new ImageIcon(new ImageIcon(map10).getImage().getScaledInstance((int) width, (int)height, Image.SCALE_SMOOTH)));
			
			JLabel ml11 = new JLabel("");
			Image map11 = new ImageIcon(this.getClass().getResource("/011.jpg")).getImage();
			ml11.setIcon(new ImageIcon(new ImageIcon(map11).getImage().getScaledInstance((int) width, (int)height, Image.SCALE_SMOOTH)));
			
			JLabel ml12 = new JLabel("");
			Image map12 = new ImageIcon(this.getClass().getResource("/012.jpg")).getImage();
			ml12.setIcon(new ImageIcon(new ImageIcon(map12).getImage().getScaledInstance((int) width, (int)height, Image.SCALE_SMOOTH)));
			
			JLabel ml13 = new JLabel("");
			Image map13 = new ImageIcon(this.getClass().getResource("/013.jpg")).getImage();
			ml13.setIcon(new ImageIcon(new ImageIcon(map13).getImage().getScaledInstance((int) width, (int)height, Image.SCALE_SMOOTH)));
			
			JLabel ml14 = new JLabel("");
			Image map14 = new ImageIcon(this.getClass().getResource("/014.jpg")).getImage();
			ml14.setIcon(new ImageIcon(new ImageIcon(map14).getImage().getScaledInstance((int) width, (int)height, Image.SCALE_SMOOTH)));
			
			JLabel ml15 = new JLabel("");
			Image map15 = new ImageIcon(this.getClass().getResource("/015.jpg")).getImage();
			ml5.setIcon(new ImageIcon(new ImageIcon(map15).getImage().getScaledInstance((int) width, (int)height, Image.SCALE_SMOOTH)));
			
			
			
			
			
			GroupLayout gl_panel = new GroupLayout(panel);  //graphics 
			gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addComponent(ml1, GroupLayout.DEFAULT_SIZE, (int)width, Short.MAX_VALUE)
						.addGap(0))
						.addComponent(ml2, GroupLayout.PREFERRED_SIZE,  (int)width, GroupLayout.PREFERRED_SIZE)
						.addGap(0)
						.addComponent(ml3, GroupLayout.PREFERRED_SIZE,  (int)width, GroupLayout.PREFERRED_SIZE)
						.addGap(0)
						.addComponent(ml4, GroupLayout.PREFERRED_SIZE,  (int)width, GroupLayout.PREFERRED_SIZE)
						.addGap(0)
						.addComponent(ml5, GroupLayout.PREFERRED_SIZE,  (int)width, GroupLayout.PREFERRED_SIZE)
						.addGap(0)
						.addComponent(ml6, GroupLayout.PREFERRED_SIZE,  (int)width, GroupLayout.PREFERRED_SIZE)
						.addGap(0)
						.addComponent(ml7, GroupLayout.PREFERRED_SIZE,  (int)width, GroupLayout.PREFERRED_SIZE)
						.addGap(0)
						.addComponent(ml8, GroupLayout.PREFERRED_SIZE,  (int)width, GroupLayout.PREFERRED_SIZE)
						.addGap(0)
						.addComponent(ml9, GroupLayout.PREFERRED_SIZE,  (int)width, GroupLayout.PREFERRED_SIZE)
						.addGap(0)
						.addComponent(ml10, GroupLayout.PREFERRED_SIZE,  (int)width, GroupLayout.PREFERRED_SIZE)
						.addGap(0)
						.addComponent(ml11, GroupLayout.PREFERRED_SIZE,  (int)width, GroupLayout.PREFERRED_SIZE)
						.addGap(0)
						.addComponent(ml12, GroupLayout.PREFERRED_SIZE,  (int)width, GroupLayout.PREFERRED_SIZE)
						.addGap(0)
						.addComponent(ml13, GroupLayout.PREFERRED_SIZE,  (int)width, GroupLayout.PREFERRED_SIZE)
						.addGap(0)
						.addComponent(ml14, GroupLayout.PREFERRED_SIZE,  (int)width, GroupLayout.PREFERRED_SIZE)
						.addGap(0)
						.addComponent(ml15, GroupLayout.PREFERRED_SIZE,  (int)width, GroupLayout.PREFERRED_SIZE)
						
				
						
					
			);
			gl_panel.setVerticalGroup(  //graphics in the other dimention 
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addComponent(ml1, GroupLayout.PREFERRED_SIZE, (int)height, GroupLayout.PREFERRED_SIZE)
						
						.addComponent(ml2, GroupLayout.PREFERRED_SIZE, (int)height, GroupLayout.PREFERRED_SIZE)
						.addComponent(ml3, GroupLayout.PREFERRED_SIZE, (int)height, GroupLayout.PREFERRED_SIZE)
						.addComponent(ml4, GroupLayout.PREFERRED_SIZE, (int)height, GroupLayout.PREFERRED_SIZE)
						.addComponent(ml5, GroupLayout.PREFERRED_SIZE, (int)height, GroupLayout.PREFERRED_SIZE)
						.addComponent(ml6, GroupLayout.PREFERRED_SIZE, (int)height, GroupLayout.PREFERRED_SIZE)
						.addComponent(ml7, GroupLayout.PREFERRED_SIZE, (int)height, GroupLayout.PREFERRED_SIZE)
						.addComponent(ml8, GroupLayout.PREFERRED_SIZE, (int)height, GroupLayout.PREFERRED_SIZE)
						.addComponent(ml9, GroupLayout.PREFERRED_SIZE, (int)height, GroupLayout.PREFERRED_SIZE)
						.addComponent(ml10, GroupLayout.PREFERRED_SIZE, (int)height, GroupLayout.PREFERRED_SIZE)
						.addComponent(ml11, GroupLayout.PREFERRED_SIZE, (int)height, GroupLayout.PREFERRED_SIZE)
						.addComponent(ml12, GroupLayout.PREFERRED_SIZE, (int)height, GroupLayout.PREFERRED_SIZE)
						.addComponent(ml13, GroupLayout.PREFERRED_SIZE, (int)height, GroupLayout.PREFERRED_SIZE)
						.addComponent(ml14, GroupLayout.PREFERRED_SIZE, (int)height, GroupLayout.PREFERRED_SIZE)
						.addComponent(ml15, GroupLayout.PREFERRED_SIZE, (int)height, GroupLayout.PREFERRED_SIZE)
						
						)
			);
			panel.setLayout(gl_panel);
			GroupLayout gl_contentPane = new GroupLayout(contentPane);
			gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, (int) width, Short.MAX_VALUE)
			);
			gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, (int) height , Short.MAX_VALUE)
			);
			contentPane.setLayout(gl_contentPane);
			
		
		
			
			
			
		}
	}
