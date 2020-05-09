//https://www.youtube.com/watch?v=Cq7SMsQBEUw
public class BubbleSort {
    public static <E extends Comparable<E>> void bubbleSort(E[] tab) {
        boolean isSorted = false;
        int end = tab.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < end; i++) {
                if (tab[i].compareTo(tab[i+1]) > 0) {
                    E temp = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = temp;
                    isSorted = false;
                }
            }
            end--;
        }
    }
}
