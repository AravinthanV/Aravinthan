import java.util.*;

public class SumOfNaturalNumbers
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0)
			System.out.println("It is not a natural number");
		else
		{
			int res=(n+1)*n/2;
			System.out.println(res);
		}
	}
}
