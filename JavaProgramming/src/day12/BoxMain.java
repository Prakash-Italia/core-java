package day12;

public class BoxMain {

	public static void main(String[] args) {
		
		Box b=new Box();
		
		System.out.println(b.Volume());
		
		Box b1=new Box(10.5,5.5,2.3);
		
		System.out.println(b1.Volume());
		
		Box b2=new Box(10.5);
		
		System.out.println(b2.Volume());

	}

}
