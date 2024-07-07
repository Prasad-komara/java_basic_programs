package Interview_programs;
import java.util.*;
public class reverse_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			
			System.out.print(s.charAt(i));
		}
		
		

	}

}
