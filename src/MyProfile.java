import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MyProfile {
	private ArrayList<CourseStats> FCourseStats = new ArrayList<CourseStats>();
	private ArrayList<Course> FCourses = new ArrayList<Course>();
	private ArrayList<String> Courses = new ArrayList<String>();
	private ArrayList<Integer> stats = new ArrayList<Integer>();
	
	public MyProfile() {
		readCourses();
	}
	
	@SuppressWarnings("finally")
	//De-Serialization of selected courses.
	public ArrayList<CourseStats> readCourses(){
		try {
			FileInputStream fileIn = new FileInputStream("Course.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			FCourses = (ArrayList<Course>) in.readObject();
			in.close();
			fileIn.close();		
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
		finally {
			System.out.println("De-Serialization Attempted...");
		}
		
		try {
			FileInputStream fileIn = new FileInputStream("CourseStats.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			FCourseStats = (ArrayList<CourseStats>) in.readObject();
			in.close();
			fileIn.close();		
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
		finally {
			System.out.println("De-Serialization Attempted...");
			return FCourseStats;
		}
		
		
	}
	
	//Getting just the name of each course
	public  ArrayList<String> getCourses(){
		Set<String> set = new HashSet<String>();
		boolean added;
		for (int i = 0; i<FCourseStats.size(); i++) {
			String course = FCourseStats.get(i).getName();
			added = set.add(FCourseStats.get(i).getName());
			if(added)
			{
				Courses.add(course);
			}
			
			
		}

		return Courses;
	}
	
	//Getting everything for each course
	public ArrayList<Course> getFCourses()
	{
		return FCourses;
	}
	
	//Getting all stats for each course
	public  ArrayList<Integer> getStats(){
	
		ArrayList<String> courses = getCourses();
		System.out.println(courses.size());
		for(int i = 0; i<courses.size(); i++) {
			int stat = FCourseStats.get(i).getStat();
			stats.add(stat);
		}
	
		return stats;
	}
	
	//Deleting all existing files created while
	//user has been using the program thus
	//giving him the option to start again
	public void reset() {
		//Deleting courses
		Path filePath = Paths.get("Course.ser");
		String input = filePath.toString();
		File path = new File(input);
		path.delete();
		
		//Deleting statistics that have been
		//occured after the user ranked
		filePath = Paths.get("newStats.txt");
		input = filePath.toString();
		path = new File(input);
		path.delete();
			
		//Deleting username
		filePath = Paths.get("username.txt");
		input = filePath.toString();
		path = new File(input);
		path.delete();
		
		//Deleting the selected lessons and stats
		filePath = Paths.get("CourseStats.ser");
		input = filePath.toString();
		path = new File(input);
		path.delete();
		
		//Deleting timers
		filePath = Paths.get("events.txt");
		input = filePath.toString();
		path = new File(input);
		path.delete();
		
		//Deleting the file that suggest that 
		//the user has ranked the courses
		filePath = Paths.get("didRank.txt");
		input = filePath.toString();
		path = new File(input);
		path.delete();
		
		//Deleting mySchedule	
		filePath = Paths.get("MyUOMSchedule.xls");
		input = filePath.toString();
		path = new File(input);
		path.delete();
		
		//Deleting all notes
		String ending = "myUomNotes.txt";
		ArrayList<String> courses;
		courses = getCourses();
		
		
		for(int i = 0; i < courses.size(); i++) {
			String noteFile = courses.get(i) + ending;
			filePath = Paths.get(noteFile);
			input = filePath.toString();
			path = new File(input);
			path.delete();
		}
		
	}

}
