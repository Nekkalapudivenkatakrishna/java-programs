import java.util.Scanner;
class Sample
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      char option;
      do{
        System.out.println("select the operator");
        System.out.print(" + --> Addition"+"\n" + " - ---> Subtraction"+"\n" +"* --> Multplication"+"\n"+"/ - division" );
         option=sc.next().charAt(0);
         System.out.println("enter a and b values");
          int a=sc.nextInt();
          int b=sc.nextInt();
        switch(option)
        {
          case('+'):
          System.out.println("result of addition is"+ (a+b));
          break;
          case('-'):
          System.out.println("result of subtraction is"+ (a-b));
          break;
          case('*'):
          System.out.println("result of multplication is"+ (a*b));
          break;
          case('/'):
          System.out.println("result of division is"+ (a/b));
          break;       
          default:
          System.out.println("invalid operator");
        }
        System.out.println("do you want to continue: (y/n)");
        option=sc.next().charAt(0);
      }
        while(option=='y'||option=='Y');
    }
  }