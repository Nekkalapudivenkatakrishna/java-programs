//Create a class called "BankAccount" with instance variables for storing the account holder's name and account balance. Implement a method named initializeAccount that takes arguments for each variable and initializes the object. Implement another method named displayAccountDetails to display the account holder's name and balance.

class BankDetail
{
  String accname;
  float accbal;
  public void initializeAccount(String accname,float accbal)
  {
    accname=name;
    accbal=bal;
  }
  public void displayAccountDetails()
  {
    System.out.println("account holder name "+name);
    System.out.println("account balance "+bal);
  }
  public static void main(String args[])
  {
  BankDetail bank=new BankDetail();
  bank.initializeAccount("krishna",555);
  bank.displayAccountDetails();
  }
}