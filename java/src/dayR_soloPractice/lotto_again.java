package dayR_soloPractice;

public class lotto_again {

	public static void main(String[] args) {
		// 로또 짜는거 한번 다시 복사해보자
		// 규칙 다시 설명 :
		// 1~45 사이의 중복되지 않은 랜덤한 번호 7개를 저장
		// 사용자에게서 번호 6개를 입력받음
		// 6개가 일치하면 1등, 5개가 일치하고 나머지 하나가 보너스와 일치하면 2등, 아니면 3등, 4개면 4등, 3개부터는 미당첨
		// 중복되지 않은 수출력해서 배열에 저장하는게 핵심!
		// pseudocode
		// 필요한 변수는 lotto[], user[], 난수는 (int)math.random()*44+1
		
		//일단 랜덤한 번호 7개 출력 후 배열에 입력
//		int lotto[] = new int[7];
//		for(int i = 0; i < lotto.length; i++)
//		{
//			for(int j = 0; j < i; j++)
//				if(lotto[i] != lotto[j]) lotto[i] = (int)Math.random()*44+1;
//			System.out.print(lotto[i] + " ");
//		}
		
 
	}
	
	public static int[] randomArray(int min, int max, int n)
	{
		int arr[] = new int [n];
		for(int count = 0; count < n; ) {
			int r = (int)(Math.random()*(max-min+1) + min);
			if(!contains(arr, count, r)) {
				arr[count] = r;
				count++;
			}
		}
		return arr;
	}
	
	public static boolean contains(int arr[], int n, int num) {
		//배열이 잘못되거나 비교 갯수가 잘못되서 비교할 필요가 없는 경우
		if(arr.length < n) {
			n = arr.length;
		}
		for(int i = 0; i<n; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
}
