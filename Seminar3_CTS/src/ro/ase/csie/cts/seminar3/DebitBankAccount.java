package ro.ase.csie.cts.seminar3;

public class DebitBankAccount extends Account implements Payable, Receivable {

    public DebitBankAccount(String iban, Persoana pers) {
        this.setIban(iban);
        this.setAcountholder(pers);
        this.setBalance(0);
    }

    @Override
    public void withdraw(long amount) throws InsufficientFundsException{
        if(amount > getBalance())
            throw new InsufficientFundsException("Insufficient funds " + getBalance());
        System.out.println("Withdrawing " + amount + " from " + getIban());
        this.setBalance(this.getBalance() - amount);
    }

    @Override
    public void deposit(long amount) {
        System.out.println("Depositing " + amount + " to " + getIban());
        this.setBalance(this.getBalance() + amount);
    }

    public Persoana getAccountHolder() {
        return this.getAcountholder();
    }
}
