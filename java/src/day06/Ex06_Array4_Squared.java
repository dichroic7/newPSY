package day06;

import java.util.Scanner;

public class Ex06_Array4_Squared {

	public static void main(String[] args) {
		// 배열에 1부터 10의 제곱을 입력하고, 원하는 배열의 제곱수를 출력하는 코드
		
		int arr[] = new int [10];
		
		for (int i =0; i < arr.length; i++)
		{
			arr[i] = (i+1)*(i+1);
			System.out.println(i+1+"의 제곱 : " + arr[i]);
		}
		
		int arr2[] = new int[11];
		for (int i = 1; i < arr2.length; i++)
		{
			arr2[i] = i*i;
			System.out.println(arr2[i]);
		}
	}

}
