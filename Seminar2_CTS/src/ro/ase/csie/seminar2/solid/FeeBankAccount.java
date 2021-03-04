package ro.ase.csie.seminar2.solid;

public class FeeBankAccount extends BankAccount {
    private long fee = 2;

    public FeeBankAccount(String iban, Persoana pers) {
        super(iban, pers);
    }

    @Override
    public void withdraw(long amount) throws InsufficientFundsException {
        System.out.println("Adding " + " dollars fee to withdrawal");
        amount+=2;
        super.withdraw(amount);
    }
}
