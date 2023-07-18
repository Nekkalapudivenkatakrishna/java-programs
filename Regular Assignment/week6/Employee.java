//Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a constructor that takes arguments for each variable and initializes the object.

class Employee
  {
  String employeename;
  String employeedesignation;
  int employeesalary;
  Employee(String name,String des,int sal)
    {
    employeename=name;
    employeedesignation=des;
    employeesalary=sal;
    }
    public void display()
    {
    System.out.println("the employee name is "+employeename);
System.out.println("the employee designation is "+employeedesignation);
System.out.println("the employee salary is "+employeesalary);
  }
  public static void main(String args[])
    {
      Employee e=new Employee("krishna","junior",28000);
      e.display();
    }
  } 