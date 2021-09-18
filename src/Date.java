import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Date {
    static DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
    public static String date(){
        LocalDateTime now= LocalDateTime.now();
        String nowDate = now.format(formatter);
        String partOne = nowDate.substring(0, 10);
        String partTwo = nowDate.substring(11, 16);
        String hoursInt = partTwo.substring(0, 2);
        String minutesInt = partTwo.substring(3);
        nowDate = partOne + " " + partTwo;
        return nowDate;
    }

    public static int hours() {
        LocalDateTime now= LocalDateTime.now();
        String nowDate = now.format(formatter);
        String partOne = nowDate.substring(0, 10);
        String partTwo = nowDate.substring(11, 16);
        String hoursInt = partTwo.substring(0, 2);
        int hour = Integer.parseInt(hoursInt);
        return hour;

    }

    public static int minutes() {
        LocalDateTime now = LocalDateTime.now();
        String nowDate = now.format(formatter);
        String partOne = nowDate.substring(0, 10);
        String partTwo = nowDate.substring(11, 16);
        String minutesInt = partTwo.substring(3);
        int minutes = Integer.parseInt(minutesInt);
        return minutes;
    }
}
