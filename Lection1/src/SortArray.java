import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    private String bubbleSort(int[] array) {
        boolean swaped;
        for(int i = 0; i < array.length - 1; i++) {
            swaped = false;
            for(int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                    swaped = true;
                }
            }

            if(!swaped) break;
        }
        return Arrays.toString(array);
    }

    private void merge(int[] array, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i += 1;
            } else {
                array[k] = right[j];
                j += 1;
            }
            k += 1;
        }

        while (i < left.length) {
            array[k] = left[i];
            k += 1;
            i += 1;
        }
        while (j < right.length) {
            array[k] = right[j];
            k += 1;
            j += 1;
        }
    }
    private String mergeSort(int[] array) {
        if(array.length <= 1) return Arrays.toString(array);

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        for(int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        for(int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);

        return Arrays.toString(array);
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static String quickSort(int[] array, int low, int high) {
        if(low >= high) return "";

        int pivot = array[high];
        int i = low;

        for(int j = low; j < high; j++) {
            if(array[j] < pivot) {
                swap(array, i++, j);
            }
        }

        swap(array, i, high);
        quickSort(array, low, i - 1);
        quickSort(array, i + 1, high);

        return Arrays.toString(array);
    }

    public String sortArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select sorting method");
        System.out.println("For bubble sort press 1");
        System.out.println("For merge sort press 2");
        System.out.println("For insertion sort press 3");
        int sortMethod = scanner.nextInt();

        return switch (sortMethod) {
            case 1 -> bubbleSort(array);
            case 2 -> mergeSort(array);
            case 3 -> quickSort(array, 0, array.length - 1);
            default -> "Invalid sorting method detected";
        };
    }

    private void testBubbleSort() {
        if(!bubbleSort(new int[]{5, 1, 23, 55, -1, 8, 3, 22, 19, 0}).equals("[-1, 0, 1, 3, 5, 8, 19, 22, 23, 55]")) {
            System.out.println("Bubble sort failed");
        }
    }
    private void testMergesort() {
        if(!mergeSort(new int[]{5, 1, 23, 55, -1, 8, 3, 22, 19, 0}).equals("[-1, 0, 1, 3, 5, 8, 19, 22, 23, 55]")) {
            System.out.println("Merge sort failed");
        }
    }

    private void testQuickSort() {
        if(!quickSort(new int[]{5, 1, 23, 55, -1, 8, 3, 22, 19, 0}, 0, 9).equals("[-1, 0, 1, 3, 5, 8, 19, 22, 23, 55]")) {
            System.out.println("Merge sort failed");
        }
    }

    public void testSortArray() {
        testBubbleSort();
        testMergesort();
        testQuickSort();

        System.out.println("All tests passed");
    }
}
