package Pra.StreamApi;

import java.util.List;

public class NameFilterExample {
    public static void main(String[] args) {
        List<String> names = List.of("Dileep","Madhu","dinesh");
        names.stream()
                .filter(name -> name.startsWith("D"))
                .map(String::toUpperCase)
                .forEach(System.out::println);


    }
}
