package day08;

public class StringMethods {

	public static void main(String[] args) {
		
		String s="Welcome";
			//String s= new String("Welcome");
		
		System.out.println(s);
		
		// Length()- String length
		int l=s.length();
		System.out.println("String Lenght = "+l); //Length of string
		
		//concat() - Join string
		String s1="Welcome";
		String s2=" to java";
		String s3=" Program";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		
		System.out.println("Welcome"+" to java");
		System.out.println("Welcome".concat(" to java"));
		
		// trim() - remove spaces right and left side
		
		s="   Welcome   ";
		System.out.println("Before triming:"+s.length());
		s1=s.trim();
		System.out.println("After triming:"+s1.length());
		
		// charAt()-return a character based on index
		// index starts from 0
		
		s="welcome";	
		char c=s.charAt(3);
		System.out.println(c);
		
		//contain() - returns true/false
		// check a string is part of the main string
		
		System.out.println(s.contains("wel")); //true
		System.out.println(s.contains("Come")); //false
		System.out.println(s.contains("come")); //true case sensitive
		System.out.println(s.contains("welome"));//false sequence required
		
		//equals() equalIgnoreCase() compare 2 strings // return boolean
		
		s1="welcome";
		s2="welcome";
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals("Welcome"));//false // case sensitive
		System.out.println(s1.equalsIgnoreCase("WeLcoMe"));//true
		
		//replace() replace single character/sequence of characters in a string
		
		s="welcome to selenium java python c#";
		
		System.out.println(s.replace('e', 'E'));
		System.out.println(s.replace("c#", "etc"));
		
		//substring()-extract substring from the main string
		
		s="welcome";
		System.out.println(s.substring(2,5));
		System.out.println(s.substring(1,3));
		
		// toUpperCase() - toLowerCase()

		s="Welcome";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//split() - split/divide the string in to multiple parts based on delimeter
	
		s="abc@xyz";
		String a[]=s.split("@");
		System.out.println(a[0]); //abc
		System.out.println(a[1]); //xyz
		
		s="abc@gmail.com";
		String b[]=s.split("@");
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		// replace()
		
		String amount = "$15,20,55";
		String new_amount = amount.replace("$","").replace(",", "");
		System.out.println(new_amount);
		
		//
		s="abc,123@xyz";
		String a1[]=s.split(",");
		//System.out.println(a1[1]);
		String a2[]=a1[1].split("@");
		System.out.println(a1[0]);
		System.out.println(a2[0]);
		System.out.println(a2[1]);
		
		//ex 5
		s="abc 123 xyz";
		String arr[]=s.split(" ");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//
		
		String name="John Kenedy";
		String s11=name.toLowerCase();
		System.out.println(s11.contains("john"));
		
	}

}
