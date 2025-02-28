package day07;

public class NoOfOddEvenInArray {

	public static void main(String[] args) {
		
	int a[]= {2,5,8,10,13,16,18,20,25};
		
		int odd=0;
		int even=0;
		
		for (int value:a)
		{
			if(value%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			
		}
		System.out.println("Number of odd num:"+odd);
		System.out.println("Number of even num:"+even);
	}
}


