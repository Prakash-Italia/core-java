package day18;

class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}


public class TypeCastingObject2 {

	public static void main(String[] args) {
		/*
		Animal an=new Dog();
		Cat ct=(Cat) an;		//Valid as per rule1
		
		Dog dg=new Dog();
		Cat ct=(cat) dg;		//Invalid as per rule1
		
		Animal an=new Dog();
		Cat ct= (Cat) an;		//Valid as per rule 2
		
		Animal an=new Dog();
		Cat ct=(Dog) an;			//Invalid as per rule2
		*/
		
		//Animal an=new Dog();
		//Cat ct= (Cat) an;
		
		Animal an=new Dog();
		Dog dg=(Dog) an;
		System.out.println(dg.getClass());
	}

}
