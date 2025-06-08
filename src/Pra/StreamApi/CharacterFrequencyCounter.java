package Pra.StreamApi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {

        final String str = "Colour";

        Map<Character, Long> map = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.forEach((character, count) -> System.out.println("Character:" + character + " Count:" + count));


    }
}
