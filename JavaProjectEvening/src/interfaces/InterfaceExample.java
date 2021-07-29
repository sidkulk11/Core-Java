package interfaces;

interface testinter
{
	int a=10;   		//by default variable is static and final
	
	void display();		//abstract method
	
}

public class InterfaceExample implements testinter

	{

		public void display()
		{
			System.out.println(a);
			
		}
		
	public static void main(String[] args) 
	{
		
		InterfaceExample inter=new InterfaceExample();
		inter.display();
	}

}
