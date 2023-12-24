package program_practise3;

import java.util.Arrays;
import java.util.Scanner;

public class NthLargest {

	
	static void largestSmallest(int a[],int n)
	{
		System.out.println("Please Enter k'th value for highest and largest");
		Scanner sc1=new Scanner(System.in);
		int k=sc1.nextInt();
		
		Arrays.sort(a);
		
		//System.out.println("Sorted array "+a);
		
		System.out.println("K'th highest number is "+a[n-k]);
		System.out.println("K'th smallest number is "+a[k]);
		
	}
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
		largestSmallest(a,n);
		
	}

}
