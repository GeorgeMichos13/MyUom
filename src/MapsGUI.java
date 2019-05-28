import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class MapsGUI extends JFrame {

	private JPanel contentPane;
	private static final int lbw = 1235;     //Label's width
	private static final int lbh = 749;     //Label's height

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();
	

	/**
	 * Create the frame.
	 */
	public MapsGUI() {
		setTitle("Maps");
		setSize(screenSize);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setSize(screenSize);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		
		
		JLabel ml1 = new JLabel("");
		Image map1 = new ImageIcon(this.getClass().getResource("/001.jpg")).getImage();
		ml1.setIcon(new ImageIcon(new ImageIcon(map1).getImage().getScaledInstance(lbw, lbh, Image.SCALE_DEFAULT)));
		
		JLabel ml2 = new JLabel("");
		Image map2 = new ImageIcon(this.getClass().getResource("/002.jpg")).getImage();
		ml2.setIcon(new ImageIcon(new ImageIcon(map2).getImage().getScaledInstance(lbw, lbh, Image.SCALE_DEFAULT)));
		
		
		
		
		
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(ml1, GroupLayout.DEFAULT_SIZE, 1235, Short.MAX_VALUE)
					.addGap(1407))
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(ml2, GroupLayout.PREFERRED_SIZE, 1235, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(ml1, GroupLayout.PREFERRED_SIZE, 749, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ml2, GroupLayout.PREFERRED_SIZE, 749, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(333, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1254, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
		
	
	/*	
		
		
		
		JLabel maplbl1 = new JLabel("");
		maplbl1.setHorizontalAlignment(SwingConstants.CENTER);
		//Image map1 = new ImageIcon(this.getClass().getResource("/001.jpg")).getImage();
		//maplbl1.setIcon(new ImageIcon(new ImageIcon(map1).getImage().getScaledInstance(lbw, lbh, Image.SCALE_DEFAULT)));
	
		
		
		
		JLabel maplbl2 = new JLabel("map2");
		maplbl2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel maplbl3 = new JLabel("map3");
		maplbl3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel maplbl4 = new JLabel("");
		maplbl4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel maplbl5 = new JLabel("map2");
		maplbl5.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel maplbl6 = new JLabel("map3");
		maplbl6.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel maplbl7 = new JLabel("map4");
		maplbl7.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel maplbl8 = new JLabel("");
		maplbl8.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel maplbl9 = new JLabel("map2");
		maplbl9.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel maplbl10 = new JLabel("map3");
		maplbl10.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		JLabel maplbl11 = new JLabel("");
		maplbl11.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel maplbl12 = new JLabel("map2");
		maplbl12.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel maplbl13 = new JLabel("map3");
		maplbl13.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel maplbl14 = new JLabel("map4");
		maplbl14.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JLabel maplbl15 = new JLabel("map4");
		maplbl15.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
	
		*/
		
		
		
	}
}
