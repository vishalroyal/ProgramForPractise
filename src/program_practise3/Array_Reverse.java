package program_practise3;

import java.util.Scanner;

public class Array_Reverse {


	public void reverse()
	{
		int i,j;

		int arr[]=new int[5];
		int l=arr.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Adding the elements to array");

		for(i=0;i<l;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println(); 
		for(i=l-1;i>=0;i--)
		{
			System.out.println(arr[i]);


		}

		System.out.println(); 
		for(i=1;i<l;i++)
		{

			if(arr[i]==arr[i-1])
				System.out.println("Same "+arr[i]);
			else
				System.out.println("Not Same "+arr[i]);

		}



	}

	public static void main(String[] args) {


		Array_Reverse ar= new Array_Reverse();
		ar.reverse();
	}

}
