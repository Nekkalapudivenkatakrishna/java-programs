import java.util.Scanner;
class Grading
  {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
    System.out.println(" enter physics marks:");
    int physics=sc.nextInt();
       System.out.println(" enter social marks:");
    int social=sc.nextInt();
       System.out.println(" enter science marks:");
    int science=sc.nextInt();
       System.out.println(" enter maths marks:");
    int maths=sc.nextInt();
       System.out.println(" enter  english marks:");
    int english=sc.nextInt();
      double total=physics+social+science+maths+english;
      double Percentage=(total/500)*100;
      System.out.println("Percentage= "+Percentage);
     if(Percentage>=90)
    {
      System.out.println("grade A");
    }
    else if(Percentage>=80)
    {
      System.out.println("grade B");
    }
    else if(Percentage>=70)
    {
       System.out.println("grade C");
    }
    else if(Percentage>=60)
    {
       System.out.println("grade D");
    }
    else if(Percentage>=40)
    {
       System.out.println("grade E");
    }
    else
    {
      System.out.println("FAIL");
    }
      
    }
  }