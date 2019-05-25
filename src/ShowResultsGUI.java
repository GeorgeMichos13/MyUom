
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
public class ShowResultsGUI extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	private JButton backButton;
	private ArrayList<String> courses = new ArrayList<String>();
	private  ArrayList<Integer> newStats  = new ArrayList<Integer>();
	private  ArrayList<Integer> oldStats = new ArrayList<Integer>();
	
	
	public ShowResultsGUI() {
		
		backButton  = new JButton("Back");
		panel = new JPanel();
		MyProfile profilewindow = new MyProfile();
		courses = profilewindow.getCourses();
		
		newStats = profilewindow.getStats();
		oldStats = RankGUI.getRanks();
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		if (!RankGUI.ranks[0].equals(0))
			alterStatistics();
		
		for(int i=0 ; i < courses.size(); i++) {
			dataset.addValue(newStats.get(i), "Classes", courses.get(i));
		}
		
		
		
		JFreeChart chart = ChartFactory.createBarChart3D("Courses Difficulty", "Courses", "Difficulty", dataset, PlotOrientation.VERTICAL, false, true, false);
		
		ChartPanel chartPanel = new ChartPanel(chart);
		
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent back) {
				setVisible(false);
				new MyProfileGUI(); 
			}
			
		});
		
		
		
		this.setContentPane(panel);
		panel.add(backButton);
		panel.add(chartPanel);
		
		this.setVisible(true);
		this.setSize(1000, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void alterStatistics() {
		ArrayList<Integer> selectedRanks;
		RankGUI rankwindow = new RankGUI();
		rankwindow.setVisible(false);
		selectedRanks = rankwindow.getRanks();
		
		for (int i = 0; i <oldStats.size(); i++) {
			newStats.add((oldStats.get(i) + selectedRanks.get(i))/2);
		}
	}

}