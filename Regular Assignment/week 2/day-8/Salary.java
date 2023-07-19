import java.util.Scanner;
class Salary
  {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
    System.out.println(" enter basicsalary :");
    int basicsalary=sc.nextInt();
      int grosssalary,HRA,DA;
    if(basicsalary<=10000)
    {
      HRA=((basicsalary*20)/100);
      DA=((basicsalary*80)/100);
    }
    else if(basicsalary<=20000)
    {
     HRA=((basicsalary*25)/100);
      DA=((basicsalary*90)/100);
    }
    else
    {
     HRA=((basicsalary*30)/100);
     DA=((basicsalary*95)/100);
    }
    grosssalary=(basicsalary+HRA+DA);
      System.out.println("your grosssalary is"+grosssalary);
    }
  }