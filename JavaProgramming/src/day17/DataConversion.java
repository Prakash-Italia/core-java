package day17;

public class DataConversion {

	public static void main(String[] args) {
		// String --> int
		// String s="Welcome" // cannot convert to number
		
		String s1="100";
		String s2="200";
		
		int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
		System.out.println(sum);
		
		// String to double
		String s11="10.5";
		String s21="5.15";
		
		double sum1=Double.parseDouble(s21)+Double.parseDouble(s11);
		System.out.println(sum1);
		
		// String to boolean
		
		String s3="true";
		boolean boolvalue=Boolean.parseBoolean(s3);
		System.out.println(boolvalue);
		
		//String to Char not possible
		
		//Scenario 2: int, double, boolean --> String
		
		int x=100;
		String s=String.valueOf(x);
		System.out.println(s);
		
		double d=10.5;
		String s4=String.valueOf(d);
		System.out.println(s4);
		
		boolean b1=true;
		String s5=String.valueOf(b1);
		System.out.println(s5);
		
		char c='A';
		System.out.println(String.valueOf(c));
		
		//Scenario 3
		
		//int --> double
		int i=10;
		System.out.println(Double.valueOf(i));
	}

}
