//Create a class called "Circle" with an instance variable for storing the radius. Implement a constructor that takes the radius as an argument and initializes the object.

class Circle
{
  double radius;
  Circle(double r)
  {
   radius=r;
  }
  public void display()
  {
  System.out.println("the radius is "+radius);
  }
  public static void main(String args[])
  {
  Circle c=new Circle(3.8);
  c.display();
  }
}