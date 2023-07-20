//Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a constructor that initializes these variables and display the employee's details.

import java.util.Scanner;
class Employee
  {
    String name;
    String designation;
    int salary;
    public void display()
   {
    System.out.println("name of the employee is "+name);
    System.out.println("designation of the employee "+designation);
    System.out.println("salary of the employee "+salary);
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    Employee e1=new Employee();
    Employee e2=new Employee();
    Employee e3=new Employee();
    System.out.println("enter the employee name");
    e1.name=sc.nextLine();
    System.out.println("enter the employee designation");
    e1.designation=sc.nextLine();
    System.out.println("enter the employee salary");
    e1.salary=sc.nextInt();
    sc.nextLine();
    System.out.println("enter the employee name");
    e2.name=sc.nextLine();
    System.out.println("enter the employee designation");
    e2.designation=sc.nextLine();
    System.out.println("enter the employee salary");
    e2.salary=sc.nextInt();
    sc.nextLine();
    System.out.println("enter the employee name");
    e3.name=sc.nextLine();
    System.out.println("enter the employee designation");
    e3.designation=sc.nextLine();
    System.out.println("enter the employee salary");
    e3.salary=sc.nextInt();
    e1.display();
    e2.display();
    e3.display();
    }
  }