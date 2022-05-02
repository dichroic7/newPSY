package day6;

import java.util.Scanner;

public class Ex01_Calculator {

	public static void main(String[] args) {
		/* 문자를 입력받아 출력
		 * 가장 기본적으로 복붙해서 쓸 수 있는 코드는 아래 세줄!
		 * System.out.println("문자를 입력하세요 : ");
		 * char ch = scan.next().charAt(0);
		 * System.out.println(ch);
		 */
		
		Scanner scan = new Scanner(System.in);

		/*방법1 for문
		for( ; ; )
		{
			System.out.println("문자를 입력하세요 : ");
			char ch = scan.next().charAt(0);
			System.out.println(ch);
			if(ch == 'q') 
			{
				System.out.println("q에 도달했습니다");
				break;
			}
		}*/
		
		/*방법 2 do while 문
		char ch = 'a';
		do
		{
			System.out.println("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
			System.out.println(ch);
		}
		while (ch != 'q');*/
		char ch = 'a';	
		for( ; ; )
		{
			System.out.println("산술 연산자 메뉴 : ");
			System.out.println("1. 더하기 : ");
			System.out.println("2. 빼기: ");
			System.out.println("3. 곱하기 : ");
			System.out.println("4. 나누기 : ");
			System.out.println("5. 나머지 : ");
			System.out.println("q. 종료 : ");
			System.out.println("메뉴를 선택하세요 : ");
			ch = scan.next().charAt(0);
			while(ch == '1')
			{
				System.out.println("정수 1을 입력하세요 : ");
				int a = scan.nextInt();
				System.out.println("정수 2를 입력하세요 : ");
				int b = scan.nextInt();
				System.out.println(a + "+" + b + "=" + (a+b));
				System.out.println("계속하시겠습니까?");
				System.out.println("1. 메뉴로 돌아가기");
				System.out.println("2. 현재 연산 계속하기");
				System.out.println("q. 종료하기");
				char c = scan.next().charAt(0);
				if (c == 'q')
				{
					System.out.println("프로그램을 종료합니다");					
					break;
				}
			}
			while(ch == '2')
			{
				System.out.println("정수 1을 입력하세요 : ");
				int a = scan.nextInt();
				System.out.println("정수 2를 입력하세요 : ");
				int b = scan.nextInt();
				System.out.println(a + "-" + b + "=" + (a-b));
				break;
			}
			while(ch == '3')
			{
				System.out.println("정수 1을 입력하세요 : ");
				int a = scan.nextInt();
				System.out.println("정수 2를 입력하세요 : ");
				int b = scan.nextInt();
				System.out.println(a + "*" + b + "=" + (a*b));
				break;
			}
			while(ch == '4')
			{
				System.out.println("정수 1을 입력하세요 : ");
				int a = scan.nextInt();
				System.out.println("정수 2를 입력하세요 : ");
				int b = scan.nextInt();
				System.out.println(a + "/" + b + "=" + ((double)a/b));
				break;
			}
			while(ch == '5')
			{
				System.out.println("정수 1을 입력하세요 : ");
				int a = scan.nextInt();
				System.out.println("정수 2를 입력하세요 : ");
				int b = scan.nextInt();
				System.out.println(a + "%" + b + "=" + (a%b));
				break;
			}
			while(ch =='q')
			{
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
		}

	}

}
