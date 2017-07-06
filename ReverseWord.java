import java.util.*;
public class ReverseWord 
{
	public static void main(String[] args) 
	{
		ReverseWord rw=new ReverseWord();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String st[]=str.split(" ");
		rw.reverseWord(st);
	}
	public void reverseWord(String s[])
	{
		for(int i=s.length-1;i>=0;i--)
			System.out.print(s[i]+" ");
	}
}
