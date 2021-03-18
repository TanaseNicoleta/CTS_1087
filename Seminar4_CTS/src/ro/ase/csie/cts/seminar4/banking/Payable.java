package ro.ase.csie.cts.seminar4.banking;

import ro.ase.csie.cts.seminar4.banking.InsuficientFundsException;

public interface Payable {
	void withdraw(long amount) throws InsuficientFundsException;

}
