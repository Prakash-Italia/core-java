package day05;

public class WhileLoop {

	public static void main(String[] args) {
		
		/*
		//Example 1:1....10
		
		int i=1;	//Initialization
		
		while (i<=10) //Condition
		{
			System.out.println(i);
			i=i+1; //Increment
		}*/
		
		//Example 2: Print "hello" 10 times
		
		/*String msg="hello";
		
		int i=1;
		
		while(i<=10)
		{
			System.out.println(msg);
			i++;
		}
			// Example: Print even numbers 1...10	
		int a=2;
		while(a<=10)
		{
			System.out.println(a);
			a=a+2;
		}*/
		
		//Example 3
		/*int i=1;
		while(i<=10)
		{
			if (i%2!=0)
			{
				System.out.println(i);
				i++;
			}
		}*/
		
		//Example 4
		//Print 10 9 8 7....1
		
		/*int i=10;
		
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}*/
		
		//Example (infinite loop)
		
		while(true)
		{
			System.out.println("Hello");
		}
		
	
	}
}
