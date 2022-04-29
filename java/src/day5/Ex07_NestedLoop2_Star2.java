package day5;

public class Ex07_NestedLoop2_Star2 {

	public static void main(String[] args) {
		// 직삼각형
		
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}

	}

}
