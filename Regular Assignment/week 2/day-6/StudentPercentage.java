class StudentPercentage
  {
    public static void main(String args[])
    {
      int english=90,maths=75,science=92,physics=90,social=89;
      double total=physics+social+science+maths+english;
      double StudentPercentage=(total/500)*100;
      System.out.println("StudentPercentage= "+StudentPercentage);
       System.out.println(Math.ceil(StudentPercentage));
        
      
      
    }
  }