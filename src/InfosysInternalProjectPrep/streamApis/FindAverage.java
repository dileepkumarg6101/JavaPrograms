package InfosysInternalProjectPrep.streamApis;

import java.util.List;

/*
problem: Find the Average of a given list of numbers using java 8 stream..
 */
public class FindAverage {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 30, 20, 40, 50);

        double average =  numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        System.out.println(average);




        }
    }


