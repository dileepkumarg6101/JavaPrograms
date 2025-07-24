package DsaWithStrivers.Step3_Problems_On_Arrays;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 6, 5, 9};
        System.out.println("arr1 secondLargest element is: " + secondLargest(arr1));

        int[] arr2 = {6, 5, 4, 3, 2, 1};
        System.out.println("arr2 secondLargest element is: " + secondLargest(arr2));


    }

    static int findlargestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
//        System.out.println("largest element is: " + largest);
        return largest;
    }

    static int secondLargest(int[] arr) {
        int largest = findlargestElement(arr);
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> secondLargest && arr[i]!= largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}