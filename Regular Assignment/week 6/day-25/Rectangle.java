import java.util.Scanner;
class Rectangle
  {
    int length;
    int width;
    public void display()
    {
      System.out.println("the area of Rectangle is "+(length*width));
      System.out.println("the perimeter of Rectangle is "+(2*(length+width)));
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    Rectangle r=new Rectangle();
    System.out.println("enter the length");
    r.length=sc.nextInt();
    System.out.println("enter the width");
    r.width=sc.nextInt();
    r.display();
    }
  }