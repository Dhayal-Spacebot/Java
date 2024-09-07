package Temp_s;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class practise {

    public static void findClosestNumber() {

        int[] nums = {-4,-1,1,4,8};

      int a1 = Arrays.stream(nums).boxed().min((a,b) -> {
           int absA = Math.abs(a);
           int absB = Math.abs(b);
           return absA == absB ? Integer.compare(a,b) : Integer.compare(absA, absB);
       }).orElse( 0);
        System.out.println(a1);



        /*String str = "dhayalan";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
        char[] chars = str.toCharArray();
        for(int i= chars.length-1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        System.out.println(sb.toString());*/

     /*   int[] arr = {1,2,3,4,5,6,0};
        int n = arr.length;
        int expectedSum = n * (n+1) / 2;
        int actualSum =0;
        for(int num: arr){
            actualSum += num;
        }
        System.out.println(expectedSum - actualSum);
    }*/

       /* String str = "radar";
        String tempString = str.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = IntStream.range(0, tempString.length() / 2).allMatch(i -> tempString.charAt(i) == tempString.charAt(tempString.length() - i - 1));

        System.out.println(isPalindrome);*/

//        int[] arr = {1,2,1,2,3,4,3,3};
//
//        Map<Integer, Long> result = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//
//        result.forEach((k,v) -> {
//            if(v > 1){
//                System.out.println(k +":"+v);
//            }
//        });

//        String words = " hi today is good day ";
//        System.out.println(Arrays.stream(words.strip().split(" ")).count());
/*
        int number = 7;
        int limit = (int) (Math.sqrt(number) + 0.1);
        for(int i =3; i<= limit; i+=2) {
            if(number % i == 0) {
                System.out.println(false);
            }
        }
        System.out.println("hmm");*/





    }

}
