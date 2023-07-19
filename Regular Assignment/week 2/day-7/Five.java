import java.util.Scanner;
class Five
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter x value:");
    int x=sc.nextInt();
    if(x%5==0)
    {
      System.out.println(x+" is a multiple of 5");
    }
    else
    {
      System.out.println(x+" is not a multiple of 5");
    }
  }
}