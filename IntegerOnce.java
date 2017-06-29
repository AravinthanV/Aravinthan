import java.util.*;
public class IntegerOnce 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s[]=str.split(" ");
		Vector<Integer> v=new Vector<Integer>();
		for(int i=0;i<s.length;i++)
			if(v.contains(Integer.parseInt(s[i])))
				v.removeElement(Integer.parseInt(s[i]));
			else
				v.addElement(Integer.parseInt(s[i]));
		System.out.println(v.firstElement());
	}
}
