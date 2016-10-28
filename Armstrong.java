import java.util.Scanner;

class Armstrong
{
  public static void main(String[] args)
  {
    int a,c=0,temp;
    int n;
    System.out.println("enter a number");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    temp=n;
    while(n>0)
    {
      a=n%10;
      n=n/10;
      c=c+(a*a*a);
     }
     if(temp==c)
     {
       System.out.println("Armstrong number");
     }
     else
      {
       System.out.println("Not Armstrong number");
     }
  }
}