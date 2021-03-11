package ro.ase.csie.cts.seminar3;

public class CreditBankAccount implements Receivable {
    private long balance;
    private String iban;
    private Persoana titular;

    public CreditBankAccount(String iban, Persoana titular, long balance) {
        this.iban = iban;
        this.titular = titular;
        this.balance= balance;
    }

    @Override
    public void deposit(long amount) {
        System.out.println("Adding " + amount + " to " + iban);
        this.balance += amount;
    }
}
