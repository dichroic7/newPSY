package day8;

public class Ex08_Method6_Array {

	public static void main(String[] args) {
		// 배열을 출력하는 메소드 작성
		// 매개변수 : 정수형 배열 int arr[]
		// 리턴타입 : 없음 (void)
		// 메소드명 : printarray
		int arr[] = {1, 4, 7, 89, 1};
		printArray(arr);
		System.out.println(contains(arr, 1));
		System.out.println(contains2(arr, 89, 4));
	}
	public static void printArray(int arr1[])
	{
		for (int i =0; i < arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}
	/* 기능 : 정수형 배열에 정수 num가 있는지 없는지 알려주는 메소드
	 * 매개변수 : int arr[], int num
	 * 리턴타입 : boolean
	 * 메소드명 : contains
	 */
	public static boolean contains(int arr[], int num)
	{
		int TF = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(num == arr[i])
			{
				TF++;
			}
		}
		if (TF != 0) return true;
		else return false; 	
	}
	/* 정수형 배열에서 0번지부터 n번지까지중에서 정수 num 가 있는지 없는지 알려주는 메서드
	 * 매개변수 : int arr[], int num, int n
	 * 리턴타입 : boolean
	 * 메서드명 : contains
	 */
	public static boolean contains2(int arr[], int num, int n)
	{
		for(int i = 0; i < n; i++)
			if(num == arr[i])
			{
				return true;
			}
		return false;
	}

}
