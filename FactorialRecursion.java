import java.util.Scanner;
class FactorialRecursion
{
  static int factorial(int n)
  {
    if(n==0)
      return 1;
    else
      return(n*factorial(n-1));
  }
  public static void main(String[] ar)
  {
    int i,fact=1;
    System.out.println("enter a number");
    int n=new Scanner(System.in).nextInt();
    fact=factorial(n);
    System.out.println(fact);
   }
}