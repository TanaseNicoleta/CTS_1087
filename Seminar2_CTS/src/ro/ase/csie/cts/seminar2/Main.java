package ro.ase.csie.cts.seminar2;

import ro.ase.csie.seminar2.solid.BankAccount;
import ro.ase.csie.seminar2.solid.Persoana;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        CalendarUtil cu = new CalendarUtil();

//        double d1 = 1.002;
//        double d2 = 0.43;
//
//        BigDecimal bg1 = new BigDecimal("1.02");
//        BigDecimal bg2 = new BigDecimal("0.43");
//        System.out.println(bg1.subtract(bg2));
//
//        System.out.println(d1-d2);
//
//        try {
//            System.out.println(cu.weekDay(7));
//            System.out.println(cu.weekDay2(4));
//            System.out.println(cu.weekDay3(5));
//            System.out.println(cu.weekDay4(5));
//        } catch (IncorrectDayException e) {
//            e.getMessage();
//        }

        Persoana p = new Persoana("Ionescu");
        BankAccount account = new BankAccount("INGB1234567899", p);

        

    }
}
