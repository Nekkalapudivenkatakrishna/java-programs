import java.util.Scanner;
class Validation
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int acount=0,lcount=0,dcount=0,scount=0;
      char ch;
      System.out.println("enter your password");
      String password=sc.next();
      for(int i=0;i<password.length();i++)
        {
        ch=password.charAt(i);
         if(password.length()>=8) 
         {
           if(ch>='A' && ch<='Z') 
          {
           acount++;
          }
         if(ch>='a'&& ch<='z')
          {
            lcount++;
          }
          if(ch>='0' && ch<='9')
          {
            dcount++;
          }
            
         }            
       else 
         {
          System.out.println("password must contain atleast 8 characters");
           break;
         }
        }
      if(acount>0 && lcount>0 && dcount>0)
      {
        System.out.println("valid password");
      }
      else
        System.out.println("Invalid password");  
    }
  }