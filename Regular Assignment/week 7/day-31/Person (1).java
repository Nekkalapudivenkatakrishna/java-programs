//Assignment 1: Create a Class with Encapsulation
//Create a class named "Person" with private attributes: name, age, and email.Provide public getter and setter methods for each attribute.//
//Write a displayInfo() method within the class to display all the details of the person.In the main method, create an object of the class and set values
//for the attributes using setter methods. Then, call the displayInfo() method to show the details of the person

class Details
{
  private String name;
  private int age;
  private String mail;
  public void setName(String name)
  {
   this.name=name;
  }
  public String getName()
  {
    return name;
  }
  public void setAge(int age)
  {
   this.age=age;
  }
  public int getAge()
  {
    return age;
  }
  public void setMail(String mail)
  {
   this.mail=mail;
  }
  public String getMail()
  {
    return mail;
  }
  public void displayInfo()
  {
    System.out.println("the name of the person "+getName());
    System.out.println("the age of the person "+getAge());
    System.out.println("the mail of the person "+getMail());
  }
}
class Person
  {
    public static void main(String args[])
    {
      Details d=new Details();
      d.setName("krishna");
      d.setAge(25);
      d.setMail("venkatakrishna5522");
      d.displayInfo();
    }
  }