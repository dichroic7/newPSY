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
		
		//역직삼각형

		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5-i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		//5줄 피라미드
		/*      *
		 *     ***
		 *    *****
		 *   *******
		 *  *********
		 *  와
		 *     *
		 *    ** *
		 *   *** **
		 *  **** ***
		 *  를 각각 출력하시오
		 *  
		 *      **
		 *     ****
		 *    ******
		 *   ********
		 *  **********
		 */
		int n = 6;
		for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= n-i; j++)
				{
					System.out.print(" ");
				}
				for (int j = 1; j <= 2*i-1; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
	}

