package Temp_s;

import java.util.Arrays;

public class StringFindStartWith2 {
    public static void findNumberStartsWith2InArray() {
        int[] arr = {1,2,23,4,5,26,27};

        Arrays.stream(arr).filter(a -> String.valueOf(a).startsWith("2"))
                .forEach(System.out::println);
    }
}
