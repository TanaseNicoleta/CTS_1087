package ro.ase.csie.cts.seminar2;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class CalendarUtil {

    private String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private Object IllegalArgumentException;

    public String weekDay(int day) throws IncorrectDayException{
        if (day == 1)
            return "Sunday";
        else if (day == 2)
            return "Monday";
        else if (day == 3)
            return "Tuesday";
        else if (day == 4)
            return "Wednesday";
        else if (day == 5)
            return "Thursday";
        else if (day == 6)
            return "Friday";
        else if (day == 7)
            return "Saturday";

        throw new IncorrectDayException("Only seven days in a week");
    }

    public String weekDay2(int day) throws IncorrectDayException{
        switch(day){
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Sunday";
            default:
                throw new IncorrectDayException("Only seven days in a week");
        }
    }

    public String weekDay3(int day) throws IncorrectDayException{
        if(day<=7 && day >=0)
            return weekDays[day-1];
        else
            throw new IncorrectDayException("Only seven days in a week");
    }

    public String weekDay4(int day) throws IncorrectDayException {
        String[] days = new DateFormatSymbols().getInstance(Locale.CHINESE).getWeekdays();
        if(day<=7 && day >=0)
            return weekDays[day-1];
        else
            throw new IncorrectDayException("Only seven days in a week");
    }
}
