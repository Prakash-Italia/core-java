package day12;

public class AdderMain {

	public static void main(String[] args) {
		
		
		//overloading concept
		Adder ad=new Adder();
		ad.sum();		
		ad.sum(10.5, 2.5);
		ad.sum(10, 2.5);
		ad.sum(10, 10);
	}

}
