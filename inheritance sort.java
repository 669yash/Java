interface Sortable {
    void sort(int[] arr);
}

class BubbleSort implements Sortable {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements Sortable {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // swap arr[i] and arr[min_idx]
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}

public class inheritance  {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.println("Array sorted using Bubble Sort:");
        printArray(arr);

        int[] arr2 = {64, 25, 12, 22, 11}; // Resetting array for Selection Sort

        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arr2);
        System.out.println("\nArray sorted using Selection Sort:");
        printArray(arr2);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
