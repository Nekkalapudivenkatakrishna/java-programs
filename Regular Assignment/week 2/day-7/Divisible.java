import java.util.Scanner;
class Divisible
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter x value:");
    int x=sc.nextInt();
    System.out.println(" enter y value:");
    int y=sc.nextInt();
    if(x%y==0)
    {
      System.out.println(x+" is divisible by "+y);
    }
    else
    {
      System.out.println(x+" is not divisible by "+y);
    }
  }
}  