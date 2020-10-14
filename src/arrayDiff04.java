/*4)int[] a={12,14,2,26,35}
find the difference b/w max and min values in array
output:35-2=33.              */
public class arrayDiff04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={12,14,2,26,35};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];
		System.out.println("Maximum Number is   "+max);
		System.out.println("Minimum Number is   "+min);
System.out.println("Difference between the largest and smallest values of the said array: "
		+(max-min));
					
				
	}

}
