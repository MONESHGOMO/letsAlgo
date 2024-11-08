
import java.util.Scanner;
class Q_1{
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("enter the value to find even or odd : ");

    int a=input.nextInt();
    System.out.println(evenOrodd(a));
     input.close();

    
    }

      static String  evenOrodd(int num){
        if(num%2==0){
           return "it is a even number ";
        }
        else{
            
            return " it is a odd number ";
        }
      
        

    }
}