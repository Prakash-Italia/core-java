package day11;

public class GreetingsMain {

	public static void main(String[] args) {
		
		Greetings gr=new Greetings();
		
		gr.m1();
		
		String s=gr.m2();
		System.out.println(s);
		System.out.println(gr.m2());
		
		gr.m3("Prakash");
		
		String s1=gr.m4("Italia");
		System.out.println(s1);
	}

}
