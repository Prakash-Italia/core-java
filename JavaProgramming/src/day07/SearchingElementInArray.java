package day07;

import java.util.Scanner;

public class SearchingElementInArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int a[]= {10,20,10,30,10,40,10,50};
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Search number:");
		int search_num=sc.nextInt();
		
		boolean status=false;
		
		for(int i=0;i<=4;i++) 
		{
			if(search_num==a[i])
			{
			System.out.println("Number is found");
			status=true;
			break;
			}
		
		}
		if(status==false)
		{
		System.out.println("Element Not Found");
		}
		
	}

}
