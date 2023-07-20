import java.util.Scanner;
class ReverseString
  {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter string");
      String str=sc.nextLine();
      String str1[]=str.split(" ");
      String reverse=" ";
      for(int i=str1.length-1;i>=0;i--)
        {
         reverse=reverse+str1[i]+" ";
        }
      System.out.println(reverse);
    }
  }
  
    