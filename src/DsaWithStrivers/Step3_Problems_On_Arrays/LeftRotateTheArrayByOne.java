package DsaWithStrivers.Step3_Problems_On_Arrays;
/*
Approach:
Here, in the given array :

n = 5,
arr[] = {1,2,3,4,5}
At first, we have to shift the array towards the left so, we store the value of the first index in a variable (let it be x).

Then we iterate the array from the 0th index to the n-1th index(why n-1 i will explain it below)

And then store the value present in the next index to the current index like this :

arr[i] = arr[i+1]
And to prevent its segmentation fault we will iterate it till n-1.

At last, put the value of variable x in the last index of the array.
 */
public class LeftRotateTheArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        leftRotate(arr, n);
    }
    public static void leftRotate(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;

        for (int i =0; i< n; i++){
            System.out.print(arr[i]+",");
        }

    }
}
