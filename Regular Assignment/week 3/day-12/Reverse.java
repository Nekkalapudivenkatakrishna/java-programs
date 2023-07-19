import java.util.Scanner;
class Reverse
  {
    public static void main(String args[])
    {   
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int number=sc.nextInt(); 
      int temp=number;
      while(number>0)
        {
          int digit=number%10; 
          reverse=(reverse*10)+digit; 
          number=number/10;
        }
      if(temp==reverse)
      System.out.println("palindrome");
      else
      {
        System.out.println("not a palindrome"); 
      }
    }
  }