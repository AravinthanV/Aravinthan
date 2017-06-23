import java.util.Scanner;
public class Factorial 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),fact=1;
		if(n==0)
			System.out.println("1");
		else if(n>0)
		{
			int i;
			for(i=1;i<=n;i++)
				fact*=i;
			System.out.println(fact);
		}
		else
			System.out.println("0");
	}
}
