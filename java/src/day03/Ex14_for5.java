package day03;

public class Ex14_for5 {

	public static void main(String[] args) 
	{
		// 정수 i의 약수를 출력하는 코드 작성
		int i = 12;
		for(int j=1; j<=i; j++)
		{
			if(i % j == 0)
			{
				System.out.println(j);
			}
		}
	
	}
}
