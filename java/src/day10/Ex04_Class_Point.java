package day10;

import java.util.Scanner;

public class Ex04_Class_Point {

	public static void main(String[] args) {
		/*  아래와 같이 출력되도록 코드를 작성하세요.
		 * 메뉴
		 * 1. 좌표설정
		 * 2. 좌표출력
		 * 3. 종료
		 * 메뉴 선택 : 1
		 * 좌표를 입력하세요 (예 : 1 2 3) : 1 2 3
		 * 메뉴
		 * 1. 좌표설정
		 * 2. 좌표출력
		 * 3. 종료
		 * 메뉴 선택 : 2
		 * (1,2,3)
		 * 메뉴
		 * 1. 좌표설정
		 * 2. 좌표출력
		 * 3. 종료
		 * 메뉴 선택 : 3
		 * 프로그램 종료
		 */
		Scanner scan = new Scanner(System.in);
		Point3D1 po = new Point3D1(1, 2, 3);
		int menu = -1;
		
		for( ; menu != 3 ; ) {
			System.out.println("메뉴\n1. 좌표설정\n2.좌표출력\n3.종료");
			System.out.print("메뉴를 선택 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:	
				System.out.print("좌표를 입력하세요 (예 : 1 2 3) : ");
				int x = scan.nextInt();
				int y = scan.nextInt();
				int z = scan.nextInt();
				po = new Point3D1(x, y,z);
				break;
			case 2:	po.print();		
				break;
			case 3:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}
		

	}

}

/* 다음 정보를 가지는 3차원에서 점을 나타내는 클래스를 생성하세요.
 * 정보 : 점 x, 점 y, 점 z
 * 기능 : 좌표를 출력하는 기능
 */
class Point3D1{
	int x, y, z;
	
	void print()
	{
		System.out.println("(" + x + "," + y +"," + z + ")");
	}
	
	public Point3D1(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
}