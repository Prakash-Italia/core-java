package day15;

class Test1
{
	final void m1()
	{
		System.out.println("This m1 from Test1");
	}
}

class Test2 extends Test1
{
	void m2()
	{
		System.out.println("This is m2 from Test2");
	}
}	
public class FinalKeyword2 {

	public static void main(String[] args) {
		
		Test2 t=new Test2();
		t.m1();
	}

}
