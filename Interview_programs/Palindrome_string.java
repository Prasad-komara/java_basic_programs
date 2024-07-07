package Interview_programs;
import java.util.*;
public class Palindrome_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.next();
		s.toCharArray();
		String rev=" ";
		String org_str=s;
		for(int i=s.length()-1;i>=0;i--)
		{
	      rev=rev+s.charAt(i);
	      
		}
		System.out.println(rev);
          if(org_str.equals(rev))
          {
        	System.out.println("it is a polindrome");  
          }
          else
          {
        	  System.out.println("it is not polindrome");  
          }
	}

}
