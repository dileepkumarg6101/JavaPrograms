package InfosysInternalProjectPrep.streamApis;

import java.util.stream.IntStream;

/*
2. Calculate the factorial of a number using Streams.
 */
public class FactorialUsingStreams {
    public static void main(String[] args) {
        int number = 5;

        int result = IntStream.rangeClosed(1, number)
                .reduce(1, (a, b) -> a * b);
        System.out.println(result);

    }
}
