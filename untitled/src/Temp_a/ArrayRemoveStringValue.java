package Temp_a;

import java.util.Arrays;

public class ArrayRemoveStringValue {

    public static void removeStringValue() {
        String[] str = {"mango", "apple","strawberry"};
//        for(String i: str) {
//            System.out.println(i);
//        }
        String[] a = Arrays.stream(str).filter(f -> !f.equals("apple")).toArray(String[]::new);
        Arrays.stream(a).forEach(System.out::println);
    }
}
