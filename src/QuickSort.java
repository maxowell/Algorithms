//https://www.youtube.com/watch?v=8hEyhs3OV1w
public class QuickSort {
    public static <E extends Comparable<E>> int partition(E[] array, int start, int end) {
        E pivot = array[(start + end) / 2];
        int i = start - 1;
        int j = end + 1;
        while (i < j) {
            do {
                j--;
            } while (array[j].compareTo(pivot) > 0);
            do {
                i++;
            } while (array[i].compareTo(pivot) < 0);
            if (i < j) {
                E temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return j;
    }

    public static <E extends Comparable<E>> void quickSort(E[] array, int start, int end) {
        if (start < end) {
            int j = partition(array, start, end);
            quickSort(array, start, j);
            quickSort(array, j+1, end);
        }
    }
}
