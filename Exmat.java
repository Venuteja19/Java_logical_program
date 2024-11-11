import java.util.Scanner;
class Exmat
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int r=sc.nextInt();
  int c=sc.nextInt();
  int a[]=new int[r][c];
  int b[]=new int[r][c];
  System.out.println("Enter Elements to 1st matrix :");
  for(i=0;i<r;i++)
  for(j=0;j<c;J++)
  a[i][j]=sc.nextInt();
 }
 {
   System.out.println("Enter Eleents to 2nd matrix :");
   for(i=0;i<r;i++)
   for(j=0;j<c;J++)
   b[i][j]=sc.nextInt();
}
 {
   System.out.println("Addition of Two matrix is :");
   for(i=0;i<r;i++)
   for(j=0;j<c;J++)
   System.out.println(""+a[i][j]+b[i][j]);
   System.out.println();
 }
}