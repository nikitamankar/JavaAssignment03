/*18)String[] input1=["Vikas","Lokesh",Ashok]
   expected output String: "Vikas,Lokesh,Ashok"    */
public class String18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1[]={"Vikas","Lokesh","Ashok"};
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<input1.length;i++)
		
			sb.append(input1[i]).append(",");
		System.out.println(sb);

	}
	 

}
