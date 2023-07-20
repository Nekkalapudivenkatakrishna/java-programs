import java.util.Scanner;
class InputE
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter start value:");
    int a=sc.nextInt();
    System.out.println(" enter end value:");
    int b=sc.nextInt();
    for(int i=a;i<=b;i++)
    {
      if(i%2==0)
      {
       System.out.println(i); 
      } 
    }
  }
}  