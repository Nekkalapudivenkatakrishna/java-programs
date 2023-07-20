import java.util.Scanner;
class EvenOrOdd2
{
    public static void eoo(int a[])
   {
      System.out.println("even nubers are");
      int count=0;
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2==0)
          {
           count++;
          }
        }
        System.out.println(count);
    }
     public static void ooe(int a[])
   {
      System.out.println("odd nubers are");
      int count=0;
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2!=0)
          {
           count++;
          }
        }
        System.out.println(count);
    }
    public static void cne(int a[])
   {
      System.out.println("Negative elements are");
       int count=0;
      for(int i=0;i<a.length;i++)
        {
          if(a[i]<0)
          {
           count++;
          }
        }
         System.out.println(count);
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
       ooe(a);
       cne(a);
    } 
 }