import java.util.*;

public class CountDigit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=String.valueOf(Math.abs(n));
		System.out.println(str.length());
	}
}
