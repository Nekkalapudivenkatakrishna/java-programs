import java.util.Scanner;
class Min
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the String");
      String str=sc.nextLine();
      String str1[]=str.split(" ");
      int min=str1[0].length();
      String word="";
      for(int i=0;i<str1.length;i++)
        {
          if(min>str1[i].length())
          {
            min=str1[i].length();
            word=str1[i];
          }
        }
    System.out.println("smallest word in sentence is "+word);
        }
  }