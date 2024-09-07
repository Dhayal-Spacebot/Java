package Temp_a;

public class ArraySeparate0And1 {
    public static void separate0And1() {
        int[] arr = {1,2,343,233, 0,234,9,0};

        int count = 0;
        for(int i =0; i< arr.length; i++ ) {
            if(arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        for(int i = count; i< arr.length; i++) {
            arr[count] = 0;
            count++;
        }
        for(int i: arr) {
            System.out.print(i+", ");
        }
    }
}
