package Interview_programs;
import java.util.*;
public class Equalityof_arays {

	public static void main(String[] args) {
		int a1[]= {1,2,3,6,6};
		int a2[]= {1,2,3,7,6};
		/*
		boolean status=Arrays.equals(a1,a2);
		if(status==true)
		{
			System.out.println(" equal");
		}
		else
		{
			System.out.println("not equal");
		}
				*/
		
		
boolean status=true;
if(a1.length==a2.length)
{
	for(int i=0;i<a1.length;i++)
	{
		if(a1[i]!=a2[i])
		{
			status=false;
		}
	}
}
else
{
	System.out.println("not equal");
}
if(status==true)
{
	System.out.println("equal");
}
else
{
	System.out.println("not equal");
}




	}

}
