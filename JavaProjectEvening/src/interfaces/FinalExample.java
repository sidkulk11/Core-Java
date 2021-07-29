package interfaces;

class Test
{
	final int a=10;
	
		final void m1()
		{
			//a=20; 					//Not valid because a is final keyword
			System.out.println(a);
			
		}
class Test123 extends Test
{
	/*void m1()							//not valid because m1 is final method
	{
						
		System.out.println("m1 is overridden");   //Not valid because a is final keyword
		
	}     */
}
	
}




public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
