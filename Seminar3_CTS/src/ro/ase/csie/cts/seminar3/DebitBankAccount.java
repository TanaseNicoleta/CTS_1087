package ro.ase.csie.cts.seminar3;

public class DebitBankAccount implements Payable, Receivable {
    private String iban;
    private long balance;
    private Persoana accountHolder;

    public DebitBankAccount(String iban, Persoana pers) {
        this.iban = iban;
        this.accountHolder = pers;
        this.balance = 0;
    }

    @Override
    public void withdraw(long amount) throws InsufficientFundsException{
        if(amount > getBalance())
            throw new InsufficientFundsException("Insufficient funds " + getBalance());
        System.out.println("Withdrawing " + amount + " from " + getIban());
        balance -= amount;
    }

    @Override
    public void deposit(long amount) {
        System.out.println("Depositing " + amount + " to " + getIban());
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
