import java.util.Scanner;
class Mail
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the String");
      String str=sc.nextLine();
      int count=0;
      if(str.contains("@")&&str.contains("."))
         {
           count++;
         }
      if(str.endsWith(".com")&&str.endsWith(".org"))
         {
          count++;
         }
      if(count>0)
      {
        System.out.println("valid password");
      }
      else
      {
         System.out.println("invalid password");
      }
    }
  }