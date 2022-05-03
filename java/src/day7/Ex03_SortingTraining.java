package day7;

public class Ex03_SortingTraining {
	
	public static void main(String[] args) {
		// "Bubble Sorting"
		
		int arr1[] = {1, 4, 2, 8, 5, 7};
		
		for (int i = 0; i <arr1.length-1; i++)
		{
			for (int j = 0 ; j<arr1.length-1-i; j++)
			{
				if (arr1[j] > arr1[j+1])
				{
					int tmp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = tmp;
				}
			}
		}
		for( int i = 0; i < arr1.length; i++)
		{
			System.out.print(arr1[i]+ " ");
		}
	
		
		
	}
}
