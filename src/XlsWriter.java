import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import jxl.Workbook;
import jxl.write.Border;
import jxl.write.BorderLineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
public class XlsWriter {
	private ArrayList<Course> FCourses = new ArrayList<Course>();
	private ArrayList<Label> labels = new ArrayList<Label>();
	
	public XlsWriter(ArrayList<Course> array)
	{
		FCourses.addAll(array);
	}
	
	public void writeToExcel()	
	{
        WritableWorkbook workbook = null;
       
        try {

        	workbook = Workbook.createWorkbook(new File("MyUOMSchedule.xls"));
            //δημιουργια νεου excel
            WritableSheet excelSheet = workbook.createSheet("MySchedule", 0);
            //δημιουργια φυλλου excel
            WritableCellFormat cellFormat = new WritableCellFormat();
            cellFormat.setWrap(true);
            cellFormat.setBackground(cellFormat.getBackgroundColour().GRAY_25);
            cellFormat.setBorder(Border.ALL, BorderLineStyle.THIN);
            Label label = new Label(0, 0, "ΩΡΑ/ΜΕΡΑ",cellFormat);
            excelSheet.addCell(label);  
            excelSheet.setColumnView(0, 12);
            for(int j=1;j<6;j++)
            {
            	excelSheet.setColumnView(j, 50);
            }
            for(int i=1;i<14;i++)
            {
            	excelSheet.setRowView(i, 500);
            }
            int i=8;
            int inext=i+1;
            Label hour = new Label(0, 1,""+ i +":00 -"+inext+":00",cellFormat);
            excelSheet.addCell(hour);
            for(int k=2;k<14;k++)
            {
            	i++;
            	inext++;
            	hour = new Label(0, k,""+ i +":00-"+inext+":00",cellFormat);
            	excelSheet.addCell(hour);
            }
           
            Label day = new Label(1, 0, "ΔΕΥΤΕΡΑ",cellFormat);
            excelSheet.addCell(day);
            
            day = new Label(2, 0, "ΤΡΙΤΗ",cellFormat);
            excelSheet.addCell(day);
            
            day = new Label(3, 0, "ΤΕΤΑΡΤΗ",cellFormat);
            excelSheet.addCell(day);
            
            day = new Label(4, 0, "ΠΕΜΠΤΗ",cellFormat);
            excelSheet.addCell(day);
            
            day = new Label(5, 0, "ΠΑΡΑΣΚΕΥΗ",cellFormat);
            excelSheet.addCell(day);//προσθηκη μερων και ωρων με την μεθοδο addCell
            
            if(!FCourses.isEmpty())
            {
            	labels.add(new Label(FCourses.get(0).getDay(),FCourses.get(0).getHour()-7,FCourses.get(0).getName()
            			+"\n"+FCourses.get(0).getClassr(),cellFormat));
             
                for(i=1;i<FCourses.size();i++)
                {
                	labels.add(new Label(FCourses.get(i).getDay(),FCourses.get(i).getHour()-7,
                			FCourses.get(i).getName() +"\n"+FCourses.get(i).getClassr(),cellFormat));
                }
            }    
            for(i=0;i<labels.size();i++)
            {
            	excelSheet.addCell(labels.get(i));
            	
            }//προσθηκη μαθηματων και δραστηριοτητων στο mySchedule                        
            workbook.write();//γραψιμο στο excel
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
