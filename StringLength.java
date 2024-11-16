import java.util.Scanner;
class StringLength
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a string :");
  String name=sc.next();
  System.out.println("The length of " + name + " is " + name.length());
 }
}