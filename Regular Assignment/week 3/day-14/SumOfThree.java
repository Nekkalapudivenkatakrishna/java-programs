import java.util.Scanner;
class SumOfThree
{
public static void sum(int a,int b,int c)
  {
  int sum=a+b+c;
  System.out.print("sum "+sum);
  }
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
    System.out.println(" enter x value:");
    int x=sc.nextInt();
    System.out.println(" enter y value:");
    int y=sc.nextInt(); 
    System.out.println(" enter z value:");
    int z=sc.nextInt(); 
    sum(x,y,z);
   }
} 