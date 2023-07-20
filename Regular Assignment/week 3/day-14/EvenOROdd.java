import java.util.Scanner;
class EvenOrOdd
{
public static void eOO(int a)
  {
   if(a%2==0)
    {
      System.out.println(a+" is even number");
    }
    else
    {
      System.out.println(a+" is odd number");
    }
  }
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
    System.out.println(" enter x value:");
    int x=sc.nextInt();
    eOO(x);
   }
} 