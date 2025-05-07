import java.util.HashSet;
import java.util.Iterator;

public class IteratorsInSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("New York");
        set.add("Los Angeles");
        set.add("Chicago");
        set.add("Denver");
        set.add("Oklahoma City");

        //iterator object
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }
}
