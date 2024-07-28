package JavaEight;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Uniquewords {

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Hello world!",
                "The world is beautiful.",
                "Hello everyone."
        );

        Set<String> uniqueWords  = sentences.stream()
                .flatMap(x-> Arrays.stream(x.split("\\W+")))
                .map(String::toLowerCase)
                .collect(Collectors.toSet());
        System.out.println(uniqueWords);

    }
}
