import java.util.*;
class Addition1
{
  int a,b,c;
  int add(int x,int y)
{
   a=x;
   b=y;
   c=a+b;
   return c;
  }
}
   class main
{
  public static void main(String[] args)
{
  int m=50,n=100,t;
  Addition a1=new Addition();
  t=a1.add(m,n);
  System.out.println("The Addition of numbers is :"+t);
 }
}