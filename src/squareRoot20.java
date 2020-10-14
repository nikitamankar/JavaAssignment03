/*20)Square root calculation of
   ((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2))
   o/p should be rounded of to int;   */
public class squareRoot20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     int x1=10,x2=10;
	     int y1=5,y2=5;
	     int z;
	     
	     z=((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2));
	     System.out.println(z);
	    System.out.println(Math.sqrt(z));
	     System.out.println((int)Math.sqrt(z));
	   
	}

}