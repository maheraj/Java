import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //VECTOR EXAMPLE
        Vector vector = new Vector();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("d");

        Enumeration characters = vector.elements();
        while (characters.hasMoreElements()) {
            System.out.println(characters.nextElement());
        }

        //SET EXAMPLE
        Set<Integer> a = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer> b = new HashSet<>(Arrays.asList(4,5,6,7,8,9,0));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println(intersection);

        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println(difference);

        //LinkedHashMap
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        //
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
    }
}
