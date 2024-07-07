package Interview_programs;
import java.util.*;
public class Sum_digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
			int num2= num%10;
			sum=sum+num2;
			num=num/10;
		}
		 System.out.println(" the sum ="+sum);

	}

}
