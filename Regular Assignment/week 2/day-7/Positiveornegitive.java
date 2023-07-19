import java.util.Scanner;
class Positiveornegitive
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter x value:");
    int x=sc.nextInt();
    if(x>0)
    {
      System.out.println(x+" is a positive value");
    }
    else if(x<0)
    {
      System.out.println(x+" is a negitive value");
    }
    else
    {
      System.out.println(x+" is not a negitive or positive value");
    }
  }
}