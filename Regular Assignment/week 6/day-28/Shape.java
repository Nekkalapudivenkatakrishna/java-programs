class Area
  {
    void area()
    {
     System.out.println("the details of rectangle is ");
    }
    void area(String colour)
    {
      System.out.println("the colour is "+colour);
    }
    void area(double radius)
    {
      System.out.println("the radius is "+radius);
    }
    void area(double length,double width)
    {
      System.out.println("the area is "+(length*width));
    }
    
  }
class Shape
  {
    public static void main(String args[])
    {
     Area a=new Area();
     a.area();
     a.area("blue");
     a.area(2.8);
     a.area(4,3);
    }
  }