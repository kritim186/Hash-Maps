import java.util.HashSet;
public class Set {   public static void main(String[] args){

        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(8);
        hs.add(1);

        System.out.println(hs);

        if(hs.contains(90)) System.out.println("has 90");
        if(hs.contains(8)) System.out.println("has 8");
        hs.remove(2);
        if(hs.contains(2)){
            System.out.println("has 2");
        }else{
            System.out.println("has not 2");
        }

        hs.clear();
        System.out.println(hs.isEmpty());

    }
}


