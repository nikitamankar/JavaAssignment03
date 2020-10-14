/* 7) arraylist1={ 1,2,3,4,5}
    arraylist2={ 6,7,8,9,10}
size of both list should be same 
output={6,2,8,4,10} */
public class arraylist07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] m={1,2,3,4,5};
		int[] n={6,7,8,9,10};
		
		int[] c=new int[m.length];
		for(int i=0;i<m.length;i++){
			if(i%2==0)
				c[i]=n[i];
			else
				c[i]=m[i];
		}
		for(int i=0;i<c.length;i++){
			System.out.print(" "+c[i]);
		}
}

}
