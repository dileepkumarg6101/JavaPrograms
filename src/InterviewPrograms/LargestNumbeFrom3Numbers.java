package InterviewPrograms;

import java.util.Scanner;

public class LargestNumbeFrom3Numbers {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            // Input three numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();

            // Finding the largest number
            int largest = num1;

            if (num2 > largest) {
                largest = num2;
            }
            if (num3 > largest) {
                largest = num3;
            }

            // Output the largest number
            System.out.println("The largest number is: " + largest);
        }

    }

