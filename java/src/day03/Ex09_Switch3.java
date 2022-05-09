package day03;

import java.util.Scanner;

public class Ex09_Switch3 {

	public static void main(String[] args) {
		/*두 정수와 산술 연산자를 입력받아 결과를 switch문으로 출력
		 * 산술 연산자가 아닌 경우 ??은 산술 연산자가 아닙니다로 출력
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.print("연산자를 입력하세요 : ");
		char op1 = scan.next().charAt(0);
		
		switch(op1)
		{
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println((double)num1/num2);
			break;
		case '%':
			System.out.println(num1%num2);
			break;
		default :
			System.out.println("??은(는) 올바른 산술 연산자가 아닙니다");
			break;
		}
			
	}
}
