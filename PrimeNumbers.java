import java.util.Scanner;
class PrimeNumbers
{
  public static void main(String[] ar)
  {
    int i,j,k;
    System.out.println("enter a number");
    int n=new Scanner(System.in).nextInt();
    for(i=2;i<n;i++)
    {
      k=0;
      for(j=2;j<i;j++)
      {
        if(i%j==0)
        {
          k=1;
          break;
        }
       }
       if(k==0)
       {
         System.out.println(i);
        }
       }
  }
}