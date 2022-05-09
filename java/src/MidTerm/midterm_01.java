package MidTerm;

import java.util.Scanner;

public class midterm_01 
{

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		Student st = new Student("홍길동", 1, 2, 3);
		int menu = -1;
		
		for( ; menu != 3 ; ) 
		{
			System.out.println("메뉴\n1. 학생 정보 입력\n2. 학생 정보 출력\n3. 프로그램 종료");
			System.out.print("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
			switch(menu) 
			{
			case 1:	
				scan.nextLine();
				System.out.println("이름 : ");
				String name = scan.nextLine();
				System.out.println("학년 : ");
				int grade = scan.nextInt();
				System.out.println("반 : ");
				int group = scan.nextInt();
				System.out.println("번호 : ");
				int idNum = scan.nextInt();
				st = new Student(name, grade, group, idNum);
				break;
			case 2:	st.print();		
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

class Student
{
	String name;
	int grade, group, idNum;
	
	void print()
	{
		System.out.println(grade + "학년 " + group + "반 "+ idNum + "번 " + name);
	}
	
	public Student(String name, int grade, int group, int idNum)
	{
		this.name = name;
		this.grade = grade;
		this.group = group;
		this.idNum = idNum;
	}
}