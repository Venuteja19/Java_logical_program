import java.util.*;
class Nnum1
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int i=1,n,sum=1;
 System.out.println("Enter n value");
 int n=sc.nextInt();
 while(i<=n)
 {
  sum=sum*i;
  i++;
 }
}
}