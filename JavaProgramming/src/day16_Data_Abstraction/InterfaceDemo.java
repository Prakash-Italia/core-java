package day16_Data_Abstraction;

interface Shape
{
	int lenght=100;		//final and static
	int width=20;
	
	void circle();  //abstract method
	
	default void square()
	{
		System.out.println("This is default - square method...");
	}
	
	static void rectangle()
	{
		System.out.println("This is static - rectangle method...");
	}
}


public class InterfaceDemo implements Shape

	{
		public void circle()
		{
			System.out.println("This is circle- abstract method...");
		}
		void triangle()
		{
			System.out.println("This is triangle...");
		}
		
	public static void main(String[] args) {
		
		/*
		//scenario 1
		InterfaceDemo id= new InterfaceDemo();
		
		id.circle();         //
		id.square();         //default
		id.triangle();
		Shape.rectangle();   //static
		System.out.println(Shape.lenght+Shape.width);
		//System.out.println(id.lenght+id.width); */
		
		//scenario 2
		Shape sh= new InterfaceDemo();
		
		sh.circle();
		sh.square();
		//Sh.rectangle(); //cant access
		Shape.rectangle();
		//sh.triangle(); // cant access		
		
	}
}

