package program_practise4;

public class MissingNumber {
	
	

	public static void main(String[] args) {
		
		int arr[]= {1,2,4,5,6,7};
		
		
		
		int l=arr.length+1;
		
		int num=(l*(l+1))/2;
		

		for(int i=0;i<arr.length;i++)
		{
			num=num-arr[i];
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("\nMissing no is "+num);
	}

}
