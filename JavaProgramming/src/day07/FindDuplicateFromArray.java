package day07;

public class FindDuplicateFromArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,10,30,10,40,10,50};
		
		int num=10;
		int count=0;
		
		for (int value:a)
		{
			if(value==num)
			{
				count++;
			}
		}
			System.out.println("How many times number repeat:"+count);
	}

}
