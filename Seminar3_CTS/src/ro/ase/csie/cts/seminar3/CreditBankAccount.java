package ro.ase.csie.cts.seminar3;

public class CreditBankAccount extends Account implements Receivable {

    public CreditBankAccount(String iban, Persoana titular) {
        this.setIban(iban);
        this.setAcountholder(titular);
    }

    @Override
    public void deposit(long amount) {
        System.out.println("Adding " + amount + " to " + this.getIban());
        this.setBalance(this.getBalance() + amount);
    }
}
