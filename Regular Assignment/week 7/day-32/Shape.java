//Assignment 1: Shape Interface Create an interface called Shape with the following methods:
//calculateArea(): Abstract method that calculates and returns the area of the shape.calculatePerimeter(): Abstract method that calculates and returns the perimeter of the shape.getDescription(): Abstract method that returns a String describing the shape.
//Now, create classes Circle, Rectangle, and Triangle, implementing the Shape interface. Write appropriate code to calculate the area and perimeter for each shape and provide a description.

interface Shape
{
  void calculateArea();
  void calculatePerimeter();
  void getDescription();
}
class Circle implements Shape
  {
    public void calculateArea(double radius)
    {
     System.out.println("the area of circle is "+(3.14*radius*radius)); 
    }
    public void calculatePerimeter(double radius)
    {
      System.out.println("the perimeter of circle is "+(2*3.14*radius));
    }
    public void getDescription()
    {
     System.out.println("circle is round in shape") 
    }
  
  class Rectangle implements Shape
  {
   public void calculateArea(double length,double width)
    {
      System.out.println("the area of the Rectangle is "+(length*width));
    }
     public void calculatePerimeter(double length,double width)
    {
      System.out.println("the perimeter of the Rectangle is "+(2*(length+width)));
    }
    public void getDescription()
    {
     System.out.println("the Rectangle have four side")
    }
  }
  class Triangle implements Shape
  {
     public void calculateArea(int height,int base)
    {
      System.out.println("the area of triangle is"+(h*b)/2);
    }
     public void calculatePerimeter(int side)
    {
     System.out.println("the area of triangle is"+side+side+side); 
    }
     public void getDescription()
    {
      System.out.println("the triangle have three side") 
    }
  }
class Abstaction
{
  public static void main(Stirng args[])
  {
    Shape c=new Circle();
    c.calculateArea();
    c.calculatePerimeter();
    c.getDescription();
    Shape r=new Rectangle();
    r.calculateArea();
    r.calculatePerimeter();
    r.getDescription();
    Shape t=new Triangle();
    t.calculateArea();
    t.calculatePerimeter();
    t.getDescription();
  }
}