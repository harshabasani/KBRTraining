import java.util.Scanner;
class NumberSequenceObject
{
  void sequence(int n)
  {
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(j+" ");
      }
     System.out.println(" ");
    }
  }
public static void main(String[] ar)
 {
   System.out.println("please enter number");
   int n=new Scanner(System.in).nextInt();
   NumberSequenceObject s=new NumberSequenceObject();
   s.sequence(n);
  }
}
   