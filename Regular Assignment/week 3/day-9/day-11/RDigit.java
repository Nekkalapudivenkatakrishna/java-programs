import java.util.Scanner;
class RDigit
  {
    public static void main(String args[])
    {   
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int number=sc.nextInt(); 
      int reverse=0; 
      while(number>0)
        {
          int digit=number%10; 
          reverse=(reverse*10)+digit; 
          number=number/10;
        }
      System.out.println("reverse number is "+reverse);
    }
  }

