import java.util.LinkedList;
public class Mcities1
{
 public static void main(String args[])
{
 LinkedList<String>cities=new LinkedList();
 cities.add("Vijayawada");
 cities.add("Vizag");
 cities.add("Guntur");
 cities.add("Gudivada");
 System.out.println("Initial LinkedList :"+cities);
 cities.addFirst("Nellore");
  System.out.println("Cities after added Nellore:"+cities);
  cities.addLast("Chennai");
 System.out.println("Cities after added Chennai:"+cities);
 cities.removeFirst();
 System.out.println("Cities after removed first:"+cities);
 cities.removeLast();
 System.out.println("Cities after removed Last:"+cities);
 cities.add(2,"Pedana");
 System.out.println("Cities after added pedana:"+cities);

 }
}