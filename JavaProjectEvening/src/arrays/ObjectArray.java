package arrays;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Object a[]=new Object[5];
		
		a[0]="HELLO Sid";  //String
		a[1]='S';			// Character
		a[2]=true;// boolean
		a[3]=40;  // integer
		a[4]=16.66; //double
		*/
		Object a[]= {"Hello Sid", "F", true, 40, 16.89};
		
		for(Object i:a)                 // integer int i:a, double i:a, character i:a;boolean i:a, integer i:a; 
										// Object i:a
			
 		{
			System.out.println(i);
		}
		
	}

}
