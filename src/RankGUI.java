
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class RankGUI extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JPanel rankGuiPanel;
	private JSlider slider1;
	private JSlider slider2;
	private JSlider slider3;
	private JSlider slider4;
	private JSlider slider5;
	private JSlider slider6;
	private JSlider slider7;
	private JSlider slider8;
	private JSlider slider9;
	private JSlider slider10;
	private JTextField field1;
	private JTextField field2;
	private JTextField field3;
	private JTextField field4;
	private JTextField field5;
	private JTextField field6;
	private JTextField field7;
	private JTextField field8;
	private JTextField field9;
	private JTextField field10;
	private JButton backButton;
	public static ArrayList<Integer> ranks = new ArrayList<Integer>();
	
	
	
	public RankGUI() {
		
		rankGuiPanel = new JPanel();
		backButton = new JButton("Back");
		rankGuiPanel.add(backButton);
		
		slider1 = new JSlider(JSlider.HORIZONTAL,1,5,3);
		slider1.addChangeListener(new SliderListener());
		
		slider2 = new JSlider(JSlider.HORIZONTAL,1,5,3);
		slider2.addChangeListener(new SliderListener());
		
		slider3 = new JSlider(JSlider.HORIZONTAL,1,5,3);
		slider3.addChangeListener(new SliderListener());
		
		slider4 = new JSlider(JSlider.HORIZONTAL,1,5,3);
		slider4.addChangeListener(new SliderListener());
		
		slider5 = new JSlider(JSlider.HORIZONTAL,1,5,3);
		slider5.addChangeListener(new SliderListener());
		
		slider6 = new JSlider(JSlider.HORIZONTAL,1,5,3);
		slider6.addChangeListener(new SliderListener());
		
		slider7 = new JSlider(JSlider.HORIZONTAL,1,5,3);
		slider7.addChangeListener(new SliderListener());
		
		slider8 = new JSlider(JSlider.HORIZONTAL,1,5,3);
		slider8.addChangeListener(new SliderListener());
		
		slider9 = new JSlider(JSlider.HORIZONTAL,1,5,3);
		slider9.addChangeListener(new SliderListener());
		
		slider10 = new JSlider(JSlider.HORIZONTAL,1,5,3);
		slider10.addChangeListener(new SliderListener());

		
		slider1.setMajorTickSpacing(1);
		slider1.setMinorTickSpacing(1);
		slider1.setPaintTicks(true);
		slider1.setPaintLabels(true);
		
		slider2.setMajorTickSpacing(1);
		slider2.setMinorTickSpacing(1);
		slider2.setPaintTicks(true);
		slider2.setPaintLabels(true);
		
		slider3.setMajorTickSpacing(1);
		slider3.setMinorTickSpacing(1);
		slider3.setPaintTicks(true);
		slider3.setPaintLabels(true);
		
		slider4.setMajorTickSpacing(1);
		slider4.setMinorTickSpacing(1);
		slider4.setPaintTicks(true);
		slider4.setPaintLabels(true);
		
		slider5.setMajorTickSpacing(1);
		slider5.setMinorTickSpacing(1);
		slider5.setPaintTicks(true);
		slider5.setPaintLabels(true);
		
		slider6.setMajorTickSpacing(1);
		slider6.setMinorTickSpacing(1);
		slider6.setPaintTicks(true);
		slider6.setPaintLabels(true);
		
		slider7.setMajorTickSpacing(1);
		slider7.setMinorTickSpacing(1);
		slider7.setPaintTicks(true);
		slider7.setPaintLabels(true);
		
		slider8.setMajorTickSpacing(1);
		slider8.setMinorTickSpacing(1);
		slider8.setPaintTicks(true);
		slider8.setPaintLabels(true);
		
		slider9.setMajorTickSpacing(1);
		slider9.setMinorTickSpacing(1);
		slider9.setPaintTicks(true);
		slider9.setPaintLabels(true);
		
		slider10.setMajorTickSpacing(1);
		slider10.setMinorTickSpacing(1);
		slider10.setPaintTicks(true);
		slider10.setPaintLabels(true);
		
		field1 = new JTextField ("������1");
		field2 = new JTextField ("������1");
		field3 = new JTextField ("������1");
		field4 = new JTextField ("������1");
		field5 = new JTextField ("������1");
		field6 = new JTextField ("������1");
		field7 = new JTextField ("������1");
		field8 = new JTextField ("������1");
		field9 = new JTextField ("������1");
		field10 = new JTextField ("������1");
		
		field1.setEditable(false);
		field2.setEditable(false);
		field3.setEditable(false);
		field4.setEditable(false);
		field5.setEditable(false);
		field6.setEditable(false);
		field7.setEditable(false);
		field8.setEditable(false);
		field9.setEditable(false);
		field10.setEditable(false);
		
		int count = 5;
		
		for (int i = 1; i <= count; i++) {
			if(i == 1) {
				rankGuiPanel.add(field1);
				rankGuiPanel.add(slider1);
			}else if(i == 2) {
				rankGuiPanel.add(field2);
				rankGuiPanel.add(slider2);
			}else if(i == 3) {
				rankGuiPanel.add(field3);
				rankGuiPanel.add(slider3);
			}else if(i == 4) {
				rankGuiPanel.add(field4);
				rankGuiPanel.add(slider4);
			}else if(i == 5) {
				rankGuiPanel.add(field5);
				rankGuiPanel.add(slider5);
			}else if(i == 6) {
				rankGuiPanel.add(field6);
				rankGuiPanel.add(slider6);
			}else if(i == 7) {
				rankGuiPanel.add(field7);
				rankGuiPanel.add(slider7);
			}else if(i == 8) {
				rankGuiPanel.add(field8);
				rankGuiPanel.add(slider8);
			}else if(i == 9) {
				rankGuiPanel.add(field9);
				rankGuiPanel.add(slider9);
			}else if(i == 10) {
				rankGuiPanel.add(field10);
				rankGuiPanel.add(slider10);
			}
		}
		
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent back) {
				setVisible(false);
				new MyProfileGUI(); 
			}
			
		});
		
		this.setContentPane(rankGuiPanel);
		this.setVisible(true);
		this.setSize(250,500);
		this.setTitle("����������� ���������");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class SliderListener implements ChangeListener {
	    public void stateChanged(ChangeEvent e) {
	    	int rank = 0;
	        JSlider source = (JSlider)e.getSource();
	        if (!source.getValueIsAdjusting()) {
	            rank = (int)source.getValue();
	        }
	        System.out.println(rank);
	    }
	}

}
