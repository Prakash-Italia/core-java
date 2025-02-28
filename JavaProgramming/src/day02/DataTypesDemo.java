package day02;

public class DataTypesDemo 
{

	public static void main(String[] args) 
	{
		//Numeric data types
		int a=100, b=200;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		
		byte by=120;
		System.out.println(by);
		
		short sh=250;
		System.out.println(sh);
		
		long l=158584524585652L; //Put the L if too long, Literal is needed
		System.out.println(l);
		
		//Decimal Number
		
		float price=150.5F;		// Literal is needed "F"
		System.out.println(price);
		
		double item_price=1452.256;
		System.out.println(item_price);
		
		// Character
		
		char grad='B';
		System.out.println("The grad of the student:"+grad);
		
		//boolean- allowed only true/false
		boolean is_true=false;
		System.out.println(is_true);
		
		//String
		String name="John";
		System.out.println(name);
		
		
	}

}
