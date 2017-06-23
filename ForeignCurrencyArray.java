import java.util.*;
public class ForeignCurrencyArray 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s[]=str.split(" ");int i;
		int arr[]=new int[s.length];
		for(i=0;i<s.length;i++)
			arr[i]=Integer.parseInt(s[i]);
		Arrays.sort(arr);
		str="";
		for(i=0;i<s.length;i++)
			str=str+String.valueOf(arr[i]);
		StringBuffer sb=new StringBuffer(str);
		for(i=3;i<sb.length();i++)
		{
			sb.insert(i,",");
			i+=3;
		}
		sb.reverse();
		System.out.println(String.valueOf(sb));
	}
}
