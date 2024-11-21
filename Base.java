import java.util.Scanner;
class Base
{
 public static void main(String args[])
{
 int n=sc.nextInt();
 Scanner sc=new Scanner(System.in);
 void accept()
 System.out.println("Enter n value :"); 
}
 interface interface1
{
 public void fact()
}
 class derived extends base implements interface1
{
 public void fact()
{
   int i,f=1;
   for(i=1;i<=n;i++)
   f=f*i;
   System.out.println("The Factorial is :"+f); 
  }
 }
}