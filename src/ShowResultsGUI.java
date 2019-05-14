
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	public ShowResultsGUI() {
		
		backButton  = new JButton("Back");
		panel = new JPanel();
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(1, "Classes", "������1");
		dataset.addValue(2, "Classes", "������2");
		dataset.addValue(3, "Classes", "������3");
		dataset.addValue(4, "Classes", "������4");
		dataset.addValue(5, "Classes", "������5");
		
		JFreeChart chart = ChartFactory.createBarChart3D("Lessons Difficulty", "Lesson", "Difficulty", dataset, PlotOrientation.VERTICAL, false, true, false);
		
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
	

}