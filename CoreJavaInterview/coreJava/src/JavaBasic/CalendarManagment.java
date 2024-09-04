package JavaBasic;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarManagment {
	
	public static void main(String[] args) {
//		Calendar c = Calendar.getInstance();
//		
//		c.add(Calendar.DAY_OF_MONTH, 1);1
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//		for(int month =0; month<12; month++) {
//			System.out.println(sdf.format(c.getTime()));
//			c.add(Calendar.MONTH, 1);
//			
//		}
		
		Calendar c= Calendar.getInstance();
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		for(int a = 1; a<=12;a++){
			 
			c.add(Calendar.DATE, 30);
			System.out.println(c.getTime());
			//System.out.println(sdf.format(c.getTime()));
			
		}
	}

}
