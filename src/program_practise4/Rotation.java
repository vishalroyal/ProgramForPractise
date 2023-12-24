package program_practise4;

import java.util.Arrays;
import java.util.Scanner;

public class Rotation {

	static void rotate(int arr[],int l)
	{


		int i,j;

		for(i=arr.length-l;i>0;i--)
		{

			int x=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--)
			{

				arr[j]=arr[j-1];


			}
			arr[0]=x;

		}
		System.out.println();
		System.out.println("Rotated array: ");
		for ( i = 0; i < arr.length; i++) {     
			System.out.print(arr[i] + " ");     
		}  

	}


	public static void main(String[] args) {

		int arr[]= new int [] {1 ,3 ,4, 13, 89, 2};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rorate value ");
		int l=sc.nextInt();


		System.out.println("Original array: ");    
		for (int i = 0; i < arr.length; i++) {     
			System.out.print(arr[i] + " ");     
		}    
		
		System.out.println();
		
		rotate(arr,l);


	}

}

