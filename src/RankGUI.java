
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
	public static Integer[] ranks = new Integer[10];
	private static ArrayList<String> courses = new ArrayList<String>();
	
	
	
	public RankGUI() {
		MyProfile profilewindow = new MyProfile();
		courses = profilewindow.getCourses();
		rankGuiPanel = new JPanel();
		backButton = new JButton("Back");
		rankGuiPanel.add(backButton);
	
		
		slider1 = new JSlider(JSlider.HORIZONTAL,1,5,1);
		slider1.addChangeListener(new SliderListener1());
		
		slider2 = new JSlider(JSlider.HORIZONTAL,1,5,1);
		slider2.addChangeListener(new SliderListener2());
		
		slider3 = new JSlider(JSlider.HORIZONTAL,1,5,1);
		slider3.addChangeListener(new SliderListener3());
		
		slider4 = new JSlider(JSlider.HORIZONTAL,1,5,1);
		slider4.addChangeListener(new SliderListener4());
		
		slider5 = new JSlider(JSlider.HORIZONTAL,1,5,1);
		slider5.addChangeListener(new SliderListener5());
		
		slider6 = new JSlider(JSlider.HORIZONTAL,1,5,1);
		slider6.addChangeListener(new SliderListener6());
		
		slider7 = new JSlider(JSlider.HORIZONTAL,1,5,1);
		slider7.addChangeListener(new SliderListener7());
		
		slider8 = new JSlider(JSlider.HORIZONTAL,1,5,1);
		slider8.addChangeListener(new SliderListener8());
		
		slider9 = new JSlider(JSlider.HORIZONTAL,1,5,1);
		slider9.addChangeListener(new SliderListener9());
		
		slider10 = new JSlider(JSlider.HORIZONTAL,1,5,1);
		slider10.addChangeListener(new SliderListener10());

		
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
		
		field1 = new JTextField ("");
		field2 = new JTextField ("");
		field3 = new JTextField ("");
		field4 = new JTextField ("");
		field5 = new JTextField ("");
		field6 = new JTextField ("");
		field7 = new JTextField ("");
		field8 = new JTextField ("");
		field9 = new JTextField ("");
		field10 = new JTextField ("");
		
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
		
		
		
		for (int i = 1; i <= courses.size(); i++) {
			if(i == 1) {
				field1.setText(courses.get(i-1));
				rankGuiPanel.add(field1);
				rankGuiPanel.add(slider1);
			}else if(i == 2) {
				field2.setText(courses.get(i-1));
				rankGuiPanel.add(field2);
				rankGuiPanel.add(slider2);
			}else if(i == 3) {
				field3.setText(courses.get(i-1));
				rankGuiPanel.add(field3);
				rankGuiPanel.add(slider3);
			}else if(i == 4) {
				field4.setText(courses.get(i-1));
				rankGuiPanel.add(field4);
				rankGuiPanel.add(slider4);
			}else if(i == 5) {
				field5.setText(courses.get(i-1));
				rankGuiPanel.add(field5);
				rankGuiPanel.add(slider5);
			}else if(i == 6) {
				field6.setText(courses.get(i-1));
				rankGuiPanel.add(field6);
				rankGuiPanel.add(slider6);
			}else if(i == 7) {
				field7.setText(courses.get(i-1));
				rankGuiPanel.add(field7);
				rankGuiPanel.add(slider7);
			}else if(i == 8) {
				field8.setText(courses.get(i-1));
				rankGuiPanel.add(field8);
				rankGuiPanel.add(slider8);
			}else if(i == 9) {
				field9.setText(courses.get(i-1));
				rankGuiPanel.add(field9);
				rankGuiPanel.add(slider9);
			}else if(i == 10) {
				field10.setText(courses.get(i-1));
				rankGuiPanel.add(field10);
				rankGuiPanel.add(slider10);
			}
		}
		
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent back) {
				if(ranks[0] != null) {
					File statsF = new File("didRank.txt");
					try {
						FileWriter fileWriter = new FileWriter(statsF);
						PrintWriter writer = new PrintWriter(fileWriter);
						writer.write("TRUE");
						writer.close();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				setVisible(false);
				new MyProfileGUI(); 
			}
			
		});
		
		this.setContentPane(rankGuiPanel);
		this.setVisible(true);
		this.setSize(250,500);
		this.setTitle("Rank panel");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class SliderListener1 implements ChangeListener {
	    public void stateChanged(ChangeEvent e1) {
	    	int rank = 0;
	        JSlider source = (JSlider)e1.getSource();
	        if (!source.getValueIsAdjusting()) {
	            rank = (int)source.getValue();
	        }
	        if (rank!=0)
	        	ranks[0] = rank;
	    }
	}

	class SliderListener2 implements ChangeListener {
	    public void stateChanged(ChangeEvent e1) {
	    	int rank = 0;
	        JSlider source = (JSlider)e1.getSource();
	        if (!source.getValueIsAdjusting()) {
	            rank = (int)source.getValue();
	        }
	        if (rank!=0)
	        	ranks[1] = rank;
	    }
	}

	class SliderListener3 implements ChangeListener {
	    public void stateChanged(ChangeEvent e1) {
	    	int rank = 0;
	        JSlider source = (JSlider)e1.getSource();
	        if (!source.getValueIsAdjusting()) {
	            rank = (int)source.getValue();
	        }
	        if (rank!=0)
	        	ranks[2] = rank;
	    }
	}

	class SliderListener4 implements ChangeListener {
	    public void stateChanged(ChangeEvent e1) {
	    	int rank = 0;
	        JSlider source = (JSlider)e1.getSource();
	        if (!source.getValueIsAdjusting()) {
	            rank = (int)source.getValue();
	        }
	        if (rank!=0)
	        	ranks[3] = rank;
	      
	    }
	}

	class SliderListener5 implements ChangeListener {
	    public void stateChanged(ChangeEvent e1) {
	    	int rank = 0;
	        JSlider source = (JSlider)e1.getSource();
	        if (!source.getValueIsAdjusting()) {
	            rank = (int)source.getValue();
	        }
	        if (rank!=0)
	        	ranks[4] = rank;
	    }
	}

	class SliderListener6 implements ChangeListener {
	    public void stateChanged(ChangeEvent e1) {
	    	int rank = 0;
	        JSlider source = (JSlider)e1.getSource();
	        if (!source.getValueIsAdjusting()) {
	            rank = (int)source.getValue();
	        }
	        if (rank!=0)
	        	ranks[5] = rank;
	    }
	}

	class SliderListener7 implements ChangeListener {
	    public void stateChanged(ChangeEvent e1) {
	    	int rank = 0;
	        JSlider source = (JSlider)e1.getSource();
	        if (!source.getValueIsAdjusting()) {
	            rank = (int)source.getValue();
	        }
	        if (rank!=0)
	        	ranks[6] = rank;
	    }
	}

	class SliderListener8 implements ChangeListener {
	    public void stateChanged(ChangeEvent e1) {
	    	int rank = 0;
	        JSlider source = (JSlider)e1.getSource();
	        if (!source.getValueIsAdjusting()) {
	            rank = (int)source.getValue();
	        }
	        if (rank!=0)
	        	ranks[7] = rank;
	    }
	}

	class SliderListener9 implements ChangeListener {
	    public void stateChanged(ChangeEvent e1) {
	    	int rank = 0;
	        JSlider source = (JSlider)e1.getSource();
	        if (!source.getValueIsAdjusting()) {
	            rank = (int)source.getValue();
	        }
	        if (rank!=0)
	        	ranks[8] = rank;
	    }
	}

	class SliderListener10 implements ChangeListener {
	    public void stateChanged(ChangeEvent e1) {
	    	int rank = 0;
	        JSlider source = (JSlider)e1.getSource();
	        if (!source.getValueIsAdjusting()) {
	            rank = (int)source.getValue();
	        }
	        if (rank!=0)
	        	ranks[9] = rank;
	    }
	}
	
	public static ArrayList<Integer> getRanks() {
		ArrayList<Integer> stats = new ArrayList<Integer>();
		
		for(int i = 0 ; i <courses.size(); i++) {
			int st = ranks[i];
			stats.add(st);
		}
		return stats;	
	}

	
}
