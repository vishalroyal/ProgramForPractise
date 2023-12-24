package program_practise2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {
	
		int i;
        Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("How many sentence you want to add in array");
		int n=sc.nextInt();
		String a[]=new String[n];
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		System.out.println();
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+" "+a[i].length());
		}
		
		Arrays.sort(a, (m, k)->Integer.compare(m.length(), k.length()));
		System.out.println();
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+" --> "+a[i].length());
		}
	}

}
