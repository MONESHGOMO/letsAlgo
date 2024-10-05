
//1. To find compound intrest  PROPERTY A= P(1+ ( (R/N*100))** (N*T)) ,CI=A-P

public class Algo_2 {
    public static void main(String[] args) {

    System.err.println(compound_intrest(1000, 5, 10, 12));
        
        
     }

     static double compound_intrest(double principal,double intrest,int time,int n){

        double amount = principal * Math.pow( 1+  ( intrest /100) / n , n *time);
        double CI= amount - principal;
         return CI;
     }
}
