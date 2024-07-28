package JavaEight;

import java.util.Arrays;
import java.util.List;

public class ArrayPractice {


    public static void main(String[] args) {

//        int[] num ={23,56,12,645,13,55};
//        int maxnum = Arrays.stream(num)
//                .max()
//                .orElseThrow(()-> new IllegalArgumentException("Array is Empty"));
//        System.out.println(maxnum);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int finalSum = numbers.stream()
                .filter(x-> x%2==0)
                .mapToInt(n -> n*n)
                .sum();
        System.out.println(finalSum);
    }
}
