package Temp_a;

import java.util.*;

public class ArrayLargeNumber {
    public static void findLargestNumberFromInputInTheArray () {

        int[] arr = {1,2,35,35,65};


       int b = Arrays.stream(arr).boxed().sorted().distinct().limit(2).skip(1).findFirst().get();

       int c = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst().orElseThrow(NoSuchFieldError::new);

        var a = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(a));

        Set<Integer> uniqueSet = new HashSet<>();
        for(int num: arr) {
            uniqueSet.add(num);
        }

        int[] uniqueValues = uniqueSet.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(uniqueValues));

        System.out.println( Arrays.stream(arr).max() );
    }
}
