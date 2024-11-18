class InSufficientException extends Exception
{
 public InvalidAgeException(int a)
{
  super(a);
 }
}
 public class main1
{
 public static void ValidGrade(int age)throws InvalidGradeException
{
 if(Grade<0)
{
  throw new InvalidGradeException("Exam passed");
  }
  System.out.println("Student granted");
 }
 public static void main(String args[])
{
 try
{
  ValidGrade(-5);
 }
  catch(InvalidGaradeException e)
{
  System.out.println("Caught Exception :"+e.getmessage);
  }
 }
}