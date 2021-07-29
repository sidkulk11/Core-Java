package inheritance;



	class Bank
	{
		int getrateofinterest()
		{
			return 0;
		}
		
	}
	
	class SBI extends Bank				//overriden
	{
		int getrateofinterest()
		{
			return 10;
		}
		
	}
	
	class ICICI extends Bank			//overriden
	{
		int getrateofinterest()
		{
			return 15;
		}
		
	}
	
	class Axis extends Bank				//overriden
	{
		int getrateofinterest()
		{
			return 12;
		}
		
	}
	
	public class Overriding {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI sbiobj=new SBI();
		System.out.println(sbiobj.getrateofinterest());			//10
		
		ICICI iciciobj=new ICICI();
		System.out.println(iciciobj.getrateofinterest());		//15
		
		Axis axisobj=new Axis();
		System.out.println(axisobj.getrateofinterest());		//12
	}

}
