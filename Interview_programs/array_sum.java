package Interview_programs;

public class array_sum {

	public static void main(String[] args) {
		  
		int a[]= {1,2,3,4,6,7};    //  (n-1)
		int sum=0;
		int even=0;
		int odd=0;
		System.out.println(" even numbers ");
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]%2==0)
			 {
				 
				System.out.println(a[i]);
				
			 }
		 }
		 System.out.println("odd numbers");
		 for(int i=0;i<a.length;i++)
		 {
			 
			 if(a[i]%2!=0)
			 {
				 System.out.println(a[i]);
			 }
			
			 
			 
		 }
		 


		
		

	}

}
