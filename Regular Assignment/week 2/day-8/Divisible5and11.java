import java.util.Scanner;
class Divisible5and11
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter x value:");
    int x=sc.nextInt();
    if((x%5==0) && (x%11==0))
    {
      System.out.println(x+" is divisible 5 and 11 ");
    }
    else 
    {
      System.out.println(x+" is not divisible 5 and 11 ");
    }
  }
}  