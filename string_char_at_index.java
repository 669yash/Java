import java.util.Scanner;
public class string1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < str.length()) {
            char c = str.charAt(index);
            System.out.println("The character at index " + index + " is: " + c);
        } else {
            System.out.println("Invalid index.");
        }
    }
}
