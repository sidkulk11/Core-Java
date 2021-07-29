package exceptionhandling;

public class ExceptionsExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Start");
		//Thread.sleep(4000);					//InterruptedException
		
		int i=10;
		System.out.println(i/0);				//Arithmatic Exception
		
		System.out.println("Stop");
	}

}
