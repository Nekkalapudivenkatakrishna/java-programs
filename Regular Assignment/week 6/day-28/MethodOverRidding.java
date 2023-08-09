class Shape
  {
    int side=3,length=4,width=3;
    void area()
    {
      System.out.println("area of all shapes");
    }
  }
class Square extends Shape
  {
    void area()
    {
      System.out.println("the area of square is "+(side*side));
    }
  }
class Rectangle extends Shape
  {
    void area()
    {
      System.out.println("the area of rectangle is "+(length*width));
    }
  }
class MethodOverRidding 
  {
    public static void main(String args[])
    {
    Shape s=new Shape();
    s.area();
    Shape squ=new Square();
    squ.area();
    Shape r=new Rectangle();
    r.area(); 
    }
  }