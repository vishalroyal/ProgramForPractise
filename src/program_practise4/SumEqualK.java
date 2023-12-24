package program_practise4;

public class SumEqualK {

	public static void main(String[] args) {
		int a[]= {1,5,7,1};
		int k=6;
		int l=a.length;
		int count=0,i,j;

		for(i=0;i<l;i++)
		{
		     for(j=i+1;j<l;j++)
		     { 
		         if(a[i]+a[j] == k)
		        	 count++;
		     }
					
		    
	  }
		 System.out.println("Count matches with k = "+count);
		
		
	}

}
