package Pra.StreamApi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/* Calculate age of a person in years

 */
public class CalPersonDate {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1998, 03,27);
        LocalDate today = LocalDate.now();

        System.out.println("Age: "+ ChronoUnit.YEARS.between(birthDay,today));

    }
}
