/*Assignment 1: Single Inheritance
Create a superclass called "Animal" with the following attributes:
String nameint ageString breed*/

class Animal
  {
    void details()
    {
    String name="bruno";
    int age=3;
    String breed="rotwiler";
    System.out.println(name+" "+age+" "+breed);
    }
  }
class Dog extends Animal
  {
  void bark() 
   {
   System.out.println("the dog is barking");
   }
  }
 class Si
  {
  public static void main(String args[])
   {
  Dog d=new Dog();
  d.details();
  d.bark();
   } 
  }