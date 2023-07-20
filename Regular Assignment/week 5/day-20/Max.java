import java.util.Scanner;
class Max
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the String");
      String str=sc.nextLine();
      String str1[]=str.split(" ");
      int max=str1[0].length();
      String word="";
      for(int i=0;i<str1.length;i++)
        {
          if(max<str1[i].length())
          {
            max=str1[i].length();
            word=str1[i];
          }
        }
    System.out.println("largest word in sentence is "+word);
        }
  }