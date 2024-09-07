package Temp_s;

import java.util.Map;
import java.util.stream.Collectors;

public class StringDuplicateCharactersAndCount {
    public static void  findDuplicateAndCount(String str) {
        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char)c) //.mapToObj(c -> Character.toLowerCase((char) c)) // Convert to lowercase
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println("duplicates characters are");

        result.forEach((key, value) -> {
            if(value > 1) {
                System.out.println( key + " : " + value);
            }
        });
    }
    }
