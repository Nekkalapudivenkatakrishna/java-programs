import java.util.Scanner;
class EvenOrOdd2
{
    public static void eoo(int a[])
   {
      System.out.println("even nubers are");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2==0)
          {
           System.out.println(a[i]);
          }
        }
    }
     public static void main(String args[])
    {
      int a[]=new int[6];      
      Scanner sc=new Scanner(System.in);
      System.out.println("enter array elements");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
       eoo(a); 
    } 
 }