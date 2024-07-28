package Thoughtworks;

import java.util.HashMap;

public class Strings {

    public static void main(String[] args) {
//        String s1 = "apple";
//        String s2 = new String("apple");
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//        s1="Banana";
//        System.out.println(s1.equals(s2));
//        String s3 = "test";
//        String s4 = "t" + "e" + "s" + "t";
//        System.out.println(s3 == s4);
//
//        String str = null;
//        try{
//            System.out.println(str.length());
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
        String s1 = "abc";
        String s3 ="abc";
        String s2 = "ABC".toLowerCase();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        String s4 = " ab jn   mk lu ";
        System.out.println(s4);
        s4 = s4.trim();
        System.out.println(s4);

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('v',2);
        map.put('t', 1);
        map.put('o', 7);
        map.put('p', 8);
        System.out.println(map.get('t'));
    }
}
