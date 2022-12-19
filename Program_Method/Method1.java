package Com.Program_Method;

import java.util.List;
import java.util.stream.Collectors;

public class Method1 {
    public static void main(String[] args) {

 //FILTER
        //Filter(predicate)true,false
        //boolean value
        //e->e>10
        //e->{return 10}

        //Stream help solve
        List<String>names= List.of("Aman", "ravi", "raj", " kant", "shiv", "ram");
        List<String> a = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(a);
        //Consumer help solve
        names.stream().forEach(e->{
            System.out.println(e);
        });
        //names.stream().forEach(System.out::println);


//MAP
        //Map(Function)valure return
        //operation ferform,, element return
        List<Integer>number=List.of(13,54,5654,654,564,675,356,7765);
        List<Integer> collect = number.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(collect);

 //Sorted
        number.stream().sorted().forEach(System.out::println);
        number.stream().sorted().collect(Collectors.toList());

 //Minimum
        Integer integer = number.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(integer);
 //Max
        Integer integer1 = number.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("Max"+integer1);

    }
}
