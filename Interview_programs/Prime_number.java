package Interview_programs;
import java.util.*;
public class Prime_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0) 
			{
				count++;
				 
			}
		}
	
		if(count==2)
		{
			
				System.out.println("it is a prime number");
		}
		else
		{
			System.out.println("it is not prime number");
		}
		

	}


}