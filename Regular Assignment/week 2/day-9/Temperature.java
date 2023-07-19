import java.util.Scanner;
class Temperature
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
      System.out.println(" enter c or f to convert :");
    char x=sc.next().charAt(0);
   if(x=='c'||x=='C')
    {
      System.out.println("enter temperature");
      double Celsius=sc.nextDouble();
      double Fahrenheit=(Celsius*1.8)+32;
     System.out.println("converted temperature is "+Fahrenheit);
    }
     else if(x=='f'||x=='F')
    {
      System.out.println("enter temperature");
      double Fahrenheit=sc.nextDouble(); 
      double Celsius= (Fahrenheit - 32) * 5/9;
     System.out.println("converted temperature is "+Celsius);
    }
    else
     {
      System.out.println("choose betwee c and f");
     }
  }
}