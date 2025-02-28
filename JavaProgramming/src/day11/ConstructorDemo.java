package day11;

public class ConstructorDemo {
	
	int x,y;
	
	ConstructorDemo()	//Default constructor
	{
		x=10;
		y=20;
	}
	
	ConstructorDemo(int a, int b)	//Parameterized constructor
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		
		//ConstructorDemo cd=new ConstructorDemo();
		//cd.sum();
		
		ConstructorDemo cd = new ConstructorDemo(100,200);
		cd.sum();
	}

}
