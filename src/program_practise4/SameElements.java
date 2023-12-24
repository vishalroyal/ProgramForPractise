package program_practise4;

public class SameElements {

	public static void main(String[] args) {
		int a[]= {2,3,1,2,3};
		int l=a.length;
		int i,j;

		
		System.out.println("Repeated elements ");
		for(i=0;i<l;i++)
		{
		     for(j=i+1;j<l;j++)
		     { 
		         if(a[i]==a[j] )
		        	 System.out.print(a[i]+" ");
		     }
					
		    
	  }

	}

}
