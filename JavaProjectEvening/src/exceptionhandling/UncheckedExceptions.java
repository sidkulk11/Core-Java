package exceptionhandling;

public class UncheckedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		//System.out.println(a/0);		//Arithmetic Exception

		String s=null;
		//System.out.println(s.length());   //NullPointerException
		
		String st="abcdef";
		//int i=Integer.parseInt(st);			//NumberFormatException
		//System.out.println(i);
		
		int arr[]=new int[5];					//ArrayIndexOutOfBoundsException
		arr[10]=100;
		
	}

}
