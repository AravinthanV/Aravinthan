import java.util.*;

class ReverseString
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    StringBuffer sb=new StringBuffer(str);
    sb.reverse();
    System.out.println(String.valueOf(sb));
  }
}
