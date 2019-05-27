import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import jxl.Workbook;
import jxl.write.*;
import jxl.write.Number;

import java.io.File;
import java.io.IOException;


public class XlsWriter {
	private ArrayList<Course> FCourses = new ArrayList<Course>();
	
	
	public XlsWriter(ArrayList<Course> array)
	{
		FCourses.addAll(array);
	}
	
	public void writeToExcel()	
	
	{
        WritableWorkbook workbook = null;

        try {

        	workbook = Workbook.createWorkbook(new File("MyUOMSchedule.xls"));

            // create an Excel sheet
            WritableSheet excelSheet = workbook.createSheet("MySchedule", 0);

            // add something into the Excel sheet
            Label label = new Label(0, 0, "ΩΡΑ/ΜΕΡΑ");
            excelSheet.addCell(label);
            
            int i=8;
            int inext=i+1;
            Label hour = new Label(0, 1,""+ i +"-"+inext);
            excelSheet.addCell(hour);
            for(int k=2;k<14;k++)
            {
            	i++;
            	inext++;
            	hour = new Label(0, k,""+ i +"-"+inext);
            	excelSheet.addCell(hour);
            }
           
            Label day = new Label(1, 0, "ΔΕΥΤΕΡΑ");
            excelSheet.addCell(day);
            
            day = new Label(2, 0, "ΤΡΙΤΗ");
            excelSheet.addCell(day);
            
            day = new Label(3, 0, "ΤΕΤΑΡΤΗ");
            excelSheet.addCell(day);
            
            day = new Label(4, 0, "ΠΕΜΠΤΗ");
            excelSheet.addCell(day);
            
            day = new Label(5, 0, "ΠΑΡΑΣΚΕΥΗ");
            excelSheet.addCell(day);
            
            if(!FCourses.isEmpty())
            {
            	Label course = new Label(FCourses.get(0).getDay(),FCourses.get(0).getHour()-7,FCourses.get(0).getName());
                excelSheet.addCell(course);
                for(i=1;i<FCourses.size();i++)
                {
                	course = new Label(FCourses.get(0).getDay(),FCourses.get(0).getHour()-7,FCourses.get(0).getName());
                	excelSheet.addCell(course);	
                }
            }
                      
            workbook.write();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        } finally {

            if (workbook != null) {
                try {
                    workbook.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (WriteException e) {
                    e.printStackTrace();
                }
            }


        }
	}

}
