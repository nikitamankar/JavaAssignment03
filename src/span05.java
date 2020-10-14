/*5)Given an array find the largest 'span'(span is the number of elements between two same digits)
    find their sum.
	a[]={1,4,2,1,4,1,5}
	Largest span=5       */
public class span05 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,4,2,1,4,1,5};
		int max=0, m1=0,p1=0,p2=0;
		int sum=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++)
				if(a[i]==a[j])
					m1=j;           //3,5
		//System.out.println(m1);
	        if((m1-i)>max){         //3-0>0,5-0>3
	        	max=m1-i;           //3,5
	        	p2=m1;              //3,5
	        	System.out.println(p2);
	        	p1=i;               //0,0
	        	System.out.println(p1);
	        	System.out.println("Span is: "+(p2-p1));//3,5
	       }
		}
			for(int i=0;i<=p2;i++){
				sum=sum+a[i];
				}
			System.out.println("sum is:   "+sum);
	}
		}
