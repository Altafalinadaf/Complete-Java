package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashD {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"java");
        map.put(2,"c");
        map.put(3,"Python");
        map.put(4,"javascript");

        System.out.println(map);

        map.put(3,"R lang");
        System.out.println(map);

        map.put(5,"java");
        System.out.println(map);

        map.put(null,"c++");
        System.out.println(map);

        map.put(6,"null");
        map.put(6,"null");
        System.out.println(map);

        System.out.println(map.get(3));
        System.out.println(map.get(100));
        System.out.println(map.containsValue(100));
        System.out.println(map.size());

        Set<Integer> set =map.keySet();

        for(Integer key: set){
            System.out.println(map.get(key));
        }

        map.remove(6);
        System.out.println(map);
        map.remove(null,"c++");
        System.out.println(map);

        System.out.println(map.keySet());
        System.out.println(map.values());
//        map.clear();
//        System.out.println(map);

        System.out.println(map.get(5));
        map.put(6,"Java");
        System.out.println(map);
    }
}
