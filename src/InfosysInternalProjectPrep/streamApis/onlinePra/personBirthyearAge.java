package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
32) Find the age of a person in years if the birthday has given?
 */
public class personBirthyearAge {
    public static void main(String[] args) {


    LocalDate birthday = LocalDate.of(1999, 03, 27);
    LocalDate today = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(birthday,today));
    }
}
