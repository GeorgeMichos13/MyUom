import java.io.Serializable;

public class Course implements Serializable{
	private static final long serialVersionUID = 1L;
	private int hour;
	private int dayΝ;
	private String day;
	private String name;
	private String classr;
	private String classs;
	private String direction;
	private String semester;
	
	public Course( String name, int day,int hour,String classr,String classs,String semester,String direction) {
		this.hour = hour;
		this.dayΝ = day;
		this.name = name;
		this.classs = classs;
		this.classr = classr;
		if(day==1)
		{
			this.day = "Δευτέρα";
		}
		if(day==2)
		{
			this.day = "Τρίτη";
		}
		if(day==3)
		{
			this.day = "Τετάρτη";
		}
		if(day==4)
		{
			this.day = "Πέμπτη";
		}
		if(day==5)
		{
			this.day = "Παρασκευή";
		}
		this.direction = direction;
		this.semester = semester;

	}
		
	public String toString() {
		return("Μαθημα: " + name + " Μέρα: " + day + " Ώρα: " + hour + ":00 Αίθουσα: " + classr + " Τμήμα: " + classs + " Eξάμηνο: " +semester + " Κατεύθυνση: " + direction);		
	}
	
	public String getName() {
		return(name);
	}
	
	public String getClasss() {
		return(classs);
	}
	
	public String getClassr() {
		return(classr);
	}
	public String getSemester() {
		return(semester);
	}
	public int getHour() {
		return(hour);
	}
	public int getDay() {
		return(dayΝ);
	}

	public String getDirection() {
		return direction;
	}
	
	public String getDayS() {
		return(day);
	}

}
