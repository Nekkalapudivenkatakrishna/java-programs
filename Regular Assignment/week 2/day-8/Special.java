import java.util.Scanner;
class Special
  
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter any one value:");
    char x=sc.next().charAt(0);
    if((x>='a')&&(x<='z'))
    {
      System.out.println(x+" is a lowercase alphabet ");
    }
    else if((x>='A')&&(x<='Z'))
    {
      System.out.println(x+" is a upercase alphabet ");
    }
    else if((x>='0')&&(x<='9'))
    {
       System.out.println(x+" is a number ");
    }
    else 
    {
       System.out.println(x+" is a special character ");
    }
    
  }
}  