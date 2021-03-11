package ro.ase.csie.cts.seminar3;

public class FeeBankAccount extends DebitBankAccount {
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
