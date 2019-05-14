

import java.util.concurrent.ThreadLocalRandom;

public class CourseStats implements Comparable<CourseStats>{
	private String name;
	private int stat;
	private String semester;
	private int semesterN;
	private String direction;
	
	public CourseStats(String name,String semester,String direction) {
		this.name = name;
		this.stat = ThreadLocalRandom.current().nextInt(1, 5 + 1);
		this.semester = semester;
		
		if (semester.equals("Α"))
		{
			this.semesterN = 1;
		}
		if (this.semester.equals("Β"))
		{
			this.semesterN = 2;
		}
		if (this.semester.equals("Γ"))
		{
			this.semesterN = 3;
		}
		if (this.semester.equals("Δ"))
		{
			this.semesterN = 4;
		}
		if (this.semester.equals("Ε"))
		{
			this.semesterN = 5;
		}
		if (this.semester.equals("ΣΤ"))
		{
			this.semesterN = 6;
		}
		if (this.semester.equals("Ζ"))
		{
			this.semesterN = 7;
		}
		if (this.semester.equals("Η"))
		{
			this.semesterN = 8;
		}
		if (this.semester.equals("Θ"))
		{
			this.semesterN = 9;
		}
	
		this.direction = direction;
	}

	public String getName() {
		return name;
	}


	public int getStat() {
		return stat;
	}
	
	public String getDirection() {
		return direction;
	}
	
	public String getSemester() {
		return semester;
	}
	
	public int getSemesterN() {
		return semesterN;
	}
	
	public String toString() {
		return("Μαθημα: " + name + "Δυσκολία: " + stat + " " + semesterN);		
	}

	@Override
	public int compareTo(CourseStats c) {
		

			int compare = c.getDirection().compareTo(direction);
			if (compare == 0)
			{
				compare = Integer.compare(semesterN, c.getSemesterN());
				if(compare == 0)
				{
					compare = name.compareTo(c.getName());
				}

			}
			return compare;
	}
	
	
	 
}
