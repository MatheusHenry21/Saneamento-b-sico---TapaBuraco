package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {
    public static final String DATE_FORMAT = "dd/MM/yyyy";
    public static final String DATE_TIME_FORMAT = "dd/MM/yyyy HH:mm";

    public String formatarData(String pattern){
        SimpleDateFormat dataFormat = new SimpleDateFormat(pattern);
        return dataFormat.format(new Date());
    }
}
