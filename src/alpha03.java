/*3)Given array of string check whether all the elements contains only digits not any alaphabets.
if condn satisfied print 1 else -1.
Input:{"123","23.14","522"}
output:1
Input1:{"asd","123","42.20"}
output:-1        */
public class alpha03 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	        String[] input1={"123","23.14","522"};
		      //String[] input1={"asd","123","42.20"};
		      System.out.println(StringDigitAlpha(input1));
		  }
public static int StringDigitAlpha(String[] input1) {
			int n=0;
			for(int i=0;i<input1.length;i++){
				String s=input1[i];
				System.out.println(" "+s);
				for(int j=0;j<s.length();j++){
					char c=s.charAt(j);
					if(Character.isDigit(c)){
						n=1;
					}else{
							n=-1;
							break;
						}
				
				}
		}
			
	return n;
  }
}
