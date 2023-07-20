import java.util.Scanner;
class Search
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter array size");
      int size=sc.nextInt();
      System.out.println("enter array elements");
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
        System.out.println("enter search elements");
       int s=sc.nextInt(); 
       int i;
       int count=0;
       for(i=0;i<size;i++)
         {
            if(a[i]==s)
          {
            count++;
            break;
          }
         }
         if(count>0)
         {
         System.out.println("the element is present in index position "+i);
         }
          else
         {
           System.out.println("element not found ");
         }
    }
  }