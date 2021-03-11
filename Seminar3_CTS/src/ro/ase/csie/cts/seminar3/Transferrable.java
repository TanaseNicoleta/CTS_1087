package ro.ase.csie.cts.seminar3;

public interface Transferrable {
    public void transfer(Receivable destination, long amount) throws InsufficientFundsException;
}
