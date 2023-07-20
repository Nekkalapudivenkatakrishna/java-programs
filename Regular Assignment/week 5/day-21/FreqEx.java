import java.util.Scanner;
class FreqEx
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String st=sc.nextLine();
      char str[]=st.toCharArray();
      boolean b[]=new boolean[str.length];
      for(int k=0;k<b.length;k++)
        {
          b[k]=false;
        }
    System.out.println("Element -----------Frequency");
      for(int i=0;i<str.length;i++)
        {
          int count=1;
          if(b[i]==true)
            continue;
          for(int j=i+1;j<str.length;j++)
            {
              if(str[i]==str[j])
              {
                count++;
                b[j]=true;
              }
            }
          
          System.out.println(str[i]+"------------"+count);
        }
    }
  }