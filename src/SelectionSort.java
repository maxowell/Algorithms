//https://www.youtube.com/watch?v=92BfuxHn2XE
public class SelectionSort {
    public static <E extends Comparable<E>> void selectionSort(E[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            int pos = i;
            E min = tab[i];
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j].compareTo(min) < 0) {
                    pos = j;
                    min = tab[j];
                }
            }
            tab[pos] = tab[i];
            tab[i] = min;
        }
    }
}
