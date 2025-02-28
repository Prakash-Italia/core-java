package day05;

public class ReverseNumber {

	public static void main(String[] args) {
		
		String a="ThankYou";
		
		System.out.println(a.length());
				
		for(int i=0;i<=8;i++)
		{
			System.out.print(a.charAt(i));
		}
		for(int j=8;j>=1;j--)
		{
			System.out.println(a.charAt(j));
		}
	}

}
