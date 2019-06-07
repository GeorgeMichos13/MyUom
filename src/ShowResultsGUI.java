
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
		
		backButton  = new JButton("Πίσω");
		panel = new JPanel();
		MyProfile profilewindow = new MyProfile();
		courses = profilewindow.getCourses();
		
		alterStatistics();
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		//Adding data to set
		for(int i=0 ; i < newStats.size(); i++) {
			dataset.addValue(newStats.get(i),courses.get(i),courses.get(i));
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
	public void alterStatistics() {
		ArrayList<Integer> selectedRanks;
	
		MyProfile profilewindow = new MyProfile();
		
		
		Path path = Paths.get("didRank.txt");
		Path path1 = Paths.get("newStats.txt");
		String input = path1.toString();
		File file = new File(input);
		
		//Writing new stats and reading them
		//Case:Users just ranked 
		if(Files.exists(path) && !Files.exists(path1)) {
			selectedRanks = RankGUI.getRanks();	
			ArrayList<Integer> oldStats = profilewindow.getStats();
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
		else if (Files.exists(path1) && Files.exists(path))
			//Reading altered stats
			//Case: User has ranked and exited programm
			//Wants to see results again
			getStatistics();
		else 
			//Stats before they have been ranked
			//Case:Users hasnt ranked yet
			newStats = profilewindow.getStats();
		
		}
	
	
	//Getting stats if the user has ranked
	public void getStatistics() {
		Path path = Paths.get("newStats.txt");
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
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		  
		
	}

}