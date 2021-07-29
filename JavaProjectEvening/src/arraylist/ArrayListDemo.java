package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//How to declare ArrayList
		
		ArrayList list=new ArrayList();			//We can store any type of data elements 
		//ArrayList <Integer>list=new <Integer> ArrayList();	//Integer
		//ArrayList <String>list=new <String> ArrayList();	//Strings
		
		//How to add elements/values to ArrayList
		list.add("John");			//0
		list.add("Claire");			//1
		list.add("Batista");		//2
		list.add('S');
		list.add(54.25);
		
		//Find size of ArrayList
		System.out.println(list.size());		//3
		System.out.println("Before removing elements: "+list);		
		
		//Remove elements from ArrayList
		list.remove(0);			//Remove John
		System.out.println(list.size());		//2
		System.out.println("After removing elements: "+list);		
		
		//Insert a new element in the middle of ArrayList
		list.add(1, "Sid");
		System.out.println(list.size());		//2
		System.out.println("After inserting elements in middle of arrayList: "+list);
		
		//Read values from ArrayList using for loop
		/*for (String s:list)						//String
		{
			System.out.println(s);
			
		}*/
		
		for (Object s:list)						//Object: Object type variable can hold any type of values
		{
			System.out.println(s);
			
		}
			
	}

}
