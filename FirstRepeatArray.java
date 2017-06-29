import java.util.*;
public class FirstRepeatArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s[]=str.split(" ");
		Integer res=0;
		Vector<Integer> list=new Vector<Integer>();
		for(int i=0;i<s.length;i++)
		{
			if(list.contains(Integer.valueOf(s[i])))
			{
				res=Integer.valueOf(s[i]);
				break;
			}
			else
				list.add(Integer.parseInt(s[i]));
		}	
		System.out.println(res);
	}
}
