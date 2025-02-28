package day16_Data_Abstraction;

public class MultipleInheritance implements I1,I2 {

	
	public void m1() 
	{
		System.out.println("This is m1..");
	}
	
	public void m2()
	{
		System.out.println("This is m2..");
	}
	public static void main(String[] args) {

		MultipleInheritance m=new MultipleInheritance();
		m.m1();
		m.m2();
		
		System.out.println(m.x);
		System.out.println(m.y);
				
	}
}
