import java.util.Scanner;
class InputP
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter n value:");
    int a=sc.nextInt();
    for(int i=1;i<=a;i++)
      {
        int count=0;
        for(int j=1;j<=i;j++)
          {
            if(i%j==0)
            {
              count++;
            }
          }
        if(count==2)
         {
           System.out.println("prime");
         }
      }
  }
}