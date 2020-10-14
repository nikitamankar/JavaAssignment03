import java.util.StringTokenizer;

/*1)input1="abc2012345"
	input2="abc2112660"
	input 3=4
here "abc**" refers to customer id.
12345 refers to last month eb reading and 12660 refers to this month eb reading
find the difference between two readings and multiply it by input3

ie., output=(12660-12345)*4   */
public class reading01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input1="abc2012345";
		String input2="abc2112660";
		int input3=4;

		input1=input1.substring(5, input1.length());
		System.out.println("Last Month EB reading : "+input1);
		
	
		input2=input2.substring(5, input2.length());
		System.out.println("This Month EB reading : "+input2);
		
      int p=Integer.parseInt(input1);
      int q=Integer.parseInt(input2);
      int s=(q-p)*input3;//315*4
      System.out.println(s);
	}
}
