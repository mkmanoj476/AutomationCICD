package JavaEight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
         String[] str = {"The quick brown fox jumps over the lazy dog",
                 "A journey of a thousand miles begins with a single step",
                 "To be or not to be that is the question"};
        List<String> sentences = Arrays.asList(str);
        List<String> longestword = sentences.stream()
                .map(sentence -> Arrays.stream(sentence.split(" "))
                .max((word1, word2) -> Integer.compare(word1.length(), word2.length()))
                        .orElse(""))
                .collect(Collectors.toList());
        System.out.println(longestword);

    }
}
