import java.util.Scanner;
class OutofBound
  {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
    System.out.println("enter the array elements");
     int arr[]=new int[4];
      for(int i=0;i<=arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
    }
  }