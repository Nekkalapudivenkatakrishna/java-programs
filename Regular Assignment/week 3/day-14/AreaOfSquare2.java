import java.util.Scanner;
class AreaOfSquare2
{
public static void as(int side)
  {
    int AreaOfSquare=side*side;
    System.out.print("AreaOfSquare "+AreaOfSquare);
  }
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
    System.out.println(" enter x value:");
    int x=sc.nextInt();
    as(x);
   }
} 