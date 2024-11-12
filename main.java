import java.util.*;
class main
{
 public static void main(String[] args)
{
  String st1="I'am VENU TEJA THANK YOU";
  Stringtokenizer t=new Stringtokenizer(st1);
  System.out.println("The number of tokens available in given String is :"+t.countToken());
  while(t.hasmoreTokens)
 System.out.println(t.nextToken());
}
}