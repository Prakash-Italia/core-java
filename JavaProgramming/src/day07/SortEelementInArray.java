package day07;

import java.util.Arrays;

public class SortEelementInArray {

	public static void main(String[] args) {
		
		//Sorting numbers
		int a[]= {100,150,500,300,700,548};
		
		System.out.println(Arrays.toString(a));	//Before sorting
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));//After sorting
			
		//Sorting String
			
		String b[]= {"A","C","H","B"};
		
		System.out.println(Arrays.toString(b));	//Before sorting
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));//After sorting

	}

}
