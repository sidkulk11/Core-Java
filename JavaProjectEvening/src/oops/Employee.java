package oops;

public class Employee {

	
		// TODO Auto-generated method stub

		int empid;                                 //Variables
		String empname;								//Variables
		int salary;									//Variables
		int deptno;									//Variables
		
		//Constructor
		/*Employee(int id, String name,int sal,int dno)
		{
			empid=id;
			empname=name;
			salary=sal;
			deptno=dno;
		}                    */
		
		void setdata(int id, String name,int sal,int dno)
		{
			empid=id;
			empname=name;
			salary=sal;
			deptno=dno;
		}
		
	    //Print
		void display()
		{
			
			System.out.println(empid);              //Methods
			System.out.println(empname);			//Methods
			System.out.println(salary);				//Methods
			System.out.println(deptno);				//Methods
		}
		
		
		//main method
		public static void main(String[] args) 
		{
			
			//Assigning values to class variables using object - First Method
			/*Employee emp1=new Employee();             //employee1
			emp1.empid= 50;
			emp1.empname= "Sid";
			emp1.salary = 50000;
			emp1.deptno = 12;
			emp1.display();     */
			
			/*Employee emp2=new Employee();             //employee2
			emp2.empid= 100;
			emp2.empname= "Rucha";
			emp2.salary = 90000;
			emp2.deptno = 15;
			emp2.display();      */ 
			
			//Assigning values to class variables using Constructor - Second Method 
			/*Employee emp1=new Employee(50, "Sid", 50000, 12);
			emp1.display();
			
			Employee emp2=new Employee(100, "Rucha", 90000, 15); 
			emp2.display();                               */
			
			//Assigning values to class variables using method - Third Method 
			Employee emp1=new Employee();
			emp1.setdata(50, "Sid", 50000, 12);
			emp1.display();
			
			Employee emp2=new Employee();
			emp2.setdata(100, "Rucha", 90000, 15);
			emp2.display();
	}

}
