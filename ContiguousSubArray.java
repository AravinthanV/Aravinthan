import java.util.*;
public class ContiguousSubArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int N=sc.nextInt();int max=0;
		String s[]=str.split(" ");
		int arr[]=new int[s.length];
		for(int i=0;i<s.length;i++)
			arr[i]=Integer.parseInt(s[i]);
		int temp[]=new int[N];
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> all=new ArrayList<Integer>();
		for(int i=0;i<=arr.length-N;i++)
		{
			int sum=0;
			for(int j=i;j<i+N;j++)
			{
				sum+=arr[j];
				al.add(arr[j]);
			}
			if(max<sum || i==0)
			{
				all.clear();
				max=sum;
				all.addAll(al);
				al.clear();
			}	
		}
		str=all.toString();
		str=str.replaceAll("\\[","").replaceAll("\\]","").replaceAll("\\s","").replaceAll(","," ");
		System.out.println(str);
	}
}
