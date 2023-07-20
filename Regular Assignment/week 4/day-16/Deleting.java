import java.util.*;
class Deleting
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter array size");
      int size=sc.nextInt(); 
      System.out.println("enter the index position ");
      int pos=sc.nextInt();
      System.out.println("enter array elements");
      int a[]=new int[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      for(int i=pos;i<size-1;i++)
        {
          a[i]=a[i+1];
        }
      System.out.println("the array elements after deleting are");
      for(int i=0;i<size-1;i++)
      {
        System.out.println(a[i]+" ");
      }
    }
  }