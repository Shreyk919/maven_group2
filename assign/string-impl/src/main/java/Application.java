import java.util.*;
public class Application {
    public static void main(String[] args) {
        StringFunctions operations = new StringFunctions(); //class StringFumctions is called
        System.out.println("Enter the string: ");
        String inputString = input.nextLine();
        input.close();
        System.out.println("Reverse of the string is: " + operations.reverse(inputString));
        System.out.println("Length of string is: " + operations.count(inputString));
    }
}
