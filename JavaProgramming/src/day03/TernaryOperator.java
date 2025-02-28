package day03;

public class TernaryOperator {

	public static void main(String[] args) {
		
		//var=exp ? result1:result2;
	
		int a=100, b=200;
		int res=(a>b)?a:b;
		System.out.println(res);
		
		int a1=100, b1=200;
		int res1=(a1<b1)?a1:b1;
		System.out.println(res1);
		
		int person_age=20;
		String res3=(person_age>=18)?"Eligible":"Not Eligible";
		System.out.println(res3);
		
		//Example 3
		int x=(1==1)?100:200;
		System.out.println(x);
		

	}

}
