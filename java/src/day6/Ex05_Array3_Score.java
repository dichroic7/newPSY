package day6;

import java.util.Scanner;

public class Ex05_Array3_Score {

	public static void main(String[] args) {
		/* 학생 3명의 성적을 입력받고 총점과 평균을 구하는 코드를 작성
		 * 단, 총점과 평균을 출력한 다음 학생 3명의 성적을 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[3];
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < nums.length; i++)
		{
			System.out.print((i+1)+"번째 점수를 입력하세요 : ");
			nums[i] = sc.nextInt();
		}
		for(int i = 0; i<nums.length; i++)
		{
			sum += nums[i];
			avg = (double) sum / nums.length;	
		}
		System.out.println("학생 3명의 총점은 "+sum+"점이고, 평균은 "+avg+"점입니다");
		for (int i = 0; i<nums.length; i++)
		{
			System.out.println("학생 "+(i+1)+"의 점수는 "+nums[i]+"점입니다");
		}
			

	}

}
