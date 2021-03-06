
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
	private  ArrayList<Integer> stats  = new ArrayList<Integer>();

	
	
	public ShowResultsGUI() {
		
		backButton  = new JButton("Πίσω");
		panel = new JPanel();
		MyProfile profilewindow = new MyProfile();
		courses = profilewindow.getCourses();
		
		readStatistics();
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		//Adding data to set
		for(int i=0 ; i < stats.size(); i++) {
			dataset.addValue(stats.get(i),courses.get(i),courses.get(i));
		}
		
		
		//Creating chart
		JFreeChart chart = ChartFactory.createBarChart3D("Courses Difficulty", "Courses", "Difficulty", dataset, PlotOrientation.VERTICAL, true, true, true);
		
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
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	//Getting stats depending on case
	public void readStatistics() {
		
	
		MyProfile profilewindow = new MyProfile();
		
	
		Path path = Paths.get("New Statistics.txt");
		
		
		//Reading statistics
		//Case:Users ranked 
		if(Files.exists(path)) {
			newStats();
		}
		else 
			//Getting statistics
			//Case:Users hasn't ranked yet
			stats = profilewindow.getStats();
		
		}
	
	
	//Getting stats if the user has ranked
	public void newStats() {
		
		//We are showing the ranks from the user
		//Because we don't have actual data
		Path path = Paths.get("New Statistics.txt");
		String input = path.toString();
		File file = new File(input);
		
		
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		String st;
		
		
		  try {
			while ((st = br.readLine()) != null) {
				
					int s = Integer.parseInt(st);
				    stats.add(s);
				
			    
			  }
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		  
		
	}

}