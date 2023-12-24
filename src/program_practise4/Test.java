package program_practise4;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void sort(int a[])
	{
		Arrays.sort(a);

	}		
	public static void countways(int a[],int l,int count)
	{
		int sec=0;
		for (int i = (l-2); i >= 0; i--) {
			if(a[l-1]!=a[i] ) {
				sec=a[i];
				break;
			}
		}

		for (int i = 0; i < l; i++) {
			if(a[l-1]==a[i] || sec==a[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void validation(int n)
	{
		if(n>100 && n<0)
			System.out.println("invalid");
		else
			System.out.println("valid");		
	}

	public static void main(String[] args) {

		System.out.println("please enter input ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int l=a.length,count=0;

		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		sort(a);
		countways(a,l,count);
		validation(n);

	}



}
