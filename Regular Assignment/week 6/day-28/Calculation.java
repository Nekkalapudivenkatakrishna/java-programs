//Design a class MathOperations with a method calculate that performs different arithmetic operations (addition, subtraction, multiplication, division) on two integers and returns the result. Implement method overloading to support the following cases:
//Perform addition.Perform subtraction.Perform multiplication.Perform division.

class Operations
  {
    void calculate(int a,int b)
    {
      System.out.println("the addition of two integers is "+(a+b));
    }
    void calculate(float a,float b)
    {
      System.out.println("the substraction of two integers is "+(a-b));
    }
    void calculate(double a,double b)
    {
      System.out.println("the multipication of two integers is "+(a*b));
    }
    void calculate(long a,long b)
    {
      System.out.println("the division of two integers is "+(a/b));
    }
  }
class Calculation
{
  public static void main(String args[])
  {
    Operations p=new Operations();
    p.calculate(4,3);
    p.calculate(7.4,2.1);
    p.calculate(15.2,6.5);
    p.calculate(555,5555);
  }
}