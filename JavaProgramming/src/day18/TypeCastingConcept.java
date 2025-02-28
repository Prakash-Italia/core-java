package day18;

//UpCasting - converting value from smaller --> larger

	//int --> long
	//float --> double

//DownCasting -- converting value from larger --> smaller
	//double -->float
	//long -->int

public class TypeCastingConcept {

	public static void main(String[] args) {
		
		//UpCasting - Automatic
		int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		float floatvalue=10.5F;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		
		//DownCasting - manually
		
		long longv=100000;
		int intv=(int) longv;
		System.out.println(intv);
		
		double doublev=12456.55;
		float floatv=(float) doublev;
		System.out.println(floatv);
		
		//Example 1
		int i=100;
		double d=i;
		System.out.println(d);     //100.0
		
		//Example 2
		double d1=10.5;
		int i1 =(int) d1;
		System.out.println(i1);		//10
		
	}

}
