import java.util.Scanner;
class Pair
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the Arrays size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("enter the divisor");
        int k=sc.nextInt();
        int count=0;
      for(int i=0;i<size;i++)
        {
          for(int j=0;j<size;j++)
          {
            if((arr[i]+arr[j]%5==0)&&(i<j))
            {
              count++;
            }
          }
        }
      System.out.println("the number of pairs are"+count);
        }
  }