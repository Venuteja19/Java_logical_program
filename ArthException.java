import java.util.Scanner;
class ArthException
{
 int a,b,c;
 void divide()
{
  try
 {
   a=10;
   b=0;
   c=a/b;
   System.out.println("The division value is :"+c);
  }
   catch(ArithmeticException ae)
 {
   System.out.println("Division Error occured"+ae.getmessage());
  }
 }
}
  class main
{
  public static void main(String args[])
{
  ArthException a1=new ArthException();
  a1.divide();
 }
}
  