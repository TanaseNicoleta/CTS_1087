package ro.ase.csie.gts.g1087.dp.apater.banca;

public class ContBancarDebit implements ContBancar{
	
	double balanta;
	String IBAN;

	public ContBancarDebit(double balanta, String iBAN) {
		super();
		this.balanta = balanta;
		IBAN = iBAN;
	}

	@Override
	public void transfer(ContBancar destinatie, double suma) {
		destinatie.depune(suma);
		this.balanta-=suma;
	}

	@Override
	public void depune(double suma) {
		this.balanta+=suma;
	}

}
