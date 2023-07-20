import java.util.Scanner;
class Count
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the String");
      String str=sc.nextLine();
      int acount=0,dcount=0,scount=0;
      for(int i=0;i<str.length();i++)
      {
     if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
             {
              acount++;
             }
          else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
             {
              dcount++;
             }
          else
            {
             scount++;
            }
        }
      System.out.println("number of characters in  string are "+acount);
      System.out.println("number of digits in string are "+dcount);
      System.out.println("number of special characters in  string are "+scount);
    }
  }