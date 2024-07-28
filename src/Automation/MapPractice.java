package Automation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {


    public static void main(String[] args) {
//        String input = "manoj monday ritu rahul";
//        Map<Character, List<String>> wordMap = new HashMap<>();
//
//        // Split the input string into words
//        String[] words = input.split(" ");
//
//        // Group words by their starting letter
//        for (String word : words) {
//            char firstLetter = word.charAt(0);
//            if (!wordMap.containsKey(firstLetter)) {
//                wordMap.put(firstLetter, new ArrayList<>());
//            }
//            wordMap.get(firstLetter).add(word);
//        }
//
//        // Output words grouped by starting letter and their count
//        for (Map.Entry<Character, List<String>> entry : wordMap.entrySet()) {
//            System.out.println(entry.getValue() + " - " + entry.getValue().size());
//        }

        String[] words = {"manoj", "monday", "ritu", "rahul"};
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            String firstChar = String.valueOf(word.charAt(0)).toLowerCase();
            if (!wordCountMap.containsKey(firstChar)) {
                wordCountMap.put(word, 1);
            } else {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            }
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        System.out.println(result + " - " + result.size());
    }


}
