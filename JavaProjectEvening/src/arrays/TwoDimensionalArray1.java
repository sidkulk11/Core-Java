package arrays;

public class TwoDimensionalArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= { {20,30,100}, {40,50,110}, {70,80,130}	};
		
		for (int i[]:a)
		{
			for(int j:i)
			{
				System.out.print(j+"  ");
				
			}
			System.out.println();
		}
		
		
	}

}
