//Create a class called "Person" with instance variables for storing the person's name, age, and address. Implement a constructor that takes arguments for each variable and initializes the object.

class Person
  {
    String name;
    int age;
    String add;
    Person(String n,int a,String ad)
    {
     name=n;
     age=a;
     add=ad;
    }
    public void display()
    {
    System.out.println(name+" "+age+" "+add);
    }
    public static void main(String args[])
    {
    Person p=new Person("krish",25,"gurunanak colony");
    p.display();
    }
  }