import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>();
        list1.add(40);
        list1.add(20);
        list1.add(57);
        list1.add(87);
        list1.add(90);

//        before stream api

        List<Integer> listEven = new ArrayList<>();
        for(Integer i : list1){
            if (i %2 ==0){
                listEven.add(i);
            }
        }

        System.out.println(listEven);

//        with stream API

        Stream<Integer> stream=list1.stream();
        List<Integer> evenList2=stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenList2);

        List<Integer> evenList3 = list1.stream().filter(i->i%2==0).collect
                (Collectors.toUnmodifiableList());
        System.out.println(evenList3);
    }
}