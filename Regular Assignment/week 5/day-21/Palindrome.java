import java.util.Scanner;
class Palindrome
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String st=sc.nextLine();
      String str[]=st.split(" ");
      for(int i=0;i<str.length;i++)
        {
          String temp=str[i];
          String reverse="";
          for(int j=temp.length()-1;j>=0;j--)
            {
              reverse=reverse+temp.charAt(j);
            }
          if(temp.equals(reverse))
          {
            System.out.println(temp+"");
          }
        }
    }
  }