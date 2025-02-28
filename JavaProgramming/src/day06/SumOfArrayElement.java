package day06;

public class SumOfArrayElement {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		System.out.println("Sum of Array="+(a[0]+a[1]+a[2]+a[3]+a[4]));
		
		
		int b[]= {1,2,3,4,5,6};
		for(int i=0;i<6;i++)
		{
			if (b[i]%2==0)
			{
				System.out.println(b[i]+"=is Even Number");
			}
			else
			{
				System.out.println(b[i]+"=is Odd number");
			}
		}
		

	}

}
