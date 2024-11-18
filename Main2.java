class InSufficientBalanceException extends Exception
{
 public InSufficientBalanceException (int a)
{
  super(a);
 }
}
 class InSufficientAmountException extends Exception
{
 public InSufficientAmountException (int a)
{
  super(a);
 }
}

 public class main2
{
 public static void SufficientBalance(int age)throws InSufficientBalanceException 
{
 if(a<0 || a>100)
{
  throw new InSufficientBalanceException ("Exam passed");
  }
  System.out.println("Student granted");
 }
 public static void main(String args[])
{
 try
{
  ValidGrade(-5);
 }
  catch(InvalidAmoubtException e)
{
  System.out.println("Caught Exception :"+e.getmessage);
  }
 }
}