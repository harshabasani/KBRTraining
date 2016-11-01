import java.util.Scanner;
class EvenObject
{
  public void even(int a)
  {
    if(a%2==0)
    {
      System.out.println("even");
    }
    else
    {
     System.out.println("odd");
    }
  }
 public static void main(String... ar)
 {
   int a=new Scanner(System.in).nextInt();
   EvenObject e1=new EvenObject();
   e1.even(a);
  }
} 
     