package QuickSort;
import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static int partition(int[] array, int lowerPoint, int higherPoint) {
        int pivot = array[higherPoint];
        int i = (lowerPoint - 1);
        for (int j = lowerPoint; j <= higherPoint - 1; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[higherPoint];
        array[higherPoint] = temp;
        return (i + 1);
    }

    public static void quickSort(int[] array, int lowerPoint, int higherPoint) {
        if (lowerPoint < higherPoint) {
            int part = partition(array, lowerPoint, higherPoint);
            quickSort(array, lowerPoint, part - 1);
            quickSort(array, part + 1, higherPoint);
        }
    }
}