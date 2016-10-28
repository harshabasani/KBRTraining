import java.util.Scanner;

class EvenOdd
{
  public static void main(String args[])
  {
    int a;
    System.out.println("please enter a number");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    int b=a%2;
    if(b==0)
    {
      System.out.println("even");
    }
    else
    {
      System.out.println("odd");
     }
  }
}