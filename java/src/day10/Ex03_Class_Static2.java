package day10;

public class Ex03_Class_Static2 {

	public static void main(String[] args) {
		Test1 printY;
		Test1 t1 = new Test1();
		//t1.printX()
		Test1 t2 = new Test1();
		Test1 t3 = new Test1();
		Test1.printCount();
		Ex3_Class_Static2 ex3 = new Ex3_Class_Static2();
		System.out.println(ex3.sum(1,2));

	}
	public static int sum(int num1, int num2)
	{
		return num1 + num2;
	}

}

class Test1
{
	int x;
	static int count;
	
	void printX()
	{
		System.out.println(x);
	}
	static void printCount()
	{	
		System.out.println(count);
	}
	public Test1() { count++; }
}