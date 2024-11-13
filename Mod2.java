import java.util.*;
class Add
{
 int a=10;
 void demo()
{
  int a=20;
  System.out.println("The value of Instance is :"+this.a);
  System.out.println("The value of local is :"+a);
 }
}
 class Mod2
{
 public static void main(String []args)
{
 Add a1=new Add();
 a1.demo();
 }
}