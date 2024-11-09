import java.util.*;
class ESnum1
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int i=1,n;
 System.out.println("Enter i value");
 n=sc.nextInt();
 do
{
  if(i%2==1)
  System.out.println(i);
  i++;
}
  while(i<=n);
}
}
 