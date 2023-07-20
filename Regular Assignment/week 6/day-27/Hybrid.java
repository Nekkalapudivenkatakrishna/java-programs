class GrandFather
{
  void property()
  {
    System.out.println("property");
  }
}
class Father extends GrandFather
{
  void job()
  {
    System.out.println("job");
  }
}
class Son extends Father
{
  void bussiness()
  {
    System.out.println("bussiness");
  }
}
class Grandchild extends Father
{
  void education()
  {
    System.out.println("education");
  }
}
class Hybrid
{
 public static void main(String args[])
  {
   Grandchild g=new Grandchild();
   Son s=new Son();
   g.property();
   s.job();
   s.bussiness();
   g.education();
  }
}