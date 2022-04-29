package day5;

import java.util.Scanner;

public class Ex05_UpDownGame {

	public static void main(String[] args) {
		// 0~100 Up Down Game 코드 작성
		
		int min = 1, max = 100;
		int r = (int)(Math.random() * (max-min+1) + min);
		System.out.println("랜덤으로 생성한 수(1~100) : " + r);
		Scanner scan = new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("정수를 입력하세요(1~100) : ");
			int num = scan.nextInt();
			if (num == r) 
				{
				System.out.println("정답입니다!");
				break;
				}
			else if (num > r) System.out.println("DOWN");
			else System.out.println("IF");
		}
	}

}
