package day05;

public class ForLoop {

	public static void main(String[] args) {
		
		//Example 1 2 3 ...10
		
		for(int i=1;i<=10;i++)
		{
			System.out.print(i);
		}

		//Example 2: only even number
				
		for(int j=2;j<=10;j=j+2)
		{
			System.out.print(" "+j);
		}
		
		//Example 3: 10...1
		
		for(int a=10;a>=1;a--)
		{
			System.out.print(a);
		}
		
	}

}
