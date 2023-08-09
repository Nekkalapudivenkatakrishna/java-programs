abstract class Shape
{
 abstract void clculateArea();
}
class Rectangle extends Shape
  {
    public void  clculateArea()
    {
    int length=5;
    int width=7;
    System.out.println("the area of rectangle is "+(length*width)); 
    }
  }
class Square extends Shape
  {
    public void  clculateArea()
    {
     int side=5;
    System.out.println("the area of square is "+(side*side)); 
    }
  }
class Circle extends Shape
  {
    public void  clculateArea()
    {
    float radius=16.2f;
    System.out.println("the area of circlerectangle is "+(3.14*radius*radius));
  }
  }
class Area
  {
    public static void main(String args[]) 
    {
     Rectangle rec=new Rectangle();
     Square sq=new Square();
     Circle cir=new Circle();
     rec.clculateArea();
     sq.clculateArea();
     cir.clculateArea(); 
    }
  }