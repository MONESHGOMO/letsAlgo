/*
  1. Sum of Two Numbers: Write a Java program to take two integers as input and print their sum.
  2.Even or Odd: Write a Java program to check if a given number is even or odd.
  3.Grade Calculator: Write a Java program to calculate a student's grade based on their score (out of 100) 
  4.Pattern Printing: Write a Java program to print the following pattern
  5.Swap Two Numbers: Write a Java program to swap the values of two variables without using a third variable.
  
     Date : 27/10/24
 */



package Meta_Questions;

public class Main {
    public static void main(String[] args) {
    
    System.out.println(SumOfTwoNumbers(43,23));
    System.out.println("=========================================================");
    System.out.println(evenOrOdd(525));
    System.out.println("=========================================================");
    gradeCalculator(78);
    System.out.println("=========================================================");
    patternPrinting();
    System.out.println("=========================================================");
    swap(5, 10);
    System.out.println("=========================================================");


   }

   public static int    SumOfTwoNumbers(int a,int b){
        return a+b;
   }

   public static String evenOrOdd(int a){
          if(a%2==0){
            return "even";
          }
          else{
            return "odd";
          }
   }

   public static void  gradeCalculator(int marks){
         if(marks>90 || marks<100){
            System.out.println("A GRADE");
         }
         else if (marks>70 || marks < 50){
            System.out.println("B GRADE");
         }
         else{
            System.out.println("C GRADE ");
         }
   }


     public static void patternPrinting(){
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }

     public static void swap(int a,int b){

        System.out.println("A before swap :" + a);
        System.out.println("B  before swap: " + b);
     
        a=a+b; 
        b=a-b; 
        a=a-b;
        System.out.println("A (swapped) :" + a);
        System.out.println("B (swapped): " + b);
     }

}
