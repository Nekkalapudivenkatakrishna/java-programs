//Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a method named setEmployeeDetails that takes arguments for each variable and initializes the object. Implement another method named

class Emp
  {
   String empname;
   String empdes;
   int empsal;
   public void setEmployeeDetails (String name,String des,int sal)
    {
    empname=name;
    empdes=des;
    empsal=sal;
    }
    public void display()
    {
      System.out.println("name of the employee "+empname);
      System.out.println("designation of the employee "+empdes);
      System.out.println("salary of the employee "+empsal);
    }
    public static void main(String args[])
    {
    Emp e=new Emp();
    e.setEmployeeDetails("krishna","manager",20000);
    e.display();
    }
  } 
