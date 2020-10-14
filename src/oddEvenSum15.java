/*15) Given an array int a[]. Add the sum at even indexes.do the same with odd indexes.
	if both the sum is equal return 1 or return -1.        */
public class oddEvenSum15 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
//		      0 1 2 3 4
	 int[] a={1,2,3,4,2};
	 int[] b=new int[a.length];
	 int[] c=new int[a.length];
	 int oddSum=0,evenSum=0;
	 for(int i=0;i<a.length;i++){
		 if(i%2==0)
			 b[i]=a[i];
		  else
			 c[i]=a[i];
		}
	 for(int j=0;j<b.length;j++){
		 evenSum=evenSum+b[j];
		  }
	 System.out.println("Sum of even indexes:  "+evenSum);
	 
	 for(int k=0;k<c.length;k++){
		 oddSum=oddSum+c[k];
		  }
	 System.out.println("Sum of odd indexes:  "+oddSum);
	 
	 if(evenSum==oddSum)
		 System.out.println("Sum are Equal:    1");
	 else 
		 System.out.println("Sum are not Equal:     -1");
	 

	}

}
