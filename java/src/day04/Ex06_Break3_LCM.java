package day04;

public class Ex06_Break3_LCM {

	public static void main(String[] args) {
		// 최소 공배수를 구하는 코드
		
		int LCM = 0;
		int small = 12;
		int big = 15;
		if (big%small == 0) System.out.println(big);
		else
		{
			for (int i = big; i <= small*big; i++)
			{
				if (i%small == 0 && i%big == 0)
				{
					LCM = i;
					System.out.println(LCM);
					break;
				}
			}
		}
	}

}
