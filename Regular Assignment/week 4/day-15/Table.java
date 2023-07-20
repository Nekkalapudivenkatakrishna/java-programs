import java.util.Scanner;
class InputP
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter a value:");
    int a=sc.nextInt();
    int res=0;
    for(int i=1;i<=10;i++)
      {
       res=a*i;
       System.out.println(a+"x"+i+"="+res);
      }
      
  }
}