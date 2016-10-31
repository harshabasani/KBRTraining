import java.util.Scanner;

public class Sequence
{
  public static void main(String args[])
  {
    int i,j;
    System.out.print("enter number of rows:"); 
    int limit=new Scanner(System.in).nextInt();
    for(i=1;i<=limit;i++)
    {
      for(j=1;j<=i;j++)
      {
        System.out.print(j);
       }
     System.out.println("");
    }
   }
}