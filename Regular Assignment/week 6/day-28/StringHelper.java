//Create a class StringHelper with a method concatenate that concatenates two strings and returns the result. Implement method overloading for concatenate to handle the following cases:
//Concatenate two strings.Concatenate three strings.Concatenate a list of strings.

class Helper
  {
    String str;
    void concat(String str1,String str2)
    {
      str=str1.concat(str2);
      System.out.println("the concatinated string is "+str);
    }
    void concat(String str3)
    {
      System.out.println("the concatinated string is"+str.concat(str3));
    }
  }
class StringHelper
  {
    public static void main(String args[])
    {
      Helper h=new Helper();
      h.concat("venkata","krishna");
      h.concat("nekkalapudi");
    }
  }