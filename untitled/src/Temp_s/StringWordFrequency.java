package Temp_s;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class StringWordFrequency {

    public static void findWordFrequency(String str) {

        Map<String, Long> result = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy( c -> c, Collectors.counting()));

        var high = Collections.max(result.entrySet(), Map.Entry.comparingByValue()).getKey();
        result.forEach((k,v) -> {
            System.out.println(k +" : "+v);
        });

        System.out.println("test: "+high);

    }
}
