package ro.ase.csie.seminar2.solid;

public class BankAccount {
    private String iban;
    private long balance;
    private Persoana accountHolder;

    public BankAccount(String iban, Persoana pers) {
        this.iban = iban;
        this.accountHolder = pers;
        this.balance = 0;
    }

    public void withdraw(long amount) {
        balance -= amount;
    }

    public void deposit(long amount) {
        balance += amount;
    }

    public String getIban() {
        return iban;
    }

    public long getBalance() {
        return balance;
    }

    public Persoana getAccountHolder() {
        return accountHolder;
    }
}
