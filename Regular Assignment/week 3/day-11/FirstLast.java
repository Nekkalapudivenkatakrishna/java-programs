import java.util.Scanner;
class FirstLast
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
      int n=sc.nextInt();
      int temp=n;
      int firstdigit=0;
        while(n>0)
      {
        firstdigit=n%10;
          n=n/10;
      }
      System.out.println("firstdigit is"+firstdigit);
      int lastdigit=temp%10;
        System.out.println("lastdigit is"+lastdigit);
    }
  }
