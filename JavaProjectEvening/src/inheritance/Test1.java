package inheritance;

class A
	{
		int a,b;
		public void display()
		{
			System.out.println(a+b);
			
		}
	}
class B extends A
	{
			int x,y;
			public void show()
			{
				System.out.println(x+y);
				
			}
	}

class C extends B
{
	int p,q;
	public void addition()
	{
		System.out.println(p+q);
		
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		/*A aobj= new A();
		aobj.a=100;
		aobj.b=200;
		aobj.display();    */
	
		B bobj= new B();
		bobj.x=10;
		bobj.y=20;
		bobj.show();
		
		bobj.a=400;
		bobj.b=500;
		bobj.display();
		
		C cobj=new C();
		cobj.a=700;
		cobj.b=800;
		cobj.p=100;
		cobj.q=900;
		cobj.x=123;
		cobj.y=456;
		
		cobj.display();
		cobj.show();
		cobj.addition();
		
		
		
	}

}
