import java.util.*;
public class SubSetCheck 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1[]=sc.nextLine().split(" ");		
		String s2[]=sc.nextLine().split(" ");		
		Vector<String> a1=new Vector<String>();
		Vector<String> a2=new Vector<String>();
		a1.addAll(Arrays.asList(s1));
		a2.addAll(Arrays.asList(s2));
		if(a2.containsAll(a1))
			System.out.println("a1 is subset of a2");
		else
			System.out.println("a1 is not a subset of a2");
	}
}
