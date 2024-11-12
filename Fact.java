import java.util.Scanner;
class  Factorial2
{
  int i,f=1; 
  int fact(int j)
  {
    i=1;
    for(i=1;i<=j;i++)
     f=f*i;
    return f;
  } 
 }
class Fact
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);  
   System.out.print("Enter a number :");
   int p=sc.nextInt();
   Factorial2 f1=new Factorial2();
   int c=f1.fact(p);
   System.out.println("The Factorial of numbers is :"+c);
  }  
 }