import java.util.Scanner;
class Rev1
{
 public static void main(String args[])
 {
  int s=0;
  System.out.print("Enter n value :");
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int p=n;
  while(n>0)
  {
   int r=n%10;
   s=s+r;
   n=n/10;
  }
  System.out.println("The reverse of " + p + " is " + s); 
 }
}