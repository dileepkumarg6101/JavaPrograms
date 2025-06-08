package Pra.StreamApi;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//Print the second-largest number in an integer array
public class SecondLargestNumber {
    public static void main(String[] args) {
        // Create sample numeric list
        List<Integer> integerList = new ArrayList<>();
        integerList.add(9);
        integerList.add(7);
        integerList.add(3);
        integerList.add(5);
        integerList.add(2);
        integerList.add(4);

        int secondLargestNumber  = integerList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("secondLargestNumber is: "+ secondLargestNumber);
    }

}
