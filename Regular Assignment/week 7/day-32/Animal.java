//Assignment 2: Animal Interface Create an interface called Animal with the following methods:
//sound(): Abstract method that returns a String representing the sound the animal makes.eat(String food): Abstract method that takes a String parameter food representing the food the animal eats.
//Now, create classes Dog, Cat, and Duck, implementing the Animal interface. Write appropriate code for each animal's sound and eating habits.

interface Animal
{
  void sound(String sounds);
  void eat(String food);
}
class Dog implements Animal
  {
    public void sound(String sounds)
    {
     System.out.println("the dog souds like "+sounds);
    }
    public void eat(String food)
    {
     System.out.println("the dog eat "+food);
    }
  }
class Cat implements Animal
  {
     public void sound(String sounds)
    {
     System.out.println("the cat souds like "+sounds);  
    }
    public void eat(String food)
    {
      System.out.println("the cat eat "+food);
    }
  }
class Duck implements Animal
  {
     public void sound(String sounds)
    {
      System.out.println("the duck souds like "+sounds); 
    }
    public void eat(String food)
    {
      System.out.println("the duck eat "+food); 
    }
  }
class Abstaction
{
  public static void main(String args[])
  {
    Animal d=new Dog();
    d.sound("bow bow");
    d.eat("chicken");
    Animal c=new Cat();
    c.sound("meow meow");
    d.eat("muose");
    Animal k=new Duck();
    k.sound("wack wack");
    k.eat("fish");
  }
}