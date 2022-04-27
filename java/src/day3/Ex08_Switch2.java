package day3;

public class Ex08_Switch2 {

	public static void main(String[] args) {
		/*월이 주어졌을 때 주어진 월의 마지막일을 출력하는 코드를 Switch문으로 작성할 것
		 * 31 : 1 3 5 7 8 10 12
		 * 30 : 4 6 9 11
		 * 28 : 2
		 */
		int m = 0;
		
		switch(m) 
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일");
			break;
		case 2:
			System.out.println("28일");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일");
			break;
		}
	}

}
