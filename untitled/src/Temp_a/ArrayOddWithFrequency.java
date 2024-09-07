package Temp_a;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayOddWithFrequency {
    public static void oddWithFrequency() {
        int[] arr = { 1,2,3,4,5,6,76,5,4,3};

        int[] oddArr = Arrays.stream(arr).filter(f -> f %2 != 0).toArray();

        Map<Integer, Long> frequency  = Arrays.stream(oddArr).mapToObj(f -> (Integer)f).collect(Collectors.groupingBy( c -> c, Collectors.counting()));

        frequency.forEach((k,v) -> {
            if(v > 1) {
                System.out.println(k + ": "+v);
            }
        });

    }
}
