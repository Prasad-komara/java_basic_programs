package Interview_programs;
import java.util.*;
public class Even_n_odd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:  ");
		int num = sc.nextInt();
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		{ 
			int num1=num%10;
			if(num1%2==0)
			{
				even_count++;
			
			}
			else
			{
				odd_count++;
				
			}
			num=num/10;
		
		}
		System.out.println("the even count "+even_count);
		System.out.println("the odd count "+odd_count);
		
		
		
		}
		
		
		
		
		
	

}
