import java.util.*;

public class IntegerOnceArray 
{
	public static  int findUnique(String[] s)
	{
		Vector<Integer> v=new Vector<Integer>();
		for(int i=0;i<s.length;i++)
			if(v.contains(Integer.parseInt(s[i])))
				v.removeElement(Integer.parseInt(s[i]));
			else
				v.addElement(Integer.parseInt(s[i]));
		return (v.firstElement());
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String input[]=str.split(" ");
		int res=findUnique(input);
		System.out.println(res);

	}

}
