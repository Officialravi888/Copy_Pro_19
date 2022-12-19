package Com.Program_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        int [] arr={1,3,5,7,8,9};
        List<Integer> list1=new ArrayList<>();
        list1.add(21);
        list1.add(34);
        System.out.println(list1);
//        List<Integer> list2= Arrays.asList(1,3,57,89,0,0,00,88,76);
//        System.out.println(list2);
//
//        for(Integer i :list1){
//            if(i%2==0){
//                list1.add(i);
//            }
//        }
//        System.out.println(list1);
        //Using Stream
        Stream<Integer> stream = list1.stream();
        List<Integer> collect1 = list1.stream().filter(i -> i% 2 == 0).collect(Collectors.toList());
    //    List<Integer> collect = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
     //   System.out.println(collect);
        System.out.println(collect1);

    }
}
