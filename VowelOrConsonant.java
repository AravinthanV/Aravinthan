import java.util.Scanner;
public class VowelOrConsonant 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		str=str.toLowerCase();
		if((str.equals("a"))||(str.equals("e"))||(str.equals("i"))||(str.equals("o"))||(str.equals("u")))
			System.out.println("Vowel");
		else
			System.out.println("Consonant");	
	}
}
