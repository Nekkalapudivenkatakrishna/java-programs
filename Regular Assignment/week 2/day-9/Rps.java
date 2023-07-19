import java.util.Scanner;; 
class Rps
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println(" enter user value");
      char user=sc.next().charAt(0);
      System.out.println(" enter computer value:");
      char computer=sc.next().charAt(0);
        if(user=='r'&&computer=='p')
        {
          System.out.println("computer will wins");
        }
        else if(user=='r'&&computer=='s')
          
        {
          System.out.println("user will wins");
        }
        else if(user=='s'&&computer=='r')
        {
          System.out.println("comp will wins");
        }
        else if(user=='p'&&computer=='r')
        {
          System.out.println("user will wins");
        }
        else if(user=='p'&&computer=='s')
        {
          System.out.println("comp will wins");
        }
        else if(user=='s'&&computer=='p')
        {
          System.out.println("user will wins");
        }
    }
  }