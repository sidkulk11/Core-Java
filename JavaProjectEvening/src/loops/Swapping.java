package loops;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Largest of 3 numbers
		/*int a=10,b=20,c=30;
		if(a>b && a>c)
		{
			System.out.println("a is greater");
			
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else 
		{
			System.out.println("c is greater");
		}  */
		
	int a=10,b=20, c;
	System.out.println("The initial value of a is "+a);
	System.out.println("The initial value of b is "+b);
	
	c=a;      //value of c is 10
	a=b;//value of a is 20
	b=c;//value of c is 10
	
	System.out.println("The value of a after swapping is "+a);
	System.out.println("The value of b after swapping is"+b);
	
	
	}

}
