package InfosysInternalProjectPrep.streamApis;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomOrder {
    public static void main(String[] args) {

        List<String> names = List.of("G", "kumar", "Dileep");
        /*

        List<String> customerOrder = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(customerOrder);

         */
        names.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
