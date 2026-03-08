import java.util.Arrays;
import java.util.stream.Stream;

public class StreamObjec {
    public static void main(String[] args) {
        Stream<Object> stream= Stream.empty();

        System.out.println(stream);
        String name[] = {"Altaf","Raju","Suresh","Pawan","Punit"};
        Stream<String> name2=Stream.of(name);
        name2.forEach(n->{
            System.out.println(n);
        });

        stream= Arrays.stream(name);
        stream.forEach(n->{
            System.out.println(n);
        });

    }
}
