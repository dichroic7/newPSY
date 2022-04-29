package day5;

public class Ex08_NestedLoop3_Star3 {

	public static void main(String[] args) {
		// 별로 피라미드 찍기
		
		int num=5;
		for(int i=0;i<num;i++)
		{
		    for(int j=num-1;j>i;j--)
		    {
		        System.out.println(" ");
		    }
			    
		    for(int j=0;j<2*i+1;j++)
		    {
			System.out.print("*");
		    }
		}
	}

}
