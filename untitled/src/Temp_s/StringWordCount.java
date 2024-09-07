package Temp_s;

import java.util.Arrays;

public class StringWordCount {
    public static void wordCount(String str) {
       long count = Arrays.stream(str.split(" ")).count();
        System.out.println(str + "count is "+count);
    }
}
