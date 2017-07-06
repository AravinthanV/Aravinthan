import java.util.*;
public class ClosestNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s[]=str.split(" ");
		int arr[]=new int[s.length];int min=0;
		for(int i=0;i<s.length;i++)
			arr[i]=Integer.parseInt(s[i]);
		Arrays.sort(arr);
		Vector<Integer> v=new Vector<Integer>();
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				int a=Math.abs(arr[i]+arr[j]);
				if((i==0&&j==1)||(arr[i]+arr[j])<min)
				{
					v.clear();
					v.addElement(arr[i]);
					v.addElement(arr[j]);
					min=a;
				}		
			}
		}
		str=v.toString();
		str=str.replaceAll("\\[","").replaceAll("\\]","").replaceAll("\\s","").replaceAll(","," ");
		System.out.println(str);
	}
}
