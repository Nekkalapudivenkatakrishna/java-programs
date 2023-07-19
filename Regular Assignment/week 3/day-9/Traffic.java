import java.util.Scanner;
class Traffic
{
  public static void main(String[] args)
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the time in 24 hours format");
    if(time<=24&&time>=1&&time<=6)
    {
      System.out.println("green signal");
    }
    else if(time>=7&&time<=11)
    {
      System.out.println("red signal");
    }
    else if(time>=12&&time<=16)
    {
      System.out.println("orange signal");
    }
    else if(time>=17&&time<=21)
    {
      System.out.println("red signal");
    }
    else if(time>=22&&time<=24)
    {
      System.out.println("orange signal");
    }
    else
    {
      System.out.println("please enter time between 1 to 24 hours");
    }
  }
}