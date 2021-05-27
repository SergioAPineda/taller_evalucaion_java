package exercise13;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();

        ZoneId timeZone = ZoneId.systemDefault();
        LocalDate getLocalDate = date.toInstant().atZone(timeZone).toLocalDate();
        System.out.println(getLocalDate.getYear() +" "+ getLocalDate.getMonth() +" "+ getLocalDate.getDayOfMonth());
        System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
    }
}
