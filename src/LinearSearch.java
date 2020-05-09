public class LinearSearch {
    public static <E> int linearSearch(E[] tab, E target) {
        int i = 0;
        while (i < tab.length && !tab[i].equals(target)) {
            i++;
        }
        if (i == tab.length) {
            i = -1;
        }
        return i;
    }
}
