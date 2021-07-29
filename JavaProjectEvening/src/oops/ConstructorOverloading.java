package oops;

public class ConstructorOverloading {

	int a=0;
	int b=0;
	double c=0;
	
	//Default constructor ----> Does not have any parameters
	//First
	ConstructorOverloading()
	{
		a=10;
		b=20;
		c=20.5;
	}
	
     //Second
	ConstructorOverloading(int x, int y)
	{
		a=x;
		b=y;
		
	}
	
	//Third
	ConstructorOverloading(int x,double y)
	{
		a=x;
		c=y;
		
	}
	
	//Fourth
	ConstructorOverloading(int x,int y, double z)
	{
		a=x;
		b=y;
		c=z;
		
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
	
		/*ConstructorOverloading co= new ConstructorOverloading();    		//Call first constructor
		co.display();             */
		
		/*ConstructorOverloading co= new ConstructorOverloading(30,40);    		//Call second constructor
		co.display();      */
		
		/*ConstructorOverloading co= new ConstructorOverloading(30,80.52);    		//Call third constructor
		co.display();     */
		
		ConstructorOverloading co= new ConstructorOverloading(30,90,52.74);    		//Call fourth constructor
		co.display();
		
	}
	

}
