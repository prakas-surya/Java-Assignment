package assignment;

import java.util.Arrays;
import java.util.Scanner;

interface SortInterface {
	void sort(int[] array);
}

class BubbleSort implements SortInterface {
	public void sort(int[] array) {
		int temp;
		boolean isSwapped;
		for (int i=0; i<array.length-1; i++) {
			isSwapped = false;
			for (int j=0; j<array.length-1-i; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					isSwapped = true;
				}
			}
			
			if (isSwapped == false) break; 
		}
	}
}

class MergeSort implements SortInterface {
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = array[left + i];
        for (int i = 0; i < n2; i++) R[i] = array[mid + 1 + i];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k++] = L[i++];
            } else {
                array[k++] = R[j++];
            }
        }

        while (i < n1) array[k++] = L[i++];
        while (j < n2) array[k++] = R[j++];
    }
}

class QuickSort implements SortInterface {
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}

public class SortUsingInterface {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Choose a sorting algorithm: ");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Merge Sort");
        int choice = scanner.nextInt();
        scanner.close();

        SortInterface sortArray;
        
        switch(choice) {
            case 1:
            	sortArray = new BubbleSort();break;
            case 2:
            	sortArray = new QuickSort();break;
            case 3:
            	sortArray = new MergeSort();break;
            default:
                System.out.println("Please enter valid choice!");return;
        }

        sortArray.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
	}

}
