package inheritance;

class Fruits
{
	int getpriceofFruits()
	{
		return 50;
	}
}

class Mango extends Fruits 
{
	int getpriceofFruits()
	{
		return 100;
		
	}
}

class Apple extends Fruits 
{
	int getpriceofFruits()
	{
		return 200;
		
	}
}


public class Overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruits fru=new Fruits(); 
		System.out.println(fru.getpriceofFruits()); 
		
		Mango man=new Mango();
		System.out.println(man.getpriceofFruits()); 
		
		Apple app=new Apple();
		System.out.println(app.getpriceofFruits()); 
	}

}
