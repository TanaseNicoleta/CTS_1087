package ro.ase.csie.cts.seminar3;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Persoana, BankAccount> employees = new HashMap<>();
        Persoana p1 = new Persoana("Chuck Norris");
        BankAccount b1 = new BankAccount("RFZ123123123123", p1);

        Persoana p2 = new Persoana("Arnold");
        BankAccount b2 = new FeeBankAccount("INGB123123123123", p2);

        Persoana p3 = new Persoana("Van Damme");
        BankAccount b3 = new BankAccount("BT123123123123", p3);

        employees.put(p1, b1);
        employees.put(p2, b2);
        employees.put(p3, b3);

        for(BankAccount a: employees.values()) {
            a.deposit(1000);
        }

        for(BankAccount a: employees.values()) {
            try {
                a.withdraw(10);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
