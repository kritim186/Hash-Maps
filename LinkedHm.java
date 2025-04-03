import java.util.*;
public class LinkedHm {
public static void main(String[] args) {
    //Here Map is ordered the elements will arrange them selves in the same way they were added
    //Internal Implementation will use Doubly Linked List
    LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
    hm.put("India", 100);
    hm.put("China", 99);
    hm.put("USA", 50);
    hm.put("Japan", 10);

    System.out.println(hm);
}
    
}
