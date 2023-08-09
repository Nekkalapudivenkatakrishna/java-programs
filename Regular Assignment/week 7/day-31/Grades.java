//Create a class named "Student" with private attributes: name, rollNumber, age, and marks.Implement getter and setter methods for all attributes.Ensure that the marks attribute can only be accessed through getter and setter methods, not directly.Add a method named calculateGrade() that calculates the grade based on the marks and returns it as a string (e.g., "A+", "B", "C", etc.).Add a method named displayDetails() that displays the student's name, roll number, age, marks, and grade.In the main method, create an array of Student objects to store information for multiple students. Prompt the user to input data for each student, calculate their grades, and display their details.


import java.util.Scanner;
class Student 
{
  private String name;
  private int rollnumber;
  private int age;
  private int marks;
  private String grade;
  public void setName(String name)
  {
    this.name=name;
  }
  public String getName()
  {
    return name;
  }
  public void setRollnumber(int rollnumber)
  {
    this.rollnumber=rollnumber;
  }
  public int getRollnumber()
  {
    return rollnumber;
  }
  public void setAge(int age)
  {
    this.age=age;
  }
  public int getAge()
  {
    return age;
  }
  public void setMarks(int marks)
  {
    this.marks=marks;
  }
  public int getMarks() 
  {
    return marks;
  }
  public String calculateGrade()
  {
    if((marks>570)&&(marks<=600))
    {
     grade="A grade";
      return grade;
    }
    else if((marks>520)&&(marks<=570))
    {
     grade="B grade";
      return grade;
    }
    else if((marks>450)&&(marks<=520))
    {
     grade="C grade";
      return grade;
    }
    
    else if((marks>350)&&(marks<=450))
    {
     grade="D grade";
      return grade;
    }
    else
    {
     grade="Fail";
      return grade;
    }
  }
  public void displayDetails()
  {
    System.out.println("student name is "+getName());
    System.out.println("student rollnumber is "+getRollnumber());
    System.out.println("student age is "+getAge());
    System.out.println("student marks is "+getMarks());
    System.out.println("student grade is "+calculateGrade());
  }
}
class Grades
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    Student student[]=new Student[3];
    for(int i=0;i<student.length;i++)
      {
       student[i]=new Student();
       System.out.println("enter the student name");
       student[i].setName(sc.next());
       System.out.println("enter the rollnumber ");
       student[i].setRollnumber(sc.nextInt());
       System.out.println("enter the age");
       student[i].setAge(sc.nextInt());
       System.out.println("enter the marks");
       student[i].setMarks(sc.nextInt());
      }
    for(int i=0;i<student.length;i++)
      {
       student[i].displayDetails();
      }
  }
}