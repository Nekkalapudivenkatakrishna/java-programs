import java.util.Scanner;
class FOcurance
  {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter string");
      String str=sc.nextLine();
      System.out.println("enter character");
      char ch=sc.next().charAt(0);
      int s=str.indexOf(ch);
      System.out.println(s);
    }
  }
    