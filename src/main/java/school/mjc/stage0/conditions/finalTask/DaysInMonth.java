package school.mjc.stage0.conditions.finalTask;
import java.time.YearMonth;
public class DaysInMonth {
    public void printDays(int year, int month) {
        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        System.out.println(daysInMonth);
    }
}
