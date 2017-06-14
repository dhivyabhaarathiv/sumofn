import java.util.*;
public class Sumofn
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int s=0;
    for(int k=1;k<=n;k++)
    {
    s+=k;
    }
    System.out.println(s);
    }
    }
