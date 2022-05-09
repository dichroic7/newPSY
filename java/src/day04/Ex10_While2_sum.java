package day04;

public class Ex10_While2_sum {

	public static void main(String[] args) {
		// 1부터 5까지의 합을 구하는 코드를 while문으로 작성
		
		int i = 1;
		int sum = 0;
		
		while(i <= 5)
		{
			sum += i;
			i++;
		}
		System.out.println("합 : " + sum);
	}

}
