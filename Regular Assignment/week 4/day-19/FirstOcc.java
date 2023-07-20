import java.util.Scanner;
class FirstOcc
  {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter string");
      String str=sc.nextLine();
      System.out.println("enter character");
      char ch=sc.next().charAt(0);
      int i;
      for(i=0;i<str.length();i++)
      {
        if(str.charAt(i)==ch)
        {
         break;
        }
      }
      System.out.println(i); 
    }
  }