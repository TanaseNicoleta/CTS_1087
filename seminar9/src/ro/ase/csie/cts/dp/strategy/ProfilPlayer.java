package ro.ase.csie.cts.dp.strategy;

public class ProfilPlayer {
    String userName;
    double playTime;
    int nrNiveluri;

    InterfataBonus strategieBonus = null;

    public ProfilPlayer(String userName, double playTime, int nrNiveluri) {
        this.userName = userName;
        this.playTime = playTime;
        this.nrNiveluri = nrNiveluri;
    }

    public void setStrategieBonus(InterfataBonus strategie) {
        this.strategieBonus = strategie;
    }

    public void getBonus() {
        if(this.strategieBonus != null) {
            int puncteBonus = this.strategieBonus.getPuncteBonus(this);
            System.out.println("Ai primit puncte bonus " + puncteBonus);
        } else
            throw new UnsupportedOperationException();
    }
}
