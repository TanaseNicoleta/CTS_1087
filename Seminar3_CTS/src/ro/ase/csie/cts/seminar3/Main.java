package ro.ase.csie.cts.seminar3;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Persoana, Receivable> employees = new HashMap<>();
        Persoana p1 = new Persoana("Chuck Norris");
        CreditBankAccount b1 = new CreditBankAccount("RFZ123123123123", p1);

        Persoana p2 = new Persoana("Arnold");
        DebitBankAccount b2 = new FeeBankAccount("INGB123123123123", p2);

        Persoana p3 = new Persoana("Van Damme");
        DebitBankAccount b3 = new DebitBankAccount("BT123123123123", p3);

        employees.put(p1, b1);
        employees.put(p2, b2);
        employees.put(p3, b3);

        for(Receivable a: employees.values()) {
            a.deposit(1000);
        }


        Map<Persoana,  Payable> union = new HashMap<>();
        union.put(p2, b2);
        union.put(p3, b3);
        for(Payable a: union.values()) {
            try {
                a.withdraw(10);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\n\n");
        try {
            b2.transfer(b3, 200);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
    }
}
