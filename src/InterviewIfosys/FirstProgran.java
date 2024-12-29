package InterviewIfosys;

import java.util.Arrays;

/*
Q1
Use java streams to find the common elements between two arrays
array1={12,34,65,85,21,33,12,37}
array2={13,38,60,88,29,34,15,35,65}
 */
public class FirstProgran {
    public static void main(String[] args) {
        int array1[] = {12, 34, 65, 85, 21, 33, 12, 37};
        int array2[] = {13, 38, 60, 88, 29, 34, 15, 35, 65};
        int n1 = array1.length;
        int n2 = array2.length;
        int cmn = 0;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (array1[i] == array2[j]) {
                    cmn += array1[i];
                }

            }

        }
        System.out.println(cmn);
    }

}

