import java.util.Scanner;
class Max
  {
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int size=sc.nextInt();
      System.out.println("Enter array element in to a[]");
      int a[]=new int[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
     int min=a[0];
     for(int i=0;i<size;i++)
     {
      if(min>=a[i]) 
      {
        min=a[i];
      }
     }
     System.out.println("the min element is"+min);
   }
  }