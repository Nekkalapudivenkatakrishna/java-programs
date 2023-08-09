//Assignment 6: Custom Exception in Banking Application Build a simple banking application in Java. Create a custom checked exception named InsufficientFundsException, which will be thrown when a user tries to withdraw an amount that exceeds their account balance. Implement classes for bank accounts, and provide methods for depositing and withdrawing money. Throw the InsufficientFundsException when a withdrawal amount is greater than the available balance. Handle this exception in an appropriate way and display a user-friendly error message.

import java.util.Scanner;
class InsufficientFundsException extends Exception
{
  InsufficientFundsException(String message)
  {
   super(message);
  }
}
class Transaction
{
  double avilablebalance=7200;
  double depositamount;
  double withdraw;
  public void deposit(double depositamount)
  {
    this.depositamount=depositamount;
  avilablebalance=depositamount+avilablebalance;
  }
  public void withdrawl(double withdraw) throws InsufficientFundsException
  {
     this.withdraw=withdraw;
    if(withdraw>avilablebalance)
    {
      throw new InsufficientFundsException("InsufficientFunds");
    }
    else 
    {
     withdraw=withdraw-avilablebalance;
       System.out.println("withdraw succesful");
    }
  }
}
class BankingApplication
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    Transaction w=new Transaction();
    System.out.println("enter the deposiamount");
    double depositamount=sc.nextDouble();
 System.out.println("enter the withdrawamount");
   double withdraw=sc.nextDouble();
try
  {
   w.withdrawl(withdraw);
  }
catch(InsufficientFundsException e)
  {
  System.out.println(e);
  }
  System.out.println("exception handled");
  }
  }