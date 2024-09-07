package Temp_a;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraySecondlargeElement {

    public static void secondLarge() {
        int[] arr = {12,454,232,2324};

        List<Integer> second = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toList();
        System.out.println(second.get(1));
    }
}
