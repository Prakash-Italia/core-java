package day07;

import java.util.Scanner;

public class TakingInputfromKeyboard {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		//Integer
		
		System.out.println("Enter a Number= ");
		int a=sc.nextInt();
		System.out.println(a);
		
		//Decimal
		System.out.println("Enter a Number= ");
		double num=sc.nextDouble();
		System.out.println(num);
			
		//String
		System.out.println("Enter your Name:");
		String name=sc.next();
		System.out.println(name);
	}

}
