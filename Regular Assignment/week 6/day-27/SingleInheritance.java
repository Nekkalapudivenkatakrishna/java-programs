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
  class SingleInheritance
  {
  public static void main(String args[])
  {
  Monkey m=new Monkey();
  m.eat();
  m.jump();
  }
 }