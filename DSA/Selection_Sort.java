import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        int a[]=new int [10];
        for(int i=0;i<a.length;i++){
            System.out.print("ENTER THE VALUE FOR : " + i + " :");
            a[i]= input.nextInt();
        }
        selection_sort(a);
        System.out.println(Arrays.toString(a));

    }


    static void selection_sort(int a[]){

        for(int i=0;i<=a.length-1;i++){

            int start=0;
            int end=a.length-1-i;
            int max_value=get_max(a,start,end);
            swap(a,max_value,end);
        }
    }

     static void swap(int[] a, int maxValue, int end) {
         int temp=a[maxValue];
         a[maxValue]=a[end];
         a[end]=temp;
    }

    static int get_max(int[] a, int start, int end) {
        int max=start;
        for(int i=start;i<=end;i++){
            if(a[i]>a[max]) {
                max = i;
            }
        }
        return max;
    }

}
