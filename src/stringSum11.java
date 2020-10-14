/*11)Get all the numbers alone from the string and return the sum. */
public class stringSum11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1s23ss";
		String s1=new String();
		int n=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(Character.isDigit(c)){
				s1=String.valueOf(c);
			   n=n+Integer.parseInt(s1);
		}
		}
		System.out.println("Sum of Digits present in String:   "+n);
			
		

	}

}
