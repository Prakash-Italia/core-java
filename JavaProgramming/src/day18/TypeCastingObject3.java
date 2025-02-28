package day18;

public class TypeCastingObject3 {

	public static void main(String[] args) {
		
		//Rule 1 & 2 satisfied and Rule 3 failed
		//Object o=new String("Welcome");
		//StringBuffer sb=(StringBuffer) o;
		//System.out.println(sb);
		
		Object o=new String("Welcome");
		String s=(String) o;
		System.out.println(s);
		System.out.println(o);
				
	}

}
