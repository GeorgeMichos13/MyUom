
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.*;  

public class Timer extends JFrame{
	protected JPanel panel;
	protected JButton add,save,show,delete,cancel;
	protected JTextField title,hours_field,minutes_field;
	protected JFrame frame;
	protected JDateChooser calendar;
	protected JTable table;
	protected JScrollPane sp;
	protected ArrayList<String[]> event_data = new ArrayList<String[]>();
	protected DefaultTableModel model;
	
	public Timer(JFrame frame) {
		this.frame=frame;
		model = new DefaultTableModel();
		model.addColumn("Τίτλος");
		model.addColumn("Προθεσμία");
		model.addColumn("Απομένουν");
		try {
			BufferedReader fr = new BufferedReader(new FileReader("events.txt"));
			String line1,line2;
			int j=0;
			while((line1=fr.readLine())!=null){
			    line2=fr.readLine();
			    event_data.add(new String[] {line2,"",line1,""});
			    j++;
			}
			fr.close();
		} catch (IOException e) {
		}
		panel = new JPanel();
		table = new JTable();
		add = new JButton("Προσθήκη Timer");
		delete = new JButton("Διαγραφή");
		show = new JButton("Προβολή");
		cancel = new JButton("Ακύρωση");
		panel.add(add);
		panel.add(show);
		panel.add(delete);
		sp = new JScrollPane(table);
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ButtonListenerAdd listenerAdd = new ButtonListenerAdd();
		add.addActionListener(listenerAdd);
		ButtonListenerShow listenershow = new ButtonListenerShow();
		show.addActionListener(listenershow);
		ButtonListenerDelete listenerDelete = new ButtonListenerDelete();
		delete.addActionListener(listenerDelete);
		ButtonListenerCancel listenerCancel = new ButtonListenerCancel();
		cancel.addActionListener(listenerCancel);
	}
	
	class ButtonListenerAdd extends JFrame implements ActionListener{        

		public void actionPerformed(ActionEvent e) {  
			if(e.getSource() == add) {
				panel.remove(delete);
				panel.remove(sp);
				panel.remove(show);
				panel.remove(add);
				
				title = new HintTextField("Τίτλος");
				hours_field = new HintTextField("Ώρες");
				minutes_field = new HintTextField("Λεπτά");
				calendar = new JDateChooser();
				calendar.setDateFormatString("dd-MM-yyyy");
				save = new JButton("Αποθήκευση");
				panel.add(title);
				panel.add(calendar);
				panel.add(hours_field);
				panel.add(minutes_field);
				panel.add(save);
				panel.add(cancel);
				frame.setContentPane(panel);
				ButtonListenerSave listenerSave = new ButtonListenerSave();
				save.addActionListener(listenerSave);
			}
		}
	}
	
	class ButtonListenerSave extends JFrame implements ActionListener{        

		public void actionPerformed(ActionEvent e){  
			if(e.getSource() == save) 
			{
				boolean flag=true,flag1=true;
				String s1=hours_field.getText();
				String s2=minutes_field.getText();
				int check1=-1,check2=-1;
				if((s1 != null) && s1.matches("[-+]?\\d*\\.?\\d+") && (s2 != null) && s2.matches("[-+]?\\d*\\.?\\d+"))
				{
					check1=Integer.valueOf(hours_field.getText());
					check2=Integer.valueOf(minutes_field.getText());
				}
				else
					flag=false;
				String date,years,months,days,hours,minutes,current_date;
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
				SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
				date=sdf2.format(calendar.getDate());
				hours=hours_field.getText();
				minutes=minutes_field.getText();
				date=date + " "+hours+':'+minutes;
				Date event = null;
				for(int j=0; j<event_data.size(); j++)
					if(title.getText().equals(event_data.get(j)[2]))
						{
						JOptionPane.showMessageDialog(frame, "Έχεις ξαναβάλει τον ίδιο τίτλο");
						flag1=false;
						}
				if((check1>=0 && check1<24) && (check2>=0 && check2<60) && flag1)
					{
					try {
						event=sdf.parse(date);
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
				   	Date today = Calendar.getInstance().getTime();
				    current_date=sdf.format(today);
				    long diff =event.getTime() - today.getTime();
				    int diffhours = (int) ((diff / (60 * 60 * 1000)) % 24);
				    int diffmin = (int) ((diff / (60 * 1000)) % 60);
				    int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
				    if((check1>=0 && check1<24) && (check2>=0 && check2<60) && title.getText()!=null && calendar.getDate()!=null && flag && diff>0)
				    {
				    	event_data.add(new String[] {date,current_date,title.getText(),String.valueOf(diffDays)+" / "+String.valueOf(diffhours)+":"+String.valueOf(diffmin)});
					    panel.remove(title);
					    panel.remove(calendar);
					    panel.remove(hours_field);
					    panel.remove(minutes_field);
					    panel.remove(save);
					    panel.remove(cancel);
					    panel.add(add);
					    panel.add(show);
					    panel.add(delete);
					    frame.setContentPane(panel);
					    try {
					    	File file = new File("events.txt");
					    	FileWriter fw = new FileWriter(file);
							PrintWriter writer = new PrintWriter(fw,true);
							writer.flush();
							for(int j=0; j<event_data.size(); j++)
							{
								writer.println(event_data.get(j)[2]);
								writer.println(event_data.get(j)[0]);
							}
							writer.close();
						} catch (FileNotFoundException e1) {
						} catch (IOException e1) {
						}
					}
				    else
				    	JOptionPane.showMessageDialog(frame, "Συμπλήρωσε σωστά τα κενά");
					}
			    else
			    	if(flag1)
			    		JOptionPane.showMessageDialog(frame, "Συμπλήρωσε σωστά τα κενά");
				
			}
		}
	}
	
