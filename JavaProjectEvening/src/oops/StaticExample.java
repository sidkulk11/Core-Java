package oops;

public class StaticExample {

	int a;							//Non static
	static int b;					//static
	
	static void m1()
	{
		
		System.out.println("This is m1 static method");
	}
	
	void m2()              //non static
	{
		
		System.out.println("This is m2 non static method");
	}
	
	void m3()				// non static
	{
		
		a=500;				//non static variable
		b=1000;				//static variable
		
		m1();		
		m2();
	}
	
	
	public static void main(String[] args) 
	{
			//Static methods can access static stuff only
		
		    b=100;
		    System.out.println(b);
			m1();
			
			//a=200;              //Cant access because it is a non static variable
			//m2();					//Cant access because it is a non static variable
			
			StaticExample se=new StaticExample();
			se.a=300;
			System.out.println(se.a);
			se.m2();
			
	}

}
