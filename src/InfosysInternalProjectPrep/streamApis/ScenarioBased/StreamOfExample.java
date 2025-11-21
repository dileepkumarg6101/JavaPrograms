package InfosysInternalProjectPrep.streamApis.ScenarioBased;

import java.util.stream.Stream;

/*
📘 You can also use Stream.of(arr) for arrays.
 */
public interface StreamOfExample {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(10, 20, 30, 40);
        stream.map(n -> n * 2)
                .forEach(System.out::println);

    }
}
