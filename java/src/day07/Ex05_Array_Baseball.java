package day07;

import java.util.Scanner;

public class Ex05_Array_Baseball {

	public static void main(String[] args) {
		// 정수 3개짜리 배열 com을 생성 한 후 랜덤으로 1~9사이의 세 정수를 만들어 배열에 저장하는 코드
		int com[] = new int[3];
		// 숫자가 서로 중복되지 않게 조정
		int count = 0;
		for (; count < 3; )
		{
			int r = (int)(Math.random()*8+1);
			int i = 0;
			for(; i<count; i++)
			{
				if(r ==com[i]) {break;}
			}
			if(i == count)
			{
				com[count] = r;
				System.out.print(com[count] + " ");
				count++;
			}
		}
		System.out.println();
			
		// 사용자가 정수 3개를 입력하여 3S가 될때까지 게임을 진행
		int user[] = new int[3];
		int strike = 0;
		int ball = 0;
		Scanner sc = new Scanner(System.in);

		while(strike < 3)
		{
			strike = 0;
			ball = 0;
			System.out.println("공을 던져주세요(예시 : 1 2 3) : ");
			for (int u = 0; u < user.length; u++)
			user[u] = sc.nextInt();

			for (int i = 0; i < com.length; i++)
			{
				for (int j = 0; j < user.length; j++)
				{
					if (com[i] == user[j])
						if (i == j) 
						{
							strike++;
						}
						else if (i != j)
						{
							ball++;
						}
				}
			}
			if (strike == 3) System.out.print("Home run!!");
			if (strike != 0 ) System.out.print(strike + "Strike ");
			if (ball != 0) System.out.print(ball + "Ball ");
			if (strike == 0 && ball == 0) System.out.print("Out!");
			System.out.println();
		}

	}

}
