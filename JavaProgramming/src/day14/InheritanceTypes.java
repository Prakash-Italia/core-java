package day14;

class A
{
	int a;
	void display()
	{
		System.out.println("Before extendint:"+a);
	}
}

class B extends A
{
	int b;
	void show()
	{
		System.out.println("After extending: "+b);
		System.out.println("Sum of variables: "+(b+a));
	}
}

class C extends B
{
	int c;
	void print()
	{
		System.out.println(c);
	}
}

public class InheritanceTypes {

	public static void main(String[] args) {
		/*
		B bobj=new B();
		bobj.a=100;
		bobj.b=200;
		bobj.display();
		bobj.show();*/
		
		C cobj=new C();
		cobj.c=30;
		cobj.a=10;
		cobj.b=20;
		cobj.show();
		cobj.print();
	}

}
