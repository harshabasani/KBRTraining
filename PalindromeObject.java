import java.util.Scanner;
class PalindromeObject
{
  public void palindrome(int n)
  {
    int r,sum=0,temp;
    temp=n;
    while(n>0)
    {
      r=n%10;
      sum=(sum*10)+r;
      n=n/10;
    }
    if(temp==sum)
    {
      System.out.println("palindrome number");
    }
    else
    {
      System.out.println("not a palindrome number");
    }
   }
 public static void main(String[] ar)
 {
   System.out.println("enter a number");
   int n=new Scanner(System.in).nextInt();
   PalindromeObject p=new PalindromeObject();
   p.palindrome(n);
  }
}
   