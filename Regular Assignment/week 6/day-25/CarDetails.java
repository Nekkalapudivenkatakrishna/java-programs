//Create a class called "Car" with instance variables for storing the make, model, and year of a car. Implement a method named setCarDetails that takes arguments for each variable and initializes the object. Display the car's details using a separate method.

class CarDetails
  {
   String make;
   String model;
   int year;
   public void  setCarDetails(String mk,String md,int yr)
    {
    make=mk;
    model=md;
    year=yr;
    }
    public void display()
    {
      System.out.println("name of the car maker "+make);
      System.out.println("model of the car "+model);
      System.out.println("yeae of the car "+year);
    }
    public static void main(String args[])
    {
    CarDetails c=new CarDetails();
    c.setCarDetails("maruti","swift",2000);
    c.display();
    }
  }