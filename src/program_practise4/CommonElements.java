package program_practise4;

public class CommonElements {

	public static void main(String[] args) {
		int a[]= {2,3,1,6,4};
		int b[]= {4,2,1,8,14};
		int c[]= {2,4,7,1,10};
		int l=a.length;
		int m=b.length;
		int o=c.length;
		int i,j,k;

		
		System.out.println("Common Elements ");
		for(i=0;i<l;i++)
		{
		     for(j=0;j<m;j++)
		     { 
		    	 for(k=0;k<o;k++)
		    	 {
		    	 
		         if(a[i]==b[j] && b[j]==c[k])
		        	 System.out.print(a[i]+" ");
		    	 }
		    }
					
		    
		}
		
	}

}
