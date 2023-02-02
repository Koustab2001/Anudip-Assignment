package Labtest1;

public class Alternate {

	public static void main(String[] args) {
		
		//Declaration of Array
		int x[]= {10,20,30,40,50,60,70,80,90};
		System.out.println("The sum of the alternative elements are :"+alternate(x));
		
	}
	
	public static int alternate(int x1[])
	{
		int j=0,sum=0;
		//Alternate array declaration and memory allocation
		int y[]=new int[x1.length];
		System.out.println("The alternative array is: ");
		//Printing the alternate array 
		for(int i=0;i<x1.length;i+=2)
		{
			y[j]=x1[i];
			System.out.println(y[j]);
			sum+=y[j];//Addition of values stored a array
			j++;	
		}
		return sum;//Returning the sum to main method
	}

}
