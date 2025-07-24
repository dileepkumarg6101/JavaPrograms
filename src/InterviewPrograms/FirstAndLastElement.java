package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstAndLastElement {
    public static void main(String[] args) {
        /*
        // Input Array
        Integer[] array1 = {4,2,1,6};
        // Convert array to ArrayList
        List<Integer> list = new ArrayList<>(Arrays.asList(array1));
        // Check if list is not empty to avoid exceptions
        if (!list.isEmpty()){
            // Find first element
            int first =  list.get(0);

            // Find last element
            int last  = list.get(list.size()-1);

            System.out.println("First element is: " + first);
            System.out.println("Last element is: " + last);
        }
        else {
            System.out.println("The list is empty!");

        }

         */

    // Input Array
        Integer[] array1 = {4,2,1,6};
        // Convert array to ArrayList
        List<Integer> list = Arrays.asList(array1);
        // First element using Stream
        Optional<Integer> first = list.stream()
                .findFirst();

        // Last element using Stream
        Optional<Integer> last = list.stream()
                .skip(list.size()-1)
                .findFirst();

        if (first.isPresent() && last.isPresent()){
            System.out.println("First element using Stream: " + first.get());
            System.out.println("Last element using Stream: " + last.get());
        }
        else{
            System.out.println("The list is empty!");

        }
    }
}
