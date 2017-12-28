import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;


public class CountWorkingDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String secound = sc.nextLine();

        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate startDate = LocalDate.from(formatted.parse((first)));
        LocalDate endDate = LocalDate.from(formatted.parse((secound)));

        LocalDate[] holidays = new LocalDate[]{
                LocalDate.of(2016, 1, 1),
                LocalDate.of(2016, 3, 3),
                LocalDate.of(2016, 5, 1),
                LocalDate.of(2016, 5, 6),
                LocalDate.of(2016, 5, 24),
                LocalDate.of(2016, 9, 6),
                LocalDate.of(2016, 9, 22),
                LocalDate.of(2016, 11, 1),
                LocalDate.of(2016, 12, 24),
                LocalDate.of(2016, 12, 25),
                LocalDate.of(2016, 12, 26)
        };

        int count = 0;

        for (LocalDate i = startDate; i.isBefore(endDate.plusDays(1)); i = i.plusDays(1)){
            LocalDate isHaloday = LocalDate.of(2016, i.getMonth(), i.getDayOfMonth());

            if (!Arrays.asList(holidays).contains(isHaloday) && i.getDayOfWeek() != DayOfWeek.SATURDAY && i.getDayOfWeek() != DayOfWeek.SUNDAY){
                count++;
            }
        }
        System.out.print(count);
    }
}
