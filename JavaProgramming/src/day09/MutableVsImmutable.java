package day09;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		int a[]= {20,30,40,50};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));

	}

}
