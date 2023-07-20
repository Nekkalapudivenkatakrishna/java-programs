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
class BabyMonkey extends Monkey
  {
    void sleep()
    {
       System.out.println("sleeping");
    }
  }
class MonkeyBrother extends BabyMonkey
  {
    void cry()
    {
       System.out.println("crying");
    }
  }
class MultilevelInheritance 
  {
  public static void main(String args[])
  {
  MonkeyBrother m=new MonkeyBrother();
  m.eat();
  m.jump();
  m.sleep();
  m.cry();
  }
 }