import java.util.Scanner;
class Pon
{
public static void pon(int x)
  {
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
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
    System.out.println(" enter a value:");
    int a=sc.nextInt();
    pon(a);
   }
} 