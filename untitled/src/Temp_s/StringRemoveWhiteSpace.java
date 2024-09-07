package Temp_s;

public class StringRemoveWhiteSpace {
    public static String removeWhiteSpace(String str) {
//       return str.replace(" ","");
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for(char c : chars) {
            if(!Character.isWhitespace(c))
                sb.append(c);
        }
        return sb.toString();
    }
}
