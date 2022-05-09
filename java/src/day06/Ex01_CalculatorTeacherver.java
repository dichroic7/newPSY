package day06;

import java.util.Scanner;

public class Ex01_CalculatorTeacherver 
{

	public static void main(String[] args) 
	{
		//강사님 ver 계산기
		
		Scanner scan = new Scanner(System.in);
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
			if(ch == 'q') {
				System.out.println("종로합니다");
				break;
			}
			if(ch<'1' || ch>'5')
			{
				System.out.println("잘못된 연산자입니다.");
				continue;
			}
			System.out.print("두 정수를 입력하세요 : ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			double res = 0.0;
			switch(ch)
			{
			case '1':
				res = a + b;
				System.out.println(""+a+'+'+b+"="+res);
				break;
			case '2':
				res = a - b;
				System.out.println(""+a+'-'+b+"="+res);
				break;
			case '3':
				res = a * b;
				System.out.println(""+a+'*'+b+"="+res);
				break;
			case '4':
				res = (double) a / b;
				System.out.println(""+a+'/'+b+"="+res);
				break;
			case '5':
				res = a % b;
				System.out.println(""+a+'%'+b+"="+res);
				break;
				
			}
		}
	}
}