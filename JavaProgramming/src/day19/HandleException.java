package day19;

import java.util.Scanner;

public class HandleException {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Program is started....");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		try
		{
			System.out.println(100/num);
		}
		catch(Exception e)
		{
			System.out.println("Invalid data provided");
			System.out.println(e.getMessage());	
		}
		
		System.out.println("Program is completed..");
	}

}
