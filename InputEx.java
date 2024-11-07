import java.util.Scanner;
class InputEx
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.print("Enter rollno :");
  int no=s.nextInt();
  System.out.print("Enter name :");
  String name=s.next();
  System.out.print("Enter Gender :");
  String gen=s.next();
  System.out.println("No = " + no);
  System.out.println("Name = " + name);
  System.out.println("Gender = " + gen);
 }
}