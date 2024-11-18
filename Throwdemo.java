import java.utill.Scanner;
class Throwdemo
{
 public static void main(String args[])
{
 try
{
  ArithmeticException a=new ArithmeticException("Hello an exception occured");
  throw a;
  }
   catch(ArithmeticException a)
 {
   System.out.println("The exception is :"+e.getmessage);
  }
 }
}