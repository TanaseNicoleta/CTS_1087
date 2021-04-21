package ro.ase.csie.cts.dp.state;

public class Supererou {
    public static final int NIVEL_CRITIC = 10;

    String nume;
    int puncteViata;

    InterfataMiscare modMiscare = null;

    public Supererou(String nume, int puncteViata) {
        this.nume = nume;
        this.puncteViata = puncteViata;
        this.modMiscare = new MiscareNormala();
    }

    void seDeplaseaza() {
        this.modMiscare.seMisca();
    }

    void esteAtacat(int puncte) {
        this.puncteViata -= puncte;
        if(this.puncteViata < NIVEL_CRITIC)
            this.modMiscare = new MiscareModRanit();
    }

    void seVindeca(int puncte) {
        this.puncteViata += puncte;
        if(this.puncteViata >= NIVEL_CRITIC)
            this.modMiscare = new MiscareNormala();
    }

}
