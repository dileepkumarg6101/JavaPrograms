package InterviewPrograms;

public class SortArrayWithoutInbuiltMethod {
    public static void main(String[] args) {
        // Input array
        int[] array = {10, 5, 20, 63, 12, 57, 88, 60};
        int temp;
        int size = array.length;

        for (int i =0; i< size; i++){
            for (int j =i+1; j<size; j++){
                if (array[i]> array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        // Display sorted array...
        for (int num : array){
            System.out.print(num+ " ");
        }

    }
}
