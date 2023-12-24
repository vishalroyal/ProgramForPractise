package program_practise4;

public class NonRepeatingElements {

	public static void main(String[] args) {
		int a[]= {-1,2,-1,3,2};
		int l=a.length;
		int i,j;


		System.out.println("Non_Repeated elements ");
		for(i=0;i<l;i++)
		{
			for(j=0;j<l;j++)
			{ 
				if(i!=j && a[i]==a[j] ) {
					break;

				}
					

			}
			if(j==l)
				System.out.println(a[i]);


		}


	}

}
