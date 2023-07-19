import java.util.Scanner;
class PDigit
  {
 public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      int n=sc.nextInt();
      int digit,product=1 ;
      while(n>0)
        {
          digit=n%10;
          System.out.println(digit);
          n=n/10;
           product=product*digit;
        }
      System.out.println("The product is "+product);
    }
  }