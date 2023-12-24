package program_practise3;

import java.util.Arrays;
import java.util.Scanner;

public class SumArray {

	public void sumarray()
	{
		int i,n,E=0,O=0,sum=0,sum2=0,m,g;
		System.out.println("Enter the elements to add in array");
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[6];
		n=a.length;
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		Arrays.sort(a);
	
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
				E++;
			else
				O++;
		}
		System.out.println("Even Count "+E);
		System.out.println("Odd Count "+O);
		
		for(i=0;i<n/2;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of elements "+sum);
		
		
		System.out.println("Enter the range m & g");
		m=sc.nextInt();
		g=sc.nextInt();
		for(i=m;i<=g;i++)
		{
			sum2=sum2+a[i];
		}
		System.out.println("Sum of range "+sum2);
	}
	
	public static void main(String[] args) {
		
		SumArray sa=new SumArray();
		sa.sumarray();

	}

}
