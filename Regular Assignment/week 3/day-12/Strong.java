import java.util.Scanner;
class Strong
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the n value");
      int n=sc.nextInt();
      int strong=0;
      int temp=n;
      while(n>0)
        {
         int digit=n%10;
          int fact=1;
         for(int i=1;i<=digit;i++)
        {  
         fact=fact*i;
        } 
           strong=strong+fact;  
           n=n/10;
        }
      if(temp==strong)
        System.out.println("Storng number");
      else
        System.out.println("not a Storng");
    }
  }