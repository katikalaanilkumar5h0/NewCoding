// Write a program to print the swap first and last elements of an array.


import java.util.Scanner;
class SwapEle
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int [] a=new int[size];
		System.out.println("Enter array elements");
		for (int i=0;i<=a.length-1;i++ )
		{
			a[i]=sc.nextInt();
		}
		int temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		for (int i=0;i<=a.length-1;i++ )
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
	}
}