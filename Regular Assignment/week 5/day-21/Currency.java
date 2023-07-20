import java.util.Scanner;
class Currency
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int totalnotes=0;
      System.out.println("enter the amount");
      int amount=sc.nextInt();
      if(amount%100==0)
      {
        if(amount>=1000)
        {
          int thousandnotes=amount/1000;
          amount=amount%1000;
          totalnotes=totalnotes+thousandnotes;
           System.out.println("thousandnotes are "+thousandnotes);
        }
        if(amount<1000&&amount>=500)
        {
          int fivehundrendnotes=amount/500;
          amount=amount%500;
          totalnotes=totalnotes+fivehundrendnotes;
          System.out.println("fivehundrendnotes are "+fivehundrendnotes);
        }
         if(amount<500&&amount>=100)
        {
          int hundrednotes=amount/100;
            amount=amount%100;
            totalnotes=totalnotes+hundrednotes;
          System.out.println("hundrednotes are "+hundrednotes);
        }
        System.out.println("totalnotes are "+totalnotes);
      }
      else
      {
       System.out.println("enter multiples of 100");
      }
      
    }
  }