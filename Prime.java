import java.util.Scanner;

class Prime
{
  public static void main(String[] args)
  {
    int i,m=0,flag=0;
    System.out.println("enter a number");
    int n=new Scanner(System.in).nextInt();
    m=n/2;
    for(i=2;i<=m;i++)
    {
      if(n%i==0)
      {
       System.out.println("not prime");
       flag=1;
       break;     
      }
     }
     if(flag==0)
     {
       System.out.println("prime");
      }
   }
}
     
    