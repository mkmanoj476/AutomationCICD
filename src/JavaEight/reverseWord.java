package JavaEight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class reverseWord {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String[] str = sentence.split("\\s");
        String sent = Arrays.asList(str).stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(sent);
    }
}
