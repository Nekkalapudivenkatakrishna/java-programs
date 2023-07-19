import java.util.Scanner;
class SDigit
  {
 public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      int n=sc.nextInt();
      int digit,sum=0;
      while(n>0)
        {
          digit=n%10;
          System.out.println(digit);
          n=n/10;
           sum=sum+digit;
        }
      System.out.println("The sum is "+sum);
    }
  }