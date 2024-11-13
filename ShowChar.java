class Print
{
 char ch='A';
 public void getChars()
 {
  System.out.println("For Loop");
  for(ch='A';ch<='Z';ch++)
   System.out.println("" + ch);
 }
 public void getChars2()
 {
  ch='A';
  System.out.println("While Loop");
  while(ch<='Z')
   System.out.println("" + ch++);
 } 
}
class ShowChar
{
 public static void main(String args[])
 {
  Print p=new Print();
  p.getChars();
  p.getChars2();
 }
}