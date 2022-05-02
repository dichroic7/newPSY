package day6;

public class Ex04_Array2 {

	public static void main(String[] args) {
		int [] arr = new int[5];
		//arr 0번지에 1을 저장
		arr[0] = 1;
		System.out.println(arr[0]);
		arr[1] = 2;
		//5개짜리 배열은 5번지가 없다, 0번부터 시작하기때문
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// 배열을 표시하는 3가지 방법
		System.out.println("--------------------");
		for(int i = 0; i <=4; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("--------------------");
		for(int i = 0; i < 5; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("--------------------");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
