import java.util.Scanner;
public class FinallyExp
{
 public static void main(String args[])
{
  try{
    int a=90;
    int r=a/0;
    System.out.println(r);
  }
   catch{
   System.out.println("Error..."+e.getmessage());
  }
   finally{
  System.out.println("Statement is finally block");
  }
 }
}