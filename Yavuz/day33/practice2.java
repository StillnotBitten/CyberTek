package day33;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class practice2 {
    public static void main(String[] args) {
        String [] students = {"Kalbinur", "Virginia","Odina","Ernis","Isa"};
        LocalDate[] birthdays = {
                LocalDate.of(1982, 12, 26),
                LocalDate.of(1993,11,25),
                LocalDate.of(1980,05,23),
                LocalDate.of(1990,2,21),
                LocalDate.of(1982,11,28)
        };
        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");

        // Odina : May/23/80 Monday

        for (int i =0;i<= students.length-1;i++){
            System.out.println(students[i]+" : "+ birthdays[i].format(dateformat));
        }
    }
}
