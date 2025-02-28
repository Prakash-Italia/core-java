package day18;

class Parent 
{
	String name="John";
	void m1()
	{
		System.out.println("This is m1 from parent..");
	}
}

class Child extends Parent 
{
	int id=101;
	
	void m2()
	{
		System.out.println("This is m2 from Child..");
	}
}

public class TypeCastingObject1 {

	public static void main(String[] args) {
		
		Child c=new Child();
		System.out.println(c.name);
		c.m1();
		System.out.println(c.id);
		c.m2();
		
		Parent p= new Child();	//UpCasting
		System.out.println(p.name);
		p.m1();
		//System.out.println(p.id); 	//we can't access
		//p.m2();						//we can't access
				
		//DownCasting we can get exception during run time
		Child c1=(Child) new Parent();
		
		System.out.println(c1.name);
		System.out.println(c1.id);
		c1.m1();
		c1.m2();
	}

}
