package dayR_soloPractice;

import java.util.Scanner;

public class test1_stringintcolor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = "홍길동";
		int i = 1;
		
		System.out.println("이름을 입력하세요 : ");
		str = scan.nextLine();
		System.out.println("몇번째입니까?");
		i = scan.nextInt();
		
		System.out.println(i + "번째 " + str);

	}

}
