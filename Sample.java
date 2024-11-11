import java.util.Scanner;
class Sample
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a string :");
  String name=sc.next();
  System.out.print("Enter a character :");
  String p=sc.next();
  char ch=p.charAt(0);
  System.out.println("The position of " + ch + " is " + (name.indexOf(ch)+1));
 }
}