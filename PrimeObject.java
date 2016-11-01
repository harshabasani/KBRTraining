import java.util.Scanner;
class PrimeObject
{
  public void prime(int n)
  { 
    System.out.println("in prime() method");
    int i,m=0,flag=0;
    m=n/2;
    System.out.println("before for loop");
    for(i=2;i<=m;i++)
    {
      System.out.println("before if");
      if(n%i==0)
      {
        System.out.println("not prime");
        flag=1;
        break;
      }
      if(flag==0)
      {
        System.out.println("prime");
      }
      System.out.println("in for loop");
    }
    System.out.println("after for loop");
  }
 public static void main(String[] ar)
 {
   System.out.println("enter a number");
   int n=new Scanner(System.in).nextInt();
   PrimeObject p=new PrimeObject();
   p.prime(n);
 }
}