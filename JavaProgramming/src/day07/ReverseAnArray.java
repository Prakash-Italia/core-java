package day07;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		int a[]= {10,15,20,25,30,35,50};
		
		int size=a.length;
		
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}
