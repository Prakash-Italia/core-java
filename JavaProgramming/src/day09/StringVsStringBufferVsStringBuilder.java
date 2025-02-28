package day09;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		//String - immutable - cannot change value
		
		String s="welcome";
		s.concat(" to java");
		System.out.println(s);// welcome 
		
		
		//StringBuffer-mutable-can change
		StringBuffer s1=new StringBuffer("welcome");
		s1.append("to java");
		System.out.println(s1);	// welcome to java
		
		
		//StringBuilder-mutable-can change
		StringBuilder s2=new StringBuilder("welcome");
		s2.append(" to java");
		System.out.println(s2);	// welcome to java
		
	}

}
