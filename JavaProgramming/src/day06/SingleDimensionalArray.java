package day06;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		//1) Declaring array
		
		//Approach 1: declaration
		int a[]=new int[5];
		
		//Assignment
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		
		//Approach 2:declaration + assign
		int b[]= {60,70,80,90,100};
		
		//3) Find the size of an array
		System.out.println(a.length);
		System.out.println(b.length);
		
		//4) read single value from array
		
		System.out.println(a[0]);
		System.out.println(b[0]);
		
		//5) read multiple value from array
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
			//System.out.println(b[i]);
			
			
		//Enhanced for loop/ for each..loop
		}
		for(int x:b)
		{
			System.out.print(x);
		}
		
	}

}
