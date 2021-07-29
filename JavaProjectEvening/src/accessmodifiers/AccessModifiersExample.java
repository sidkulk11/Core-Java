package accessmodifiers;

class A
{
	  /*private int i=10;
		
		private void m1()
		{
			System.out.println(i);
			
		}*/
		
		int i=10;
		void m1()
		{
			System.out.println(i);
		}
}


public class AccessModifiersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A aobj= new A();
		//aobj.i=10;					//cannot access since it is private
		//aobj.m1();					//cannot access since it is private
		
		aobj.i=10;					  	//can access since it is default
		aobj.m1();						//can access since it is default
	
	}

}
