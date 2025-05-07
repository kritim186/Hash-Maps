import java.util.*;
public class TicketsItenerary {

    private static String findStart(HashMap<String, String> tickets){
        HashMap<String, String> revMap = new HashMap<>();
        //created a reverse hashmap in which key is the value (to, from)
        for(String key : tickets.keySet()){
                revMap.put(tickets.get(key), key);
        }

        for(String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
    return null;
    }
    public static void main(String[] args) {
        
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");
        
        String start = findStart(map);
        System.out.print(start);
        for(String key : map.keySet()){
            System.out.print(" -> " + map.get(start));
            start = map.get(start);
        }

    }
}
