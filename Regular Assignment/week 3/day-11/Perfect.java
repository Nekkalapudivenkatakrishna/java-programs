import java.util.Scanner;
class Perfect
  {
 public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      int n=sc.nextInt();
      int temp=n;
      int perfect=0;
      for(int i=1;i<n;i++)
        {
          if(n%i==0)
          {
          perfect=perfect+i;
          }  
        }
        if(perfect==temp)
        {
         System.out.println("perfect number");  
        }
        else
        {
        System.out.println("not a perfect number");  
        }
    }
  }