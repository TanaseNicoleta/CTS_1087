package ro.ase.csie.cts.seminar2;

public class Main {
    public static void main(String[] args) {
        CalendarUtil cu = new CalendarUtil();

        try {
            System.out.println(cu.weekDay(7));
            System.out.println(cu.weekDay2(4));
            System.out.println(cu.weekDay3(5));
            System.out.println(cu.weekDay4(2));
        } catch (IncorrectDayException e) {
            e.printStackTrace();
        }

    }
}
