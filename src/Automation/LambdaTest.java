package Automation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaTest {

    //String[] st = {"rahul", "aman", "rohit","Arun","Sameer","manoj","monday","anuj"};
    public static void Occurword(String[] str){
        List<String> list = Arrays.asList(str);
        Map<String, Long> map = list.stream()
                .filter(s-> s.startsWith("r"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }



    public static void main(String[] args) {
        String[] st = {"rahul", "aman", "rohit","Arun","Sameer","manoj","monday","anuj"};
        LambdaTest.Occurword(st);
        List<String> words = Arrays.asList("apple", "banana", "grapefruit", "kiwi", "orange", "mango");
//        Map<String, Integer> map = words.stream()
//                .filter(n-> n.length()>)
//                .collect(Collectors.toCollection(Collectors.groupingBy(Collectors.counting())))

    }
}
