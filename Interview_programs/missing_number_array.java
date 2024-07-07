package Interview_programs;

public class missing_number_array {

	public static void main(String[] args) {
		int a[]= {1,2,4,5};
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
			
		}
		System.out.println("  the sum of array : " +sum1);

		int sum2=0;
		for(int i=1;i<6;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("the sum of original  :"+sum2);
		if(sum1!=sum2)
		{
			System.out.println("the missing number : "+(sum2-sum1));
		}
	}

}
