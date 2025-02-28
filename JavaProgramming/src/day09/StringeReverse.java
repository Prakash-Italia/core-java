package day09;

public class StringeReverse {

	public static void main(String[] args) {
/*
		//Method 1
		String s="Selenium WebDriver";
		String rev="";
		int len=s.length();
		System.out.println("Lenght of String="+len);
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse String:"+rev);
		
		//Method 2 by converting string to Array
		String s1="welcome";
		
		int len1=s1.length();
		
		char a[]=s1.toCharArray();
		System.out.println("Reverse String:");
		for(int i=len1-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
*/		
		//Method 3- using stringBuffer class(pre defined)
		
		StringBuffer s11= new StringBuffer("prakash");
		System.out.println(s11.reverse());
		
		StringBuilder s12=new StringBuilder("Italia");
		System.out.println(s12.reverse());
				
	}

}
