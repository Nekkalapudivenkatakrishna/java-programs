//Assignment 1: Simple Custom Exception Create a Java program that simulates a shopping cart. Define a custom exception called OutOfStockException. Implement a class representing an item in the cart with attributes like name, price, and quantity. When adding an item to the cart, throw the OutOfStockException if the quantity of the item is zero. Handle the exception appropriately and display an error message indicating that the item is out of stock


import java.util.Scanner;
class OutOfStockException extends Exception
  {
OutOfStockException(String message)
  {
   super(message);
  }
  }
class Cart
  {
  private String itemname;
  private double itemprice;
  private int itemquantity;
   public void setName(String itemname)
    {
      this.itemname=itemname;
    }
    public String getName()
    {
      return this.itemname;
    }
     public void setprice(double itemprice)
    {
      this.itemprice=itemprice;
    }
    public double getpirce()
    {
      return this.itemprice;
    } 
    public void setQuantity(int itemquantity)
    {
      this.itemquantity=itemquantity;
    }
    public int getQuantity()
    {
      return this.itemquantity;
    }
  }
 class Itemcart extends Cart
   {
      Scanner sc=new Scanner(System.in);
      Cart cart[]=new Cart[3];
     public void addingitems() throws OutOfStockException
     {
      for(int i=0;i<3;i++)
        {
      cart[i]=new Cart();
      System.out.println("enter the name of item");
      String itemname=sc.nextLine();
      cart[i].setName(itemname);
      System.out.println("enter the price of item");
      double itemprice=sc.nextDouble();
      cart[i].setprice(itemprice); 
      System.out.println("enter the quantity of item");
      int itemquantity=sc.nextInt();
          sc.nextLine();
       if(itemquantity==0)
       {
         throw new  OutOfStockException("item  Out Of Stock");
       }
       else
       {
         cart[i].setQuantity(itemquantity);
       }
        }
      }
    public void display()
     {
       System.out.println("the items list is");
       for(int i=0;i<3;i++)
         {
          System.out.println(cart[i].getName());
          System.out.println(cart[i].getpirce());
          System.out.println(cart[i].getQuantity());
         }
     }
   }
class ShopingCart
  {
    public static void main(String args[])
    {
      Itemcart i=new Itemcart();
      try
      {
        i.addingitems();
      }
      catch(Exception e)
        {
         System.out.println(e);
        }
      System.out.println("Exception handled");
      i.display();
    }
  }