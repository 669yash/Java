import java.util.Scanner;

public class delelementarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the index of the element you want to delete: ");
        int index = sc.nextInt();
        if (index >= 0 && index < n) {
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            System.out.println("The array after deletion is: ");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("Invalid index.");
        }
    }
}
