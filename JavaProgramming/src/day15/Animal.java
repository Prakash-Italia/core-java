package day15;

public class Animal {
	
	String color="White";
	void eat()
	{
		System.out.println("eating...");
	}
	
	Animal()
	{
		System.out.println("This is Animal...");
	}

	Animal(String name) {
		System.out.println(name);
	}	
}

class Dog extends Animal
{
	String color="black";
	void displayColor()
	{
		System.out.println(super.color);
	}
	
	void eat()
	{
		System.out.println("eating bread");
		super.eat();
	}
	Dog()
	
	{
		super();
		System.out.println("This is Dog...");
	}
	Dog(String name)
	{
		super(name);
	}
		
}