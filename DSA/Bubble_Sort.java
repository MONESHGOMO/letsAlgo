import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {


    int[] a ={5,4,3,2,1};
    bubbleSort(a);
    System.out.println(Arrays.toString(a));


    }

   static void  bubbleSort(int []a){

        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j]< a[j-1]){
                    swap(a,j,j-1);
                }
            }
        }

    }

     static void swap(int[] a, int first, int second) {
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;

    }
}
