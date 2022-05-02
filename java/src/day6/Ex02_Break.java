package day6;

public class Ex02_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j;
		for(i = 1; i <= 5; i++)
		{
			for(j=1; j<=5; j++)
			{
				System.out.println(i + ", " + j);
				if(j==3)
				{
					break;
				}
			}
		}
		System.out.println("------------------------");
		//out의 용례 : break를 만나면 이 위치로 이동
		out : for(i = 1; i <= 5; i++)
		{
			for(j=1; j<=5; j++)
			{
				System.out.println(i + ", " + j);
				if(j==3)
				{
					break out;
				}
			}
		}

	}

}
