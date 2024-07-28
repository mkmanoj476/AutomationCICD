package MIssion.Day2;

import java.util.*;

public class CollectionPractice {

    public static void Test(int[] num){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: num){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }
    public static void Test1(String[] str){
        Set<String> set = new TreeSet<>();
        for(String s : str){
            set.add(s);
        }

        System.out.println(set);
    }






    public static void main(String[] args) {

        int[] num ={2,4,2,4,2,5,3,1,5,2,3,2,1,4};
        String[] str = {"mango","apple","guavava", "mawa", "lichi", "coconut"};
        CollectionPractice.Test(num);
        CollectionPractice.Test1(str);

    }

}
