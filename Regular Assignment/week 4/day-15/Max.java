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
     int max=a[0];
     for(int i=0;i<size;i++)
     {
      if(max<=a[i]) 
      {
        max=a[i];
      }
     }
     System.out.println("the max element is"+max);
   }
  }
     
