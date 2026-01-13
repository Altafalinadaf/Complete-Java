package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        Stream<Integer> stream=Stream.empty();

        String names[]={"Altaf","Raju","Kushal","Naveen"};
        Stream<String> names2=Stream.of(names);

        names2.forEach(name->{
            System.out.println(name);
        });

        List<Integer> list= Arrays.asList(14,2,6,3);
        Stream<Integer> stream1=list.stream();
    }
}
