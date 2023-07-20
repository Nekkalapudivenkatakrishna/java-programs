import java.util.Scanner;
class Natural
  {
    public static void nat(int a,int b)
    {
      for(int i=a;i<=b;i++)
        System.out.println(i);
    }
    public static void main(String []args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter x value:");
    int x=sc.nextInt();
    System.out.println(" enter y value:");
    int y=sc.nextInt();  
    nat(x,y);
   }
} 