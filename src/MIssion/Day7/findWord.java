package MIssion.Day7;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class findWord {
    public static void main(String[] args) {
        String str="Manoj Kumar is giving Interview";
        String[] words = str.split("\\s");
        Map<String, Integer> map =new TreeMap<>();
        for(String s: words){
            map.put(s, s.length());
        }

    }
}
