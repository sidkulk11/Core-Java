package oops;

public class MethodOverloading {

		int a;
		int b;
		
		//First Method
		void sum()
		{
			a=10;
			b=20;
			System.out.println(a+b);
		}
		
		//Second Method
		void sum(int x, int y)
		{
			int a=x;
			int b=y;
			System.out.println(a+b);
			
		}
		
		//Third Method
		void sum(int x, int y, int z)
		{
			System.out.println(x+y+z);
			
		}
		//Fourth Method
		void sum(int x, double y)
		{
			System.out.println(x+y);
			
		}
	
	
	
	
	
	public static void main(String[] args) {
		
			MethodOverloading mo=new MethodOverloading();
			
			mo.sum();            //30      It will call the first method 
			
			mo.sum(100,200);       //300      It will call the second method bcoz both values are "integers"
			
			mo.sum(20, 30, 50);     //100      It will call the third method 
			
			mo.sum(100,0.1);			//100.1      It will call the fourth method
			
	}

}
