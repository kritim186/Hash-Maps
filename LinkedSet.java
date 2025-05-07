import java.util.*;
public class LinkedSet {
    public static void main(String[] args) {
        
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("New York");
        lhs.add("Chicago");
        lhs.add("Las Vegas");
        lhs.add("Oklahoma");
        lhs.add("Austin");

        // Iterator it = lhs.iterator();
        // while(it.hasNext()){
        //     System.out.print(it.next()+" ");
        // }
        System.out.println(lhs);

        //Sorted order
        TreeSet<String> ts = new TreeSet<>();
        ts.add("New York");
        ts.add("Chicago");
        ts.add("Las Vegas");
        ts.add("Oklahoma");
        ts.add("Austin");

        System.out.println(ts);

    }
}
