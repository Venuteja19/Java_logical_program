class MyException extends Exception
{
 public static void main(String args[])
{
 MyException(String name)
{
 super(name);
 }
  MyException me=new MyException("Exception Details");
  throw me;
 }
}