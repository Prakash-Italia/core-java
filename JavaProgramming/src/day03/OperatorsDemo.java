package day03;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		//1) Arithmetic operators + - * / %
		
		int a=20, b=10;
		System.out.println("Sum of a & b="+(a+b));
		System.out.println("Diff of a & b="+(a-b));
		System.out.println("Multiplication of a & b="+(a*b));
		System.out.println("Div of a & b="+(a/b));
		System.out.println("Modulo div of a & b="+(a%b));
		
		//2) Relational or Comparison operators > >= < <= ==
		// Returns boolean value: true or false
		
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//3) Logical Operators && || !
		// return boolean value -true or false
		// works between 2 boolean value
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1=10>20;
		
		System.out.println(" "+b1); //false
		
		boolean b2=20>10;
		System.out.println(b2); //true
		
		System.out.println(b1 && b2); //false
		
		System.out.println(b1 || b2); //true
		
		System.out.println((10<20) && (20>10)); //true
		
		System.out.println((10<20) && (20>10)); //true 
		
		// Increment and Decrement operator
		// 
	}

}
