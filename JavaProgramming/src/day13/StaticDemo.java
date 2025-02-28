package day13;

public class StaticDemo {
		
	static int a=10;
	int b=20;
	
	static void m1()
	{
		System.out.println("This is static method..");
	}
	void m2()
	{
		System.out.println("This is non static method..");
	}
	
	void m3()
	{
		m1();
		System.out.println(a);
		
		m2();
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		System.out.println(a); // Directly access through static 
		m1();  //directly access through static, without creating object
		
		//System.out.println(b); access only through object
		//m2();
		
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		
		sd.m3();
		
	}

}
