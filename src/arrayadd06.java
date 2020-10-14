/*6)input={"1","2","3","4"}
    output=10
ie,if string elements are nos,add it.
    input={"a","b"}
    output=-1;*/
public class arrayadd06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//String[] input={"1","2","3","4"};
	String[] input={"a","b"};
	System.out.println(addDigits(input));
	}
public static int addDigits(String[] input){
		int m=0;
		for(int i=0;i<input.length;i++){
			String s=input[i];
			for(int j=0;j<s.length();j++){
				char c=s.charAt(j);
				System.out.println(c);
				if(Character.isDigit(c)){
				m=m+Integer.parseInt(s);
			}else{
					m=-1;	
				 }
				}
			}
	return m;
 }
}

