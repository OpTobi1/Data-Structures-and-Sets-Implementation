// Assignment: 4
// Author: Liav Lugasi, ID: 213007271

package HW4_213007271.set;


/**
 * Utility class providing static methods for set operations.
 */
public class SetUtils {

    /**
     * Returns the union of sets A and B.
     */
    public static <T> SimpleSet<T> union(SimpleSet<T> a, SimpleSet<T> b) {
        SimpleSet<T> result = new SimpleSet<>();
        for (int i = 0; i < a.size(); i++) result.add(a.get(i));
        for (int i = 0; i < b.size(); i++) result.add(b.get(i));
        return result;
    }

    /**
     * Returns the intersection of sets A and B.
     */
    public static <T> SimpleSet<T> intersection(SimpleSet<T> a, SimpleSet<T> b) {
        SimpleSet<T> result = new SimpleSet<>();
        for (int i = 0; i < a.size(); i++) {
            if (b.contains(a.get(i))) result.add(a.get(i));
        }
        return result;
    }

    /**
     * Returns the difference A \ B.
     */
    public static <T> SimpleSet<T> difference(SimpleSet<T> a, SimpleSet<T> b) {
        SimpleSet<T> result = new SimpleSet<>();
        for (int i = 0; i < a.size(); i++) {
            if (!b.contains(a.get(i))) result.add(a.get(i));
        }
        return result;
    }

    /**
     * Returns the symmetric difference of A and B.
     */
    public static <T> SimpleSet<T> symmetricDifference(SimpleSet<T> a, SimpleSet<T> b) {
        SimpleSet<T> diff1 = difference(a, b);
        SimpleSet<T> diff2 = difference(b, a);
        return union(diff1, diff2);
    }

    /**
     * Returns the power set of A (all subsets).
     * The result is a Set of Sets.
     */
    public static <T> SimpleSet<SimpleSet<T>> powerSet(SimpleSet<T> a) {
        SimpleSet<SimpleSet<T>> pSet = new SimpleSet<>((int) Math.pow(2, a.size()));
        pSet.add(new SimpleSet<T>()); // Add empty set

        for (int i = 0; i < a.size(); i++) {
            T item = a.get(i);
            int currentSize = pSet.size();
            for (int j = 0; j < currentSize; j++) {
                SimpleSet<T> subset = new SimpleSet<>();
                SimpleSet<T> existing = pSet.get(j);
                for (int k = 0; k < existing.size(); k++) subset.add(existing.get(k));
                subset.add(item);
                pSet.add(subset);
            }
        }
        return pSet;
    }
}