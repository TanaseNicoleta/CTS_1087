package ro.ase.csie.cts.seminar4;

import ro.ase.csie.cts.seminar4.banking.*;

import java.math.BigInteger;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        Person p = new Person("Van Damme");
        p.setEmail("van@damme.com");
        p.setMobile("+44534634423");

        CreditBankAccount b = CreditBankAccount.createCreditBankAccountWithBalance(emailService, "BT12312323", p, 100);
        CreditBankAccount b1 = CreditBankAccount.createCreditBankAccountWithoutBalance(emailService, "INGB123123123", p);

        BigInteger bi = new BigInteger(24, 11, new Random());
        BigInteger bi2 = BigInteger.probablePrime(12, new Random());

        Boolean value = Boolean.valueOf(false);
        

        b.deposit(50);
        System.out.println(b.toString());
    }
}
