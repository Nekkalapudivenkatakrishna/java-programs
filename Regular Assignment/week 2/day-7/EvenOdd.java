import java.util.Scanner;
class EvenOdd
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter x value:");
    int x=sc.nextInt();
    if(x%2==0)
    {
      System.out.println(x+" is even number");
    }
    else
    {
      System.out.println(x+" is odd number");
    }
  }
}  