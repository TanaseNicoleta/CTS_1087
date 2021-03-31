package ro.as.csie.cts.seminar6.dp.builder;

public class Supererou {

    String nume;
    int puncteViata;

    boolean esteNegativ;
    boolean esteRanitGrav;

    //Deep
    InterfataArma armaStanga;
    InterfataArma armaDreapta;
    InterfataSuperputere superputere;
    InterfataSuperputere superSuperputere;

    public Supererou() {
    }

    public Supererou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav, InterfataArma armaStanga, InterfataArma armaDreapta, InterfataSuperputere superputere, InterfataSuperputere superSuperputere) {
        this.nume = nume;
        this.puncteViata = puncteViata;
        this.esteNegativ = esteNegativ;
        this.esteRanitGrav = esteRanitGrav;
        this.armaStanga = armaStanga;
        this.armaDreapta = armaDreapta;
        this.superputere = superputere;
        this.superSuperputere = superSuperputere;
    }
}
