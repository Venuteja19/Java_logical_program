import java.util.Scanner;
class Exarr1
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int i=0,n;
  System.out.println("Enter array size :");
  n=sc.nextInt();
  int a[]=new int[n];
  System.out.println("Enter Elements in Array :");
  for(i=0;i<a.length;i++)
  a[i]=sc.nextInt();
  System.out.println("The Elements in array is :");
  for(i=0;i<a.length;i++)
  System.out.println(a[i]);
 }
}


