import java.util.Scanner;
class Fibonacci
  {
    {   
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int n=sc.nextInt();
       int first=0,second=1;
      System.out.print(first+" ");
      System.out.print(second+" ");
      for(int i=1;i<=n;i++)
        {
          int third=first+second;
          System.out.print(third+" ");
          first=second;
          second=third;
        }
    }
  }