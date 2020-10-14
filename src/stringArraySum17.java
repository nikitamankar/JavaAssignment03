/*17)Find the sum of the numbers in the given input string array
   Input{“2AA”,”12”,”ABC”,”c1a”)
   Output:6 (2+1+2+1)
   Note in the above array 12 must not considered as such
   i.e,it must be considered as 1,2   */
public class stringArraySum17 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input[]={"2AA","12","ABC","c1a"};
		int n=0, sum=0;
		for(int i=0;i<input.length;i++){
         for(int j=0;j<input[i].length();j++){
          char c=input[i].charAt(j);
			if(Character.isDigit(c)){
			 String s=String.valueOf(c);
	          System.out.println(s);
		       int b=Integer.parseInt(s);
	            sum=sum+b;
			}
          }
		}
	       System.out.println("Total number of sum:    "+sum);
	}

}
