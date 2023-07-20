//Create a class called "Car" with instance variables for storing the make, model, and year of a car. Implement a constructor that initializes these variables and display the car's details.

class Car
  {
    String model;
    int year;
    public void display()
    {
    System.out.println("the model of the car is "+model);
    System.out.println("the year of the car is"+year);
    }
     public static void main(String args[])
    {
    Car c1=new Car();
    Car c2=new Car ();
    c1.model="ciaz";
    c1.year=2013;
    c2.model="creta";
    c2.year=2012;
    c1.display();
    c2.display();
    }
  }