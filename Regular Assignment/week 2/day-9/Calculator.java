import java.util.Scanner;
class Calculator
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter x value:");
    int x=sc.nextInt();
    System.out.println(" enter y value:");
    int y=sc.nextInt();
      System.out.println(" enter operator :");
    char z=sc.next().charAt(0);
   if(z=='+')
    {
      int add=x+y;
      System.out.println("the aswer is "+add);
    }
     else if(z=='-')
    {
      int sub=x-y;
      System.out.println("the aswer is "+sub);
    }
     else if(z=='*')
    {
      int mul=x*y;
      System.out.println("the aswer is "+mul);
    }
     else if(z=='%')
    {
      int div=x%y;
      System.out.println(" the aswer is "+div);
    }
   else
    {
     System.out.println("invalid operator");
    }
  }
}