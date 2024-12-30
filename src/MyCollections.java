import java.util.Comparator;
import java.util.List;

public class MyCollections {
    public static <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T key) {
        int fromIndex = 0;
        int toIndex = list.size();

        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            T midVal = list.get(mid);
            int cmp = midVal.compareTo(key);

            if (cmp < 0) {
                fromIndex = mid + 1;
            } else if (cmp > 0) {
                toIndex = mid;
            } else {
                return mid; // key found
            }
        }
        return -(fromIndex + 1); // key not found
    }

    // Binary Search with Comparator
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        int fromIndex = 0;
        int toIndex = list.size();

        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            T midVal = list.get(mid);
            int cmp = c.compare(midVal, key);

            if (cmp < 0) {
                fromIndex = mid + 1;
            } else if (cmp > 0) {
                toIndex = mid;
            } else {
                return mid; // key found
            }
        }
        return -(fromIndex + 1); // key not found
    }
}
