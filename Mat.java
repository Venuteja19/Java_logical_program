import java.util.*;
{
class Addition 
{
 int a,b,c;
 Addition()
 System.out.println("It is non-Perametarized constructor");
}
{
  Addition(int n)
  System.out.println("The n value is :"+n);
}
{
  Addition(int x,int y)
  System.out.println("The Addition value is :"+c);
 }
}
{
 class Mat
 public static void main(String[] args)
{
  int m=5,n=10;
  Addition a1=new Addition(m,n);
  Addition a2=new Addition();
  Addition a3=new Addition(10);
 }
}