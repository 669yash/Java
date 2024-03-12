import java.util.Scanner;

public class stringoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Concatenation of two strings
        System.out.println("Concatenation of two strings: " + str.concat(" ").concat("Java"));

        // Length of a string
        System.out.println("Length of the given string is: " + str.length());

        // Comparison of two strings
        String str1 = "Hello";
        int res = str1.compareTo(str);
        if (res > 0) {
            System.out.println("The given string is greater than 'Hello'");
        } else if (res < 0) {
            System.out.println("The given string is less than 'Hello'");
        } else {
            System.out.println("The given string is equal to 'Hello'");
        }

        // Check if a string is empty
        if (str.isEmpty()) {
            System.out.println("The given string is empty");
        } else {
            System.out.println("The given string is not empty");
        }

        // Convert a string to uppercase
        System.out.println("Uppercase of the given string is: " + str.toUpperCase());

        // Convert a string to lowercase
        System.out.println("Lowercase of the given string is: " + str.toLowerCase());

        // Extract a substring from a string
        String subStr = str.substring(0, 5);
        System.out.println("Substring of the given string is: " + subStr);

        // Replace a substring in a string
        String replaceStr = str.replace("World", "Java");
        System.out.println("Replace 'World' with 'Java' in the given string: " + replaceStr);

        // Trim whitespace from a string
        String trimmedStr = str.trim();
        System.out.println("Trim whitespace from the given string: " + trimmedStr);

        // Split a string into an array of strings
        String[] splitArr = str.split(" ");
        System.out.println("Split the given string into an array of strings: ");
        for (String s : splitArr) {
            System.out.println(s);
        }
    }
}
