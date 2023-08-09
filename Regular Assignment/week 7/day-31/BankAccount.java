//Assignment 2: Bank Account Hierarchy
/// an abstract class called "BankAccount" that has the following abstract methods:
//deposit(amount): Adds the given amount to the account balance.withdraw(amount): Deducts the given amount from the account balance.get_balance(): Returns the current account balance.
//Create concrete classes CheckingAccount and SavingsAccount that inherit from the abstract class "BankAccount." Implement the required methods for each class.
//Write a program to:
//Create instances of CheckingAccount and SavingsAccount.Prompt the user to make deposits and withdrawals from each account.Display the current balance of each account after each transaction.


import java.util.Scanner;
abstract class Account
{
 Scanner sc=new Scanner(System.in);
 double accountbalance=4500;
 abstract void deposit();
 abstract void withdraw();
}
class CheckingAccount extends Account
{
 public void deposit()
  {
    System.out.println("enter the deposit amount");
    double depositamount=sc.nextDouble();
    accountbalance=accountbalance+depositamount;
    System.out.println("the deposited amount is "+depositamount);
    System.out.println("after deposit accontbalance is "+ accountbalance);
  }
  public void withdraw()
  {
   System.out.println("enter the withdraw amount");
  double withdrawamount=sc.nextDouble();
   accountbalance=accountbalance-withdrawamount;
    System.out.println("the withdraw amount is "+withdrawamount);
    System.out.println("after deposit accontbalance is "+ accountbalance);
  }
  public void get_Balance()
  {
  System.out.println("accontbalance is "+ accountbalance); 
  }
}
class SavingsAccount extends Account
  {
   public void deposit()
  {
    System.out.println("enter the deposit amount");
    double depositamount=sc.nextDouble();
    accountbalance=accountbalance+depositamount;
    System.out.println("the deposited amount is "+depositamount);
    System.out.println("after deposit accontbalance is "+ accountbalance);
  } 
   public void withdraw()
  {
   System.out.println("enter the withdraw amount");
   double withdrawamount=sc.nextDouble();
   accountbalance=accountbalance-withdrawamount;
    System.out.println("the withdraw amount is "+withdrawamount);
     System.out.println("after deposit accontbalance is "+ accountbalance);
  }
  public void get_Balance()
  {
  System.out.println("accontbalance is "+ accountbalance); 
  }
  }
class BankAccount
  {
    public static void main(String args[])
    {
      CheckingAccount ca=new CheckingAccount();
      SavingsAccount sa=new SavingsAccount();
      ca.deposit();
      ca.withdraw();
      ca.get_Balance();
      sa.deposit();
      sa.withdraw();
      sa.get_Balance();
    }
  }