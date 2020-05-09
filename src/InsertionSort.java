//https://www.youtube.com/watch?v=8oJS1BMKE64
public class InsertionSort {
    public static <E extends Comparable<E>> void insertionSort(E[] tab) {
        for (int i = 1; i < tab.length; i ++) {
            int j = i - 1;
            E temp = tab[i];
            while (j >= 0 && tab[j].compareTo(temp) > 0) {
                tab[j + 1] = tab[j];
                j--;
            }
            tab[j + 1] = temp;
        }
    }
}
