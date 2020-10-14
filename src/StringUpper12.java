import java.util.StringTokenizer;

/*12)String a="a very fine day"
output:A Very Fine Day  */
public class StringUpper12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="a";
		System.out.println(a);
	
		StringBuffer sb=new StringBuffer();
		StringTokenizer st=new StringTokenizer(a," ");
		while(st.hasMoreTokens()){
			String s2=st.nextToken();
			String s3 = s2.substring(0,1);
		    String s4 = s2.substring(1, s2.length());
            sb.append(s3.toUpperCase()).append(s4).append(" ");
            System.out.println(sb);
		}
		
		
		
		
		
		
		
		
		
		
		/*StringTokenizer st=new StringTokenizer(a," ");
        String s1=st.nextToken();
		System.out.print(s1.toUpperCase());
		String s2=st.nextToken();
		System.out.print(" "+s2.substring(0, 1).toUpperCase()+s2.substring(1));
		String s3=st.nextToken();
		System.out.print(" "+s3.substring(0, 1).toUpperCase()+s3.substring(1));
		String s4=st.nextToken();
	    System.out.print(" "+s4.substring(0, 1).toUpperCase()+s4.substring(1));*/
	 

	}

}
