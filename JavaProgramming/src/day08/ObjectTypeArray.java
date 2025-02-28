package day08;

import java.util.Arrays;

public class ObjectTypeArray {

	public static void main(String[] args) {
		
		Object a[]=new Object[5];
		a[0]=100;
		a[1]="Welcome";
		a[2]='A';
		a[3]=true;
		a[4]=10.5;
		
		System.out.println(Arrays.toString(a));
		
		for(Object x:a)
		{
			System.out.println(x);
		}

	}

}
