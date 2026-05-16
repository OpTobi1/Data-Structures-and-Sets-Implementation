// Assignment: 4
// Author: Liav Lugasi, ID: 213007271

package HW4_213007271.set;

/**
 * Main class to demonstrate SimpleSet and SetUtils functionality.
 */
public class Main {
    public static void main(String[] args) {
        SimpleSet<Integer> setA = new SimpleSet<>();
        SimpleSet<Integer> setB = new SimpleSet<>();

        // Add to group A
        setA.add(1);
        setA.add(2);
        setA.add(3);

        // Add to group B
        setB.add(3);
        setB.add(4);
        setB.add(5);

        System.out.println("Testing Set Operations: ");

        // Union
        SimpleSet<Integer> unionSet = SetUtils.union(setA, setB);
        System.out.println("Union size: " + unionSet.size());

        // Intersection
        SimpleSet<Integer> intersectSet = SetUtils.intersection(setA, setB);
        System.out.println("Intersection size: " + intersectSet.size());

        // Difference
        SimpleSet<Integer> diffSet = SetUtils.difference(setA, setB);
        System.out.println("Difference (A - B) size: " + diffSet.size());

        // Symmetric Difference
        SimpleSet<Integer> sDiffSet = SetUtils.symmetricDifference(setA, setB);
        System.out.println("Symmetric Difference size: " + sDiffSet.size());

        // Power Set
        System.out.println("Power Set of {1, 2, 3} : ");
        SimpleSet<SimpleSet<Integer>> pSet = SetUtils.powerSet(setA);
        System.out.println("Power set size: " + pSet.size());
    }
}