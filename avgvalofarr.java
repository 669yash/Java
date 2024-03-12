import java.util.Scanner;

public class avgvalofarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int sum = arr[0];
        for (int i = 1; i < 5; i++) {
            sum = sum + arr[i];
        }
        int a=arr.length;
        float avg= (float) sum /a;
        System.out.println("Average value of elements of array: " + avg);
    }
}
