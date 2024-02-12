/* Write a program to print sum of factorial of each digit of a given number. */

import java.util.Scanner;
class  Sumoffactorialofeachdigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n number");
		int n=sc.nextInt();
		int sum=0;
		while (n!=0)
		{
			int rem=n%10;
			int prod=1;
			for (int i=rem;i>=1 ;i-- )
			{
				prod=prod*i;
			}
			sum=sum+prod;
			n=n/10;
		}
		System.out.println("sum of factorial of ecah digit is:"+sum);
	}
}