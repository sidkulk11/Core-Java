package exceptionhandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[5];					
				
		try 
		{
			arr[4]= 100;						//ArrayIndexOutOfBoundsException  	//if arr[10]=100; (Not executed)   if arr[4]=100; (executed)   
			
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
			
		}
		finally
		{
			System.out.println("tHIS is finally block");
			
		}
	}

}
