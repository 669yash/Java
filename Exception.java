public class exception1 {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5] = 30 / 5;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
        }
    }
}


//------------------------------------------------------------

import java.util.Scanner;

public class exception2 {
    public static void main(String[] args) {
        int maxRetries = 5;
        int retryCount = 0;
        Scanner scanner = new Scanner(System.in);

        while (retryCount < maxRetries) {
            System.out.println("Enter something: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            retryCount++;
        }

        if (retryCount >= maxRetries) {
            System.out.println("Errors occurred. Max retries reached.");
        }
    }
}

//-----------------------------------------------------------

