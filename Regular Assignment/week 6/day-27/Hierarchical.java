class Animal
  {
    void eat()
    {
    System.out.println("eating");
    }
  }
class Monkey extends Animal
  {
    void jump()
    {
    System.out.println("jumping");
    }
  }
class Dog extends Animal
  {
    void bark()
    {
    System.out.println("barking");
    }
  }
class Cat extends Animal
  {
    void sleep()
    {
    System.out.println("sleeping");
    }
  }
  class Hierarchical
  {
  public static void main(String args[])
  {
  Cat c=new Cat();
  Dog d=new Dog();
  Monkey m=new Monkey();
  c.eat();
  m.jump();
  d.bark();
  c.sleep();
  }
 }