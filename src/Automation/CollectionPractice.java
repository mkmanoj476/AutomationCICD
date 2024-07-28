package Automation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionPractice {

    public static void test(String str){
        char[]  ch = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<ch.length; i++){
            map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public static void test1(int[] num, int n){
        List<String >  list = new ArrayList<>();
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i]+num[j]==n){
                    String p = num[i]+":"+num[j];
                    String reverse = new StringBuilder(p).reverse().toString();
                    if(!list.contains(p)||!list.contains(reverse)){
                        list.add(p);
                    }
                }
            }
        }
        System.out.println(list);
    }

    public static void Dog(String str){
        char[] ch = new char[str.length()];
        int k=0;
        for(int i=str.length()-1; i<=0; i--){
            ch[k] = str.charAt(i);
        }
        String reverse = new String(ch);
        System.out.println(reverse);

    }

    public static void abc(String str){
        String[] strings = str.split("\\s");
        for(String s : strings){
            System.out.println(s);
        }
    }

    public static void test4(String str){
        char[] ch = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<ch.length; i++){
            map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
        }
        int maxvalue=0;
        char maxchar='\0';
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() > maxvalue){
                maxvalue = entry.getValue();
                maxchar = entry.getKey();
            }
        }
        System.out.println(maxchar+":"+maxvalue);
    }

    public static void main(String[] args) {
        int[] num = {2,3,2,4,2,1,5,3,2,6,2};
        String str = "My name is manoj kumar";
        //CollectionPractice.test1(num, 5);
        //CollectionPractice.abc(str);
        CollectionPractice.Dog("The worlds is Beautiful");
    }
}
