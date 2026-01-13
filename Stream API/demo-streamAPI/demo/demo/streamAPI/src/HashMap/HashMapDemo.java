package HashMap;

import javax.lang.model.type.IntersectionType;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
       HashMap<Integer,String> map= new HashMap<>();

//       it does not store value in one by one, it stores with sequence number,
//        first it stores 2 then 11 then 31 like this
//     by using put method will insert data inside map
       map.put(11,"Altaf");
       map.put(2,"Kartik");
       map.put(31,"Sunil");
       System.out.println(map);

//       getting particular value we used get(key)
        System.out.println(map.get(2));

//        if  key is not present in a map it gives null
        System.out.println(map.get(100));

//        we can also check whether the key is available or not using 'containsKey(key)'
//        it gives boolean values true or false
        System.out.println(map.containsKey(100));

//        we can also check value is present or not in map using 'containValue(value)'
//        it will also give boolean value
        System.out.println(map.containsValue("Altaf"));

//        we can also use loop to print whole map data
//        there is method 'map.keySet()'
        Set<Integer> set=map.keySet();
        for (Integer i : set){
            System.out.println(map.get(i));
        }

        for (Integer key : map.keySet()){
            System.out.println(map.get(key));
        }

//        by using 'set()' we can set the value


    }
}
