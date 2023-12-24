package program_practise2;

public class BinarySearch {

	static void search(int a[],int first,int last,int k)
	{
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(a[mid]<k)
			{
				first=mid+1;
			}
			else if(a[mid]==k) {
				System.out.println("WE got it at "+mid);
				break;
			}
			else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		
		if(first>last)
			System.out.println("Not Found");
	}
	public static void main(String[] args) {
		int a[]= {12,15,47,50,60};
		int k=50;
		int last=a.length-1;		
		
		search(a,0,last,k);
		

	}

}
