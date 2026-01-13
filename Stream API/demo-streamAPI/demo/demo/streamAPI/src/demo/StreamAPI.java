package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
//    introduced in java 8
//    inspired by functional programming
//    used to process colletion / (group of object)
//
//    stream does not store data
//    it also not modify the original data
//    ontime usable

    public static void main(String[] args) {

//        without using Stream API
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        List<Integer> list2=new ArrayList<>();
        list2.add(12);
        list2.add(13);
        list2.add(42);
        list2.add(14);

        List<Integer> list3= Arrays.asList(12,20,41,25,69,23);

        List<Integer> evenList=new ArrayList<>();

        for(Integer e : list){
            if(e%2==0){
                evenList.add(e);
            }
        }

        System.out.println(evenList);

//        with Stream API

        Stream<Integer> stream=list.stream();
        List<Integer> even=stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(even);


        List<Integer> even2=list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(even2);

    }
}
