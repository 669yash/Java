import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of stars");
        int n = obj.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(""); // Changed from println to print
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*"); // Changed from println to print
            }
            System.out.println(); 
        }
    }
}
