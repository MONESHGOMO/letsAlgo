public class zero_to_ones {
    public static void main(String[] args) {
        int  num=70430;
       System.out.println(replace(num));
        
    }

    public static String replace(int value){
        String replace_value=Integer.toString(value);
        replace_value=replace_value.replace('0','1');
        return replace_value;
    }
    
}
