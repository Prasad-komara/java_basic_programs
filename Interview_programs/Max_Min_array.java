package Interview_programs;

public class Max_Min_array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,0,56,199,22,48,88};
		int min=a[0];
		int max=a[0];
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]<min)
			 {
				 min =a[i];
			 }
			 
		 }
		 System.out.println(min);
		 for(int i=0;i<a.length;i++)
		 {
			if(a[i]>max)
			{
				max=a[i];
			}

		 }
		 System.out.println(max);

		 
		

	}

}
