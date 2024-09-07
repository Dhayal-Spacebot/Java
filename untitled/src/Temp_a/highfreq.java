package Temp_a;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class highfreq {

    public static void findhighfreq() {
        int[] arr = {15,23,39,42};

        Comparator<Integer> cpo = (i, j) -> i%10 - j%10;

      Integer[] b =    Arrays.stream(arr).boxed().sorted(cpo).toArray(Integer[]::new);

//        Arrays.stream(b).forEach(System.out::println);

        for(Integer v: b){
            System.out.println(v);
        }

        Map<Integer, Long> highMap = Arrays.stream(arr).mapToObj(f -> (Integer)f).collect(Collectors.groupingBy(c-> c, Collectors.counting()));
//
//        int value = Collections.max(highMap.entrySet(), Map.Entry.comparingByValue()).getKey();

    }
}
