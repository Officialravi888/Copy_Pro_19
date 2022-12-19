package Com.Program_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Strem_Object {
    public static void main(String[] args) {
        //Stream API-Collectio

        //Blank Stream
        Stream<Object>emptyStream=Stream.empty();
        emptyStream.forEach(e->{System.out.println(e);});
        String name[]={"ravi","kant","ravkant"};
        Stream<String> name1 = Stream.of(name);
        name1.forEach(e->{
            System.out.println(e);
        });

        //bilder function
        Stream<Object> build = Stream.builder().build();

        //Array stream  petern
        IntStream stream = Arrays.stream(new int[]{2, 5, 78, 9});
        stream.forEach(e ->{
            System.out.println(e);
        });

        // list , set
        List<Integer> A= new ArrayList<>();
        A.add(23);
        A.add(45);

        Stream<Integer>B=A.stream();
        stream.forEach(e->{
            System.out.println(e);
        });

    }
}
