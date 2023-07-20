import java.util.Scanner;
class Copy
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int size=sc.nextInt();
      int a[]=new int[size];
      int b[]=new int[size];
      System.out.println("Enter array element in to a[]");
      	
      for(int i=0;i<size;i++)
        {
          b[i]=a[i];
        }
    System.out.println("elements are in a[]");
      for(int i=0;i<size;i++)
        {
          System.out.print(a[i]+" ");
        }
        System.out.println("elements are in b[]");
      for(int i=0;i<size;i++)
        {
          System.out.print(b[i]+" ");
        }
    }
  }