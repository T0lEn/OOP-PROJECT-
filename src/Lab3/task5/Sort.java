package Lab3.task5;

public class Sort {
    static <E> void swap(E[] arr, int i, int j) {
        E temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static <E extends Comparable<E>> void quickSort(E[] arr) {
        quickSortHelper(arr, 0, arr.length - 1);
    }
    static <E extends Comparable<E>> void quickSortHelper(E[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSortHelper(arr, low, pivot - 1);
            quickSortHelper(arr, pivot + 1, high);
        }
    }
    static <E extends Comparable<E>> int partition(E[] arr, int low, int high) {
        E pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    static <E extends Comparable<E>> void heapify(E[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left].compareTo(arr[largest]) > 0) {
            largest = left;
        }

        if (right < n && arr[right].compareTo(arr[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);


            heapify(arr, n, largest);
        }

    }
    
}
