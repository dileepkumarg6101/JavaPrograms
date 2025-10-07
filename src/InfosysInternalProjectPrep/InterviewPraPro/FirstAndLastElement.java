package InfosysInternalProjectPrep.InterviewPraPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstAndLastElement {
    public static void main(String[] args) {

        // 🔹 STEP 1: Using List get() method
        // ----------------------------------
        // Input Array
        // assigining the values in array1[]
        /*
        Integer array1[] = {1, 2, 3, 4, 5};

        // convert to arrayList
        List<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
        // check the list is not empty...

        if (!list1.isEmpty()) {
            // finding the first number;
            int firstNumber = list1.get(0);

            // find the Lastelement;
            int lastElement = list1.get(list1.size() - 1);

            System.out.println("First element is: " + firstNumber);
            System.out.println("Last element is: " + lastElement);

        } else {
            System.out.println("list is empty");
        }

         */
        // 🔹 STEP 2: Using Java Streams
        // ------------------------------
        // Input Array

        Integer array1[] = {1, 2, 3, 4, 5};

        List<Integer> list1 = new ArrayList<>(Arrays.asList(array1));

        Optional<Integer> firstElement = list1.stream().findFirst();

        Optional<Integer> lastElement = list1.stream()
                .skip(list1.size()-1)
                .findFirst();

        if (firstElement.isPresent() && lastElement.isPresent()){
            System.out.println("First element using Stream: " + firstElement.get());
            System.out.println("Last element using Stream: " + lastElement.get());
        }
        else {
            System.out.println("elements are not present");
        }

    }
}
