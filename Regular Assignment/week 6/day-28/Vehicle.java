//Design a class Vehicle with a method start_engine that prints a generic message like "Engine starting." Create two derived classes, Car and Motorcycle, that override the start_engine method with more specific messages like "Car engine starting" and "Motorcycle engine starting."

class Engine
  {
    void startengine()
    {
      System.out.println("engine starting");
    }
  }
class Car extends Engine
  {
    void startengine()
    {
      System.out.println("car engine starting");
    }
  }
class Motorcycle extends Engine
  {
   void startengine()
    {
      System.out.println("Motorcycle engine starting");
    }
  }
class Vehicle
{
  public static void main(String args[])
  {
    Engine c=new Car();
    c.startengine();
    Engine m=new Motorcycle();
    m.startengine();
  }
}