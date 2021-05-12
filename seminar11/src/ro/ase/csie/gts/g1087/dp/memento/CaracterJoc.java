package ro.ase.csie.gts.g1087.dp.memento;

public class CaracterJoc {

    String denumire;
    int puncteViata;
    String abilitatiMagice;

    public CaracterJoc(String denumire, int puncteViata, String abilitatiMagice) {
        this.denumire = denumire;
        this.puncteViata = puncteViata;
        this.abilitatiMagice = abilitatiMagice;
    }

    public void ataca() {

    }

    public void seDeplaseaza() {

    }

    public void seVindeca(int n) {
        this.puncteViata += n;
    }

    public MementoCaracterJoc salvare() {
        return new MementoCaracterJoc(this.denumire, this.puncteViata, this.abilitatiMagice);
    }

    public void incarcaSalvare(MementoCaracterJoc salvare) {
        this.denumire = salvare.denumire;
        this.puncteViata = salvare.puncteViata;
        this.abilitatiMagice = salvare.abilitatiMagice;
    }
}
