package day12;

public class CallByReference {

	public static void main(String[] args) {
		
		Test test=new Test();
		test.number=100;
		
		System.out.println("Value before the method:"+test.number);
		
		test.m2(test);
		
		System.out.println("Value after the method:"+test.number);

	}

}
