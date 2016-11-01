import java.util.Scanner;
class SumOfDigits
{
  public static void main(String[] ar)
  {
    int a=0,sum=0;
    System.out.println("enter a number");
    int n=new Scanner(System.in).nextInt();
    while(n!=0)
    {
      a=n%10;
      n=n/10;
      sum=sum+a;
     }
     System.out.println(sum);
   }
}