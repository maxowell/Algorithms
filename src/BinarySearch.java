public class BinarySearch {
    public static <E extends Comparable<E>> int binarySearch (E[] tab, E target) {
        int start = 0;
        int end = tab.length - 1;
        while (start < end) {
            int middle = (start + end) / 2;
            if (target.compareTo(tab[middle]) <= 0) {
                end = middle;
            }else {
                start = middle + 1;
            }
        }
        if (tab[start].compareTo(target) != 0) {
            start = -1;
        }
        return start;
    }
}
