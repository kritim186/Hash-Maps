import java.util.*;
class Demo{
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();
        hm.put("India", 150);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("UK", 45);

        // System.out.println(hm.get("UK"));
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.size());
        // System.out.println(hm.isEmpty());
        // hm.clear();
        // System.out.println(hm.isEmpty());

        //Iteration on HashMap
        // Set<String> keys = hm.keySet();
        // for(String key:keys){
        //     System.out.println("country = "+ key + " population in Cr is = "+hm.get(key));
        // }
        System.out.println(hm.get("Bhutan"));
        System.out.println(hm.getOrDefault("Nepal", 0)+1);
        //getOrdefault will take the default value if key does not exists

    }
}