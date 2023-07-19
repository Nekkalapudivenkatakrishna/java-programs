import java.util.Scanner;
class AgeCalculator
  {
 public static void main(String args[])
    {
      
      Scanner sc=new Scanner(System.in);
      System.out.println("enter year of birth");
      int dob=sc.nextInt();
      if(dob<2023)
       {
       int age=(2023-(dob));
       if(age>=18)
       {
       System.out.println("Age of person :"+age);
       System.out.println("The person is Adult");
       }
       else 
       {
       System.out.println("Age of person :"+age);
       System.out.println("The person is Minor");
       }
       }
      else 
      {
      System.out.println("enter a year below 2023");
      }
    }
  }