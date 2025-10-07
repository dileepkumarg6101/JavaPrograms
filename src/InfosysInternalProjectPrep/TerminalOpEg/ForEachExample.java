package InfosysInternalProjectPrep.TerminalOpEg;

import java.util.List;
/*
1. forEach()

Iterates over each element of the stream.
 */
public class ForEachExample {
    public static void main(String[] args) {
        List<String> names = List.of("Dileep", "Dinesh","Rahul");
        names.stream()
                .forEach(System.out::println);
    }
}
