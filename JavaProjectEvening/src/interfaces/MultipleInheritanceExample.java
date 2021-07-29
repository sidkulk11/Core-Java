package interfaces;

interface A
{
	
	int a=60;
	void display();

}

interface B
{
	
	int b=70;
	void show();

}

public class MultipleInheritanceExample implements A,B

{
	public void display()
	{
		
		System.out.println(a);
	}
	
	public void show()
	{
		
		System.out.println(b);
	}
	public static void main(String[] args) {
		
		MultipleInheritanceExample mul=new MultipleInheritanceExample();
		mul.display();
		mul.show();
		
	}

}
