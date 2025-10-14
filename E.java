class D
{
 int a=17;
 public synchronized int increment()
{
 return a++;
} 
}
class Thread1 extends Thread
{
 public void run()
{
  a = increment();
  System.out.print(a);
}
}
class Thread2 extends Thread
{
 public void run()
{
  a = increment();
  System.out.print(a);
}
}
public class E
{
public static void main(String[] args) 
{
 D obj1 = new D();
 Thread1 obj2 = new Thread1();
Thread2 obj3 = new Thread3();
obj2.start();
obj3.start();
}
}
