package ro.ase.csie.cts.seminar3;

public class Account {
    private long balance;
    private String iban;

    public Persoana getAcountholder() {
        return acountholder;
    }

    public void setAcountholder(Persoana acountholder) {
        this.acountholder = acountholder;
    }

    private Persoana acountholder;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
