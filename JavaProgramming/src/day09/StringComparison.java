package day09;

public class StringComparison {

	public static void main(String[] args) {
	/*	
		//case1
		String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);	//true
		System.out.println(s1.equals(s2));	//false
		
		//case 2
		String s3= new String("welcome");
		String s4= new String("welcome");
		
		System.out.println(s3==s4);	//false == used for comparing objects
		System.out.println(s3.equals(s4));	//true equal() used for comparing value
		
		
		//case 3
		
		String s1="abc";
		String s2= new String("abc");
		
		System.out.println(s1==s2);	//false
		System.out.println(s1.equals(s2)); //true
		*/
		
		//case 4
		
		String s1="abc";
		String s2=new String("abc");
		String s3=s2;
		
		System.out.println(s1==s2);  //false
		System.out.println(s1.equals(s2));  //true
		System.out.println(s2==s3);  //true..objects are same
		System.out.println(s2.equals(s3));  //true values of objects are same
		
		
	}

}
