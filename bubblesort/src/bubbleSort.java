import java.util.Arrays;
import java.util.Random;
	


public class bubbleSort {

	public final static int MAX_SIZE = 1000000;
	//Changing just the MAX_SIZE will edit the total size, no further changes are neccesary
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		Random rand = new Random(100); 
	
		 int a[] = new int[MAX_SIZE];
		
		//initialize the random number generator.
		for(int i = 0; i < MAX_SIZE; i++)
		{
			a[i] = rand.nextInt(MAX_SIZE) + 1; 
		}
		//n is between 1 and 101
		
		
		long start = System.currentTimeMillis();
		long end = 0;
		long total = 0;
		

		int n = 0;
		boolean swapped = false;
		int max = MAX_SIZE;
		/*do
		{
			swapped = false;
			int i = 0;
			while(i < (max - 1))
			{
				if (a[i] > a[i+1])	
				{
					n = a[i];
					a[i] = a[i + 1];
					a[i + 1] = n;
					swapped = true;
				}
				
			i++;		
			}
			max = max - 1;
		} while (swapped == true);
		
		*/
		
		Arrays.sort(a);

		end = System.currentTimeMillis();
		/*
		for( int i = 0; i < MAX_SIZE; i++)
		{
			System.out.println(a[i]);
		}*/
		
		total = end - start;
		
		String s = String.format("Duration = %d ms", total );
		
		System.out.println(s);
		
		
		
	}

}
