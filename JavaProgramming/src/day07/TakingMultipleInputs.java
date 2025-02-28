package day07;

import java.util.Scanner;

public class TakingMultipleInputs {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first number");
		
		int num1=sc.nextInt();
		
		System.out.println("Enter Second number");
		
		int num2=sc.nextInt();		
		
		System.out.println("Sum of two number="+(num1+num2));

	}

}