	class ButtonListenerShow extends JFrame implements ActionListener{        
		public void actionPerformed(ActionEvent e) {  
			Date event=null,today = null;
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
			String minutes;
			if(e.getSource() == show) {
				{
					model = new DefaultTableModel();
					model.addColumn("Τίτλος");
					model.addColumn("Προθεσμία");
					model.addColumn("Απομένουν");
					for(int i=0; i<event_data.size(); i++)
						{
							today = Calendar.getInstance().getTime();
							try {
								event=sdf.parse(event_data.get(i)[0]);
							} catch (ParseException e1) {
								e1.printStackTrace();
							}
						    long diff =event.getTime() - today.getTime();
						    int diffhours = (int) ((diff / (60 * 60 * 1000)) % 24);
						    int diffmin = (int) ((diff / (60 * 1000)) % 60);
						    if(diffmin/10==0)
						    	minutes="0"+String.valueOf(diffmin);
						    else
						    	minutes=String.valueOf(diffmin);
						    int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
						    if(diff<=0)
						    	{
						    	event_data.get(i)[3]="Τέλος";
						    	JOptionPane.showMessageDialog(frame, "Η προθεσμία του '"+event_data.get(i)[2]+"' έχει τελειώσει");
						    	}
						    else
						    	event_data.get(i)[3]=String.valueOf(diffDays)+" Μέρες"+" / "+String.valueOf(diffhours)+":"+minutes;
							model.insertRow(0, new Object[] {event_data.get(i)[2],event_data.get(i)[0],event_data.get(i)[3]});
						}
				}
				table = new JTable(model);
				table.setPreferredScrollableViewportSize(new Dimension(300,60));
				table.setPreferredSize(new Dimension(300,200));
				sp.setViewportView(table);
				sp.getVerticalScrollBar().setPreferredSize(new Dimension(10,0));
				panel.add(sp);
				frame.setContentPane(panel);
			}
		}
	}
	
	class ButtonListenerDelete extends JFrame implements ActionListener{        

		public void actionPerformed(ActionEvent e) {  
			if(e.getSource() == delete) {
				if(table.getParent()!=null)
					if(table.getSelectedRow() != -1)
						{
						for(int i=0; i<event_data.size(); i++)
							if(event_data.get(i)[2]==model.getValueAt(table.getSelectedRow(), 0))
								event_data.remove(i);
						model.removeRow(table.getSelectedRow());
						table=new JTable(model);
						table.setPreferredScrollableViewportSize(new Dimension(300,60));
						table.setPreferredSize(new Dimension(300,200));
						sp.setViewportView(table);
						sp.getVerticalScrollBar().setPreferredSize(new Dimension(10,0));
						panel.add(sp);
						frame.setContentPane(panel);
					    try {
					    	File file = new File("events.txt");
					    	FileWriter fw = new FileWriter(file);
							PrintWriter writer = new PrintWriter(fw,true);
							writer.flush();
							for(int j=0; j<event_data.size(); j++)
							{
								writer.println(event_data.get(j)[2]);
								writer.println(event_data.get(j)[0]);
							}
							writer.close();
						} catch (FileNotFoundException e1) {
						} catch (IOException e1) {
						}
						}
			}
		}
	}
	
	class ButtonListenerCancel extends JFrame implements ActionListener{        

		public void actionPerformed(ActionEvent e) {  
			if(e.getSource() == cancel) {
			    panel.remove(title);
			    panel.remove(calendar);
			    panel.remove(hours_field);
			    panel.remove(minutes_field);
			    panel.remove(save);
			    panel.remove(cancel);
			    panel.add(add);
			    panel.add(show);
			    panel.add(delete);
			    frame.setContentPane(panel);
			}
		}
	}
	
	public class HintTextField extends JTextField {  
  
  Font gainFont = new Font("Tahoma", Font.PLAIN, 11);  
  Font lostFont = new Font("Tahoma", Font.ITALIC, 11);  
  
  public HintTextField(final String hint) {  
  
    setText(hint);  
    setFont(lostFont);  
    setForeground(Color.GRAY);  
  
    this.addFocusListener(new FocusAdapter() {  
  
      @Override  
      public void focusGained(FocusEvent e) {  
        if (getText().equals(hint)) {  
          setText("");  
          setFont(gainFont);  
        } else {  
          setText(getText());  
          setFont(gainFont);  
        }  
      }  
  
      @Override  
      public void focusLost(FocusEvent e) {  
        if (getText().equals(hint)|| getText().length()==0) {  
          setText(hint);  
          setFont(lostFont);  
          setForeground(Color.GRAY);  
        } else {  
          setText(getText());  
          setFont(gainFont);  
          setForeground(Color.BLACK);  
        }  
      }  
    });  
  
  }  
}  
	
}
