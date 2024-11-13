import java.util.Scanner;
class Rev
{
 public static void main(String args[])
 {
  int s=0;
  System.out.print("Enter n value :");
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int p=n;
  while(n!=0)
  {
   int r=n%10;
   n=n/10;
   s=s*10+r;
  }
  System.out.println("The reverse of " + p + " is " + s); 
 }
}