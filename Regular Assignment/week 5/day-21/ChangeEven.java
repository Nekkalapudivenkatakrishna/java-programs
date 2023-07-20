import java.util.Scanner;
class ChangeEven
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String st=sc.nextLine();
      String str="";
       for(int i=0;i<st.length();i++)
      {
        if(i%2==0)
        {
          str=str+st.charAt(i);
        }
      }
       for(int i=0;i<st.length();i++)
      {
        if(i%2!=0)
        {
          str=str+st.charAt(i);
        }
      }
     System.out.println(str) ;
    }
  }