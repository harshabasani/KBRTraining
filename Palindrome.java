import java.util.Scanner;

class Palindrome
{
  public static void main(String args[])
  {
    int r,sum=0,temp;
    System.out.println("please enter a number to check palindrome or not");
    int n=new Scanner(System.in).nextInt();
    temp=n;
    while(n>0)
    {
      r=n%10;
      sum=(sum*10)+r;
      n=n/10;
    }
    if(temp==sum)
    {
     System.out.println("palindrome");
     }
    else
    {
      System.out.println("not palindrome");
    }
  }
}  
      