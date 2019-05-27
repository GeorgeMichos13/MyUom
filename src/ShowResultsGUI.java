
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
	private  ArrayList<Integer> newStats  = new ArrayList<Integer>();

	
	
	public ShowResultsGUI() {
		
		backButton  = new JButton("Back");
		panel = new JPanel();
		MyProfile profilewindow = new MyProfile();
		courses = profilewindow.getCourses();
		
		alterStatistics();
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
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
	
		MyProfile profilewindow = new MyProfile();
		ArrayList<Integer> oldStats = profilewindow.getStats();
		
		Path path = Paths.get("didRank.txt");
		Path path1 = Paths.get("Stats.txt");
		String input = path1.toString();
		File file = new File(input);
		if(Files.exists(path) && !Files.exists(path1)) {
			selectedRanks = RankGUI.getRanks();	
			FileWriter fileWriter;
			try {
				fileWriter = new FileWriter(file);
				PrintWriter writer = new PrintWriter(fileWriter);
				for (int i = 0; i <oldStats.size(); i++) {
					newStats.add((oldStats.get(i) + selectedRanks.get(i))/2);
					int s = newStats.get(i);
					writer.write(s + "\r\n");
					}
				writer.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if (Files.exists(path1))
			getStatistics();
		else 
			newStats = profilewindow.getStats();
		}
	
	
	public void getStatistics() {
		Path path = Paths.get("Stats.txt");
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
			    newStats.add(s);
			    
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}