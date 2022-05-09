package day07;

public class Ex01_Array1 {

	public static void main(String[] args) {
		/* 5개짜리 배열을 만들고, 0번지에 1
		 * 
		 */
		
		int arr1[] = new int [5];
		for (int i = 0; i < arr1.length; i++)
		{
			arr1[i] = i+1;
			System.out.print(arr1[i] + " ");
		}

		
		

	}

}
