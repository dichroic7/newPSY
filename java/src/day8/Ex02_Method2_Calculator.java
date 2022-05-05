package day8;

public class Ex02_Method2_Calculator {

	public static void main(String[] args) {
		// 두 정수와 산술연산자가 주어지면 산술연산결과를 알려주는 메소드
		int a = 1, b = 2;
		char op = '/';
		double res = calculator(a, op, b);
		System.out.println(""+a+op+b+"="+res);
	}
	public static double calculator (int num1, char op, int num2)
	{
		double res = 0;
		switch(op)
		{
		case '+' : res = num1 + num2; break;
		case '-' : res = num1 - num2; break;
		case '*' : res = num1 * num2; break;
		case '/' : res = (double) num1 / num2; break;
		case '%' : res = num1 % num2; break;
		}
		return res;
	}

}
