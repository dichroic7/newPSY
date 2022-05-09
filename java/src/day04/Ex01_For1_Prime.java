package day04;

public class Ex01_For1_Prime {

	public static void main(String[] args) {
		/*정수가 소수인지 아닌지 판별하는 코드 작성
		 */
		
		int a = 38463;
		int div = 1;
		if (a == 1)
		{
			System.out.println(a + "은(는) 소수가 아닙니다");
		}
		else
		{
			for (int i = 1; i < a; i++)
			{
				if (a%i == 0) div = i;
			}
			if (div == 1) 
				{
				System.out.println(a + "은(는) 소수입니다");
				}
			else 
				{
				System.out.println(a + "은(는) 소수가 아닙니다");
				}
		}
	}

}
