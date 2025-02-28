package day19;

public class ExceptionDemo {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		System.out.println("Program is started....");
		
		
		//Scanner sc=new Scanner(System.in);
		
		/*
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println(100/num);
		*/
		/*
		//Example 2
		
		int a[]=new int[5];
		
		System.out.println("Enter the position(0-4):");
		int pos=sc.nextInt();
		
		System.out.println("Enter the value:");
		int value=sc.nextInt();
		
		a[pos]=value;		//ArrayIndexOutOfBoundsException while enter 5
		
		System.out.println(a[pos]);
		*/
		
		//Example 3
		/*
		String s="Welcome";
		int num=Integer.parseInt(s);		//NumberFormatException
		System.out.println(num);
		*/
		
		//Example 4
		
		String s=null;
		System.out.println(s.length());		//NullPointerException
		
		System.out.println("Program is completed..");
	}
		
}
