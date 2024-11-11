import java.util.Scanner;
class Exfl
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int i,n,s=0;
 i=sc.nextInt();
 n=sc.nextInt();
 System.out.println("Enter a number :");
 for(i=1;i<=n;i++)
 if(n%i==0)
 {
 s=s+i;
 s=sc.nextInt();
}
 {
  if(s==n)
  System.out.println("Number is prime");
  else
  System.out.println("Number is Composite");
  } 
 }
} 