import java.util.Arrays;

public class FindTheMaximumElementInArray {

    public static void main(String[] args) {
        int arr[] = {43, 4, 32, 542, 132, 3};
        int a[]={5,4,3,2,1};
        
       // System.out.println(getMaxElement(arr)); 
       // System.out.println(getMaxElement(arr, 0, 4));
        reverseArray(a);
        System.out.println("Number of arguments passed: " + args.length);
        //System.out.println(Arrays.toString(a));
            }
        
           
        
            public static int getMaxElement(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }



    public static void reverseArray(int[] a) {

          int length=a.length;

        int start =0;
        int end=length-1;

        while(start<end){
            swap(a,start,end);
                        start++;
                        end--;
                        
        }
            
    }

     static void swap(int[] a, int start, int end) {

        int tempory =a[start];
        a[start] =a[end];
        a[end]=tempory;

        
    }
            
            
}
