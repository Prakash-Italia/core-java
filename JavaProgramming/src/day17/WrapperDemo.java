package day17;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int i=10;	//Primitive
		double d=10.5;
		char c='a';
		boolean b=true;
		
		
		// converting primitive to object type	- Auto boxing
		
		Integer iobj=i;		//object
		Double dobj=d;
		Character cobj=c;
		Boolean bobj=b;
		
		System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);
		
		int intvalue= iobj;
		double doublevalue=dobj;
		char charvalue=cobj;
		boolean boolvalue=bobj;
		
		System.out.println(intvalue);
		System.out.println(doublevalue);
		System.out.println(charvalue);
		System.out.println(boolvalue);
		
		// converting object to primitive type	- Un boxing
	}

}
