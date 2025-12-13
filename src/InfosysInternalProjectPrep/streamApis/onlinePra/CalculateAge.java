package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter your birthdate (yyyy-mm-dd): ");

            String birthDateString = sc.nextLine();

            LocalDate birthADate = LocalDate.parse(birthDateString);

            // store current date..
            LocalDate currentDate = LocalDate.now();

            // use period to calcaute age..
            Period age = Period.between(birthADate, currentDate);

            System.out.println("you are "+ age.getYears() + " years old.");
        }

    }
}
