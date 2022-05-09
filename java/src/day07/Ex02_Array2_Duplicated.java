package day07;

import java.util.Scanner;

public class Ex02_Array2_Duplicated {

	public static void main(String[] args) {
		// 정수 num을 입력받고, 입력받은 정수가 배열에 있는지 없는지 확인하는 코드를 작성
		int arr[] = {1, 2, 1};
		int dup = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int i = sc.nextInt();
		for (int j = 0; j < arr.length; j++)
		{
			if(i == arr[j]) 
				dup++;
		}
		if (dup != 0) System.out.println("True");
		else System.out.println("False");
	}

}
