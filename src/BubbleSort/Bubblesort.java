package BubbleSort;
import java.util.Arrays;

public class Bubblesort {

    public static void main(String[] args) {
        int N = 5;
        int arr[] = {4, 1, 3, 9, 7};
        System.out.println(Arrays.toString(bubblesort(arr, N)));
    }

    public static int[] bubblesort(int[] arr, int N) {
        int temp;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (arr[i] < arr[j]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        return arr;
    }
}