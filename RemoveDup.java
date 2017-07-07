import java.util.*;
public class RemoveDup
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String result="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
				result+=(String.valueOf(str.charAt(i)));
			str=str.replace(str.charAt(i),' ');	
		}
		System.out.println(result);
	}

}
