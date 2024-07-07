package Interview_programs;
import java.util.*;
public class Reverse_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the number");
		int num =sc.nextInt();
		
		// logic1 using alogrithm 
		/*
		int rev=0;
		while(num!=0)
		{
			rev=rev*10 +num%10;
			num=num/10;
		}
		
		System.out.println(rev);
		
		*/
		
		//stringBuffer class
		/*
		 StringBuffer s=new StringBuffer(String.valueOf(num));
		System.out.println(s.reverse());
		  */
		
		StringBuilder s=new StringBuilder();
		s.append(num);
		s.reverse();
		System.out.println(s);
	}

}
