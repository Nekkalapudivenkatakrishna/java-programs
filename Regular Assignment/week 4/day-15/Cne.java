import java.util.Scanner;
class Cne
  {
    public static void main(String args[])
    {
      int a[]=new int[6];      
      Scanner sc=new Scanner(System.in);
      System.out.println("enter array elements");
      int count=0;
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Negative elements are");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]<0)
          {
           count++;
          }
        }
        System.out.println(count);
    }
  }