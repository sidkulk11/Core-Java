package arrays;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[]=new String [5];
		
		s[0]="Sid";
		s[1]="Rucha";
		s[2]="Dad";
		s[3]="Mom";
		s[4]="Bro";
		
		System.out.println(s.length); //Returns length for an array
	
		for(String i:s)
		{
			System.out.println(i);
		}
	
	}

}
