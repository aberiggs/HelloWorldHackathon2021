import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Date {
    static DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
    public static int dateInMin(){
        LocalDateTime now= LocalDateTime.now();
        String nowDate = now.format(formatter);
        String partOne = nowDate.substring(0, 10);
        String partTwo = nowDate.substring(11, 16);
        String hoursInt = partTwo.substring(0, 2);
        String minutesInt = partTwo.substring(3);
        int dateMin = Integer.parseInt(partOne.substring(8,10)) * 24 * 60;
        int hoursMin = Integer.parseInt(hoursInt) * 60;
        int minutes = Integer.parseInt(minutesInt);
        int totalMin = dateMin + hoursMin + minutes;
        return totalMin;
    }


}
