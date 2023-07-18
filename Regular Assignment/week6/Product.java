//Create a class called "Product" with instance variables for storing the product name, price, and quantity. Implement a constructor that takes arguments for each variable and initializes the object.

class Product
  {
    String productname;
    int productprice;
    int productquantity;
    Product(String pn,int pp,int pq)
    {
     productname=pn;
     productprice=pp;
     productquantity=pq;
    }
    public void display()
    {
      System.out.println("the product name is "+productname);
      System.out.println("the product price is "+productprice);
      System.out.println("the product quantity is "+productquantity);
    }
    public static void main(String args[])
    {
      Product p=new Product("mobile",18000,1);
      p.display();
    }
  }