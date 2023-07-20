import java.util.Scanner;
class VowelOrNot
{
public static void von(char x)
  {
       if((x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='u'))
    {
      System.out.println(x+" is a vowel ");
    }
    else 
    {
      System.out.println(x+" is not a vowel ");
    }
  }
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
    System.out.println(" enter a value:");
    char a=sc.next().charAt(0);
    von(a);
   }
} 