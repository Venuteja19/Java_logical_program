import java.util.*;
class Addition
{
  int a,b,c;
  void add(int x,int y)
{
  a=x;
  b=y;
  c=a+b;
  System.out.println("Addition of numbers :"+c);
 }
}
 class main
{
  public static void main(String[] args)
 {
  int m=50,n=100;
  Addition a1=new Addition();
  a1.add(m,n);
}
}