import java.util.Scanner;
class Occurene
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String word=sc.nextLine();
      System.out.println("enter the character");
      char ch=sc.next().charAt(0);
      int count=0;
      for(int i=0;i<word.length();i++)
      {
       if(word.charAt(i)==ch)
       {
         count++;
       } 
      }
      System.out.println("the no of "+ch+" occurances is "+count);
    }
  }