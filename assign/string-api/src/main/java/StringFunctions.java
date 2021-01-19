import java.lang.*;

public class StringFunctions {
    //module to reverse a string
    public String reverse(String inputString) {
        String String1 = "";    //temporary string
        for(int i = inputString.length() - 1; i >= 0; i--) {
            String1 = String1 + inputString.charAt(i);
        }
        return String1;
    }

    //module to find length of string
    public int count(String str) {
        int length;
        length = str.length();
        return length;
    }
}
