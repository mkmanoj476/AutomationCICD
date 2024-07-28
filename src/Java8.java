import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8 {

    public static void getWordCount(String str){
        String[] strings = str.split("\\s");
        Map<String, Integer> map = new HashMap<>();
        for(String s : strings){
            if(s.startsWith("r") || s.startsWith("R")){
                map.put(s, map.getOrDefault(s, 0)+1);
            }
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    public static void getWords(String str){
        String[] words = str.split("\\s");

        Map<String, Long> map = Arrays.asList(words)
                .stream().filter(x-> x.startsWith("R")||x.startsWith("r"))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        map.forEach((word, count)-> System.out.println(word+":"+count));
    }

    public static void test1(){
        List<String> list = Arrays.asList("ram", "Shyam", "Dharmedra", "Amit", "Kushwaha");

        String strings = list.stream()
                .filter(x-> x.length() >=5)
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println(strings);
    }

    public static void test2(){
        List<Integer> num = Arrays.asList(5,3,6,7,9,2,23,2,1,56,42,1,25);

        List<Integer> number = num.stream()
                .map(x->x*x)
                .filter(x-> x>50)
                .collect(Collectors.toList());
        System.out.println(number);

    }



    public static void main(String[] args) {
         Java8.test2();
       // Java8.getWordCount("ram shyam ramayan Rahul manoj ram Ram Ritu harish rohit");


    }



}