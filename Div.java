import java.util.*;
class Div
{
	public static void main(String[] args) 
	{  
		Scanner s=new Scanner(System.in);
		int a,b,r;
		System.out.println("enter two values");
		a=s.nextInt();
		b=s.nextInt();
		if(b==0)
		{
			System.out.println("second no cannot be zero");
				b=1;
		}
		r=a/b;
		System.out.println("Division="+r);
	}
}



	

