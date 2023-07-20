import java.util.Scanner;
class Replace
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String st=sc.nextLine();
      String str=st.replaceAll("[()]", "");
      System.out.println(str);
    }
  }