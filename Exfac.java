import java.util.Scanner;
class Exfac
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int i,n,f=1;
 System.out.println("Enter a number :");
 n=sc.nextInt();
 for(i=n;i>=1;i--)
 f=f*i;
 System.out.println("The Factorial of " + n+ " is " + f);
 }
}