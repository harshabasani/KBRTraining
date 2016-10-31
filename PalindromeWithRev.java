import java.util.Scanner;

public class PalindromeWithRev
{
  public static void main(String[] args)
  {
   System.out.println("enter a number");
   String n=new Scanner(System.in).next();
   StringBuilder s=new StringBuilder(n);
   System.out.println(s.reverse());
   }
}