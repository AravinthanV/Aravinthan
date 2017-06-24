import java.util.Scanner;
public class ReverseDigit
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt(),res=0,rev=0,a=1;
	if(num<0)
		a=-1;
	num=Math.abs(num);
	while(num>0)
	{
		res=num%10;
		rev=(rev*10)+res;
		num/=10;
	}
		rev=rev*a;
	System.out.println(rev);
	}
}

