package exceptionhandling;

public class HandleCheckedExceptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Program is started");
		
		System.out.println("Program is in progress");
		
		/*try 
		{
		Thread.sleep(4000);
		}
		catch(InterruptedException e)
		{
			System.out.println("e.getMessage()");
		}		*/
		
		Thread.sleep(4000);
		
		
		System.out.println("Program is completed");
		
		System.out.println("Program is exited");
	}

}
