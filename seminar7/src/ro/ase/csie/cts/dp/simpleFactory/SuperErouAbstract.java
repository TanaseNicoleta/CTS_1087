package ro.ase.csie.cts.dp.simpleFactory;

public abstract class SuperErouAbstract {
    String nume;
    int puncteViata;

    public SuperErouAbstract(String nume, int puncteViata) {
        this.nume = nume;
        this.puncteViata = puncteViata;
    }

    public abstract void seDeplaseaza();

    public void setPuncteViata(int puncteViata) {
        this.puncteViata = puncteViata;
    }



}