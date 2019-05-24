import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MyProfile {
	private ArrayList<CourseStats> FCourseStats = new ArrayList<CourseStats>();
	private ArrayList<Course> FCourses = new ArrayList<Course>();
	private ArrayList<String> Courses = new ArrayList<String>();
	
	public MyProfile() {
		readCourses();
	}
	
	@SuppressWarnings("finally")
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
	
	public  ArrayList<String> getCourses(){
		for (int i = 0; i<FCourseStats.size(); i++) {
			String course = FCourseStats.get(i).getName();
			Courses.add(course);
			
		}
		return Courses;
	}
	
	
	public void reset() {
		//Courses deleted
		Path filePath = Paths.get("Course.ser");
		String input = filePath.toString();
		File path = new File(input);
		path.delete();
			
		filePath = Paths.get("username.txt");
		input = filePath.toString();
		path = new File(input);
		path.delete();
		
		filePath = Paths.get("CourseStats.ser");
		input = filePath.toString();
		path = new File(input);
		path.delete();
		
		filePath = Paths.get("events.txt");
		input = filePath.toString();
		path = new File(input);
		path.delete();
		
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
