package program_practise2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	
	public static void main(String[] args) {
		int i,m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter array size");
		m=sc.nextInt();
		int a[]=new int[m];
		n=a.length;
		System.out.println("Add the elements to array");
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		Arrays.sort(a);
		System.out.println();
		System.out.println("Sorted Array");
		
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}


	}


