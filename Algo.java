// 1. Find the largest number among the three numbers.
// 2. Write a Program to check whether a number is prime or not
class Algo{
    public static void main(String[] args) {
        
        System.err.println(largestNumber(10, 43, 42));
        System.out.println(primeOrnot(54));
    }

    static String largestNumber(int a,int b,int c){
     
    if(a >(b & c)){
        return " A is greater than B & C";
    }
    else if (b > (c & a)){
        return  "B is greater than A & C ";
    }
    else{
        return  " C is greater than A & B ";
    }

    }

    static String primeOrnot(int a){

       int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count ++;
            }
        }
        if(count ==2){
            return "It is a prime number ";
        }
        else{

            return "Not a prime number";
        }
    }
}
