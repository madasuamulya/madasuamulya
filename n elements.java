import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int a[],i,n;
	    System.out.println("Enter size of the array");
	    n=s.nextInt();
	    a=new int[n];
	    System.out.println("enter n elements");
	    for (i=0;i<n;i++)
	    {
	        a[i]=s.nextInt();
	    }
	         System.out.println("The values are");
	         for (i=0;i<n;i++)
	    {
	        System.out.print(a[i]+"");
	    }
	}
}
	    
	  