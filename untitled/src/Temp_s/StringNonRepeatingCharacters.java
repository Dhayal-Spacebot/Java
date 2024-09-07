package Temp_s;

import java.util.Map;
import java.util.stream.Collectors;

public class StringNonRepeatingCharacters {
    public static void findNonRepeatingCharacters(String str) {
        Map<Character, Long> result = str.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy( c -> c, Collectors.counting()));
        result.forEach((k,v) -> {
            if(v == 1) {
                System.out.print(k + " ");
            }
        });
    }
}
