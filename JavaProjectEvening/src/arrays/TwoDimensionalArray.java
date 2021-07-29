package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a[][]=new int [3][2]; 			//declaration
		Object a[][]=new Object[3][2];
		
		//storing elements/values into array
		/*a[0][0]= 10;
		a[0][1]= 20;
		                   
		a[1][0]= 30;
		a[1][1]= 40;
		
		a[2][0]= 50;
		a[2][1]= 60; */
		
		a[0][0]= "Tom Hanks";
		a[0][1]= 20.65;
		                   
		a[1][0]= 'D';
		a[1][1]= 52;
		
		a[2][0]= true;
		a[2][1]= 75; 
		
		// classic for loop
		
		/*for(int i=0;i<=2;i++)           //For incrementing the rows
		{
			for (int j=0;j<=1;j++)             //For incrementing the coloumns
			{
				System.out.println(a[i][j]);
			}
		
		} 
		
		//for...each loop
		for(int i[]:a)
		{
			for(int j:i)
			{
				System.out.println(j); 
			}
		}*/
		
		for(Object i[]:a)
		{
			for(Object j:i)
			{
				System.out.print(j+"  "); 
			}
			System.out.println();
		}
		
		
	}

}
