package day04;

public class LargestNumber {

	public static void main(String[] args) {
		
		
		//Pre required: All the number having different value
		int a=40,b=30,c=20;
		
		if (a>b && a>c)
		{
			System.out.println("a is the largest");
		}
		else if (b>a && b>c)
		{
			System.out.println("b is the largest");
		}
		if (c>a && c>b)
		{
			System.out.println("c is the largest");
		}
		
	}

}
