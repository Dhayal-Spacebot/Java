package Temp_s;

public class StringReverse {

    public static String reverseString(String str) {
        if(str == null || str.isEmpty()) {
            throw new IllegalArgumentException(" no valid arguments");
        }

        StringBuilder sb = new StringBuilder();
       /*
       String s1 = "hello";
       String s2 = new String("hello");
       s1 == s2 // return false it compares the memory reference
       s1.equals(s2) // return true it compare the content / value of the string

       sb.reverse();
        return sb.toString();


        */
        char[] charArray = str.toCharArray();
        for(int i = charArray.length -1 ; i >= 0; i--) {
            sb.append(charArray[i]);
        }
        return sb.toString();
//        return Stream.of(resyu.split("")).sorted().collect(Collectors.joining());
    }
}
