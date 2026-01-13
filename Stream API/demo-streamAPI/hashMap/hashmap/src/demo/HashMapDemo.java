package demo;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
//        put() for adding value
        map.put(1,"Altaf");
        map.put(2,"Kartik");
        map.put(3,"Nikhil");
        System.out.println(map);

        map.put(3,"Rahul");
        System.out.println(map);

        map.put(4,"Kartik");
        System.out.println(map);

        map.put(null,"Rohit");
        System.out.println(map);
//        map.put(null,"Krish");
//        System.out.println(map);

//        get() will fetch particular value
        System.out.println(map.get(2));
        System.out.println(map.get(100));

//        containsKey() to check whether key is present or not
        System.out.println(map.containsKey(100));

        System.out.println(map.size());

        map.remove(null);
        System.out.println(map);

        map.remove(4,"Kartik");
        System.out.println(map);

        Set<Integer> key=map.keySet();
        for(Integer e:key){
            System.out.println(map.get(e));
        }

//        map.clear() removes all data in map
        map.clear();
        System.out.println(map);

    }
}
