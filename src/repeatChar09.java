/*9)find the no.of charcters,that has repeated 3 consecutive times
input1:"aaabbccc"
ouput1=2;     */
public class repeatChar09{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String input1="aaabbccc";
    int sum=0, c=0;
	for(int i=0;i<input1.length()-1;i++){
		
			if((input1.charAt(i)==input1.charAt(i+1)))
                sum++;
			else
				sum=0;
	if(sum==2)
		c++;
	
		}
	System.out.println("repeated 3 consecutive times:   "+c);
	}
}
