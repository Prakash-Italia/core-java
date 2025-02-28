package day12;

public class Adder {
	
	int a=10, b=20;
	void sum()
	{
		System.out.println(a+b);
	}
	
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void sum(double a, double b)
	{
		System.out.println(a+b);
	}
	
	void sum(int a, double b)
	{
		System.out.println(a+b);
	}
}
