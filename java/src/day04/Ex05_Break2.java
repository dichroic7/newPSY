package day04;

import java.util.Scanner;

public class Ex05_Break2 {

	public static void main(String[] args) {
		// 정수를 5번 입력하고, 입력한 정수를 콘솔에 출력하는 코드를 작성하세요
		
		int i, num;
		Scanner scan = new Scanner(System.in);
		
		for(i = 1; i<=5; i++)
		{
			System.out.println("양의 정수 입력 : ");
			num = scan.nextInt();
			System.out.println(num);
		}
		
		//scan.close();
		
		//양의 정수를 무한으로 입력하고, 음수이면 반복문을 빠져 나오는 코드 
		
		int j, num2;
		
		for (j = 1; j>0; j++)
		{
			System.out.println("양의 정수 입력 : ");
			num2 = scan.nextInt();
			if (j < 0)
			{
				break;
			}

		}
		
		scan.close();

	}

}
