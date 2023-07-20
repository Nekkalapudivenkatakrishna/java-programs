//Create a class called "Book" with instance variables for storing the book title, author, and publication year. Implement a method named initializeBook that takes arguments for each variable and initializes the object. Display the details of the book using a separate method.

class Book
  {
   String booktitle;
   String author;
   int publicationyear;
   public void initializeBook(String bt,String at,int py)
    {
     booktitle=bt;
     author=at;
     publicationyear=py;
    }
    public void display()
    {
      System.out.println("name of the book "+booktitle);
      System.out.println("author of the book "+author);
      System.out.println("publication of the book "+publicationyear);
    }
    public static void main(String args[])
    {
    Book b=new Book();
    b.initializeBook("atomic habits","chaung",2012);
    b.display();
    }
  } 
