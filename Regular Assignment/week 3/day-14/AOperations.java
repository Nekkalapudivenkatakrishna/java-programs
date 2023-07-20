import java.util.Scanner;
class AOperations
  {
    public static void addition(int a,int b)
    {
   int addition=a+b;
    System.out.println("the value is "+addition);
    }
    public static void subtract(int a,int b)
    {
    int subtract=a-b;
    System.out.println("the value is "+subtract);
    }
    public static void mul(int a,int b)
    {
    int mul=a*b;
    System.out.println("the value is "+mul);
    }
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a value");
     int x=sc.nextInt();
     System.out.println("enter a value");
     int y=sc.nextInt();
       addition(x,y);
       subtract(x,y);
       mul(x,y);
    }
  }