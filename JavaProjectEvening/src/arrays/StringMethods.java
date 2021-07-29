package arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//finding length of String
		String s="Welcome";
		String t=" Home";
		System.out.println(s.length());    
		
		//concatenating string s and t
		String s1="Welcome";
		String t1=" Home";
		System.out.println(s1+t1); 
		System.out.println(s1.concat(t1));  
		System.out.println("Welcome"+" Home");
		System.out.println("Welcome".concat(" Home"));
		
		//equals
		String s2="Welcome";
		String t2="welcome";
		System.out.println(s2.equals(t2));                //false
		
		//equalsIgnoreCase
		System.out.println(s2.equalsIgnoreCase(t2));     //true (Will not consider case sensitivity)
		
		//contains
		System.out.println(s2.contains("come"));         //true
		System.out.println(t2.contains("WEL"));          //false
	
		//substring
		System.out.println(s2.substring(1,5));            //elco
		System.out.println(t2.substring(4,6));            //om
		
		//replace
		System.out.println(s2.replace('W','R'));           //Relcome
		System.out.println(t2.replace("come","done"));     //weldone
	}

}
