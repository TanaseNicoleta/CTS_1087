package ro.ase.csie.cts.dp.chain;

public class MesajChat {

    String destinatie;
    String continut;
    int prioritate;

    public MesajChat(String destinatie, String continut, int prioritate) {
        this.destinatie = destinatie;
        this.continut = continut;
        this.prioritate = prioritate;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public String getContinut() {
        return continut;
    }

    public void setContinut(String continut) {
        this.continut = continut;
    }

    public int getPrioritate() {
        return prioritate;
    }

    public void setPrioritate(int prioritate) {
        this.prioritate = prioritate;
    }
}
