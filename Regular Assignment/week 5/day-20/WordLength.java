import java.util.Scanner;
class WordLength
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the String");
      String str=sc.nextLine();
      String str1[]=str.split(" ");
      for(int i=0;i<str1.length;i++)
        {
          System.out.println("the length of"+str1[i]+"is"+str1[i].length());
        }
    }
    }