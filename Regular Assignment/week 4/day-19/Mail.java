import java.util.Scanner;
class Mail
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int lcount=0,dcount=0,scount=0,scount1=0;
      char ch;
      System.out.println("enter your password");
      String password=sc.next();
      for(int i=0;i<password.length();i++)
        {
          ch=password.charAt(i);
          if(ch>='a'&& ch<='z')
          {
            lcount++;
          }
          if(ch>='0' && ch<='9')
          {
            dcount++;
          }
          if(ch=='@')
          {
           scount++;
          }
           if(ch=='.')
          {
           scount1++;
          }
        }
      if(lcount>0 && dcount>0 && scount>0 && scount1>0)
      {
        System.out.println("valid password");
      }
      else
        System.out.println("in valid password");    
    }
  }