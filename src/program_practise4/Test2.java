package program_practise4;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	static int nt,sht=0,count=0;
	static int ht[]=new int[100];

	static void secondHighestTower()
	{

		for(int i=ht.length-2;i>=ht.length-nt;i--)
		{
			if(ht[ht.length-1]!=ht[i])
			{
				sht=ht[i];
				break;
			}	
		}

	}
	static int counttowers()
	{

		for(int i=ht.length-nt;i<ht.length;i++)
		{
			if(ht[ht.length-1]==ht[i] || sht == ht[i])
			{
				count++;
			}
		}

		return count;
	}
	static int validation()
	{
		if(nt>100 || nt<0)
			return -1;
		else
			return 1;
	}

	public static void main(String[] args) {
		int i;
		System.out.println("please enter input ");
		Scanner sc=new Scanner(System.in);
		nt=sc.nextInt();


		for(i=0;i<nt;i++) 
			ht[i]=sc.nextInt();

		Arrays.sort(ht);

		secondHighestTower();
		if(validation()!= -1)
			System.out.println("Number of towers cut in second shot = "+counttowers());
		else
			System.out.println("invalid input");

	}

}
