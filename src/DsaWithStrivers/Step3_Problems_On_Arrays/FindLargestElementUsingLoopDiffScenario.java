package DsaWithStrivers.Step3_Problems_On_Arrays;

public class FindLargestElementUsingLoopDiffScenario {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 6, 5,9};
        System.out.println("arr1 largest element is: "+ findlargestElement(arr1));

        int[] arr2= {6,5,4,3,2,1};
        System.out.println("arr2 largest element is: "+ findlargestElement(arr2));


    }

    static int findlargestElement(int[] arr){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
//        System.out.println("largest element is: " + largest);
        return largest;
    }
}