//Create a class called "Student" with instance variables for storing the student's name, roll number, and grade. Implement a constructor that takes arguments for each variable and initializes the object.

class Student
  {
    String Studentname;
    int rollnumber;
    char grade;
    Student(String n,int rn,char g)
    {
     Studentname=n;
     rollnumber=rn;
     grade=g;
    }
    public void display()
    {
    System.out.println("the student name is "+Studentname);
    System.out.println("the student roll number is "+rollnumber);
    System.out.println("the student grade is "+grade);   
    }
    public static void main(String args[])
    {
    Student s=new Student("krishna",89,'c');
    s.display();
    }
  }