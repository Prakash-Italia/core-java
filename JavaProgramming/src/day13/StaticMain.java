package day13;

public class StaticMain {

	public static void main(String[] args) {
		
		System.out.println(StaticDemo.a); // Directly access through static 
		StaticDemo.m1();  //directly access through static, without creating object
		
		//System.out.println(b); access only through object
		//m2();
		
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		
		sd.m3();

	}

}
