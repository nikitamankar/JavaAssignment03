/*2)Given array of integers,print the sum of elements squaring/cubing as per the power of their 
indices.         
//answer=  sum=sum+a[i]^i;
     eg:input:{2,3,5}
	Output:29
*/
public class integer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input={2,3,5};
		int sum = 0 ;
		for(int i=0;i<input.length;i++)
		
		sum =(int) (sum + Math.pow(input[i], i));
	
		     
			System.out.println(sum);
       
		
	    
	}


}
