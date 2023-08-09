//Create an abstract class called "Shape" that has the following abstract methods:
//get_area(): Returns the area of the shape.get_perimeter(): Returns the perimeter of the shape.
//Create concrete classes Circle, Rectangle, and Triangle that inherit from the abstract class "Shape." Implement the required methods for each class.

import java.util.Scanner;
abstract class Shape2
{
 Scanner sc=new Scanner(System.in);
 abstract void getArea();
 abstract void getPerimeter(); 
}
class Rectangle extends Shape2
  {
    public void  getArea()
    {
    System.out.println("enter the length");
    int length=sc.nextInt();
    System.out.println("enter the width");
    int width=sc.nextInt();
    System.out.println("the area of rectangle is "+(length*width)); 
    }
    public void getPerimeter()
    {
    System.out.println("enter the length");
    int length=sc.nextInt();
    System.out.println("enter the width");
    int width=sc.nextInt();
     System.out.println("the perimeter of rectangle is "+(2*(length*width))); 
    }
  }
class Square extends Shape2
  {
    public void getArea()
    {
     System.out.println("enter the side");
     int side=sc.nextInt();
    System.out.println("the area of square is "+(side*side)); 
    }
    public void getPerimeter()
    {
      System.out.println("enter the side");
     int side=sc.nextInt();
    System.out.println("the Perimeter of square is "+(4*side));  
    }
  }
class Circle extends Shape2
  {
    public void  getArea()
    {
    System.out.println("enter the radius");
    float radius=sc.nextFloat();
    System.out.println("the area of circle is "+(3.14*radius*radius));
   }
    public void getPerimeter()
    {
       System.out.println("enter the radius");
    float radius=sc.nextFloat();
       System.out.println("the perimeter of circle is "+(2*3.14*radius));
    }
  }
class Area
  {
    public static void main(String args[]) 
    {
     Rectangle rec=new Rectangle();
     Square sq=new Square();
     Circle cir=new Circle();
     rec.getArea();
     rec.getPerimeter(); 
     sq.getArea();
     sq.getPerimeter();
     cir.getArea();
     cir.getPerimeter(); 
    }
  }