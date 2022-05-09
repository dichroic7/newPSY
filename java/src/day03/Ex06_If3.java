package day03;

public class Ex06_If3 {

		public static void main(String[] args) 
		{
			/* 2,3,6의 배수 판별 예제(day2.Ex17_Test5.java 참고) 중첩 if문으로 바꿈!
			 * 중첩 if문에서 중요한 점 : 괄호관리!!
			 */
			int num = 9;
			
			if(num % 2 == 0) 
			{
				if(num % 3 == 0) 
				{
					System.out.println(num + "는 6의 배수");
				}
				else {System.out.println(num + "는 2의 배수");}
			}
			else if(num % 3 == 0 && num % 2 != 0) 
			{
				System.out.println(num + "는 3의 배수");
			}
			else 
			{
				System.out.println(num + "는 2,3,6의 배수가 아님");
			}
		}
}
