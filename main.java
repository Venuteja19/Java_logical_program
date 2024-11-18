class InvalidAgeException extends Exception
{
 public InvalidAgeException(String message)
{
  super(message);
 }
}
 public class main
{
 public static void ValidAge(int age)throws InvalidAgeException
{
 if(age<18)
{
  throw new InvalidAgeException("Age must be above 18");
  }
  System.out.println("Acess granted");
 }
 public static void main(String args[])
{
 try
{
  ValidAge(17);
 }
  catch(InvalidAgeException e)
{
  System.out.println("Caught Exception :"+e.getmessage);
  }
 }
}