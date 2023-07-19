import java.util.Scanner;
class Input{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      System.out.println("enter name ");
     String name=sc.nextLine();
      System.out.println("enter rollno ");
   long rollno=sc.nextLong();
       System.out.println("enter percentage ");
    float percentage=sc.nextFloat();
    System.out.println("enter grade ");
    char grade=sc.next().charAt(0);
        System.out.println("student name is "+name); 
        System.out.println("student rollno is "+rollno);
        System.out.println("student percentage is "+percentage);
        System.out.println("student grade is "+grade);
        
  }
}