import java.text.SimpleDateFormat;
import java.util.Date;
/*10)What will be the DAY of current date in next year  */
public class dayYear10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      Date d=new Date();
		      System.out.println(sameDayOnUpcomingYear(d));
		}
		public static String sameDayOnUpcomingYear(Date d) {
		      Date d1=new Date();
		      d1.setYear(d.getYear()+1);
		      SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
		      String s=sdf.format(d1);
		      return s;
		}

	

}
