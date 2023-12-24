package program_practise2;

import java.util.Arrays;
import java.util.Scanner;

public class Digit1 {

	public static void main(String[] args) {
		int a[]=new int[6];
		//Scanner sc=new Scanner(System.in);
		int dig=749454;
		int dig1,i,j,temp=0,count1=0;


		System.out.println("Individual digits added to array ");
		for(i=0;i<6;i++)
		{



			dig1=dig%10;
			a[i]=dig1;
			dig=dig/10;

			System.out.println(" "+a[i]+"  ");

		}
		//System.out.println(Arrays.toString(a).replace("[","").replace("]", "").replace(",", ""));
		System.out.println();
		System.out.println("After sorting the array ");

		for(i=0;i<a.length;i++)
		{

			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}



			}
			System.out.println(a[i]);


		}
		System.out.println();
		System.out.println("Counting the digits of array= "+a.length);
		System.out.println();
		System.out.println("Largest number from array is= "+a[5]);
		System.out.println();
		System.out.println("Smallest element from array is= "+a[0]);
		System.out.println();
		System.out.println("Second largest element from array is= "+a[4]);

		System.out.println();

		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count1++;

				}

			}
		}
		System.out.println("count of repeation= "+count1);


	}

}
