package day4;

import java.util.Scanner;

public class Ex02_For2_Score 
{

	public static void main(String[] args) 
	{
		// 3명의 국어 점수를 입력받아 총점과 평균을 구하는 코드를 작성
		
		Scanner scan = new Scanner(System.in);
		
		int i;
		int a;
		int sum = 0;
		double avg;
		
		for(i = 1; i <= 3; i++) 
		{
			System.out.println("학생"+i+"의 국어 성적 : ");
			a = scan.nextInt(); //scanner를 이용하여 정수를 입력받아 a에 저장
			sum = sum + a; //초기값 0의 sum에 a를 더해 새로운 sum 생성
		}
		System.out.println("총점 : " + sum);
		avg = (double)sum / 3;
		System.out.println("평균 : " + avg);
		
		scan.close();

	}

}
