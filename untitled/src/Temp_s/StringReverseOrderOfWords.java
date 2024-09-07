package Temp_s;


public class StringReverseOrderOfWords {
    public static String reverseOrderOfWords(String str) {
    String[] words = str.split(" ");
    StringBuilder reversed = new StringBuilder();

    for(int i = words.length -1; i >= 0 ; i --) {
        reversed.append(words[i]);
        if(i > 0) {
            reversed.append(" ");
        }
    }
    return reversed.toString();
    }


}
