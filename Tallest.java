import java.util.*;
public class Tallest
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int height[]=new int[50];
    for(int i=0;i<50;i++)
      height[i]=sc.nextInt();
    Arrays.sort(height);
    int k=sc.nextInt();
    System.out.println(height.length-k+1);
  }
}
