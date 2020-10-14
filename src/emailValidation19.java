import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.SynchronousQueue;

/*19)Email Validation
   String input1="test@gmail.com"
                1)@ & . should be present;
                2)@ & . should not be repeated;
                3)there should be five charcters between @ and .;
                4)there should be atleast 3 characters before @ ;
                5)the end of mail id should be .com;   */

public class emailValidation19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Scanner st=new Scanner(System.in);
		//String s=st.next();
		String s="testt@gmail.com";
	boolean b=validEmail(s);
	if(b==true)
		System.out.println("valid password");
	else
		System.out.println("Invalid Password");
}
	
	public static boolean validEmail(String s){
		boolean b=false;
		int i=0;
		StringTokenizer t=new StringTokenizer(s,"@");
	String s1=t.nextToken();
	System.out.println(s1);
	String s2=t.nextToken();
	System.out.println(s2);
	StringTokenizer t1=new StringTokenizer(s2,".");
	String s3=t1.nextToken();
	System.out.println(s3);
	String s4=t1.nextToken();
	System.out.println(s4);
	if(s.contains("@")&& s.contains("."))
		i++;
	if(i==1)
		if(s3.length()==5)
			if(s1.length()==4)
				if(s4.equals("com"))
					b=true;
		
		
		return b;
		
	}

}
