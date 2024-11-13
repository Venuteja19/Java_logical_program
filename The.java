import java.util.*;
class In
{
 Protected int a,b,c;
 base()
{
  a=10;
  b=20;
 }
  void add()
{
  c=a+b;
  System.out.println("The Addition value is :"+c);
 }
}
 {
   class Out extends In
  {
   int d;
   void mul()
 {
   d=a*b;
   System.out.println("The Multipication value is :"+d);
  }
 }
}
  {
    class The
 {
  public static void mian(String []args)
{
    Out a1=new Out();
    a1.add();
    a1.mul();
  }
 } 
}
   