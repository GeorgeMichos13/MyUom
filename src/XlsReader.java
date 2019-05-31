

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class XlsReader {	
	
	 private ArrayList<Course> courses=new ArrayList<Course>();
	 private ArrayList<Course> coursesSelected=new ArrayList<Course>();
	 private HashSet<String> courseDistinct = new HashSet<String>(); 
	 private HashSet<String> courseDistinctSelected = new HashSet<String>(); 
	 private ArrayList<CourseStats> courseStats = new ArrayList<CourseStats>();
	 private ArrayList<CourseStats> courseStatsSelected = new ArrayList<CourseStats>();
	 private ArrayList<String> courseStr = new ArrayList<String>();
	 private String dirstr;
	 
	    public void read() {
	    	int i;
	    	int j;
	    	int k;
	    	int day;
	    	int counter;
	    	int hour;
	    	String cellstring;
	    	boolean merged;
	    	String cellinfo;
	    	String course;
	    	String classs;
	    	String classr;
	    	String sheetName;
	    	String sheetName2;
	    	int numOfSheets;
	    	int cindex;
	    	int cindex2;
	    	int index2;	
	    	int prev=0;
	    	boolean added;
	        Workbook workbook = null;
	        Path xlPath = Paths.get("TimeTable.xls");
	        String path = xlPath.toString();
	        try {
	            workbook = Workbook.getWorkbook(new File(path));
	            numOfSheets = workbook.getNumberOfSheets();
	            Cell cell2 = workbook.getSheet(1).getCell(2,13);
	            for(k=0;k<numOfSheets;k++)
	            {
		            Sheet sheet = workbook.getSheet(k);  
		            sheetName = sheet.getName();
		            cindex2 = sheetName.indexOf("'");
		            sheetName2 = sheetName.substring(0, cindex2);
		            cindex = sheetName.indexOf('-');
		            sheetName = sheetName.substring(cindex+1);
		            day = 0;
		            j=2;
		            counter = 0;
		            merged = false;
		            do  {
		            	if(sheet.getCell(j,3).getCellFormat().getAlignment().getDescription().equals("centre"))
		            	{    		
		            		day++;
		            	}
	        			if(sheet.getCell(j,3).getCellFormat().getWrap()==false) {
	        				merged = true;
	        			}
	        			else
	        			{
	        				merged = false;
	        			}
	        			i=4;
	        			do{				
		            		Cell cell = sheet.getCell(j, i);		            		
		            		cellstring = cell.toString();	
		            		if(cellstring.contains("Label") || cellstring.contains("Mul") || cellstring.contains("Blank")) { 
		            			
		            			hour = i+4;
		            			course = "";
		            			classs = "κοινό";
		            			classr = "";
		            			if(cellstring.contains("Label"))
		            			{
		            				cellinfo = cell.getContents().trim().replaceAll(" +", " ");
		            				cindex = cellinfo.indexOf('(');
			            			course = cellinfo.substring(0, cindex);
			            			if(cellinfo.contains("Τμήμα ")) {
				            			index2 = cellinfo.indexOf("Τμήμα ");
				            			classs = cellinfo.substring(index2 + 6,index2 + 7);
			            			}
			            			else if(cellinfo.contains("Τμήμα: ")) {
				            			index2 = cellinfo.indexOf("Τμήμα: ");
				            			classs = cellinfo.substring(index2 + 6,index2 + 7);
			            			}
			            			else if(cellinfo.contains("Τμήμα")) {
				            			index2 = cellinfo.indexOf("Τμήμα");
				            			classs = cellinfo.substring(index2 + 6,index2 + 7);
			            			}
			            			else if(cellinfo.contains("Τμήμα:")) {
				            			index2 = cellinfo.indexOf("Τμήμα:");
				            			classs = cellinfo.substring(index2 + 6,index2 + 7);
			            			}		            			
			          
			            			if(cellinfo.contains("Αίθουσα ")) {
				            			index2 = cellinfo.indexOf("Αίθουσα ");
				            			classr = cellinfo.substring(index2);
			            			}
			              			if(cellinfo.contains("Αμφιθέατρο") && cellinfo.contains("ΚΕΥΠ")) {
				            			index2 = cellinfo.indexOf("Αμφιθέατρο");
				            			classr = cellinfo.substring(index2);
			            			}		            			
			            			else if(cellinfo.contains("ΚΕΥΠ")) {
				            			index2 = cellinfo.indexOf("ΚΕΥΠ");
				            			classr = cellinfo.substring(index2);
			            			}
			            			else if(cellinfo.contains("Αμφιθέατρο ")) {
				            			index2 = cellinfo.indexOf("Αμφιθέατρο ");
				            			classr = cellinfo.substring(index2);
			            			}
			            			if(cellinfo.contains("Εργαστήριο ")) {
				            			index2 = cellinfo.indexOf("Εργαστήριο ");
				            			classr = cellinfo.substring(index2);
				
			            			}
			            			if(classr.contains("\n"))
			            			{
			            				index2 = classr.indexOf("\n");
			            				classr = classr.substring(0,index2);
			            			}
			            			if(cellinfo.contains("Φροντιστήριο")==false)
			            			{
			            				counter = 0;
			            				if(hour!=22)
			            				{
			            					courses.add(new Course(course,day,hour,classr,classs,sheetName2,sheetName));
			            				}
			            				
			            				added = false;
			            				if(sheetName.equals("ΚΕΠ") || sheetName.equals("ΚΟΙΝΟ") )
			            				{
			            					added = courseDistinct.add(course);
			            				}
			            				else if(sheetName.equals("ΚΔΤ") || sheetName.equals("ΚΟΙΝΟ"))
			            				{
			            					added = courseDistinctSelected.add(course);
			            				}
			            				if (added == true)
			            				{
			            					courseStats.add(new CourseStats(course,sheetName2,sheetName));	            					
			            				}
			            				prev=j;			            				
			            			}			            				            			
		            			}
		            				if(j==2 && i ==13 && k ==1 )		            					
		            				{
		            					System.out.println(cell2.getCellFormat().getWrap() + cell.getCellFormat().getAlignment().getDescription());
		            				}
		            					            						        		            		
			            			if (cell.getCellFormat().getWrap() == false && cell.getCellFormat().getAlignment().getDescription().equals("general") && counter <2 && prev ==j) 
			            			{
			            				counter++;
			            				course = courses.get(courses.size()-1).getName();	
			            				classs = courses.get(courses.size()-1).getClasss();	
			            				classr = courses.get(courses.size()-1).getClassr();	
			            				if(classs.equals("1") || classs.equals("2") || classs.equals("3") || classs.equals("4"))
			            				{
			            					break;
			            				}
			            				if(hour!=22)
			            				{
			            					courses.add(new Course(course,day,hour,classr,classs,sheetName2,sheetName));
			            					
			            				}
			            				added = false;
			            				if(sheetName.equals("ΚΕΠ") || sheetName.equals("ΚΟΙΝΟ"))
			            				{
			            					added = courseDistinct.add(course);
			            				}
			            				else if(sheetName.equals("ΚΔΤ") || sheetName.equals("ΚΟΙΝΟ"))
			            				{
			            					added = courseDistinctSelected.add(course);
			            				}
			            				if (added == true)
			            				{
			            					courseStats.add(new CourseStats(course,sheetName2,sheetName));	            					
			            				}
			            			}		            					            			
		            		}
		            		if(sheet.getCell(1,i).getCellFormat().getWrap() == true && sheet.getCell(1,i).getContents().equals("")) {
		            			break;
		            		}
		            		i++;
            				if(i>17)
            				{
            					break;
            				}
		            	}while(true);	
		            	if(sheet.getCell(j,3).getContents().equals("")==true && merged == false) {
		            		break;
		            	}
		            	j++;
		            }while(true);		     
	            }
    	        Collections.sort(courseStats);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (BiffException e) {
	            e.printStackTrace();
	        } finally {
	            if (workbook != null) {
	                workbook.close();
	            }

	        }

	    }
	    
	    public  ArrayList<Course> getCourses()
	    {
	    	return courses;
	    }
	    
	    public  ArrayList<CourseStats> getCoursesStats()
	    {
	    	return courseStats;
	    }
	    
	    public void printCourses()
	    {
	    	if(courses.size()>1) {
				for(int k=0;k<courses.size();k++) {
					System.out.println(courses.get(k).toString());
				}
			}
	    }
	    
	    public void printCoursesStats()
	    {
	    	if(courseStats.size()>1) {
				for(int k=0;k<courseStats.size();k++) {
					System.out.println(courseStats.get(k).toString());
				}
			}	
	    }
	    
	    public void setArrayString(ArrayList<String> anArray) {
	    	this.courseStr.addAll(anArray);
	    	
	    }
	    
	    public void setSelectedDirection(String str)
		{
			dirstr = str;
		}
	    
		public void writeSelectedCourses() {	
			System.out.println(dirstr);
			for(int i=0;i<courseStr.size();i++)
			{
				String temp = courseStr.get(i).replace("\n","");
				courseStr.remove(i);
				courseStr.add(i,temp);			
				for(int j=0;j<courses.size();j++)
				{					
					if(courseStr.get(i).equals(courses.get(j).getName()) && dirstr.equals(courses.get(j).getDirection()))
					{
						coursesSelected.add(courses.get(j));
						
					}
					if(courseStr.get(i).equals(courses.get(j).getName()) && courses.get(j).getDirection().equals("ΚΟΙΝΟ"))
					{
						coursesSelected.add(courses.get(j));
						
					}
				}
				for(int k=0;k<courseStats.size();k++)
				{
					if(courseStr.get(i).equals(courseStats.get(k).getName()))
					{

						courseStatsSelected.add(courseStats.get(k));;
					}
				}
				
			}			
			try {
				FileOutputStream fileOut = new FileOutputStream("Course.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut);
				out.writeObject(coursesSelected);
				out.close();
				fileOut.close();		
			}
			catch(IOException i) {
				i.printStackTrace();
			}
			finally {
				System.out.println("Serialization Attempted...");
			}
			try {
				FileOutputStream fileOut = new FileOutputStream("CourseStats.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut);
				out.writeObject(courseStatsSelected);
				out.close();
				fileOut.close();		
			}
			catch(IOException i) {
				i.printStackTrace();
			}
			finally {
				System.out.println("Serialization Attempted...");
			}
		}					  	    
}