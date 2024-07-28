package JavaEight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaClass {

    public static void test1(int[] n){
        List<Integer> p= Arrays.stream(n).
                filter(x->x%2==0)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(p);
    }

    public static void test2(int[] n){
        int p= Arrays.stream(n).
                filter(x->x%2==0)
                        .map(x->x*x)
                                .sum();
        System.out.println(p);
    }

    public static void maxNum(int[] n){
        int p = Arrays.stream(n)
                .max()
                        .orElse(Integer.MIN_VALUE);
        System.out.println(p);
    }

    public static void CapLetter(String str){

        int p= (int)str.chars()
                .filter(Character::isUpperCase)
                .count();
        System.out.println(p);
    }
    public static void test5(int[] num) {
        int n = num.length;
        int firstmax=0;
        int secondmax=0;
        int thirdmax =0;
        for(int i=0; i<n; i++) {
            if(num[i]>firstmax) {
                thirdmax =secondmax;
                secondmax=firstmax;
                firstmax=num[i];

            }
        }
        System.out.println(firstmax);
        System.out.println(secondmax);
        System.out.println(thirdmax);

    }
    public static void reverseS(List<String> list){

        List<String> p = list.stream()
                .map(x-> new StringBuilder(x).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(p);
    }

    public static void CountStr(List<String> list, int t){

        long p = list.stream()
                .filter(x-> x.length()>t)
                .count();
        System.out.println(p);

    }

    public static void CommonList(List<Integer> a , List<Integer> b){

        List<Integer> p = a.stream()
                .filter(b::contains)
                .collect(Collectors.toList());
        System.out.println(p);
    }

    public static void startT(List<String> str){
        List<String> p = str.stream()
                .filter(x->x.startsWith("T") || x.startsWith("t"))
                .collect(Collectors.toList());
        System.out.println(p);
    }

    public static void groupT(List<String> str){
        Map<Integer,List<String>> p = str.stream()
                        .collect(Collectors.groupingBy(String::length));
        System.out.println(p);
    }


    public static void main(String[] args) {
//        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        String str ="Hello World! This Is A Test String. YUH";
//        List<String> list = Arrays.asList("apple", "banana", "orange", "kiwi");
//        List<String> strings =Arrays.asList("apple", "banana", "orange", "kiwi", "pineapple", "grape");
//        List<String> t = Arrays.asList("Hello", "World!", "This", "Is", "A", "Test", "String", "YUH");
//
//        LambdaClass.test2(n);
//        LambdaClass.CapLetter(str);
//        LambdaClass.reverseS(list);
//        LambdaClass.CountStr(strings,5);
//        List<Integer> a = Arrays.asList(3,2,5,52,2,6,5,3);
//        List<Integer> b = Arrays.asList(5,3,6,2,6,6,2,2,4,7,9);
//        LambdaClass.CommonList(a,b);
//        LambdaClass.startT(t);
        int[] nums = {4,1,5,5,2,5,35,52,56,65,84,23};
        LambdaClass.test5(nums);



    }

}


