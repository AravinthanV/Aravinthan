import java.util.*;
public class TwoTarget
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int target=sc.nextInt();
		String s[]=str.split(" ");
		int arr[]=Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
		lab: for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]+arr[j])==target)
				{
					System.out.println(arr[i]+" "+arr[j]);
					break lab;
				}
			}
		}
	}
}
