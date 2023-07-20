import java.util.Scanner;
class Divisible2
{
public static void divisible(int x,int y)
  {
  
    if(x%y==0)
    {
      System.out.println(x+" is divisible by "+y);
    }
    else
    {
      System.out.println(x+" is not divisible by "+y);
    }
  }
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
    System.out.println(" enter a value:");
    int a=sc.nextInt();
    System.out.println(" enter b value:");
    int b=sc.nextInt();  
    divisible(a,b);
   }
} 