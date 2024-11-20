import java.util.ArrayList;
public class Mcities2
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int c=sc.nextInt();
 String sname;
 do{
   System.out.println("1.Add Teacher");
  System.out.println("2.Display Teacher");
  System.out.println("3.Delete Teacher");
  System.out.println("4.Search Teacher");
  System.out.println("5.Update Teacher");
  System.out.println("Enter tour choice :");
 switch(choice){
  case 1:System.out.println("Enter Teacher name:");
       Sname=sc.next();
       System.out.println("Teacher added successfully");
       break;
 case 2:System.out.println("All Teacher list is :"+Teacher);
       break;
  case 3:System.out.println("Enter Teacher name to delete:");
       Sname=sc.next();
       teacher.remove(sname);
       System.out.println("Teacher added successfully");
       break;
   }
  }
 }
