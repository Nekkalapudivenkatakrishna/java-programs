import java.util.Scanner;
class CDigit
  {
 public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      int n=sc.nextInt();
      int digit,count=0;
      while(n>0)
        {
          digit=n%10;
          System.out.println(digit);
          n=n/10;
          count=count+1;
        }
      System.out.println("The count is "+count);
    }
  }