import java.util.StringTokenizer;
/*13)Take the word with a max length in the given sentance
 in that check for vowels if so count the no.of occurances !
  Input 1="Bhavane is a good girl"
  Output =3
  Input 1="Bhavanee is a good girl"
  Output =4                                               */
public class vowelsMax13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Bhavanee is a good girl";
		int max=0,n=0;
		String s4="AEIOUaeiou";
		String s3=new String();
		StringTokenizer st=new StringTokenizer(s1," ");
		while(st.hasMoreTokens()){
			int n1=0;
			String s2=st.nextToken();
			 
			if(s2.length()>max){
				max=s2.length();
			s3=s2;
			System.out.println(s3);
		}
		}
		for(int i=0;i<s3.length();i++){
			for(int j=0;j<s4.length();j++)
				if(s3.charAt(i)==s4.charAt(j))
				n++;
		}
		System.out.println(n);

	}

}
