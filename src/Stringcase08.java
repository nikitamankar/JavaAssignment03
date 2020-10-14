import java.util.StringTokenizer;
/*8)count the number of times the second word in second string occurs in first string-case
 *  sensitive
input1=hai hello hai where hai Hai;
input2=what hai
output=3;   */
public class Stringcase08 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="hai hello hai where hai Hai";
		String input2="what hai";
		System.out.println(stringCaseSensitive(input1,input2));
	}
public static int stringCaseSensitive(String input1, String input2){
		StringTokenizer st=new StringTokenizer(input2, " ");
			String s1=st.nextToken();
			System.out.println(s1);
			String s2=st.nextToken();
			System.out.println(s2);
			
			StringTokenizer st1=new StringTokenizer(input1, " ");
			int n=0;
			while(st1.hasMoreTokens()){
				if(st1.nextToken().equals(s2)){
					n++;
			  }
			}
			return n;
}
}

