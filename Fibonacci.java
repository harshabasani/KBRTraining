import java.util.Scanner;

class Fibonacci
{
  public static void main(String args[])
  {
   int n1=0,n2=1,n3,limit;
   Scanner sc=new Scanner(System.in);
   limit=sc.nextInt();
   System.out.print(n1+" "+n2);
   for(int i=2;i<limit;++i)
   {
     n3=n1+n2;
     System.out.print(" "+n3);
     n1=n2;
     n2=n3;
   }
  }
}