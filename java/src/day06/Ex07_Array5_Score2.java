package day06;

import java.util.Scanner;

public class Ex07_Array5_Score2 {

	public static void main(String[] args) {
		// 학생 수 입력(최대 10), 점수 입력 후 총점과 평균을 출력하는 코드
		// 배열 수 미리 지정해주기 꼭!(바로 아래 두 번째 줄)
		int count = 10;
		int [] num = new int[count];
		int sum = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요(1~10) : ");
		count = sc.nextInt();
		num = new int[count];
		
		if(count < 1)
		{
			System.out.println("최소 1명부터입니다.");
		}
		else if (count > 10)
		{
			System.out.println("최대 10명까지입니다.");
		}
		else
		{
			for (int i = 0; i < count; i++)
			{
				System.out.println(i+1+"번학생 : ");
				num[i] = sc.nextInt();
				sum += num[i];
				avg += (double) sum / count;
			}
			System.out.println("총점 : "+sum+ ", 평균 : "+avg);
		}
	}

}
