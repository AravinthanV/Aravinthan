import java.util.*;
public class ArrayMatchIndex 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s[]=str.split(" ");
		int arr[]=Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(i==arr[i])
				System.out.print(i+" ");
		}
		
	}
}
