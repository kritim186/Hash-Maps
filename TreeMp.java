import java.util.TreeMap;
public class TreeMp {
    public static void main(String[] args) {
        //Here the Map is Sorted in form of Keys
        //Internal Implementation use Red Black Trees
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 99);
        tm.put("Indonesia", 40);
        tm.put("USA", 50);
        System.out.println(tm);
    }
}
