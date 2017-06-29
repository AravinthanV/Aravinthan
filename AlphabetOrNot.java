import java.util.Scanner;
public class AlphabetOrNot
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c[]=s.toCharArray();
		if(Character.isLetter(c[0]))
			System.out.println("Alphabet");
		else
			System.out.println("Not an alphabet");
	}
}
