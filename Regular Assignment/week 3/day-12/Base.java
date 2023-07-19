import java.util.Scanner;
class Base
  {
    public static void main(String args[])
    {   
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the base number");
      int base=sc.nextInt(); 
      System.out.println("enter the power number");
      int power=sc.nextInt(); 
      int value=1;
      for(int i=1;i<=power;i++)
        {
        value=value*base;  
        }
      System.out.println(value);
    }
  }