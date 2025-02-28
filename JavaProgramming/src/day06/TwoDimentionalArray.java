package day06;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		//Declaration
		
		//Approach 1
		
		/*int a[][]=new int [3][2];		//declaration
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;*/
		
		//Approach 2: declaration + adding value
		int a[][]= {{100,200},
					{300,400},
					{500,600}};
		
		//3) Find size of an array
		
		System.out.println(a.length); //return no. of row
		System.out.println(a[0].length);//return no. of column in specific row
		
		System.out.println(a[1][1]); //400 data from specific row and data
		
		//5) reading data from 2D array
		/*
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}*/
		
		// Enhanced for loop
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x+"  ");
			}
			System.out.println();
		}
	}	

}
